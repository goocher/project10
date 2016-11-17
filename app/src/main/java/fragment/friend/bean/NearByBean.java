package fragment.friend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.HotApi;
import net.api.NearByPerson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/7.
 */
public class NearByBean implements Parcelable {

    public static void load(Callback callback) {
        LogUtils.i("flag","load()1");
        NearByPerson nearByPersonApi = BaseRetrofit.getRetrofit().create(NearByPerson.class);

        ArrayMap<String, String> map = new ArrayMap<>();
/*http://api.yiqi1717.com/user/get_list?age_from=0&age_to=0&city=%E5%8C%97%E4%BA%AC%E5%B8%82&constellation=0&distance=0&gender=2&lat=40.043426&lng=116.376632&nonce=mkueq59bcd&orderby=distance&pageindex=1&province=%E5%8C%97%E4%BA%AC%E5%B8%82&publickey=3.9&timestamp=1478513387&token=00f51617b02368a384ab62cff77f2bc5&signature=655863db9ceca9874a9d95125c45628f*/
        map.put("age_from", "0");
        map.put("age_to", "0");
        map.put("city", "北京市");
        map.put("constellation", "0");
        map.put("distance", "0");
        map.put("gender", "2");
        map.put("lat", "40.043426");
        map.put("lng", "116.376632");
        map.put("nonce", "mkueq59bcd");
        map.put("orderby", "distance");
        map.put("pageindex", "1");
        map.put("province", "北京市");
        map.put("publickey", "3.9");
        map.put("timestamp", "1478513387");
        map.put("token", "00f51617b02368a384ab62cff77f2bc5");
        map.put("signature", "655863db9ceca9874a9d95125c45628f");
        LogUtils.i("flag","load2()");
        Call<NearByBean> call = nearByPersonApi.getNearByPerson(map);
        LogUtils.i("flag","load3()");
        call.enqueue(callback);
        LogUtils.i("flag","load4()");

    }

