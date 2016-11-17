
package com.gooch.showtogether;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gooch.showtogether.Commen.PeriscopeLayout;
import com.gooch.showtogether.UserAdapter.UserAdaper;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import fragment.zhibo.bean.CaiYiBean;
import fragment.zhibo.bean.HotBean;
import fragment.zhibo.bean.NearByInfo;
import fragment.zhibo.bean.TuiJian;
import fragment.zhibo.bean.XinrenInfo;
import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.VideoView;
import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.loader.ILoader;
import master.flame.danmaku.danmaku.loader.IllegalDataException;
import master.flame.danmaku.danmaku.loader.android.DanmakuLoaderFactory;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.BaseCacheStuffer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.model.android.SpannedCacheStuffer;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.parser.IDataSource;
import master.flame.danmaku.danmaku.util.IOUtils;

import utils.CircleTransform;
import utils.LoadUtils;

public class ToPlayActivity extends AppCompatActivity implements View.OnClickListener {

    private IDanmakuView mDanmakuView;

    private View mMediaController;

    public PopupWindow mPopupWindow;

    private Button mBtnRotate;

//    private ImageView mBtnHideDanmaku;

    private ImageView mBtnShowDanmaku;

    private BaseDanmakuParser mParser;

//    private Button mBtnPauseDanmaku;

    private ImageView mBtnResumeDanmaku;

    private ImageView mBtnSendDanmaku;

    private ImageView mBtnSendDanmakuTextAndImage;
    private ImageView cancel;
    private ImageView mBtnSendDanmakus;
    private DanmakuContext mContext;
    private ImageView mImagePrepared;
    private RelativeLayout mNoLive;
    private String path = "";
    private RecyclerView mRecyclerView=null;
    private RecyclerView mListView=null;
    private ImageView btnHide;
    private ImageView iconLive;
    private TextView nickNameLive;
    private TextView userCount;
    private TextView meiLiZhi;
    private ImageView sendHeart;


    private BaseCacheStuffer.Proxy mCacheStufferAdapter = new BaseCacheStuffer.Proxy() {

        private Drawable mDrawable;

        @Override
        public void prepareDrawing(final BaseDanmaku danmaku, boolean fromWorkerThread) {
            if (danmaku.text instanceof Spanned) { // 根据你的条件检查是否需要需要更新弹幕
                // FIXME 这里只是简单启个线程来加载远程url图片，请使用你自己的异步线程池，最好加上你的缓存池
                new Thread() {

                    @Override
                    public void run() {
                        String url = "http://www.bilibili.com/favicon.ico";
                        InputStream inputStream = null;
                        Drawable drawable = mDrawable;
                        if(drawable == null) {
                            try {
                                URLConnection urlConnection = new URL(url).openConnection();
                                inputStream = urlConnection.getInputStream();
                                drawable = BitmapDrawable.createFromStream(inputStream, "bitmap");
                                mDrawable = drawable;
                            } catch (MalformedURLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            } finally {
                                IOUtils.closeQuietly(inputStream);
                            }
                        }
                        if (drawable != null) {
                            drawable.setBounds(0, 0, 100, 100);
                            SpannableStringBuilder spannable = createSpannable(drawable);
                            danmaku.text = spannable;
                            if(mDanmakuView != null) {
                                mDanmakuView.invalidateDanmaku(danmaku, false);
                            }
                            return;
                        }
                    }
                }.start();
            }
        }

        @Override
        public void releaseResource(BaseDanmaku danmaku) {
            // TODO 重要:清理含有ImageSpan的text中的一些占用内存的资源 例如drawable
        }
    };
    private UserAdaper mUserAdaper;
    private List<Gift> mGifts;
    private Timer mTimer;
    private LiveListAdapter mAdapter;
    private PeriscopeLayout mPeriscopeLayout;

    /**
     * 绘制背景(自定义弹幕样式)
     */
    private static class BackgroundCacheStuffer extends SpannedCacheStuffer {
        // 通过扩展SimpleTextCacheStuffer或SpannedCacheStuffer个性化你的弹幕样式
        final Paint paint = new Paint();

