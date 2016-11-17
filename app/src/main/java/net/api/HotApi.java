package net.api;

import android.util.ArrayMap;

import fragment.zhibo.bean.CaiYiBean;
import fragment.zhibo.bean.HotBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/6.
 */
public interface HotApi {
    @GET("home/get_single")
    public Call<HotBean> getHot(@QueryMap ArrayMap<String, String> params);
}