    /**
     * list : [{"uid":5239908,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/57b5f366-1a49-4b2c-b0c2-b6af704f3e52?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"晚安","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"21小时前","lastvisit2":"2016-11-06 21:19:48","distance":"1.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":13,"id":1,"grade":"星","exp":55628,"next":61339,"upgrade":5711,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5239908,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/57b5f366-1a49-4b2c-b0c2-b6af704f3e52?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 08:26:21","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5239908","rtmp":"http://yiqihdl.8686c.com/pajia/5239908.flv"}},{"uid":4563446,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a0864091-6346-4a82-95c3-37b4b779cdec?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"JS-凡姨太","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-03 11:51:26","distance":"3.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1209,"next":1939,"upgrade":730,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4563446,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/a0864091-6346-4a82-95c3-37b4b779cdec?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-14 20:35:22","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4563446","rtmp":"http://yiqihdl.8686c.com/pajia/4563446.flv"}},{"uid":6511802,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0358525d-4fd2-405a-a004-dc84464e846b?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"DQ-Daisy","gender":2,"age":24,"constellation":"魔羯座","lastvisit":"5小时前","lastvisit2":"2016-11-07 13:22:50","distance":"4.1km","sign":"当初可爱的我早已消失不见，取而代之的是更可爱的我","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1704,"next":1939,"upgrade":235,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6511802,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0358525d-4fd2-405a-a004-dc84464e846b?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 19:27:32","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6511802","rtmp":"http://yiqihdl.8686c.com/pajia/6511802.flv"}},{"uid":5882322,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cfcf58cd-3b75-4681-9e88-bfe1f9af17da?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"怪力","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 14:08:36","distance":"4.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":47,"next":619,"upgrade":572,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5882322,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cfcf58cd-3b75-4681-9e88-bfe1f9af17da?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-14 22:56:31","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5882322","rtmp":"http://yiqihdl.8686c.com/pajia/5882322.flv"}},{"uid":5760805,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/48769f34-eb1f-41e7-85b5-f7876262a58c?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"丑小丫","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"4小时前","lastvisit2":"2016-11-07 14:35:15","distance":"4.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":4,"id":1,"grade":"星","exp":2560,"next":3379,"upgrade":819,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5760805,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/48769f34-eb1f-41e7-85b5-f7876262a58c?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-15 01:29:54","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5760805","rtmp":"http://yiqihdl.8686c.com/pajia/5760805.flv"}},{"uid":5998472,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0b447820-a85f-4986-8493-20bee2648de5?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"DCT❤淼淼","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 09:36:14","distance":"4.9km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":3399,"next":5499,"upgrade":2100,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5998472,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0b447820-a85f-4986-8493-20bee2648de5?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-14 23:48:53","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5998472","rtmp":"http://yiqihdl.8686c.com/pajia/5998472.flv"}},{"uid":5965200,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ae2d2d9e-0f13-49eb-977c-acafa118d661?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"萌少女💕💕","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"2天前","lastvisit2":"2016-11-05 15:49:08","distance":"5.0km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1861,"next":1939,"upgrade":78,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5965200,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ae2d2d9e-0f13-49eb-977c-acafa118d661?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-05 16:07:18","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5965200","rtmp":"http://yiqihdl.8686c.com/pajia/5965200.flv"}},{"uid":6572783,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/8dac12dd-5dbc-4062-9eeb-91f7aaa11939?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"DQ金角大王","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-05 19:46:40","distance":"5.1km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":415,"next":619,"upgrade":204,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6572783,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/8dac12dd-5dbc-4062-9eeb-91f7aaa11939?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-03 23:28:34","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6572783","rtmp":"http://yiqihdl.8686c.com/pajia/6572783.flv"}},{"uid":5691791,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2642c485-e518-432a-ab6b-7a8b9873bc2d?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"欢儿","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-05 21:45:00","distance":"5.1km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":4,"id":1,"grade":"星","exp":2832,"next":3379,"upgrade":547,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5691791,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2642c485-e518-432a-ab6b-7a8b9873bc2d?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-10 11:10:48","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5691791","rtmp":"http://yiqihdl.8686c.com/pajia/5691791.flv"}},{"uid":6555738,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a36e1565-6baf-44b0-aaca-75fb2c374aa1?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"DQ 诗欣","gender":2,"age":19,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 02:14:15","distance":"5.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":96,"next":619,"upgrade":523,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6555738,"title":"来抓鬼","cover":"http://yiqi1717-10009627.image.myqcloud.com/a36e1565-6baf-44b0-aaca-75fb2c374aa1?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 23:44:57","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6555738","rtmp":"http://yiqihdl.8686c.com/pajia/6555738.flv"}},{"uid":5375170,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d5d0a1c6-7756-4d8b-8577-8c14ff826a1a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"爱吃榴莲的欣妹妹","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 15:48:17","distance":"5.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":47,"next":619,"upgrade":572,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5375170,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d5d0a1c6-7756-4d8b-8577-8c14ff826a1a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-24 13:41:17","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5375170","rtmp":"http://yiqihdl.8686c.com/pajia/5375170.flv"}},{"uid":5222578,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/87008067-15c3-45f6-8d29-4082fd80dcc3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"ʚ欣妹妹ɞ","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 15:55:19","distance":"5.4km","sign":"遇见你是我的幸运","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":14,"id":1,"grade":"星","exp":67656,"next":74979,"upgrade":7323,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5222578,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/87008067-15c3-45f6-8d29-4082fd80dcc3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-22 15:12:59","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5222578","rtmp":"http://yiqihdl.8686c.com/pajia/5222578.flv"}},{"uid":5944597,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/11e73e61-5281-4b56-896d-cd3c42acb52c?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"梦想高飞","gender":2,"age":26,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 13:57:31","distance":"5.5km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":104,"next":619,"upgrade":515,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5944597,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/11e73e61-5281-4b56-896d-cd3c42acb52c?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-02 13:58:07","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5944597","rtmp":"http://yiqihdl.8686c.com/pajia/5944597.flv"}},{"uid":5984081,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/37b78019-e4e5-49bf-914b-0b84a44a39a6?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"粘土女孩👍起来","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 14:06:15","distance":"5.6km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":335,"next":619,"upgrade":284,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5984081,"title":"和发小Cindy","cover":"http://yiqi1717-10009627.image.myqcloud.com/37b78019-e4e5-49bf-914b-0b84a44a39a6?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 14:06:46","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5984081","rtmp":"http://yiqihdl.8686c.com/pajia/5984081.flv"}},{"uid":5358814,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1ddb8510-6d92-4a6a-bad8-1acb4be840f8?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Ann.JIAO","gender":2,"age":25,"constellation":"魔羯座","lastvisit":"2小时前","lastvisit2":"2016-11-07 16:44:03","distance":"5.7km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":2,"id":1,"grade":"星","exp":661,"next":1059,"upgrade":398,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5358814,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/1ddb8510-6d92-4a6a-bad8-1acb4be840f8?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-29 21:18:27","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5358814","rtmp":"http://yiqihdl.8686c.com/pajia/5358814.flv"}},{"uid":5598929,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d24ba6d1-e51f-497e-b734-3b3f300568b1?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"你挺胸啊🙈","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"23小时前","lastvisit2":"2016-11-06 19:21:53","distance":"5.9km","sign":"👏👏👏👏👏👏👏","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":2,"id":1,"grade":"星","exp":1052,"next":1059,"upgrade":7,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5598929,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d24ba6d1-e51f-497e-b734-3b3f300568b1?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 13:45:38","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5598929","rtmp":"http://yiqihdl.8686c.com/pajia/5598929.flv"}},{"uid":6387334,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ef527529-f1d9-4409-8b90-d05d42c1abf6?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Cat😼宝宝呀","gender":2,"age":22,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 23:46:30","distance":"6.0km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":3852,"next":5499,"upgrade":1647,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6387334,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ef527529-f1d9-4409-8b90-d05d42c1abf6?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-24 20:38:36","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6387334","rtmp":"http://yiqihdl.8686c.com/pajia/6387334.flv"}},{"uid":4332992,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/7cd93b0c-4699-4ebb-b617-3cd1afaefcff?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA刘思含","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"2天前","lastvisit2":"2016-11-04 19:50:28","distance":"6.4km","sign":"90后正常人一枚，有理想，喜欢唱歌，逛街，吃美食","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":259,"next":619,"upgrade":360,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4332992,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/7cd93b0c-4699-4ebb-b617-3cd1afaefcff?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 22:12:21","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4332992","rtmp":"http://yiqihdl.8686c.com/pajia/4332992.flv"}},{"uid":5790311,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0d1b9680-47c2-4d1f-a5a1-494c4b7dea66?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"娱家香草味布丁","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-30 08:10:47","distance":"6.7km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":118,"next":619,"upgrade":501,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5790311,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0d1b9680-47c2-4d1f-a5a1-494c4b7dea66?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-23 22:10:54","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5790311","rtmp":"http://yiqihdl.8686c.com/pajia/5790311.flv"}},{"uid":5739921,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"👄NK彤彤👄","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"3天前","lastvisit2":"2016-11-04 01:26:34","distance":"7.0km","sign":"没事找我来唠唠嗑","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":9,"id":1,"grade":"星","exp":18409,"next":23179,"upgrade":4770,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5739921,"title":"今天怎么这么难看呢！哈哈","cover":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-07 22:12:40","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5739921","rtmp":"http://yiqihdl.8686c.com/pajia/5739921.flv"}},{"uid":5720824,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1bdca9ef-1c05-49e0-9500-dddf7c8a467d?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"NKい仙女-俊熙","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 16:46:02","distance":"7.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":21,"id":2,"grade":"冠","exp":225847,"next":229819,"upgrade":3972,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5720824,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/1bdca9ef-1c05-49e0-9500-dddf7c8a467d?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 15:35:39","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5720824","rtmp":"http://yiqihdl.8686c.com/pajia/5720824.flv"}},{"uid":6681304,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/235070d2-2aee-45c7-aefd-b7012ee935cc?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"PM我是小可爱","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 09:24:02","distance":"7.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":27,"next":619,"upgrade":592,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6681304,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/235070d2-2aee-45c7-aefd-b7012ee935cc?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-04 20:27:05","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6681304","rtmp":"http://yiqihdl.8686c.com/pajia/6681304.flv"}},{"uid":5803714,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/46e73890-c31e-4c66-9f2e-cb047469e36b?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"铁锤妹妹","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"21小时前","lastvisit2":"2016-11-06 21:43:40","distance":"7.3km","sign":"如果再见还能红着脸，是否可以红着眼","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":90,"id":4,"grade":"火冠","exp":14916811,"next":15390499,"upgrade":473688,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/1d3bb155-d6e2-4102-b5db-e67f9e2eb49e"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5803714,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/46e73890-c31e-4c66-9f2e-cb047469e36b?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-05 18:30:23","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5803714","rtmp":"http://yiqihdl.8686c.com/pajia/5803714.flv"}},{"uid":5415753,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e4594d2c-f80e-4441-b058-520007a5a478?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"🌱","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-02 22:01:49","distance":"7.6km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":18,"id":1,"grade":"星","exp":130117,"next":149539,"upgrade":19422,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5415753,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e4594d2c-f80e-4441-b058-520007a5a478?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-24 19:04:45","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5415753","rtmp":"http://yiqihdl.8686c.com/pajia/5415753.flv"}},{"uid":5877013,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/7cc5cb95-9689-4929-8f68-3386fabef17e?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"melody","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-03 00:51:43","distance":"7.7km","sign":"爱过人渣 信过狗 和一些狗做过好朋友 放心吧我不是什么好人","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":17,"id":1,"grade":"星","exp":122582,"next":127659,"upgrade":5077,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5877013,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/7cc5cb95-9689-4929-8f68-3386fabef17e?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-10 15:59:08","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5877013","rtmp":"http://yiqihdl.8686c.com/pajia/5877013.flv"}},{"uid":4531414,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9b71f7e1-ab0a-4d72-abe3-2d970b4a2514?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"🌸","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"4小时前","lastvisit2":"2016-11-07 14:47:47","distance":"7.7km","sign":"勿忘初心","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":35,"id":2,"grade":"冠","exp":938860,"next":980499,"upgrade":41639,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4531414,"title":"好久不见","cover":"http://yiqi1717-10009627.image.myqcloud.com/9b71f7e1-ab0a-4d72-abe3-2d970b4a2514?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-02 22:03:40","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4531414","rtmp":"http://yiqihdl.8686c.com/pajia/4531414.flv"}},{"uid":6124934,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5350b5bb-2bd9-427b-8b4d-52d211eb424a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"傻🌱貂小婵","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"42分钟前","lastvisit2":"2016-11-07 18:17:48","distance":"8.0km","sign":"不忘初心 感谢疼爱","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":36,"id":2,"grade":"冠","exp":982291,"next":1063219,"upgrade":80928,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6124934,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/5350b5bb-2bd9-427b-8b4d-52d211eb424a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 14:18:13","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6124934","rtmp":"http://yiqihdl.8686c.com/pajia/6124934.flv"}},{"uid":5421960,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/af9291d9-13b2-45a0-9881-50034199f7d3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"玖🔰亿媛","gender":2,"age":27,"constellation":"魔羯座","lastvisit":"20小时前","lastvisit2":"2016-11-06 22:03:36","distance":"8.0km","sign":"等我想好了、在写吧","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":6,"id":1,"grade":"星","exp":8298,"next":8419,"upgrade":121,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5421960,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/af9291d9-13b2-45a0-9881-50034199f7d3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-20 18:23:52","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5421960","rtmp":"http://yiqihdl.8686c.com/pajia/5421960.flv"}},{"uid":6210161,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/dacafafe-935f-42e7-8e4d-cc2174169be5?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"G M楠楠","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 13:28:36","distance":"8.1km","sign":"心情不好","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":5011,"next":5499,"upgrade":488,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6210161,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/dacafafe-935f-42e7-8e4d-cc2174169be5?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-29 14:36:26","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6210161","rtmp":"http://yiqihdl.8686c.com/pajia/6210161.flv"}},{"uid":5345065,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2ae1e04d-b373-4d8b-9903-3df42a7f3054?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Coco💐幺妹","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"7小时前","lastvisit2":"2016-11-07 11:07:02","distance":"8.1km","sign":"准备好了吗\u2026\u2026","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":16,"id":1,"grade":"星","exp":91714,"next":108019,"upgrade":16305,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5345065,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2ae1e04d-b373-4d8b-9903-3df42a7f3054?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-01 18:27:09","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5345065","rtmp":"http://yiqihdl.8686c.com/pajia/5345065.flv"}},{"uid":4752850,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ec7d4280-acc4-4a8c-a517-8cfd8b5c75f7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"YF_歆萌大宝","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-11-01 18:11:28","distance":"8.1km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":22,"id":2,"grade":"冠","exp":254341,"next":261859,"upgrade":7518,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4752850,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ec7d4280-acc4-4a8c-a517-8cfd8b5c75f7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 23:08:27","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4752850","rtmp":"http://yiqihdl.8686c.com/pajia/4752850.flv"}},{"uid":4619547,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/21c055ce-f44f-454e-b01d-ca01dd1dc5e3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"空","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"2小时前","lastvisit2":"2016-11-07 16:24:30","distance":"8.1km","sign":"你一定要过的好，不然对不起我的不打扰","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":62,"id":3,"grade":"彩冠","exp":5142624,"next":5151459,"upgrade":8835,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4619547,"title":"发布会的备战","cover":"http://yiqi1717-10009627.image.myqcloud.com/21c055ce-f44f-454e-b01d-ca01dd1dc5e3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-14 20:29:58","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4619547","rtmp":"http://yiqihdl.8686c.com/pajia/4619547.flv"}},{"uid":5605757,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2f125abf-75d3-4305-bce1-c55fe3445a16?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"RG🔥谭mm","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-05 23:30:53","distance":"8.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":2,"id":1,"grade":"星","exp":1044,"next":1059,"upgrade":15,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5605757,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2f125abf-75d3-4305-bce1-c55fe3445a16?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-07-26 23:49:11","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5605757","rtmp":"http://yiqihdl.8686c.com/pajia/5605757.flv"}},{"uid":5592931,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/86e56326-c972-474a-90fb-eacc95dd409a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"久就旧.","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 13:51:34","distance":"8.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":111,"next":619,"upgrade":508,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5592931,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/86e56326-c972-474a-90fb-eacc95dd409a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 03:24:37","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5592931","rtmp":"http://yiqihdl.8686c.com/pajia/5592931.flv"}},{"uid":5496555,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f27ccacf-6bba-4722-a82d-f31645141bdc?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"雪儿","gender":2,"age":25,"constellation":"魔羯座","lastvisit":"3天前","lastvisit2":"2016-11-03 19:30:47","distance":"8.8km","sign":"有缘无份的爱","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1335,"next":1939,"upgrade":604,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5496555,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f27ccacf-6bba-4722-a82d-f31645141bdc?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-11 16:28:29","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5496555","rtmp":"http://yiqihdl.8686c.com/pajia/5496555.flv"}},{"uid":5993442,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/26cc8b6e-45e9-4cf8-9f5d-d24a5b56e9de?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Lijia盈","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-27 06:13:13","distance":"8.8km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":110,"next":619,"upgrade":509,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5993442,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/26cc8b6e-45e9-4cf8-9f5d-d24a5b56e9de?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 06:13:25","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5993442","rtmp":"http://yiqihdl.8686c.com/pajia/5993442.flv"}},{"uid":6070082,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/73d4b2b6-af00-4765-a22b-816b015e49c3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"花花","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-27 22:42:46","distance":"8.8km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":176,"next":619,"upgrade":443,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6070082,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/73d4b2b6-af00-4765-a22b-816b015e49c3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 22:42:59","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6070082","rtmp":"http://yiqihdl.8686c.com/pajia/6070082.flv"}},{"uid":6010468,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/948c3d57-15a0-49fb-9981-68cb0a01b1c0?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Vv💕空白","gender":2,"age":23,"constellation":"魔羯座","lastvisit":"2天前","lastvisit2":"2016-11-04 20:07:23","distance":"8.9km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":535,"next":619,"upgrade":84,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6010468,"title":"掉了一个跟的高跟鞋","cover":"http://yiqi1717-10009627.image.myqcloud.com/948c3d57-15a0-49fb-9981-68cb0a01b1c0?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-04 20:09:18","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6010468","rtmp":"http://yiqihdl.8686c.com/pajia/6010468.flv"}},{"uid":5753826,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cb369aff-e4c9-4a59-9a0b-0ec48d225fac?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"🔰慕🌟曦🔰","gender":2,"age":19,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-28 22:00:55","distance":"9.0km","sign":"就是想跟你们吹吹牛","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1076,"next":1939,"upgrade":863,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5753826,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cb369aff-e4c9-4a59-9a0b-0ec48d225fac?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-28 22:02:10","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5753826","rtmp":"http://yiqihdl.8686c.com/pajia/5753826.flv"}},{"uid":5478424,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c5d62cd3-1c64-4753-97bf-d3955df0f055?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"果果","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 11:52:15","distance":"9.1km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":7,"id":1,"grade":"星","exp":9262,"next":12259,"upgrade":2997,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5478424,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c5d62cd3-1c64-4753-97bf-d3955df0f055?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-10 21:32:20","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5478424","rtmp":"http://yiqihdl.8686c.com/pajia/5478424.flv"}},{"uid":5233123,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/fcb873be-14b7-48c7-98c1-50aa2d835564?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"WK👑如戏","gender":2,"age":24,"constellation":"魔羯座","lastvisit":"1小时前","lastvisit2":"2016-11-07 17:11:14","distance":"9.2km","sign":"深情不及久伴，厚爱无需多言\u2026\u2026","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":8,"id":1,"grade":"星","exp":15836,"next":17139,"upgrade":1303,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5233123,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/fcb873be-14b7-48c7-98c1-50aa2d835564?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 17:11:26","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5233123","rtmp":"http://yiqihdl.8686c.com/pajia/5233123.flv"}},{"uid":5809026,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/625b2363-b35f-441b-b30f-b96063f09ee9?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"JL王者@牡丹～","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"2天前","lastvisit2":"2016-11-04 23:20:49","distance":"9.4km","sign":"性格决定命运！","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":5345,"next":5499,"upgrade":154,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5809026,"title":"昨开播报废了一手机 今再","cover":"http://yiqi1717-10009627.image.myqcloud.com/625b2363-b35f-441b-b30f-b96063f09ee9?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-04 23:21:53","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5809026","rtmp":"http://yiqihdl.8686c.com/pajia/5809026.flv"}},{"uid":6571699,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/83253114-44d4-4376-9d7a-ca191d990e8a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"锦绣agens","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-28 19:47:23","distance":"9.6km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":2,"id":1,"grade":"星","exp":735,"next":1059,"upgrade":324,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6571699,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/83253114-44d4-4376-9d7a-ca191d990e8a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 13:25:47","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6571699","rtmp":"http://yiqihdl.8686c.com/pajia/6571699.flv"}},{"uid":4953698,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/99b57885-a76b-4acf-9431-63e1d85bdf50?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"百秀包子～明妹儿","gender":2,"age":23,"constellation":"魔羯座","lastvisit":"7小时前","lastvisit2":"2016-11-07 11:53:12","distance":"9.9km","sign":"通往成为逗比女神经的路上\u2026\u2026谢谢么么哒","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":12,"id":1,"grade":"星","exp":49441,"next":49459,"upgrade":18,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4953698,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/99b57885-a76b-4acf-9431-63e1d85bdf50?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-04 15:24:45","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4953698","rtmp":"http://yiqihdl.8686c.com/pajia/4953698.flv"}},{"uid":5901440,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f7f89484-796c-4198-a380-15fcb6f1b794?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"🌻Mrs.李李","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 17:44:01","distance":"10.1km","sign":"U deserve best😊","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1158,"next":1939,"upgrade":781,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5901440,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f7f89484-796c-4198-a380-15fcb6f1b794?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-11 18:51:52","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5901440","rtmp":"http://yiqihdl.8686c.com/pajia/5901440.flv"}},{"uid":5812526,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f9c0c085-9c09-4d23-91e2-7ebaff9be2e0?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"张进琴","gender":2,"age":25,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 14:57:20","distance":"10.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":462,"next":619,"upgrade":157,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5812526,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f9c0c085-9c09-4d23-91e2-7ebaff9be2e0?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-14 21:28:51","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5812526","rtmp":"http://yiqihdl.8686c.com/pajia/5812526.flv"}},{"uid":4707870,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0dcdaa98-dc83-4359-9f84-3c109a36662a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Mo.娜大宝","gender":2,"age":28,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 09:26:05","distance":"10.2km","sign":"多多关注我","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":316,"next":619,"upgrade":303,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4707870,"title":"无聊中","cover":"http://yiqi1717-10009627.image.myqcloud.com/0dcdaa98-dc83-4359-9f84-3c109a36662a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-05-30 18:33:52","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4707870","rtmp":"http://yiqihdl.8686c.com/pajia/4707870.flv"}},{"uid":6014523,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/270ac1a2-975b-42ee-bc16-a3d987e9257c?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"༶ 凰权💫米咪","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-01 21:52:56","distance":"10.2km","sign":"不送礼物别加关注","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1907,"next":1939,"upgrade":32,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6014523,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/270ac1a2-975b-42ee-bc16-a3d987e9257c?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-01 21:53:04","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6014523","rtmp":"http://yiqihdl.8686c.com/pajia/6014523.flv"}},{"uid":6020324,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/edfd1624-78e0-4d63-8722-0c94a6b5c5bc?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Merrill","gender":2,"age":22,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-03 18:01:13","distance":"10.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":74,"next":619,"upgrade":545,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6020324,"title":"午夜放毒","cover":"http://yiqi1717-10009627.image.myqcloud.com/edfd1624-78e0-4d63-8722-0c94a6b5c5bc?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-03 02:25:34","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6020324","rtmp":"http://yiqihdl.8686c.com/pajia/6020324.flv"}},{"uid":5463045,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b461dc4d-9f9d-4212-8c99-d1fc6d725647?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA鹊儿~🍃","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-11-01 11:11:39","distance":"10.4km","sign":"☀粉丝专用号：ash06729☀","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":6,"id":1,"grade":"星","exp":8181,"next":8419,"upgrade":238,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5463045,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/b461dc4d-9f9d-4212-8c99-d1fc6d725647?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-25 19:48:10","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5463045","rtmp":"http://yiqihdl.8686c.com/pajia/5463045.flv"}},{"uid":6494663,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/25ecce1f-7fc3-474b-a6ea-c750f70e3033?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"PM✨卷尾猫✨","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 00:48:02","distance":"10.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":156,"next":619,"upgrade":463,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6494663,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/25ecce1f-7fc3-474b-a6ea-c750f70e3033?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-15 23:01:24","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6494663","rtmp":"http://yiqihdl.8686c.com/pajia/6494663.flv"}},{"uid":4287062,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/4281dcef-a489-48c9-b847-ef88be3278b8?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"我叫你默妹","gender":2,"age":18,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 21:20:41","distance":"10.5km","sign":"宁愿与狼为伍也不与狗同行，我不坏但我也不是好人","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":356378,"next":375499,"upgrade":19121,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4287062,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/4281dcef-a489-48c9-b847-ef88be3278b8?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-05-09 14:33:18","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4287062","rtmp":"http://yiqihdl.8686c.com/pajia/4287062.flv"}},{"uid":6568068,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1fc63279-0a56-4c14-93eb-daa4f9c88bda?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"筝女Phoebe","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"2小时前","lastvisit2":"2016-11-07 16:54:47","distance":"10.7km","sign":"不定时直播，喜欢古筝请关注。","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":3703,"next":5499,"upgrade":1796,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6568068,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/1fc63279-0a56-4c14-93eb-daa4f9c88bda?imageView2/2/w/800/","users":0,"is_live":true,"begin_live":"2016-11-07 16:55:20","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6568068","rtmp":"http://yiqihdl.8686c.com/pajia/6568068.flv"}},{"uid":5301801,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/392757c0-982b-4a2e-bd23-277feb2a13d5?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA匿名🍀","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6小时前","lastvisit2":"2016-11-07 12:35:22","distance":"10.8km","sign":"先生对不起，我长得不美，但不是每个人都有机会\u2026\u2026","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":42,"id":3,"grade":"彩冠","exp":1616512,"next":1658659,"upgrade":42147,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5301801,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/392757c0-982b-4a2e-bd23-277feb2a13d5?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 18:01:08","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5301801","rtmp":"http://yiqihdl.8686c.com/pajia/5301801.flv"}},{"uid":4583019,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f2423a9c-7a1c-4f45-ab16-3542d217092a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"食人族-白果","gender":2,"age":19,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-01 22:26:22","distance":"10.8km","sign":"V博-我是白果Ginkgo 想进家族做主播的可以私信我","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":19,"id":1,"grade":"星","exp":164615,"next":173779,"upgrade":9164,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4583019,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f2423a9c-7a1c-4f45-ab16-3542d217092a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-15 22:04:07","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4583019","rtmp":"http://yiqihdl.8686c.com/pajia/4583019.flv"}},{"uid":6023260,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/eeacc832-41c3-4c37-892d-9a877d4a58f7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"🌸MAX微整形","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 14:18:50","distance":"11.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":29,"next":619,"upgrade":590,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6023260,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/eeacc832-41c3-4c37-892d-9a877d4a58f7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-29 14:19:20","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6023260","rtmp":"http://yiqihdl.8686c.com/pajia/6023260.flv"}},{"uid":5834937,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a26ff4e8-aef7-49fc-90ae-84172473bc32?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"玛利亚","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-31 12:47:57","distance":"11.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":340,"next":619,"upgrade":279,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5834937,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/a26ff4e8-aef7-49fc-90ae-84172473bc32?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 12:48:33","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5834937","rtmp":"http://yiqihdl.8686c.com/pajia/5834937.flv"}},{"uid":5642291,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/574d1312-e9e1-4b1c-b8f4-fdac99102f7b?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"阳宝宝是一只宝宝","gender":2,"age":18,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 02:22:26","distance":"11.5km","sign":"欢迎关注","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":52,"next":619,"upgrade":567,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5642291,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/574d1312-e9e1-4b1c-b8f4-fdac99102f7b?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-29 02:22:35","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5642291","rtmp":"http://yiqihdl.8686c.com/pajia/5642291.flv"}},{"uid":5417975,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/559fbb28-649f-4b0d-9a6b-3662e29edf5b?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Coco💐色拉","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 06:15:15","distance":"11.7km","sign":"🍃爱我的从未离开过！","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":15,"id":1,"grade":"星","exp":84493,"next":90499,"upgrade":6006,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5417975,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/559fbb28-649f-4b0d-9a6b-3662e29edf5b?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 18:58:53","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5417975","rtmp":"http://yiqihdl.8686c.com/pajia/5417975.flv"}},{"uid":5386767,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5dd9f07c-c5a0-49bc-a1bf-afc293467340?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Mu_","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-26 19:31:02","distance":"11.8km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":17,"id":1,"grade":"星","exp":114372,"next":127659,"upgrade":13287,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5386767,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/5dd9f07c-c5a0-49bc-a1bf-afc293467340?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-12 14:40:59","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5386767","rtmp":"http://yiqihdl.8686c.com/pajia/5386767.flv"}},{"uid":5805976,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/3c81fddd-bbd1-4bf9-9883-a1319a331a63?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"ZS💖虎丫头","gender":2,"age":88,"constellation":"魔羯座","lastvisit":"1小时前","lastvisit2":"2016-11-07 17:09:41","distance":"12.1km","sign":"一直很安静","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":11,"id":1,"grade":"星","exp":33179,"next":39219,"upgrade":6040,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5805976,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/3c81fddd-bbd1-4bf9-9883-a1319a331a63?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 22:34:48","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5805976","rtmp":"http://yiqihdl.8686c.com/pajia/5805976.flv"}},{"uid":5809468,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b0734ea2-f83d-4a06-b08b-5285f9ccdf2a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"啦啦啦啦","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-28 10:26:51","distance":"12.7km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1353,"next":1939,"upgrade":586,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5809468,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/b0734ea2-f83d-4a06-b08b-5285f9ccdf2a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-16 12:38:54","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5809468","rtmp":"http://yiqihdl.8686c.com/pajia/5809468.flv"}},{"uid":4556712,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f44168e8-c3ef-48ce-9c95-f124569fce49?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"SW关儿悠悠","gender":2,"age":23,"constellation":"魔羯座","lastvisit":"3天前","lastvisit2":"2016-11-04 14:54:42","distance":"12.7km","sign":"我是一个努力干活又不磨人的小妖精","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":13,"id":1,"grade":"星","exp":56224,"next":61339,"upgrade":5115,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4556712,"title":"1111","cover":"http://yiqi1717-10009627.image.myqcloud.com/f44168e8-c3ef-48ce-9c95-f124569fce49?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-04 11:45:05","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4556712","rtmp":"http://yiqihdl.8686c.com/pajia/4556712.flv"}},{"uid":5965911,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9a5fc59d-0314-4fcc-8eb7-352dc2cd4e5e?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"傲娇","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-31 13:23:03","distance":"13.1km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1343,"next":1939,"upgrade":596,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5965911,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/9a5fc59d-0314-4fcc-8eb7-352dc2cd4e5e?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-28 15:48:54","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5965911","rtmp":"http://yiqihdl.8686c.com/pajia/5965911.flv"}},{"uid":6486257,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f7a0b6fe-e79b-418d-97f5-337ffe802d5a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA六🌺朵儿","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 16:38:36","distance":"13.2km","sign":"跳舞💃 越野 极限 看电影 啪啪啪😊","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":19,"id":1,"grade":"星","exp":168516,"next":173779,"upgrade":5263,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6486257,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f7a0b6fe-e79b-418d-97f5-337ffe802d5a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-02 03:17:45","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6486257","rtmp":"http://yiqihdl.8686c.com/pajia/6486257.flv"}},{"uid":6007764,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e42e0839-6095-4e59-aebc-05b502ab8bc7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"村姑","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 16:48:05","distance":"13.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":135,"next":619,"upgrade":484,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6007764,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e42e0839-6095-4e59-aebc-05b502ab8bc7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-12 23:59:00","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6007764","rtmp":"http://yiqihdl.8686c.com/pajia/6007764.flv"}},{"uid":5589832,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/655539ef-1309-4870-ad17-c99d90b61cf7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA薇～独行侠","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"21小时前","lastvisit2":"2016-11-06 21:45:01","distance":"13.3km","sign":"9125～不管经历过多少，始终单纯的像个孩子","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":8,"id":1,"grade":"星","exp":14992,"next":17139,"upgrade":2147,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5589832,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/655539ef-1309-4870-ad17-c99d90b61cf7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-01 16:47:37","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5589832","rtmp":"http://yiqihdl.8686c.com/pajia/5589832.flv"}},{"uid":6515897,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/4739f3a6-c129-4802-b1d7-98b6ddbd8cc7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"锦秀👼艳儿","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"11小时前","lastvisit2":"2016-11-07 07:56:01","distance":"13.4km","sign":"你若盛开蝴蝶自来👼","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1288,"next":1939,"upgrade":651,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6515897,"title":"带你们看风景😂","cover":"http://yiqi1717-10009627.image.myqcloud.com/4739f3a6-c129-4802-b1d7-98b6ddbd8cc7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-30 15:51:05","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6515897","rtmp":"http://yiqihdl.8686c.com/pajia/6515897.flv"}},{"uid":5754693,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/fcc808f2-d9cf-4fc2-a798-6767f0bbdf0f?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"ZTY💕WEN","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-30 16:51:47","distance":"13.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":309,"next":619,"upgrade":310,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5754693,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/fcc808f2-d9cf-4fc2-a798-6767f0bbdf0f?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-30 16:51:56","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5754693","rtmp":"http://yiqihdl.8686c.com/pajia/5754693.flv"}},{"uid":5312999,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cdc45313-d660-4dde-9881-795dc027dcb3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"请叫我呵呵💫","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"1小时前","lastvisit2":"2016-11-07 17:38:50","distance":"13.5km","sign":"说句我爱你，你能和我走？","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":10,"id":1,"grade":"星","exp":25858,"next":30499,"upgrade":4641,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5312999,"title":"好久没回来，过来看看","cover":"http://yiqi1717-10009627.image.myqcloud.com/cdc45313-d660-4dde-9881-795dc027dcb3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-19 20:29:31","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5312999","rtmp":"http://yiqihdl.8686c.com/pajia/5312999.flv"}},{"uid":6043945,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0ddb66b7-f362-41fc-83e1-ffceb3736303?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"丹妮在等you！","gender":2,"age":24,"constellation":"魔羯座","lastvisit":"9小时前","lastvisit2":"2016-11-07 09:09:34","distance":"13.5km","sign":"希望有那么一个人让我成为你的唯一！💕 微博名字：嬌怡儿","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":49,"id":3,"grade":"彩冠","exp":2523422,"next":2593579,"upgrade":70157,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6043945,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0ddb66b7-f362-41fc-83e1-ffceb3736303?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 19:48:20","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6043945","rtmp":"http://yiqihdl.8686c.com/pajia/6043945.flv"}},{"uid":6391322,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/4b7dc9a7-9c37-4c65-801a-98e87347d35a?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Kmෆ女王汉库克","gender":2,"age":21,"constellation":"魔羯座","lastvisit":"5小时前","lastvisit2":"2016-11-07 13:50:06","distance":"13.6km","sign":"Kmෆ女王汉库克","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":10,"id":1,"grade":"星","exp":25219,"next":30499,"upgrade":5280,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6391322,"title":"刚睡醒的大素颜😂","cover":"http://yiqi1717-10009627.image.myqcloud.com/4b7dc9a7-9c37-4c65-801a-98e87347d35a?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-05 17:16:35","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6391322","rtmp":"http://yiqihdl.8686c.com/pajia/6391322.flv"}},{"uid":6206812,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cb9af71f-f198-457c-ab2e-b1b14a5e3a7f?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Ｎ✩艾米","gender":2,"age":21,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-01 20:25:47","distance":"13.7km","sign":"喜欢吃喝玩乐","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":8,"id":1,"grade":"星","exp":16809,"next":17139,"upgrade":330,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6206812,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cb9af71f-f198-457c-ab2e-b1b14a5e3a7f?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-09 20:52:22","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6206812","rtmp":"http://yiqihdl.8686c.com/pajia/6206812.flv"}},{"uid":4472784,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2153da19-ea38-4856-bd94-88f6e62b4881?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"【秀】月光仙子","gender":2,"age":88,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 16:17:47","distance":"13.7km","sign":"新浪微博王亚丹我是造型师，帅哥美女刷法拉利可加微信，排名前三的护花可做管理员","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":4993,"next":5499,"upgrade":506,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4472784,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2153da19-ea38-4856-bd94-88f6e62b4881?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-18 12:19:15","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4472784","rtmp":"http://yiqihdl.8686c.com/pajia/4472784.flv"}},{"uid":5859090,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/771facf7-cf15-4c46-9864-3b6fd09dcd9e?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"C+ 范范范🍚","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-28 13:07:26","distance":"13.8km","sign":"五颗星","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":212,"next":619,"upgrade":407,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5859090,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/771facf7-cf15-4c46-9864-3b6fd09dcd9e?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-28 13:07:43","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5859090","rtmp":"http://yiqihdl.8686c.com/pajia/5859090.flv"}},{"uid":6542531,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cd011db5-1e05-4fc5-9968-a6c3e5eb5b77?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Co🐒Lucy","gender":2,"age":18,"constellation":"魔羯座","lastvisit":"1小时前","lastvisit2":"2016-11-07 17:33:25","distance":"13.8km","sign":"除了没人疼😑全身哪都疼🙂","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":13,"id":1,"grade":"星","exp":56855,"next":61339,"upgrade":4484,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6542531,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cd011db5-1e05-4fc5-9968-a6c3e5eb5b77?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 18:33:42","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6542531","rtmp":"http://yiqihdl.8686c.com/pajia/6542531.flv"}},{"uid":5503914,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/001a85ca-1a1f-4485-b7c8-937fa6caf397?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA🐷贝贝","gender":2,"age":21,"constellation":"魔羯座","lastvisit":"2天前","lastvisit2":"2016-11-05 00:31:08","distance":"13.8km","sign":"我给你的东西你一定要好好珍惜，特别是脸！","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":4796,"next":5499,"upgrade":703,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5503914,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/001a85ca-1a1f-4485-b7c8-937fa6caf397?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-04 23:09:39","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5503914","rtmp":"http://yiqihdl.8686c.com/pajia/5503914.flv"}},{"uid":5567031,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/215843a5-dafb-435d-a0ba-edc223578e6f?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"YP、雪哥","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-29 23:02:36","distance":"13.9km","sign":"南方航空乘务员","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":2,"id":1,"grade":"星","exp":857,"next":1059,"upgrade":202,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5567031,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/215843a5-dafb-435d-a0ba-edc223578e6f?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-04 15:16:57","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5567031","rtmp":"http://yiqihdl.8686c.com/pajia/5567031.flv"}},{"uid":5156634,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ee2cfe7a-5344-4142-b155-f3a04e809c60?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"BF-丁亿菲演艺","gender":2,"age":30,"constellation":"魔羯座","lastvisit":"20小时前","lastvisit2":"2016-11-06 22:39:12","distance":"14.2km","sign":"文化媒体有限公司，肚皮舞，钢管舞，喜欢讲笑话，演艺等等","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":6,"id":1,"grade":"星","exp":8042,"next":8419,"upgrade":377,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5156634,"title":"谁来安慰我","cover":"http://yiqi1717-10009627.image.myqcloud.com/ee2cfe7a-5344-4142-b155-f3a04e809c60?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 22:42:28","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5156634","rtmp":"http://yiqihdl.8686c.com/pajia/5156634.flv"}},{"uid":5751669,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/61d8ba54-2e9e-43a1-9b51-cde99ed6e9e6?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"小美芽","gender":2,"age":26,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-10-31 22:21:53","distance":"14.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":98,"next":619,"upgrade":521,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5751669,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/61d8ba54-2e9e-43a1-9b51-cde99ed6e9e6?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 22:22:06","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5751669","rtmp":"http://yiqihdl.8686c.com/pajia/5751669.flv"}},{"uid":5978823,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/4f0548c2-810d-4f71-93ca-370aeff022d7?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"鸿雁","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-11-01 18:08:21","distance":"14.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":29,"next":619,"upgrade":590,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5978823,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/4f0548c2-810d-4f71-93ca-370aeff022d7?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-18 18:37:50","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5978823","rtmp":"http://yiqihdl.8686c.com/pajia/5978823.flv"}},{"uid":5992487,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/4b76d00f-aa39-43df-8650-1dcb67035adc?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"👠👗💄","gender":2,"age":30,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-02 23:19:04","distance":"14.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":4605,"next":5499,"upgrade":894,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5992487,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/4b76d00f-aa39-43df-8650-1dcb67035adc?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-27 00:07:33","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5992487","rtmp":"http://yiqihdl.8686c.com/pajia/5992487.flv"}},{"uid":5935395,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/8c7b2fa0-f576-41f2-acbb-159110b3bd35?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"后知后觉","gender":2,"age":23,"constellation":"魔羯座","lastvisit":"20小时前","lastvisit2":"2016-11-06 22:30:16","distance":"14.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":11,"id":1,"grade":"星","exp":31358,"next":39219,"upgrade":7861,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5935395,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/8c7b2fa0-f576-41f2-acbb-159110b3bd35?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-29 01:40:15","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5935395","rtmp":"http://yiqihdl.8686c.com/pajia/5935395.flv"}},{"uid":5463286,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ad6fe056-7898-4220-88be-6f370e82a111?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"蓝水儿","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"4天前","lastvisit2":"2016-11-03 05:33:18","distance":"14.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":378,"next":619,"upgrade":241,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5463286,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ad6fe056-7898-4220-88be-6f370e82a111?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-24 18:52:49","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5463286","rtmp":"http://yiqihdl.8686c.com/pajia/5463286.flv"}},{"uid":5458904,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ac3af066-36e0-4280-985b-0727b2670e08?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"CoCo💐楠楠","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-11-01 07:32:27","distance":"14.7km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":6,"id":1,"grade":"星","exp":6475,"next":8419,"upgrade":1944,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5458904,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ac3af066-36e0-4280-985b-0727b2670e08?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-28 23:14:05","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5458904","rtmp":"http://yiqihdl.8686c.com/pajia/5458904.flv"}},{"uid":5868699,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cdab1457-bfa9-45f8-9eb1-4c0f0c1e8319?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"时光💕甜心","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"22小时前","lastvisit2":"2016-11-06 20:16:37","distance":"14.7km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":4,"id":1,"grade":"星","exp":3244,"next":3379,"upgrade":135,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5868699,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cdab1457-bfa9-45f8-9eb1-4c0f0c1e8319?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-13 19:58:21","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5868699","rtmp":"http://yiqihdl.8686c.com/pajia/5868699.flv"}},{"uid":5922347,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c76dc7fe-37e8-4295-9109-2cd76e37ed34?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"陈槿潇","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"17小时前","lastvisit2":"2016-11-07 01:21:36","distance":"15.0km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":195,"next":619,"upgrade":424,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5922347,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c76dc7fe-37e8-4295-9109-2cd76e37ed34?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-25 21:13:11","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5922347","rtmp":"http://yiqihdl.8686c.com/pajia/5922347.flv"}},{"uid":4547349,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/750b13e3-523e-46e7-8ae8-40a65f2585da?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Carol💊","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"31分钟前","lastvisit2":"2016-11-07 18:29:13","distance":"15.0km","sign":"不经常玩但是谢谢陪伴❤️","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":17,"id":1,"grade":"星","exp":117472,"next":127659,"upgrade":10187,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":4547349,"title":"来伺候小主","cover":"http://yiqi1717-10009627.image.myqcloud.com/750b13e3-523e-46e7-8ae8-40a65f2585da?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-01 09:01:30","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=4547349","rtmp":"http://yiqihdl.8686c.com/pajia/4547349.flv"}},{"uid":5481648,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c0f11050-8e1b-4b25-9365-4188206ae29e?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"SK歌手王柯心","gender":2,"age":28,"constellation":"魔羯座","lastvisit":"22小时前","lastvisit2":"2016-11-06 20:58:44","distance":"15.0km","sign":"街头卖艺滴","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":7,"id":1,"grade":"星","exp":8531,"next":12259,"upgrade":3728,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5481648,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c0f11050-8e1b-4b25-9365-4188206ae29e?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-24 19:55:13","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5481648","rtmp":"http://yiqihdl.8686c.com/pajia/5481648.flv"}},{"uid":6423363,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/954bfa4c-c48a-4c66-a18e-c0cba6ba3011?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"隐💄Ariel","gender":2,"age":21,"constellation":"魔羯座","lastvisit":"3小时前","lastvisit2":"2016-11-07 15:35:38","distance":"15.1km","sign":"为毛线我照片没有本人好看☝🏻","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":6,"id":1,"grade":"星","exp":6977,"next":8419,"upgrade":1442,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6423363,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/954bfa4c-c48a-4c66-a18e-c0cba6ba3011?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 16:09:49","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6423363","rtmp":"http://yiqihdl.8686c.com/pajia/6423363.flv"}},{"uid":5783178,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ac92cdaf-dc60-4fa7-a69f-938b432d8016?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"ZS    丹丹","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1天前","lastvisit2":"2016-11-06 09:26:35","distance":"15.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1799,"next":1939,"upgrade":140,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5783178,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ac92cdaf-dc60-4fa7-a69f-938b432d8016?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 09:27:04","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5783178","rtmp":"http://yiqihdl.8686c.com/pajia/5783178.flv"}},{"uid":5346510,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f56718a6-b93c-4f3b-b1b7-2e1a7c812f52?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"平凡","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-10-31 19:49:40","distance":"15.2km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":13,"id":1,"grade":"星","exp":54003,"next":61339,"upgrade":7336,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5346510,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f56718a6-b93c-4f3b-b1b7-2e1a7c812f52?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 19:53:36","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5346510","rtmp":"http://yiqihdl.8686c.com/pajia/5346510.flv"}},{"uid":5585162,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cb9c81b1-eb61-48fb-b1d9-f8923ec3c8a3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"✨妮妮✨","gender":2,"age":24,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-02 00:30:22","distance":"15.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":3,"id":1,"grade":"星","exp":1706,"next":1939,"upgrade":233,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5585162,"title":"好無聊，陪我聊個天吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/cb9c81b1-eb61-48fb-b1d9-f8923ec3c8a3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-09-14 18:47:20","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5585162","rtmp":"http://yiqihdl.8686c.com/pajia/5585162.flv"}},{"uid":5711632,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e263ae3a-b096-425f-9aa3-050a2731d0f8?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Vv💕哈哈😄","gender":2,"age":19,"constellation":"魔羯座","lastvisit":"19小时前","lastvisit2":"2016-11-06 23:28:12","distance":"15.3km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":8,"id":1,"grade":"星","exp":14463,"next":17139,"upgrade":2676,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5711632,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e263ae3a-b096-425f-9aa3-050a2731d0f8?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-30 21:07:42","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5711632","rtmp":"http://yiqihdl.8686c.com/pajia/5711632.flv"}},{"uid":5581109,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f9b58363-2685-48ed-9aef-a1dfaf327c54?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"Elly","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"6天前","lastvisit2":"2016-11-01 14:25:10","distance":"15.4km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":187,"next":619,"upgrade":432,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5581109,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f9b58363-2685-48ed-9aef-a1dfaf327c54?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-01 14:25:46","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5581109","rtmp":"http://yiqihdl.8686c.com/pajia/5581109.flv"}},{"uid":3821880,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b8d8d17b-81bf-479b-b349-bce3ea772cb3?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"💋千色、夏馨","gender":2,"age":18,"constellation":"魔羯座","lastvisit":"2小时前","lastvisit2":"2016-11-07 16:50:23","distance":"15.4km","sign":"还行","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":9,"id":1,"grade":"星","exp":18127,"next":23179,"upgrade":5052,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":3821880,"title":"我回来咯😄","cover":"http://yiqi1717-10009627.image.myqcloud.com/b8d8d17b-81bf-479b-b349-bce3ea772cb3?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 16:50:48","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=3821880","rtmp":"http://yiqihdl.8686c.com/pajia/3821880.flv"}},{"uid":5287137,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/7606e339-6d81-4c88-9949-03892dbb5fbf?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA没有胖嘟嘟","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"5天前","lastvisit2":"2016-11-01 20:12:41","distance":"15.5km","sign":"","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":8,"id":1,"grade":"星","exp":14667,"next":17139,"upgrade":2472,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5287137,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/7606e339-6d81-4c88-9949-03892dbb5fbf?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-08-15 12:43:50","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5287137","rtmp":"http://yiqihdl.8686c.com/pajia/5287137.flv"}},{"uid":5795424,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"DQ✨我宝大人呀","gender":2,"age":99,"constellation":"魔羯座","lastvisit":"2小时前","lastvisit2":"2016-11-07 16:01:51","distance":"15.7km","sign":"右眼里有个秘密","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":10,"id":1,"grade":"星","exp":30411,"next":30499,"upgrade":88,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5795424,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-07 11:48:14","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5795424","rtmp":"http://yiqihdl.8686c.com/pajia/5795424.flv"}},{"uid":6102332,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0eeff38a-1d44-4e62-88ee-3bda4b70aec1?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"AAA靖哥🌀","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"1周前","lastvisit2":"2016-10-28 21:37:39","distance":"15.8km","sign":"你必须很喜欢和自己作伴。好处是：你不必为了顺从别人或讨好别人而扭曲自己。","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":5,"id":1,"grade":"星","exp":4537,"next":5499,"upgrade":962,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":6102332,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0eeff38a-1d44-4e62-88ee-3bda4b70aec1?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-28 21:37:49","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=6102332","rtmp":"http://yiqihdl.8686c.com/pajia/6102332.flv"}},{"uid":3842404,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/cbf80720-aac6-429b-8809-08d6633429bf?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260","nickname":"银铃🤓雅雅雅哥","gender":2,"age":22,"constellation":"魔羯座","lastvisit":"6小时前","lastvisit2":"2016-11-07 12:07:05","distance":"16.0km","sign":"➕微博:南七小雅。美拍:35529874。","province":"北京市","city":"北京市","follow_status":0,"active":{"id":0,"category_id":0,"name":""},"grade":{"lv":11,"id":1,"grade":"星","exp":30517,"next":39219,"upgrade":8702,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":3842404,"title":"同志们好","cover":"http://yiqi1717-10009627.image.myqcloud.com/cbf80720-aac6-429b-8809-08d6633429bf?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-06 21:58:42","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=3842404","rtmp":"http://yiqihdl.8686c.com/pajia/3842404.flv"}}]
     * ret : 0
     * msg :
     */

