package com.gooch.showtogether.bangdan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import fragment.friend.bean.PaiHangBean;
import fragment.friend.fragment.paihangbang.BangdanFragment;
import url.AppConfig;

public class BangdanActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager mViewPager=null;
    private TabLayout mTabLayout=null;
    private List<BangdanFragment> mFragmentList;
    private ImageView backToBangdan=null;
    private int mType;
    private PaiHangBean mPaiHangBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangdan);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }

       Intent intent=getIntent();
        mType = intent.getIntExtra("type", AppConfig.MELIBANG);
        mPaiHangBean = intent.getExtras().getParcelable("paihangbean");
        init();
    }

    private void init() {
        initView();
        initTab();
        initViewPager();
        initType();
        backToBangdan.setOnClickListener(this);
    }

    private void initType() {
        switch (mType){
            case AppConfig.FUHAGO:
                mViewPager.setCurrentItem(1);

                break;
            case AppConfig.MELIBANG:
                mViewPager.setCurrentItem(0);

                break;
        }
    }

    private void initViewPager() {
        mFragmentList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            BangdanFragment bangdanFragment = new BangdanFragment();
            mFragmentList.add(bangdanFragment);
            Bundle bundle1=new Bundle();
            bundle1.putInt("type",i);
            bundle1.putParcelable("bean",mPaiHangBean);
            bangdanFragment.setArguments(bundle1);
        }
        BangdanFragmentAdapter adapter=new BangdanFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    private void initTab() {
        String[] titles=new String[]{"魅力榜","富豪榜"};
        for (int i = 0; i < titles.length; i++) {
            TabLayout.Tab tab=mTabLayout.newTab();
            tab.setText(titles[i]);
            mTabLayout.addTab(tab);
            mTabLayout.setTabTextColors(Color.GRAY,Color.BLACK);
//            mTabLayout.setTabMode(TabLayout.MODE_FIXED);
            mTabLayout.setSelectedTabIndicatorColor(Color.BLACK);
            mTabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        }


    }

    private void initView() {
        mTabLayout= (TabLayout) findViewById(R.id.tablayout_bangdanactivity);
        mViewPager= (ViewPager) findViewById(R.id.viewPager_bangdanActivity);
        backToBangdan= (ImageView) findViewById(R.id.back_bangdanvtivity);
    }

    @Override
    public void onClick(View v) {
        BangdanActivity.this.finish();
    }
}