        @Override
        public void measure(BaseDanmaku danmaku, TextPaint paint, boolean fromWorkerThread) {
            danmaku.padding = 10;  // 在背景绘制模式下增加padding
            super.measure(danmaku, paint, fromWorkerThread);
        }

        @Override
        public void drawBackground(BaseDanmaku danmaku, Canvas canvas, float left, float top) {
            paint.setColor(0xf0ff0f);
            canvas.drawRect(left + 2, top + 2, left + danmaku.paintWidth - 2, top + danmaku.paintHeight - 2, paint);
        }

        @Override
        public void drawStroke(BaseDanmaku danmaku, String lineText, Canvas canvas, float left, float top, Paint paint) {
            // 禁用描边绘制
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vitamio.initialize(this);
        if (!LibsChecker.checkVitamioLibs(this))
            return;
        setContentView(R.layout.activity_to_play);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        initView();
        initData();
        initHeart();
        findViews();
        initTitle();

    }


    private void initHeart() {
        mPeriscopeLayout = (PeriscopeLayout) findViewById(R.id.btn_sendheart);

    }


    private void initTitle() {

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mUserAdaper = new UserAdaper(this);
        mRecyclerView.setAdapter(mUserAdaper);
        List<String>strings=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strings.add("http://p1.so.qhmsg.com/t01d3af10f9d1736bab.jpg");
        }
        mUserAdaper.setList(strings);
        mUserAdaper.setOnRecyvlerItemClickListener(new UserAdaper.OnRecyvlerItemClickListener() {
            @Override
            public void onClick(View view, UserAdaper.MyViewHolder myViewHolder, int position) {
                initTitlePopup(view);
            }
        });
    }

    private void initTitlePopup(View view) {

        View contentView= LayoutInflater.from(this).inflate(R.layout.popup_title_live_layout, null);
        View baseLine=findViewById(R.id.baseline);
        ImageView icon= (ImageView) contentView.findViewById(R.id.icon_popTitle);
        String path="http://p1.so.qhmsg.com/t01d3af10f9d1736bab.jpg";
        LoadUtils.loadImage(this,icon,path,R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());

        //参数四：设置popupWindow是否获取焦点
        mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        //设置
        //popupWindow不会占满全屏，当点击其他位置是否允许窗口取消
        mPopupWindow.setOutsideTouchable(true);

        //如果想让popupWindow必须设置setBackgroundDrawable方法，漏洞
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.alpha(0x47C7C4C7)));

        //参数1：只要是一个当前activity下的view就行       getWindowToken识别的窗体
        //参数三和四  偏移量  x轴和y轴
