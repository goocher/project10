package DefineView.shafflingview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gooch on 2016/10/16.
 */
public class ShufflingView extends LinearLayout implements ViewPager.OnPageChangeListener,
        ViewPagerAdapter.ViewpagerOnitemClicklistener {

    private Context mContext;
    private ViewPager mViewPager;
    private LinearLayout mContainer;
    private int mPreviousPos;// 上一个圆点的位置
    private List<String> mImageIds = new ArrayList<>();
    private OnitemClicklistener mOnitemClicklistener;

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {

            if (msg.what==0){
                // 更新页面，获取当前页面,跳到下一页
                mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1, true);
                // 发送延时3秒的消息
                mHandler.sendEmptyMessageDelayed(0, 3000);
            }
        }
    };

    //设置图片的数据集合
    public void setImagers(List<String> ImagUrl) {
        if (mImageIds.size() > 0) {
            mImageIds.clear();
        }
        mImageIds.addAll(ImagUrl);
        mViewPager.setAdapter(new ViewPagerAdapter(mContext, mImageIds, this));
        initOrigin(mContext);
        // 图片集合的倍数，这样就可以与初始化数据同步且双向滑动
        mViewPager.setCurrentItem(mImageIds.size() * 1000 , true);
        mContainer.getChildAt(0).setEnabled(true);
        mHandler.sendEmptyMessageDelayed(0, 3000);

    }

    //item的点击监听
    public void setOnitemClicklistener(OnitemClicklistener onitemClicklistener) {
        mOnitemClicklistener = onitemClicklistener;
    }



    public ShufflingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public ShufflingView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ShufflingView(Context context) {
        this(context,null);
    }

    private void initView(Context context) {
        mContext = context;
        View view = View.inflate(context, R.layout.shufflingview, this);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mContainer = (LinearLayout) view.findViewById(R.id.ll_container);
        mViewPager.addOnPageChangeListener(this);
        //这是viewpager的滑动动画，还在学习中，先注释哈~
        // mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        //mViewPager.setPageTransformer(true, new DepthPageTransformer());
    }

    //初始化原点位置
    private void initOrigin(Context context) {
        for (int i = 0; i < mImageIds.size(); i++) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.point_selector);
            // 设置布局参数，父控件是谁就是谁的布局参
            LayoutParams params = new LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT);

            // 从第二个圆开始设置左边距
            if (i > 0) {
                // 第二个圆左边距5个像素
                params.leftMargin = 7;
                // 设置原点为不可用
                imageView.setEnabled(false);
            }
            // 给图片设置布局参数
            imageView.setLayoutParams(params);
            // 将原点添加到线性布局
            mContainer.addView(imageView);
        }
        mContainer.getChildAt(0).setEnabled(true);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        position = position % mImageIds.size();
        //当页面被选中的时候，当前的原点为红色，上一个原点为灰色
        // 通过父控件找到子控件（根据位置）
        mContainer.getChildAt(position).setEnabled(true);
        // 上一个原点为灰色
        mContainer.getChildAt(mPreviousPos).setEnabled(false);
        mPreviousPos = position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void setOnitemClicklistener(int position) {
        //点击监听：给使用者使用
        mOnitemClicklistener.setOnitemClicklistener(position);
    }

    public interface OnitemClicklistener {
        void setOnitemClicklistener(int position);
    }
}