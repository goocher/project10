package net.api;

import android.util.ArrayMap;

import fragment.zhibo.bean.GuanZhuBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by WH on 2016/11/6.
 */
public interface GuanZhuApi {

    @GET("home/get_single")
    public Call<GuanZhuBean> getGuanZhu(@QueryMap ArrayMap<String, String> params);
}
