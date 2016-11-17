package fragment.zhibo.adatper.XinRenadapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
public class XinrenViewPageAdapter extends PagerAdapter{

    List<ImageView> data;

    public XinrenViewPageAdapter(List<ImageView> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView ret= data.get(position);
        container.addView(ret);
        return ret;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
        container.removeView(data.get(position));
    }
}
