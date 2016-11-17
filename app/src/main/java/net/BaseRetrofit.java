package net;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import url.AppConfig;
import url.UrlConfig;

/**
 * Created by Administrator on 2016/11/1.
 */
public class BaseRetrofit {
    private static Retrofit mRetrofit=null;
    private static BaseRetrofit sBaseRetrofit=null;
    public static Retrofit getRetrofit(){
        return mRetrofit;
    }
    public  static void init(){
        if (sBaseRetrofit==null){
            sBaseRetrofit= new BaseRetrofit();
        }

    }
    private BaseRetrofit (){
        //创建http连接的对象client
        OkHttpClient.Builder okHttpBuilder=new OkHttpClient.Builder();
        okHttpBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original=chain.request();
                HttpUrl httpUrl=original.url().newBuilder().build();
                Request request=original.newBuilder()
                        .addHeader("user-agent","android")
                        .addHeader("Accept","application/x-www-form-urlencoded")
                        .addHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8")
                        .url(httpUrl)
//                        .addHeader("signed","ljdflskjksjfdlkjslfljllllll")
//                        .addHeader("pageno","123")
                        
                        .build();
                return chain.proceed(request);
            }
        }).connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        //关于rerofit的打印日志，之前不打印，之后大神有打印日志的方式
        //鉴于此，retrofit官方提供了打印日志的方式
        if (AppConfig.isDebug){
            HttpLoggingInterceptor logging=new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpBuilder.addInterceptor(logging);
        }
        OkHttpClient client=okHttpBuilder.build();


        //创建Retrofit对象
        Retrofit.Builder builder=new Retrofit.Builder();
        builder.baseUrl(UrlConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client);
        mRetrofit=builder.build();
    };
}
