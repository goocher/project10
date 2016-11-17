package com.gooch.showtogether;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioGroup;

import base.BaseActivity;
import fragment.zhibo.ZhiBoFragment;
import utils.FragmentFactory;
import utils.LogUtils;

public class MainActivity extends BaseActivity {
    private RadioGroup mRadioGroup = null;
    private FragmentManager mFragmentManager = null;
    private Fragment mCurrentFragment = null;
    private Fragment mZhiBoFragment, mFriendFragment, mMessageFragment, mMineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //设置全屏展示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        init();
    }

    private void init() {
        initView();

        mZhiBoFragment = new ZhiBoFragment();
        mFragmentManager = getSupportFragmentManager();
        mFragmentManager.beginTransaction()
                .add(R.id.fragment_container, mZhiBoFragment, "zhibo")
                .commit();
        mCurrentFragment = mZhiBoFragment;

        initListener();

    }

    private void initListener() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton_main:
                        mFragmentManager.beginTransaction()
                                .hide(mCurrentFragment)
                                .show(mZhiBoFragment)
                                .commit();
                        mCurrentFragment = mZhiBoFragment;
                        break;
                    case R.id.radioButton_friend:
                        showFragment(mFriendFragment, checkedId, "friend");
                        break;
//                    case R.id.radioButton_play_default:
//                        showFragment(mPlayFragment,checkedId,"play");
//                        break;
                    case R.id.radioButton_message:
                        showFragment(mMessageFragment, checkedId, "message");
                        break;
                    case R.id.radioButton_mine:
                        showFragment(mMineFragment, checkedId, "mine");
                        break;
                }

            }
        });
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGoup_bottom_button);

    }

    private void showFragment(Fragment fragment, int checkId, String tag) {
        if (fragment == null) {
            fragment = FragmentFactory.createById(checkId);

            mFragmentManager.beginTransaction().hide(mCurrentFragment)
                    .add(R.id.fragment_container, fragment, tag).commit();
        } else {
            mFragmentManager.beginTransaction().hide(mCurrentFragment)
                    .show(fragment).commit();
        }
        mCurrentFragment = fragment;


    }


    public void toOther(View view) {
        ZhiBoFragment zhiBoFragment = (ZhiBoFragment) mZhiBoFragment;
        switch (view.getId()) {
            case R.id.toReMen:
                zhiBoFragment.toOtherFragment(1);
                break;
            case R.id.toCaiYi:
                zhiBoFragment.toOtherFragment(2);
                break;
            case R.id.toXinRen:
                zhiBoFragment.toOtherFragment(4);
                break;
        }
    }

    public void clickii(View view) {
        LogUtils.i("flag","000000000000000");
    }
}
