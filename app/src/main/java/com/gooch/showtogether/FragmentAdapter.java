package com.gooch.showtogether;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */
class FragmentAdapter extends FragmentStatePagerAdapter{

    List<Fragment>mFragments=null;

    public FragmentAdapter(FragmentManager fm, List<Fragment>fragments) {
        super(fm);
        this.mFragments=fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
