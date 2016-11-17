package DefineView.shafflingview;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.gooch.showtogether.R;

import java.util.List;

import utils.LoadUtils;

/**
 * Created by Gooch on 2016/10/16.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<String> mImageIds;
    private ViewpagerOnitemClicklistener mViewpagerOnitemClicklistener;

    public ViewPagerAdapter(Context mContext, List<String> mImageIds, ViewpagerOnitemClicklistener viewpagerOnitemClicklistener) {
        this.mContext = mContext;
        this.mImageIds = mImageIds;
        this.mViewpagerOnitemClicklistener = viewpagerOnitemClicklistener;
    }

    public void setViewpagerOnitemClicklistener(ViewpagerOnitemClicklistener viewpagerOnitemClicklistener) {
        mViewpagerOnitemClicklistener = viewpagerOnitemClicklistener;
    }

    @Override
    public int getCount() {
        // 无限滑动，设置返回为整数最大数
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        // 初始化图片布局
        //用Xutils加载图片
//        x.image().bind(view, mImageIds.get(position % mImageIds.size()));
//        NetWorkImageView netWorkImageView=new NetWorkImageView(mContext);
        ImageView imageView=new ImageView(mContext);
        LoadUtils.loadImage(mContext,imageView,mImageIds.get(position%mImageIds.size()),R.mipmap.focus_img_nonet,R.mipmap.focus_img_nonet);
//        netWorkImageView.setImageResource(R.mipmap.focus_img_nonet);
//        netWorkImageView.setUrl(mImageIds.get(position%mImageIds.size())).loadImage();
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(imageView);
        //点击监听的回调，给View层使用，要把position回传
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewpagerOnitemClicklistener.setOnitemClicklistener(position % mImageIds.size());
            }
        });
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    //点击监听的接口
    public interface ViewpagerOnitemClicklistener {
        void setOnitemClicklistener(int position);
    }

}
