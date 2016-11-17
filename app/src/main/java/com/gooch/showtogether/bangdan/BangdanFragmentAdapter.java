package com.gooch.showtogether.bangdan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.friend.fragment.paihangbang.BangdanFragment;

/**
 * Created by Administrator on 2016/11/8.
 */
public class BangdanFragmentAdapter extends FragmentStatePagerAdapter {
    private List<BangdanFragment>mBangdanFragments=null;
    public BangdanFragmentAdapter(FragmentManager fm, List<BangdanFragment> mBangdanFragments) {
        super(fm);
        this.mBangdanFragments=mBangdanFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mBangdanFragments.get(position);
    }

    @Override
    public int getCount() {
        return mBangdanFragments.size();
    }
}
