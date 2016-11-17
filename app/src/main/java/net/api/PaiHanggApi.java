package net.api;

import android.util.ArrayMap;

import fragment.friend.bean.PaiHangBean;
import fragment.zhibo.bean.CaiYiBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/8.
 */
public interface PaiHanggApi {
    @GET("rank/all")
    public Call<PaiHangBean> getPaiHang(@QueryMap ArrayMap<String, String> params);

}