//        mPopupWindow.showAtLocation(getWindow().getDecorView(), Gravity.BOTTOM, 0, 0);
        //参数四；只能是right或left   只能是左对齐或右对齐
        mPopupWindow.showAsDropDown(baseLine, 0, 0, Gravity.LEFT);

    }

    private BaseDanmakuParser createParser(InputStream stream) {

        if (stream == null) {
            return new BaseDanmakuParser() {

                @Override
                protected Danmakus parse() {
                    return new Danmakus();
                }
            };
        }

        ILoader loader = DanmakuLoaderFactory.create(DanmakuLoaderFactory.TAG_BILI);

        try {
            loader.load(stream);
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
        BaseDanmakuParser parser = new BiliDanmukuParser();
        IDataSource<?> dataSource = loader.getDataSource();
        parser.load(dataSource);
        return parser;

    }

    private void findViews() {

        mMediaController = findViewById(R.id.media_controller);
        mBtnResumeDanmaku = (ImageView) findViewById(R.id.btn_resume);
        mBtnSendDanmaku = (ImageView) findViewById(R.id.btn_send);
        mBtnSendDanmakuTextAndImage = (ImageView) findViewById(R.id.btn_send_image_text);
        mBtnSendDanmakus = (ImageView) findViewById(R.id.btn_send_danmakus);
        mMediaController.setOnClickListener(this);
        sendHeart= (ImageView) findViewById(R.id.btn_sendheart_danmakus);
        mBtnResumeDanmaku.setOnClickListener(this);
        mBtnSendDanmaku.setOnClickListener(this);
        mBtnSendDanmakuTextAndImage.setOnClickListener(this);
        mBtnSendDanmakus.setOnClickListener(this);
        btnHide= (ImageView) findViewById(R.id.btn_hide);
        sendHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.addList("你点亮了爱心！！");
                mPeriscopeLayout.addHeart();
                mTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mPeriscopeLayout.addHeart();
                            }
                        });
                    }
                },0,600);



            }
        });
        // VideoView
        VideoView mVideoView = (VideoView) findViewById(R.id.videoView);
        // DanmakuView
        btnHide.setOnClickListener(this);
        // 设置最大显示行数
        HashMap<Integer, Integer> maxLinesPair = new HashMap<Integer, Integer>();
        maxLinesPair.put(BaseDanmaku.TYPE_SCROLL_RL, 5); // 滚动弹幕最大显示5行
        // 设置是否禁止重叠
        HashMap<Integer, Boolean> overlappingEnablePair = new HashMap<Integer, Boolean>();
        overlappingEnablePair.put(BaseDanmaku.TYPE_SCROLL_RL, true);
        overlappingEnablePair.put(BaseDanmaku.TYPE_FIX_TOP, true);

        mDanmakuView = (IDanmakuView) findViewById(R.id.sv_danmaku);
        mContext = DanmakuContext.create();
        mContext.setDanmakuStyle(IDisplayer.DANMAKU_STYLE_STROKEN, 3).setDuplicateMergingEnabled(false).setScrollSpeedFactor(1.2f).setScaleTextSize(1.2f)
        .setCacheStuffer(new SpannedCacheStuffer(), mCacheStufferAdapter) // 图文混排使用SpannedCacheStuffer
