package fragment.message.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/11/5.
 */
public class MessageFragmentPageAdaper extends FragmentPagerAdapter {
    private List<Fragment> mFragments=null;
    public MessageFragmentPageAdaper(FragmentManager fm, List<Fragment>mFragments) {
        super(fm);
        this.mFragments=mFragments;
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
