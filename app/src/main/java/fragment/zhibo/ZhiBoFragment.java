package fragment.zhibo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.zhibo.adatper.ZhiBoFragmentPageAdapter;
import utils.FragmentFactory;
import utils.LoadUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZhiBoFragment extends BaseFragment implements View.OnClickListener {

    private FragmentManager mFragmentManager = null;
    private List<Fragment> mFragments = null;
    private ViewPager mViewPager = null;
    private TabLayout mTabLayout = null;
    private ImageView mSearch;

    public ZhiBoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_zhi_bo, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.viewPager_zhibo);
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout_zhibo_title);
        mSearch = (ImageView) view.findViewById(R.id.imageView_title_search);
        init();
        return view;
    }

    private void init() {
        createFragment();
        initTab();
        initViewPager();

        mSearch.setOnClickListener(this);

    }

    private void initViewPager() {
        ZhiBoFragmentPageAdapter adapter = new ZhiBoFragmentPageAdapter(getChildFragmentManager(), mFragments);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    private void initTab() {
        String[] strings = getResources().getStringArray(R.array.zhibotitle);
        for (int i = 0; i < strings.length; i++) {

            TabLayout.Tab tab = mTabLayout.newTab();
            tab.setText(strings[i]);

            mTabLayout.addTab(tab);
            mTabLayout.setTabMode(TabLayout.MODE_FIXED);
            mTabLayout.setSelectedTabIndicatorColor(Color.BLACK);

            mTabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
            mTabLayout.setTabTextColors(Color.GRAY, Color.BLACK);
        }
    }

    private void createFragment() {
        int[] layoutIds = new int[]{R.layout.fragment_tui_jian, R.layout.fragment_hot, R.layout.fragment_cai_yi
                , R.layout.fragment_guan_zhu, R.layout.fragment_xin_ren, R.layout.fragment_near_by};
        mFragments = new ArrayList<>();
        for (int i = 0; i < layoutIds.length; i++) {
            mFragments.add(FragmentFactory.createZhiBoById(layoutIds[i]));

        }
    }


    public void toOtherFragment(int i) {
        mViewPager.setCurrentItem(i, true);
    }


    @Override
    public void onClick(View v) {
        LoadUtils.toSearchActivity(getContext(), getActivity());
    }
}
