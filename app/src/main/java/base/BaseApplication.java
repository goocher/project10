package base;

import android.app.Application;

import com.gooch.showtogether.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import net.BaseRetrofit;

/**
 * Created by Administrator on 2016/11/1.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseRetrofit.init();


        DisplayImageOptions defaultOptions = new DisplayImageOptions
                .Builder()
                .showImageForEmptyUri(R.mipmap.icon)
                .showImageOnFail(R.mipmap.icon)
                .cacheInMemory(true)
                .cacheOnDisc(true)
                .build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration
                .Builder(getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .discCacheSize(50 * 1024 * 1024)//
                .discCacheFileCount(100)//缂撳瓨涓?櫨寮犲浘鐗?
                .writeDebugLogs()
                .build();
        ImageLoader.getInstance().init(config);

    }
}