package net.api;

import android.util.ArrayMap;

import fragment.friend.adapter.pengyouquan.bean.UserInfo;
import fragment.friend.bean.PaiHangBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/12.
 */
public interface PengYouQuangApi {

    @GET("quan/get_follow")
    public Call<UserInfo> getPengyouquang(@QueryMap ArrayMap<String, String> params);
}
