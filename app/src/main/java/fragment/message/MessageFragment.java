package fragment.message;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.friend.adapter.FriendFragmentPageAdaper;
import fragment.friend.fragment.FriendsFrieldFragment;
import fragment.friend.fragment.HaoYouFragment;
import fragment.friend.fragment.NearByPersonFragment;
import fragment.friend.fragment.PaiHangBangFragment;
import fragment.message.fragment.ChatFragment;
import fragment.message.fragment.NotificationFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends BaseFragment {


    private List<Fragment> mFragments=null;
    private ViewPager mViewPager=null;
    private TabLayout mTabLayout=null;
    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_message,container,false);
        mViewPager= (ViewPager) view.findViewById(R.id.viewPager_message);
        mTabLayout= (TabLayout) view.findViewById(R.id.tablayout_message_title);
        init();
        return view;
    }

    private void init() {
        createFragment();
        initTab();
        initViewPager();
    }

    private void initViewPager() {
        FriendFragmentPageAdaper adapter=new FriendFragmentPageAdaper(getChildFragmentManager(),mFragments);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    private void initTab() {
        String[]strings=getResources().getStringArray(R.array.Message);
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
        mFragments.add(new ChatFragment());
        mFragments.add(new NotificationFragment());


    }

}
