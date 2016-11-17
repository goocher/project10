package net.api;

import android.util.ArrayMap;

import fragment.friend.bean.HaoyouBean;
import fragment.zhibo.bean.HotBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/8.
 */
public interface HaoyouApi {

    @GET("user/get_follow2")
    public Call<HaoyouBean> getHaoyou(@QueryMap ArrayMap<String, String> params);
}
