package com.gooch.showtogether;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import base.BaseActivity;
import fragment.zhibo.bean.TuiJian;
import retrofit2.Call;
import retrofit2.Response;
import utils.LoadUtils;

public class YaoYiYaoActivity extends BaseActivity implements View.OnClickListener {
    private SensorManager mSensorManager=null;
    private Sensor mSensor=null;
    private SensorEventListener mSensorEventListener=null;
    private SoundPool mSoundPool=null;
    private int soundId1=0;
    private int soundId2=0;
    private ImageView back;
    private LinearLayout container;
    private TuiJian mTuiJian;
    private ImageView icon;
    private TextView nickName;
    private AnimationDrawable mDrawable;
    private ImageView define;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yao_yi_yao);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        initSoundPool();
        init();
        mSensorManager= (SensorManager) getSystemService(SENSOR_SERVICE);
        mSensor=mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorEventListener= new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float temp=Math.max(Math.max(event.values[0],event.values[1]),event.values[2]);
                if (temp>max&&System.currentTimeMillis()-5000>time) {
                    time = System.currentTimeMillis();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //控制一抬手就想了
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            mSoundPool.play(soundId1, 1f, 1f, 0, 0, 1f);

                            //为了网络访问
                           initData();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    define.setBackgroundResource(R.drawable.frame_jd);
                                    mDrawable = (AnimationDrawable) define.getBackground();
                                    mDrawable.start();
                                }
                            });

                        }
                    }).start();
                }
                }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
        mSensorManager.registerListener(mSensorEventListener,mSensor,SensorManager.SENSOR_DELAY_GAME);
    }

    private void init() {
        initView();
        initBack();
//        initData();
    }

    private void initData() {
        TuiJian.load(this);
    }

    private void initBack() {
        back.setOnClickListener(this);
    }

    private void initView() {
        back= (ImageView) findViewById(R.id.back_yaoyiyao);
        container= (LinearLayout) findViewById(R.id.container_yaoyiyao);
        icon= (ImageView) findViewById(R.id.icon_yaoyiyao);
        nickName= (TextView) findViewById(R.id.nickName_yaoyiyao);
        define= (ImageView) findViewById(R.id.define);
    }

    private void initSoundPool() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            SoundPool.Builder builder=new SoundPool.Builder();
            mSoundPool=builder.build();
        }else {
            mSoundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        }
        soundId1=mSoundPool.load(getApplicationContext(),R.raw.shake_sound_male,1);
        soundId2=mSoundPool.load(getApplicationContext(),R.raw.shake_match,1);
    }
    private Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
           int size= mTuiJian.getList().size();
            LoadUtils.loadImage(YaoYiYaoActivity.this,icon,mTuiJian.getList().get(0).getLivelist().get(new Random().nextInt(size)).getUser().getAvatar(),R.mipmap.default_img,R.mipmap.add_album_cover);
            nickName.setText(mTuiJian.getList().get(0).getName());
            container.startAnimation(AnimationUtils.loadAnimation(YaoYiYaoActivity.this,
                    R.anim.from_downtoup));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mDrawable.stop();

                }
            }).start();
            mSoundPool.play(soundId2,1f,1f,0,0,1f);

        }
    };
    private float max=15f;
    private long time=0;
    private int path=0;


    @Override
    public void onClick(View v) {
        YaoYiYaoActivity.this.finish();
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        mTuiJian = (TuiJian) response.body();

        mHandler.sendEmptyMessage(1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSensorManager.unregisterListener(mSensorEventListener);
    }
}