    private String ret;
    private String msg;
    /**
     * uid : 5239908
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/57b5f366-1a49-4b2c-b0c2-b6af704f3e52?imageView2/1/w/260/h/260?imageView2/1/w/260/h/260
     * nickname : 晚安
     * gender : 2
     * age : 20
     * constellation : 魔羯座
     * lastvisit : 21小时前
     * lastvisit2 : 2016-11-06 21:19:48
     * distance : 1.4km
     * sign :
     * province : 北京市
     * city : 北京市
     * follow_status : 0
     * active : {"id":0,"category_id":0,"name":""}
     * grade : {"lv":13,"id":1,"grade":"星","exp":55628,"next":61339,"upgrade":5711,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
     * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
     * live : {"uid":5239908,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/57b5f366-1a49-4b2c-b0c2-b6af704f3e52?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-10-31 08:26:21","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5239908","rtmp":"http://yiqihdl.8686c.com/pajia/5239908.flv"}
     */

    private List<ListBean> list;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Parcelable {
        private int uid;
        private String avatar;
        private String nickname;
        private int gender;
        private int age;
        private String constellation;
        private String lastvisit;
        private String lastvisit2;
        private String distance;
        private String sign;
        private String province;
        private String city;
        private int follow_status;
        /**
         * id : 0
         * category_id : 0
         * name :
         */

        private ActiveBean active;
        /**
         * lv : 13
         * id : 1
         * grade : 星
         * exp : 55628
         * next : 61339
         * upgrade : 5711
         * vip_image : http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4
         */

        private GradeBean grade;
        /**
         * vip : false
         * heat : false
         * follow : false
         * official : false
         * sale : false
         */

        private IcoBean ico;
        /**
         * uid : 5239908
         * title : 我发起了一个直播，快来看看吧！
         * cover : http://yiqi1717-10009627.image.myqcloud.com/57b5f366-1a49-4b2c-b0c2-b6af704f3e52?imageView2/2/w/800/
         * users : 0
         * is_live : false
         * begin_live : 2016-10-31 08:26:21
         * displayorder : 6
         * html_share : http://www.yiqi1717.com/live/html_share?live_uid=5239908
         * rtmp : http://yiqihdl.8686c.com/pajia/5239908.flv
         */

        private LiveBean live;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getConstellation() {
            return constellation;
        }

        public void setConstellation(String constellation) {
            this.constellation = constellation;
        }

        public String getLastvisit() {
            return lastvisit;
        }

        public void setLastvisit(String lastvisit) {
            this.lastvisit = lastvisit;
        }

        public String getLastvisit2() {
            return lastvisit2;
        }

        public void setLastvisit2(String lastvisit2) {
            this.lastvisit2 = lastvisit2;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getFollow_status() {
            return follow_status;
        }

        public void setFollow_status(int follow_status) {
            this.follow_status = follow_status;
        }

        public ActiveBean getActive() {
            return active;
        }

        public void setActive(ActiveBean active) {
            this.active = active;
        }

        public GradeBean getGrade() {
            return grade;
        }

        public void setGrade(GradeBean grade) {
            this.grade = grade;
        }

        public IcoBean getIco() {
            return ico;
        }

        public void setIco(IcoBean ico) {
            this.ico = ico;
        }

        public LiveBean getLive() {
            return live;
        }

        public void setLive(LiveBean live) {
            this.live = live;
        }

        public static class ActiveBean implements Parcelable {
            private int id;
            private int category_id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeInt(this.category_id);
                dest.writeString(this.name);
            }

            public ActiveBean() {
            }

            protected ActiveBean(Parcel in) {
                this.id = in.readInt();
                this.category_id = in.readInt();
                this.name = in.readString();
            }

            public static final Creator<ActiveBean> CREATOR = new Creator<ActiveBean>() {
                @Override
                public ActiveBean createFromParcel(Parcel source) {
                    return new ActiveBean(source);
                }

                @Override
                public ActiveBean[] newArray(int size) {
                    return new ActiveBean[size];
                }
            };
        }

        public static class GradeBean implements Parcelable {
            private int lv;
            private int id;
            private String grade;
            private int exp;
            private int next;
            private int upgrade;
            private String vip_image;

            public int getLv() {
                return lv;
            }

            public void setLv(int lv) {
                this.lv = lv;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String grade) {
                this.grade = grade;
            }

            public int getExp() {
                return exp;
            }

            public void setExp(int exp) {
                this.exp = exp;
            }

            public int getNext() {
                return next;
            }

            public void setNext(int next) {
                this.next = next;
            }

            public int getUpgrade() {
                return upgrade;
            }

            public void setUpgrade(int upgrade) {
                this.upgrade = upgrade;
            }

            public String getVip_image() {
                return vip_image;
            }

            public void setVip_image(String vip_image) {
                this.vip_image = vip_image;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.lv);
                dest.writeInt(this.id);
                dest.writeString(this.grade);
                dest.writeInt(this.exp);
                dest.writeInt(this.next);
                dest.writeInt(this.upgrade);
                dest.writeString(this.vip_image);
            }

            public GradeBean() {
            }

            protected GradeBean(Parcel in) {
                this.lv = in.readInt();
                this.id = in.readInt();
                this.grade = in.readString();
                this.exp = in.readInt();
                this.next = in.readInt();
                this.upgrade = in.readInt();
                this.vip_image = in.readString();
            }

            public static final Creator<GradeBean> CREATOR = new Creator<GradeBean>() {
                @Override
                public GradeBean createFromParcel(Parcel source) {
                    return new GradeBean(source);
                }

                @Override
                public GradeBean[] newArray(int size) {
                    return new GradeBean[size];
                }
            };
        }

