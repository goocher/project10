package net.api;

import android.util.ArrayMap;

import fragment.zhibo.bean.NearByInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/5.
 */
public interface NearByInfoApi {
    @GET("home/get_single")
    public Call<NearByInfo> getNearbyInfo(@QueryMap ArrayMap<String,String> params);
}
