package net.api;

import android.util.ArrayMap;


import fragment.zhibo.bean.TuiJian;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/1.
 */
public interface TuiJianApi {

    @GET("home/get_multi")
    public Call<TuiJian> getTuiJian(@QueryMap ArrayMap<String, String> params);

}