        public static class IcoBean implements Parcelable {
            private boolean vip;
            private boolean heat;
            private boolean follow;
            private boolean official;
            private boolean sale;

            public boolean isVip() {
                return vip;
            }

            public void setVip(boolean vip) {
                this.vip = vip;
            }

            public boolean isHeat() {
                return heat;
            }

            public void setHeat(boolean heat) {
                this.heat = heat;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public boolean isOfficial() {
                return official;
            }

            public void setOfficial(boolean official) {
                this.official = official;
            }

            public boolean isSale() {
                return sale;
            }

            public void setSale(boolean sale) {
                this.sale = sale;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeByte(this.vip ? (byte) 1 : (byte) 0);
                dest.writeByte(this.heat ? (byte) 1 : (byte) 0);
                dest.writeByte(this.follow ? (byte) 1 : (byte) 0);
                dest.writeByte(this.official ? (byte) 1 : (byte) 0);
                dest.writeByte(this.sale ? (byte) 1 : (byte) 0);
            }

            public IcoBean() {
            }

            protected IcoBean(Parcel in) {
                this.vip = in.readByte() != 0;
                this.heat = in.readByte() != 0;
                this.follow = in.readByte() != 0;
                this.official = in.readByte() != 0;
                this.sale = in.readByte() != 0;
            }

            public static final Creator<IcoBean> CREATOR = new Creator<IcoBean>() {
                @Override
                public IcoBean createFromParcel(Parcel source) {
                    return new IcoBean(source);
                }

                @Override
                public IcoBean[] newArray(int size) {
                    return new IcoBean[size];
                }
            };
        }

