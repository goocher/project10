package net.api;

import android.util.ArrayMap;


import fragment.zhibo.bean.CaiYiBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/1.
 */
public interface CaiYiApi {
    @GET("home/get_single")
   public Call<CaiYiBean> getCaiYi(@QueryMap ArrayMap<String, String> params);

}
