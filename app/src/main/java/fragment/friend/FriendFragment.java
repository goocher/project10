package fragment.friend;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.gooch.showtogether.R;
import com.gooch.showtogether.YaoYiYaoActivity;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.friend.adapter.FriendFragmentPageAdaper;
import fragment.friend.fragment.FriendsFrieldFragment;
import fragment.friend.fragment.HaoYouFragment;
import fragment.friend.fragment.NearByPersonFragment;
import fragment.friend.fragment.PaiHangBangFragment;
import utils.FragmentFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendFragment extends BaseFragment implements View.OnClickListener, TabLayout.OnTabSelectedListener {

    private List<Fragment> mFragments=null;
    private ViewPager mViewPager=null;
    private TabLayout mTabLayout=null;
    private TextView shaiXuan=null;
    private ImageView search=null;
    private TextView faBu=null;
    private View grayLayout=null;
    private PopupWindow mPopupWindow;

    public FriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_friend,container,false);
        mViewPager= (ViewPager) view.findViewById(R.id.viewPager_friends);
        mTabLayout= (TabLayout) view.findViewById(R.id.tablayout_friends_title);
        shaiXuan= (TextView) view.findViewById(R.id.textView_friend_shaixuan_title);
        search= (ImageView) view.findViewById(R.id.textView_friend_search_title);
        faBu= (TextView) view.findViewById(R.id.textView_friend_fabu_title);
        grayLayout = view.findViewById(R.id.gray_layout);
        init();
        return view;
    }

    private void init() {
        createFragment();
        initTab();
        initViewPager();

        mTabLayout.setOnTabSelectedListener(this);
        faBu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), YaoYiYaoActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }

    private void setTitleVisiable(int position) {
        if (position==3){
            shaiXuan.setVisibility(View.VISIBLE);
            search.setVisibility(View.INVISIBLE);
            faBu.setVisibility(View.INVISIBLE);
            shaiXuan.setOnClickListener(this);
        }else if (position==1||position==2){
            shaiXuan.setVisibility(View.INVISIBLE);
            search.setVisibility(View.VISIBLE);
            faBu.setVisibility(View.INVISIBLE);
        }else {
            shaiXuan.setVisibility(View.INVISIBLE);
            search.setVisibility(View.INVISIBLE);
            faBu.setVisibility(View.VISIBLE);
        }
    }

    private void initViewPager() {
        FriendFragmentPageAdaper adapter=new FriendFragmentPageAdaper(getChildFragmentManager(),mFragments);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    private void initTab() {
        String[]strings=getResources().getStringArray(R.array.friendtitle);
        for (int i = 0; i < strings.length; i++) {

            TabLayout.Tab tab=mTabLayout.newTab();
            tab.setText(strings[i]);

            mTabLayout.addTab(tab);
            mTabLayout.setTabMode(TabLayout.MODE_FIXED);
            mTabLayout.setSelectedTabIndicatorColor(Color.BLACK);

            mTabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
            mTabLayout.setTabTextColors(Color.GRAY,Color.BLACK);
        }
    }

    private void createFragment() {

        mFragments=new ArrayList<>();
        mFragments.add(new FriendsFrieldFragment());
        mFragments.add(new HaoYouFragment());
        mFragments.add(new PaiHangBangFragment());
        mFragments.add(new NearByPersonFragment());

    }

    @Override
    public void onClick(View v) {
        View contentView= LayoutInflater.from(getContext()).inflate(R.layout.popup_layout, null);
        //参数四：设置popupWindow是否获取焦点
        mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        //设置
        //popupWindow不会占满全屏，当点击其他位置是否允许窗口取消
        mPopupWindow.setOutsideTouchable(true);

        //如果想让popupWindow必须设置setBackgroundDrawable方法，漏洞
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.alpha(0x47C7C4C7)));

        //参数1：只要是一个当前activity下的view就行       getWindowToken识别的窗体
        //参数三和四  偏移量  x轴和y轴
//        popupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);
        grayLayout.setVisibility(View.VISIBLE);
        //参数四；只能是right或left   只能是左对齐或右对齐
                mPopupWindow.showAsDropDown(v, 0, 0, Gravity.LEFT);
        mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                grayLayout.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        setTitleVisiable(tab.getPosition());
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
    public void onPop(View view) {
        switch (view.getId()){
            case R.id.cancel_popup:
                mPopupWindow.dismiss();

                break;
            case R.id.lahei:
                mPopupWindow.dismiss();
                Toast.makeText(getContext(), "已拉黑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jubao:
                mPopupWindow.dismiss();
                Toast.makeText(getContext(), "已举报", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