        public static class LiveBean implements Parcelable {
            private int uid;
            private String title;
            private String cover;
            private int users;
            private boolean is_live;
            private String begin_live;
            private int displayorder;
            private String html_share;
            private String rtmp;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getUsers() {
                return users;
            }

            public void setUsers(int users) {
                this.users = users;
            }

            public boolean isIs_live() {
                return is_live;
            }

            public void setIs_live(boolean is_live) {
                this.is_live = is_live;
            }

            public String getBegin_live() {
                return begin_live;
            }

            public void setBegin_live(String begin_live) {
                this.begin_live = begin_live;
            }

            public int getDisplayorder() {
                return displayorder;
            }

            public void setDisplayorder(int displayorder) {
                this.displayorder = displayorder;
            }

            public String getHtml_share() {
                return html_share;
            }

            public void setHtml_share(String html_share) {
                this.html_share = html_share;
            }

            public String getRtmp() {
                return rtmp;
            }

            public void setRtmp(String rtmp) {
                this.rtmp = rtmp;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.uid);
                dest.writeString(this.title);
                dest.writeString(this.cover);
                dest.writeInt(this.users);
                dest.writeByte(this.is_live ? (byte) 1 : (byte) 0);
                dest.writeString(this.begin_live);
                dest.writeInt(this.displayorder);
                dest.writeString(this.html_share);
                dest.writeString(this.rtmp);
            }