//        .setCacheStuffer(new BackgroundCacheStuffer())  // 绘制背景使用BackgroundCacheStuffer
        .setMaximumLines(maxLinesPair)
        .preventOverlapping(overlappingEnablePair);
        if (mDanmakuView != null) {
            mParser = createParser(this.getResources().openRawResource(R.raw.comments));
            mDanmakuView.setCallback(new master.flame.danmaku.controller.DrawHandler.Callback() {
                @Override
                public void updateTimer(DanmakuTimer timer) {
                }

                @Override
                public void drawingFinished() {

                }

                @Override
                public void danmakuShown(BaseDanmaku danmaku) {
//                    Log.d("DFM", "danmakuShown(): text=" + danmaku.text);
                }

                @Override
                public void prepared() {
                    mDanmakuView.start();
                }
            });
            mDanmakuView.setOnDanmakuClickListener(new IDanmakuView.OnDanmakuClickListener() {

                @Override
                public boolean onDanmakuClick(IDanmakus danmakus) {
                    Log.d("DFM", "onDanmakuClick: danmakus size:" + danmakus.size());
                    BaseDanmaku latest = danmakus.last();
                    if (null != latest) {
                        Log.d("DFM", "onDanmakuClick: text of latest danmaku:" + latest.text);
                        return true;
                    }
                    return false;
                }

                @Override
                public boolean onViewClick(IDanmakuView view) {
                    mMediaController.setVisibility(View.VISIBLE);
                    return false;
                }
            });
            mDanmakuView.prepare(mParser, mContext);
            mDanmakuView.showFPS(false);
            mDanmakuView.enableDanmakuDrawingCache(true);
        }
        if (path == "") {
            // Tell the user to provide a media file URL.
            Toast.makeText(ToPlayActivity.this, "Please edit MediaPlayerDemo_Video Activity," + " and set the path variable to your media file URL.", Toast.LENGTH_LONG).show();
            return;
        }
        if (mVideoView != null) {
            mVideoView.setVideoURI(Uri.parse(path));
            mVideoView.setOnPreparedListener(new io.vov.vitamio.MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(io.vov.vitamio.MediaPlayer mp) {
                    mp.start();

                }
            });
            mVideoView.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
                @Override
                public void onBufferingUpdate(MediaPlayer mp, int percent) {
                    if (percent==50){
                        mImagePrepared.setVisibility(View.GONE);
                        huaban.setVisibility(View.VISIBLE);
                        btnHide.setVisibility(View.VISIBLE);

                    }
                }
            });


        }

    }
    private boolean isLive = false;
    private void initView() {
        iconLive= (ImageView) findViewById(R.id.icon_live);
        nickNameLive= (TextView) findViewById(R.id.nickname_live);
        userCount= (TextView) findViewById(R.id.count_live);
        meiLiZhi= (TextView) findViewById(R.id.meilicount_live);
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView_live);
        cancel= (ImageView) findViewById(R.id.cancel_live);
        mImagePrepared = (ImageView) findViewById(R.id.cover_prepared);
        mNoLive = (RelativeLayout) findViewById(R.id.noLive);
        huaban=findViewById(R.id.huaban_live);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToPlayActivity.this.finish();
            }
        });
        mListView= (RecyclerView) findViewById(R.id.recyclerView_chat_live);
        mListView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new LiveListAdapter(this);
        mListView.setAdapter(mAdapter);
        final List<String>list=new ArrayList<>();
        String[] stringArray = getResources().getStringArray(R.array.fayan);
        for (int i = 0; i < stringArray.length; i++) {
            list.add(stringArray[i]);
        }


        mAdapter.setList(list);
        mTimer = new Timer();

        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter.addList(list.get((int) (Math.random()*4)));
                        mListView.smoothScrollToPosition(list.size()-1);
                    }
                });

            }
        },0,1500);
    }
    private void initData() {
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        int type = 0;
        if (bundle != null) {

            Parcelable livelistBean = bundle.getParcelable("livelistBean");
            type = bundle.getInt("class");
            switch (type) {
                case 0:
                    TuiJian.ListBean.LivelistBean bean0 = (TuiJian.ListBean.LivelistBean) livelistBean;
                    path = bean0.getRtmp();
                    LoadUtils.loadImage(this, mImagePrepared, bean0.getCover());
                    isLive = bean0.isIs_live();
                    LoadUtils.loadImage(this,iconLive,bean0.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
                    nickNameLive.setText(bean0.getUser().getNickname());
                    meiLiZhi.setText(bean0.getUser().getCredits()+"");
                    userCount.setText(bean0.getUsers()+"");
                    break;
                case 1:
                    HotBean.InfoBean.LivelistBean bean1 = (HotBean.InfoBean.LivelistBean) livelistBean;
                    path = bean1.getRtmp();
                    LoadUtils.loadImage(this, mImagePrepared, bean1.getCover());
                    isLive = bean1.isIs_live();
                    LoadUtils.loadImage(this,iconLive,bean1.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
                    nickNameLive.setText(bean1.getUser().getNickname());
                    meiLiZhi.setText(bean1.getUser().getCredits()+"");
                    userCount.setText(bean1.getUsers()+"");
                    break;
                case 2:
                    CaiYiBean.InfoBean.LivelistBean bean2 = (CaiYiBean.InfoBean.LivelistBean) livelistBean;
                    path = bean2.getRtmp();
                    LoadUtils.loadImage(this, mImagePrepared, bean2.getCover());
                    isLive = bean2.isIs_live();
                    LoadUtils.loadImage(this,iconLive,bean2.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
                    nickNameLive.setText(bean2.getUser().getNickname());
                    meiLiZhi.setText(bean2.getUser().getCredits()+"");
                    userCount.setText(bean2.getUsers()+"");
                    break;
                case 4:
                    XinrenInfo.InfoBean.LivelistBean bean4 = (XinrenInfo.InfoBean.LivelistBean) livelistBean;
                    path = bean4.getRtmp();
                    LoadUtils.loadImage(this, mImagePrepared, bean4.getCover());
                    isLive = bean4.isIs_live();
                    LoadUtils.loadImage(this,iconLive,bean4.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
                    nickNameLive.setText(bean4.getUser().getNickname());
                    meiLiZhi.setText(bean4.getUser().getCredits()+"");
                    userCount.setText(bean4.getUsers()+"");
                    break;
                case 5:
                    NearByInfo.InfoBean.LivelistBean bean5 = (NearByInfo.InfoBean.LivelistBean) livelistBean;
                    path = bean5.getRtmp();
                    LoadUtils.loadImage(this, mImagePrepared, bean5.getCover());
                    isLive = bean5.isIs_live();
                    LoadUtils.loadImage(this,iconLive,bean5.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
                    nickNameLive.setText(bean5.getUser().getNickname());
                    meiLiZhi.setText(bean5.getUser().getCredits()+"");
                    userCount.setText(bean5.getUsers()+"");
                    break;

            }
            if (!isLive) {
                mNoLive.setVisibility(View.VISIBLE);
            } else
                mNoLive.setVisibility(View.GONE);
        }

    }


    @Override
    protected void onResume() {
        super.onResume();
        if (mDanmakuView != null && mDanmakuView.isPrepared() && mDanmakuView.isPaused()) {
            mDanmakuView.resume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDanmakuView != null) {
            // dont forget release!
            mDanmakuView.release();
            mDanmakuView = null;
        }
        mTimer.cancel();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mDanmakuView != null) {
            // dont forget release!
            mDanmakuView.release();
            mDanmakuView = null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    private boolean isHide=false;
    private View huaban= null;
    @Override
    public void onClick(View v) {
        if (v == btnHide) {
            if (!isHide) {
                huaban.setVisibility(View.GONE);
            }else {
                huaban.setVisibility(View.VISIBLE);
            }
            isHide=!isHide;
        }
        if (mDanmakuView == null || !mDanmakuView.isPrepared())
            return;
       if (v == mBtnSendDanmaku) {
            addDanmaku(false);
        } else if (v == mBtnSendDanmakuTextAndImage) {
           popupGift();
//            addDanmaKuShowTextAndImage(false);
        }
    }
    private void initgridData() {
        List<Gift>mGifts = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.giftname);
        String[] values = getResources().getStringArray(R.array.giftvalue);
        for (int i = 0; i < 8; i++) {

            int resId=getResources().getIdentifier("t"+(i+1),"mipmap",this.getPackageName());
            Gift gift=new Gift();
            gift.setBitmap(BitmapFactory.decodeResource(getResources(),resId));
            gift.setName(names[i]);
            gift.setValue(values[i]);
            mGifts.add(gift);
        }
//        gridViewAdapter.setGiftList(mGifts);
    }
//    public void translate(View view){
//        TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_PARENT,
//                1.0f,Animation.RELATIVE_TO_PARENT,-1.0f,Animation.RELATIVE_TO_PARENT,-1.0f,
//                Animation.RELATIVE_TO_PARENT,1.0f);
//        translateAnimation.setDuration(2000);
//        translateAnimation.setInterpolator(new Interpolator() {
//            @Override
//            public float getInterpolation(float input) {
//                return 2.0f;
//            }
//        });
//        view.setAnimation(translateAnimation);
//        view.startAnimation(translateAnimation);
//    }
    private void popupGift() {
        View contentView= LayoutInflater.from(this).inflate(R.layout.fragment_gift, null);
//        ViewPager viewPager= (ViewPager) contentView.findViewById(R.id.viewpager_gift_live);
//       List<Fragment>fragments=new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            fragments.add(new GiftFragment());
//        }
//        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),fragments);
//       viewPager.setAdapter(fragmentAdapter);
        Button chongZhi = (Button) contentView.findViewById(R.id.chongzhi_gift_live);
        chongZhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPopupWindow.dismiss();
                LoadUtils.toChongZhiActivity(ToPlayActivity.this,ToPlayActivity.this);
            }
        });
        GridView gridView= (GridView) contentView.findViewById(R.id.gridView_gift);
        GiftGridViewAdapter gridViewAdapter =new GiftGridViewAdapter(this);
        gridView.setAdapter(gridViewAdapter);
        mGifts = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.giftname);
        String[] values = getResources().getStringArray(R.array.giftvalue);
        final int[]resIds=new int[8];
        for (int i = 0; i < 8; i++) {

             resIds[i]=getResources().getIdentifier("t"+(i+1),"mipmap",this.getPackageName());
            Gift gift=new Gift();
            gift.setBitmap(BitmapFactory.decodeResource(getResources(),resIds[i]));
            gift.setName(names[i]);
            gift.setValue(values[i]);
            mGifts.add(gift);
        }
        gridViewAdapter.setGiftList(mGifts);

//        gridViewAdapter.setGiftList(mGifts);


        //参数四：设置popupWindow是否获取焦点
        mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT,240, true);
        //设置
        //popupWindow不会占满全屏，当点击其他位置是否允许窗口取消
        mPopupWindow.setOutsideTouchable(true);

        //如果想让popupWindow必须设置setBackgroundDrawable方法，漏洞
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.alpha(0x47C7C4C7)));

        //参数1：只要是一个当前activity下的view就行       getWindowToken识别的窗体
        //参数三和四  偏移量  x轴和y轴

        mPopupWindow.showAtLocation(mMediaController, Gravity.BOTTOM, 0, 0);
        //参数四；只能是right或left   只能是左对齐或右对齐
