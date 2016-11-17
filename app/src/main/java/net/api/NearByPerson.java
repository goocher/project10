package net.api;

import android.util.ArrayMap;

import fragment.friend.bean.NearByBean;
import fragment.zhibo.bean.HotBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/7.
 */
public interface NearByPerson {
    @GET("user/get_list")
    public Call<NearByBean> getNearByPerson(@QueryMap ArrayMap<String, String> params);
}