            public LiveBean() {
            }

            protected LiveBean(Parcel in) {
                this.uid = in.readInt();
                this.title = in.readString();
                this.cover = in.readString();
                this.users = in.readInt();
                this.is_live = in.readByte() != 0;
                this.begin_live = in.readString();
                this.displayorder = in.readInt();
                this.html_share = in.readString();
                this.rtmp = in.readString();
            }

            public static final Creator<LiveBean> CREATOR = new Creator<LiveBean>() {
                @Override
                public LiveBean createFromParcel(Parcel source) {
                    return new LiveBean(source);
                }

                @Override
                public LiveBean[] newArray(int size) {
                    return new LiveBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.uid);
            dest.writeString(this.avatar);
            dest.writeString(this.nickname);
            dest.writeInt(this.gender);
            dest.writeInt(this.age);
            dest.writeString(this.constellation);
            dest.writeString(this.lastvisit);
            dest.writeString(this.lastvisit2);
            dest.writeString(this.distance);
            dest.writeString(this.sign);
            dest.writeString(this.province);
            dest.writeString(this.city);
            dest.writeInt(this.follow_status);
            dest.writeParcelable(this.active, flags);
            dest.writeParcelable(this.grade, flags);
            dest.writeParcelable(this.ico, flags);
            dest.writeParcelable(this.live, flags);
        }

