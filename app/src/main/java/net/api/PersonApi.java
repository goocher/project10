package net.api;

import android.util.ArrayMap;

import com.gooch.showtogether.person.PersonBean;

import fragment.friend.bean.PaiHangBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/8.
 */
public interface PersonApi {
    @GET("user/get_imploded")
    public Call<PersonBean> getPerson(@QueryMap ArrayMap<String, String> params);
}
