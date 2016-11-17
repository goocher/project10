package net.api;

import android.util.ArrayMap;

import fragment.zhibo.bean.NearByInfo;
import fragment.zhibo.bean.XinrenInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/6.
 */
public interface XinrenApi {
    @GET("home/get_single")
    public Call<XinrenInfo> getXinwenInfo(@QueryMap ArrayMap<String, String> params) ;
}