        public ListBean() {
        }

        protected ListBean(Parcel in) {
            this.uid = in.readInt();
            this.avatar = in.readString();
            this.nickname = in.readString();
            this.gender = in.readInt();
            this.age = in.readInt();
            this.constellation = in.readString();
            this.lastvisit = in.readString();
            this.lastvisit2 = in.readString();
            this.distance = in.readString();
            this.sign = in.readString();
            this.province = in.readString();
            this.city = in.readString();
            this.follow_status = in.readInt();
            this.active = in.readParcelable(ActiveBean.class.getClassLoader());
            this.grade = in.readParcelable(GradeBean.class.getClassLoader());
            this.ico = in.readParcelable(IcoBean.class.getClassLoader());
            this.live = in.readParcelable(LiveBean.class.getClassLoader());
        }

        public static final Creator<ListBean> CREATOR = new Creator<ListBean>() {
            @Override
            public ListBean createFromParcel(Parcel source) {
                return new ListBean(source);
            }

            @Override
            public ListBean[] newArray(int size) {
                return new ListBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.ret);
        dest.writeString(this.msg);
        dest.writeList(this.list);
    }

    public NearByBean() {
    }

    protected NearByBean(Parcel in) {
        this.ret = in.readString();
        this.msg = in.readString();
        this.list = new ArrayList<ListBean>();
        in.readList(this.list, ListBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<NearByBean> CREATOR = new Parcelable.Creator<NearByBean>() {
        @Override
        public NearByBean createFromParcel(Parcel source) {
            return new NearByBean(source);
        }

        @Override
        public NearByBean[] newArray(int size) {
            return new NearByBean[size];
        }
    };
}