//                popupWindow.showAsDropDown(view, 0, 0, Gravity.LEFT);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                addDanmaKuShowTextAndImage(true,resIds[position],position);
//                translate(view);
                mPopupWindow.dismiss();
            }
        });

    }


    private void addDanmaku(boolean islive) {
        BaseDanmaku danmaku = mContext.mDanmakuFactory.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL);
        if (danmaku == null || mDanmakuView == null) {
            return;
        }
        // for(int i=0;i<100;i++){
        // }
        danmaku.text = "这是一条弹幕" + System.nanoTime();
        danmaku.padding = 5;
        danmaku.priority = 0;  // 可能会被各种过滤器过滤并隐藏显示
        danmaku.isLive = islive;
        danmaku.setTime(mDanmakuView.getCurrentTime() + 1200);
        danmaku.textSize = 25f * (mParser.getDisplayer().getDensity() - 0.6f);
        danmaku.textColor = Color.RED;
        danmaku.textShadowColor = Color.WHITE;
        // danmaku.underlineColor = Color.GREEN;
        danmaku.borderColor = Color.GREEN;
        mDanmakuView.addDanmaku(danmaku);

    }

    private void addDanmaKuShowTextAndImage(boolean islive,int resId,int position) {
        BaseDanmaku danmaku = mContext.mDanmakuFactory.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL);
        Drawable drawable = getResources().getDrawable(resId);
        drawable.setBounds(0, 0, 100, 100);
        SpannableStringBuilder spannable = createSpannable(drawable);
        danmaku.text = spannable;
        danmaku.padding = 5;
        danmaku.priority = 1;  // 一定会显示, 一般用于本机发送的弹幕
        danmaku.isLive = islive;
        danmaku.setTime(mDanmakuView.getCurrentTime() + 1200);
        danmaku.textSize = 25f * (mParser.getDisplayer().getDensity() - 0.6f);

        danmaku.textColor = Color.RED;
        danmaku.textShadowColor = 0; // 重要：如果有图文混排，最好不要设置描边(设textShadowColor=0)，否则会进行两次复杂的绘制导致运行效率降低
        danmaku.underlineColor = Color.YELLOW;

        mDanmakuView.addDanmaku(danmaku);
    }

    private SpannableStringBuilder createSpannable(Drawable drawable) {
        String text = "bitmap";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        ImageSpan span = new ImageSpan(drawable);//ImageSpan.ALIGN_BOTTOM);
        spannableStringBuilder.setSpan(span, 0, text.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append("送了一个"+"！！");
        spannableStringBuilder.setSpan(new BackgroundColorSpan(Color.parseColor("#03CFCFCB")), 0, spannableStringBuilder.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        return spannableStringBuilder;
    }

}
