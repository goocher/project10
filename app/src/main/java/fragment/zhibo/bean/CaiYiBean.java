package fragment.zhibo.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.CaiYiApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/5.
 */
public class CaiYiBean {
/*
http://api.yiqi1717.com/home/get_single
?nonce=4ryhtfd0q8
&pageindex=1
&publickey=3.9
&tag_id=7
&timestamp=1478263116
&token=e360449e304df22d9cbc9e3558fbb9c1
&signature=9a8022d1f3cd9217f690ad75272bfc25*/
    public static void load(Callback callback) {
        LogUtils.i("flag","load()1");
        CaiYiApi caiYiApi = BaseRetrofit.getRetrofit().create(CaiYiApi.class);

        ArrayMap<String, String> map = new ArrayMap<>();

        map.put("nonce", "4ryhtfd0q8");
        map.put("pageindex", "1");
        map.put("publickey", "3.9");
        map.put("tag_id", "7");
        map.put("timestamp", "1478263116");
        map.put("token", "e360449e304df22d9cbc9e3558fbb9c1");
        map.put("signature", "9a8022d1f3cd9217f690ad75272bfc25");
        LogUtils.i("flag","load2()");
        Call<CaiYiBean> call = caiYiApi.getCaiYi(map);
        LogUtils.i("flag","load3()");
        call.enqueue(callback);
        LogUtils.i("flag","load4()");

    }
    /**
     * ret : 0
     * msg :
     * bar : []
     * info : {"id":11,"template":"NORMAL","numerical":"USERS","name":"","parameters":"","line":1,"waterfall":false,"livelist":[{"uid":5392720,"title":"欢喜就好","cover":"http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/828/h/828","users":14130,"is_live":true,"begin_live":"2016-11-05 18:50:03","netease_tid":"3674655","max_manager":0,"heats":135205,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5392720","rtmp":"http://yiqihdl.8686c.com/pajia/5392720.flv","all_count":512,"user":{"uid":5392720,"parent_uid":4705679,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/260/h/260","nickname":"A🍼愛文儿","gender":2,"age":18,"role_id":1,"credits":5477625,"live_credits":71278,"live_credits_1":12575,"live_adds":48,"live_shares":233,"province":"重庆市","city":"重庆市","sign":"🌶      岁月漫长 要心地善良","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":22831,"next":23179,"upgrade":348,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5371305,"title":"嘿嘿 没洗脑壳。。","cover":"http://yiqi1717-10009627.image.myqcloud.com/bc0e5015-0856-4230-b575-8a28eee1db62?imageView2/1/w/828/h/828","users":13395,"is_live":true,"begin_live":"2016-11-05 19:19:21","netease_tid":"3506895","max_manager":0,"heats":133543,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5371305","rtmp":"http://yiqihdl.8686c.com/pajia/5371305.flv","all_count":512,"user":{"uid":5371305,"parent_uid":4396572,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/bc0e5015-0856-4230-b575-8a28eee1db62?imageView2/1/w/260/h/260","nickname":"NK、Mc觉主","gender":1,"age":25,"role_id":2,"credits":1746994,"live_credits":30143,"live_credits_1":28440,"live_adds":53,"live_shares":41,"province":"内蒙古自治区","city":"呼伦贝尔市","sign":"怀有一颗感恩的心","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":30,"id":2,"grade":"冠","exp":579305,"next":630499,"upgrade":51194,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4704350,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d0c3aaf2-e753-4b76-90a1-610905ee8bc9?imageView2/1/w/828/h/828","users":14391,"is_live":true,"begin_live":"2016-11-05 12:15:07","netease_tid":"59839","max_manager":0,"heats":129622,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4704350","rtmp":"http://yiqihdl.8686c.com/pajia/4704350.flv","all_count":512,"user":{"uid":4704350,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d0c3aaf2-e753-4b76-90a1-610905ee8bc9?imageView2/1/w/260/h/260","nickname":"Coco💐小雨","gender":1,"age":25,"role_id":2,"credits":6663986,"live_credits":15595,"live_credits_1":5150,"live_adds":182,"live_shares":42,"province":"Gangwon-do","city":"Chuncheon","sign":"脚踏实地，努力奋斗！尊师V姐","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":57,"id":3,"grade":"彩冠","exp":3943414,"next":4029259,"upgrade":85845,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5416593,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/476a2aeb-09dc-4c3b-9d53-7269b3782b9f?imageView2/1/w/828/h/828","users":11520,"is_live":true,"begin_live":"2016-11-05 19:41:38","netease_tid":"3423084","max_manager":0,"heats":128922,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5416593","rtmp":"http://yiqihdl.8686c.com/pajia/5416593.flv","all_count":512,"user":{"uid":5416593,"parent_uid":4495523,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/476a2aeb-09dc-4c3b-9d53-7269b3782b9f?imageView2/1/w/260/h/260","nickname":"ZTY💕月儿","gender":2,"age":20,"role_id":2,"credits":1100399,"live_credits":33981,"live_credits_1":4209,"live_adds":67,"live_shares":72,"province":"黑龙江省","city":"哈尔滨市","sign":"微博号:Angle淇儿","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":15,"id":1,"grade":"星","exp":89469,"next":90499,"upgrade":1030,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6318133,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c2366eb9-657b-4bb4-9a22-3700e6eebdf2?imageView2/1/w/828/h/828","users":10878,"is_live":true,"begin_live":"2016-11-05 18:37:09","netease_tid":"4130112","max_manager":0,"heats":127375,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6318133","rtmp":"http://yiqihdl.8686c.com/pajia/6318133.flv","all_count":512,"user":{"uid":6318133,"parent_uid":6211943,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c2366eb9-657b-4bb4-9a22-3700e6eebdf2?imageView2/1/w/260/h/260","nickname":"Hw💋mm梓晴","gender":2,"age":30,"role_id":1,"credits":1320065,"live_credits":9968,"live_credits_1":9968,"live_adds":44,"live_shares":100,"province":"甘肃省","city":"张掖市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":11,"id":1,"grade":"星","exp":31732,"next":39219,"upgrade":7487,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6473290,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2e6c8927-9d36-42fa-87d7-cf4c0d81c8d3?imageView2/1/w/828/h/828","users":11051,"is_live":true,"begin_live":"2016-11-05 18:24:42","netease_tid":"4339543","max_manager":0,"heats":126100,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6473290","rtmp":"http://yiqihdl.8686c.com/pajia/6473290.flv","all_count":512,"user":{"uid":6473290,"parent_uid":4728569,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2e6c8927-9d36-42fa-87d7-cf4c0d81c8d3?imageView2/1/w/260/h/260","nickname":"Only👿诺","gender":2,"age":99,"role_id":2,"credits":622095,"live_credits":21093,"live_credits_1":5224,"live_adds":23,"live_shares":155,"province":"辽宁省","city":"沈阳市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":18,"id":1,"grade":"星","exp":133172,"next":149539,"upgrade":16367,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5981679,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/90aebe78-a618-4426-b522-e34f1f68afcd?imageView2/1/w/828/h/828","users":5463,"is_live":true,"begin_live":"2016-11-05 20:08:34","netease_tid":"3882194","max_manager":0,"heats":126025,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5981679","rtmp":"http://yiqihdl.8686c.com/pajia/5981679.flv","all_count":512,"user":{"uid":5981679,"parent_uid":4416596,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/90aebe78-a618-4426-b522-e34f1f68afcd?imageView2/1/w/260/h/260","nickname":"魔音✝️萱宝","gender":2,"age":20,"role_id":1,"credits":2278327,"live_credits":17185,"live_credits_1":17095,"live_adds":68,"live_shares":5,"province":"江苏省","city":"苏州市","sign":"求守护，求关注，我是新人，需要你们的支持。俊俊💋","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":27,"id":2,"grade":"冠","exp":430493,"next":467059,"upgrade":36566,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6580442,"title":" 粱慧旋","cover":"http://yiqi1717-10009627.image.myqcloud.com/9102fe7f-2589-44ea-9457-88433173f8b9?imageView2/1/w/828/h/828","users":13466,"is_live":true,"begin_live":"2016-11-05 18:56:21","netease_tid":"4516065","max_manager":0,"heats":125068,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6580442","rtmp":"http://yiqihdl.8686c.com/pajia/6580442.flv","all_count":512,"user":{"uid":6580442,"parent_uid":5909476,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9102fe7f-2589-44ea-9457-88433173f8b9?imageView2/1/w/260/h/260","nickname":"粱慧旋","gender":2,"age":20,"role_id":1,"credits":523830,"live_credits":6595,"live_credits_1":6565,"live_adds":9,"live_shares":109,"province":"Seoul","city":"Seongbuk","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":2505,"next":3379,"upgrade":874,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4877400,"title":"快乐开始🤔","cover":"http://yiqi1717-10009627.image.myqcloud.com/26ab4fd3-79df-4fbb-8df6-57e318ee4977?imageView2/1/w/828/h/828","users":13347,"is_live":true,"begin_live":"2016-11-05 19:13:34","netease_tid":"104841","max_manager":0,"heats":124662,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4877400","rtmp":"http://yiqihdl.8686c.com/pajia/4877400.flv","all_count":512,"user":{"uid":4877400,"parent_uid":5631439,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/26ab4fd3-79df-4fbb-8df6-57e318ee4977?imageView2/1/w/260/h/260","nickname":"🈳️🌟小神经","gender":1,"age":25,"role_id":1,"credits":3783769,"live_credits":6694,"live_credits_1":6694,"live_adds":161,"live_shares":34,"province":"辽宁省","city":"铁岭市","sign":"本人全才 （生孩子除外）！","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":27,"id":2,"grade":"冠","exp":445108,"next":467059,"upgrade":21951,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6166239,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/da784e24-12bd-4406-a99a-cf32211c18c5?imageView2/1/w/828/h/828","users":13855,"is_live":true,"begin_live":"2016-11-05 16:21:53","netease_tid":"4016911","max_manager":0,"heats":124586,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6166239","rtmp":"http://yiqihdl.8686c.com/pajia/6166239.flv","all_count":512,"user":{"uid":6166239,"parent_uid":4861292,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/da784e24-12bd-4406-a99a-cf32211c18c5?imageView2/1/w/260/h/260","nickname":"另得儿","gender":2,"age":20,"role_id":2,"credits":615014,"live_credits":10846,"live_credits_1":4068,"live_adds":58,"live_shares":60,"province":"北京市","city":"北京市","sign":"一个人有多不正经 就有多深情","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":149694,"next":173779,"upgrade":24085,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6156365,"title":"怕冷的丫头","cover":"http://yiqi1717-10009627.image.myqcloud.com/13bd0202-983e-4047-bffe-63d01fe778fb?imageView2/1/w/828/h/828","users":13781,"is_live":true,"begin_live":"2016-11-05 18:24:46","netease_tid":"4009209","max_manager":0,"heats":123129,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6156365","rtmp":"http://yiqihdl.8686c.com/pajia/6156365.flv","all_count":512,"user":{"uid":6156365,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/13bd0202-983e-4047-bffe-63d01fe778fb?imageView2/1/w/260/h/260","nickname":"DQ嘉嘉爱家呀","gender":2,"age":20,"role_id":2,"credits":1623316,"live_credits":11460,"live_credits_1":3131,"live_adds":58,"live_shares":16,"province":"山东省","city":"济南市","sign":"动态有我和你的故事❤️注意查收","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":24,"id":2,"grade":"冠","exp":323272,"next":334579,"upgrade":11307,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6164642,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0f6c90bb-dc14-4084-b800-68ed4c79aef3?imageView2/1/w/828/h/828","users":5441,"is_live":true,"begin_live":"2016-11-05 18:39:56","netease_tid":"4385018","max_manager":0,"heats":122831,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6164642","rtmp":"http://yiqihdl.8686c.com/pajia/6164642.flv","all_count":512,"user":{"uid":6164642,"parent_uid":5200275,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0f6c90bb-dc14-4084-b800-68ed4c79aef3?imageView2/1/w/260/h/260","nickname":"St✨V脸男神","gender":1,"age":28,"role_id":1,"credits":40957,"live_credits":16359,"live_credits_1":9615,"live_adds":11,"live_shares":24,"province":"吉林省","city":"延边朝鲜族自治州","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":11000,"next":12259,"upgrade":1259,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6680448,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0032c9ff-9ad7-4e54-9b9d-bed4d794fd4c?imageView2/1/w/828/h/828","users":1841,"is_live":true,"begin_live":"2016-11-05 19:29:38","netease_tid":"4771795","max_manager":0,"heats":122398,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6680448","rtmp":"http://yiqihdl.8686c.com/pajia/6680448.flv","all_count":512,"user":{"uid":6680448,"parent_uid":6631262,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0032c9ff-9ad7-4e54-9b9d-bed4d794fd4c?imageView2/1/w/260/h/260","nickname":"Ms✨汐宝👶","gender":2,"age":20,"role_id":1,"credits":13343,"live_credits":13343,"live_credits_1":13313,"live_adds":0,"live_shares":8,"province":"四川省","city":"绵阳市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":0,"next":619,"upgrade":619,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4944536,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/89a30bf3-bf89-4c60-8741-061b2b720215?imageView2/1/w/828/h/828","users":8627,"is_live":true,"begin_live":"2016-11-05 20:00:09","netease_tid":"103085","max_manager":0,"heats":117624,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4944536","rtmp":"http://yiqihdl.8686c.com/pajia/4944536.flv","all_count":512,"user":{"uid":4944536,"parent_uid":4851427,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/89a30bf3-bf89-4c60-8741-061b2b720215?imageView2/1/w/260/h/260","nickname":"Rx✨阿提蜜斯","gender":2,"age":18,"role_id":1,"credits":992123,"live_credits":9499,"live_credits_1":4049,"live_adds":63,"live_shares":18,"province":"安徽省","city":"安庆市","sign":"演员","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":20799,"next":23179,"upgrade":2380,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5245439,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/00d69a7e-d742-4b9e-90bc-fb4bdd337d73?imageView2/1/w/828/h/828","users":2199,"is_live":true,"begin_live":"2016-11-05 20:31:34","netease_tid":"213319","max_manager":0,"heats":117382,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5245439","rtmp":"http://yiqihdl.8686c.com/pajia/5245439.flv","all_count":512,"user":{"uid":5245439,"parent_uid":4611995,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/00d69a7e-d742-4b9e-90bc-fb4bdd337d73?imageView2/1/w/260/h/260","nickname":"凰权💫雪宝儿","gender":2,"age":66,"role_id":2,"credits":9266932,"live_credits":16877,"live_credits_1":1757,"live_adds":146,"live_shares":6,"province":"安徽省","city":"阜阳市","sign":"\u2014\u2014","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":40,"id":3,"grade":"彩冠","exp":1355874,"next":1440499,"upgrade":84625,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6674659,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/9aa7ca6e-0cf9-476f-8153-916271b99b03?imageView2/1/w/828/h/828","users":9038,"is_live":true,"begin_live":"2016-11-05 18:19:26","netease_tid":"4728314","max_manager":0,"heats":117042,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6674659","rtmp":"http://yiqihdl.8686c.com/pajia/6674659.flv","all_count":512,"user":{"uid":6674659,"parent_uid":4728569,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9aa7ca6e-0cf9-476f-8153-916271b99b03?imageView2/1/w/260/h/260","nickname":"Only💞狐狸","gender":2,"age":20,"role_id":1,"credits":24434,"live_credits":6482,"live_credits_1":6119,"live_adds":2,"live_shares":5,"province":"辽宁省","city":"大连市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":2,"id":1,"grade":"星","exp":733,"next":1059,"upgrade":326,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5824664,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d920d1f5-3761-4046-a044-376aebad5784?imageView2/1/w/828/h/828","users":5621,"is_live":true,"begin_live":"2016-11-05 20:15:29","netease_tid":"3784675","max_manager":0,"heats":116638,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5824664","rtmp":"http://yiqihdl.8686c.com/pajia/5824664.flv","all_count":512,"user":{"uid":5824664,"parent_uid":4501000,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d920d1f5-3761-4046-a044-376aebad5784?imageView2/1/w/260/h/260","nickname":"NS🔥薇薇","gender":2,"age":20,"role_id":2,"credits":4394612,"live_credits":6755,"live_credits_1":6755,"live_adds":83,"live_shares":9,"province":"四川省","city":"成都市","sign":"晚上9点播！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":22,"id":2,"grade":"冠","exp":257498,"next":261859,"upgrade":4361,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5295536,"title":"深情不及久伴。😊😊","cover":"http://yiqi1717-10009627.image.myqcloud.com/ee9055f7-6d1f-42fb-a7d8-a43d3ce53151?imageView2/1/w/828/h/828","users":13815,"is_live":true,"begin_live":"2016-11-05 19:10:13","netease_tid":"310923","max_manager":0,"heats":115855,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5295536","rtmp":"http://yiqihdl.8686c.com/pajia/5295536.flv","all_count":512,"user":{"uid":5295536,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ee9055f7-6d1f-42fb-a7d8-a43d3ce53151?imageView2/1/w/260/h/260","nickname":"金刚柒月💥","gender":1,"age":99,"role_id":2,"credits":6210572,"live_credits":4070,"live_credits_1":3860,"live_adds":139,"live_shares":22,"province":"浙江省","city":"杭州市","sign":"欲戴王冠，必承其重！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":35,"id":2,"grade":"冠","exp":958248,"next":980499,"upgrade":22251,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5512976,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f0918dff-09ae-4b07-98bd-310795327507?imageView2/1/w/828/h/828","users":2798,"is_live":true,"begin_live":"2016-11-05 20:29:02","netease_tid":"3527209","max_manager":0,"heats":115147,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5512976","rtmp":"http://yiqihdl.8686c.com/pajia/5512976.flv","all_count":512,"user":{"uid":5512976,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f0918dff-09ae-4b07-98bd-310795327507?imageView2/1/w/260/h/260","nickname":"DQ晓玲妹妹","gender":2,"age":20,"role_id":2,"credits":361623,"live_credits":17173,"live_credits_1":16453,"live_adds":74,"live_shares":5,"province":"广东省","city":"广州市","sign":"\u201c 你给的半点好 我都想炫耀 \u201d","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":13,"id":1,"grade":"星","exp":60512,"next":61339,"upgrade":827,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5392629,"title":"回来啦","cover":"http://yiqi1717-10009627.image.myqcloud.com/d1ec4254-ace6-4232-b842-eb50bca10834?imageView2/1/w/828/h/828","users":9344,"is_live":true,"begin_live":"2016-11-05 19:09:06","netease_tid":"3389789","max_manager":0,"heats":112655,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5392629","rtmp":"http://yiqihdl.8686c.com/pajia/5392629.flv","all_count":512,"user":{"uid":5392629,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d1ec4254-ace6-4232-b842-eb50bca10834?imageView2/1/w/260/h/260","nickname":"润\u2022钢琴女王","gender":2,"age":20,"role_id":2,"credits":530524,"live_credits":3848,"live_credits_1":3848,"live_adds":47,"live_shares":8,"province":"吉林省","city":"吉林市","sign":"个性签名","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":172947,"next":173779,"upgrade":832,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6039898,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/35a0b4ce-32ad-49c8-9304-14f846af19cd?imageView2/1/w/828/h/828","users":9384,"is_live":true,"begin_live":"2016-11-05 19:55:08","netease_tid":"3922176","max_manager":0,"heats":112350,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6039898","rtmp":"http://yiqihdl.8686c.com/pajia/6039898.flv","all_count":512,"user":{"uid":6039898,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/35a0b4ce-32ad-49c8-9304-14f846af19cd?imageView2/1/w/260/h/260","nickname":"DQ西点徒喵喵","gender":2,"age":20,"role_id":2,"credits":717137,"live_credits":5858,"live_credits_1":5320,"live_adds":35,"live_shares":6,"province":"江苏省","city":"南京市","sign":"爱玩游戏呀","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":163968,"next":173779,"upgrade":9811,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6176031,"title":"快来看丫丫的新造型","cover":"http://yiqi1717-10009627.image.myqcloud.com/b6732392-fa96-4e0a-8902-4d048701e91b?imageView2/1/w/828/h/828","users":14297,"is_live":true,"begin_live":"2016-11-05 18:34:48","netease_tid":"4035105","max_manager":0,"heats":111891,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6176031","rtmp":"http://yiqihdl.8686c.com/pajia/6176031.flv","all_count":512,"user":{"uid":6176031,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b6732392-fa96-4e0a-8902-4d048701e91b?imageView2/1/w/260/h/260","nickname":"DQ丫丫","gender":2,"age":20,"role_id":2,"credits":892173,"live_credits":5899,"live_credits_1":237,"live_adds":51,"live_shares":19,"province":"浙江省","city":"嘉兴市","sign":"梦想拥有天使的外表，不如修炼一颗天使的心❤️","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":23157,"next":23179,"upgrade":22,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6196582,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f7b33872-08fc-4d34-b999-7fcece357b6a?imageView2/1/w/828/h/828","users":9678,"is_live":true,"begin_live":"2016-11-05 18:33:20","netease_tid":"4060106","max_manager":0,"heats":111819,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6196582","rtmp":"http://yiqihdl.8686c.com/pajia/6196582.flv","all_count":512,"user":{"uid":6196582,"parent_uid":4861292,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f7b33872-08fc-4d34-b999-7fcece357b6a?imageView2/1/w/260/h/260","nickname":"百秀🎨小竹条儿","gender":2,"age":18,"role_id":1,"credits":263513,"live_credits":4828,"live_credits_1":3798,"live_adds":53,"live_shares":16,"province":"浙江省","city":"杭州市","sign":"临摹小画手～","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":13,"id":1,"grade":"星","exp":58460,"next":61339,"upgrade":2879,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4622076,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/98fbca21-3d07-4123-bff9-ed5b11366800?imageView2/1/w/828/h/828","users":5419,"is_live":true,"begin_live":"2016-11-05 18:00:55","netease_tid":"4048285","max_manager":0,"heats":108679,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4622076","rtmp":"http://yiqihdl.8686c.com/pajia/4622076.flv","all_count":512,"user":{"uid":4622076,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/98fbca21-3d07-4123-bff9-ed5b11366800?imageView2/1/w/260/h/260","nickname":"karry。","gender":2,"age":99,"role_id":2,"credits":203849,"live_credits":3502,"live_credits_1":1869,"live_adds":25,"live_shares":12,"province":"四川省","city":"成都市","sign":"િ😳ી 噢多克~","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":13469,"next":17139,"upgrade":3670,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5907926,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e4716692-73b0-43ec-b3fd-a9167511b087?imageView2/1/w/828/h/828","users":3639,"is_live":true,"begin_live":"2016-11-05 20:24:13","netease_tid":"4017447","max_manager":0,"heats":104845,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5907926","rtmp":"http://yiqihdl.8686c.com/pajia/5907926.flv","all_count":512,"user":{"uid":5907926,"parent_uid":3774730,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e4716692-73b0-43ec-b3fd-a9167511b087?imageView2/1/w/260/h/260","nickname":"月亮公主🌸驾到","gender":2,"age":27,"role_id":1,"credits":1712074,"live_credits":1724,"live_credits_1":540,"live_adds":59,"live_shares":18,"province":"江苏省","city":"无锡市","sign":"谈恋伤钱！","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":23,"id":2,"grade":"冠","exp":269816,"next":296739,"upgrade":26923,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6392157,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/b8a2f318-ec0d-49bd-bb16-3b7bc0e40395?imageView2/1/w/828/h/828","users":5796,"is_live":true,"begin_live":"2016-11-05 19:41:06","netease_tid":"4223965","max_manager":0,"heats":101665,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6392157","rtmp":"http://yiqihdl.8686c.com/pajia/6392157.flv","all_count":512,"user":{"uid":6392157,"parent_uid":6043959,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b8a2f318-ec0d-49bd-bb16-3b7bc0e40395?imageView2/1/w/260/h/260","nickname":"AAA-歌手菲梵","gender":2,"age":20,"role_id":1,"credits":1528504,"live_credits":1625,"live_credits_1":1625,"live_adds":24,"live_shares":11,"province":"江苏省","city":"徐州市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":7852,"next":8419,"upgrade":567,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6084454,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/93fa3b5c-6e8a-4da9-ac9f-e336b7c200ff?imageView2/1/w/828/h/828","users":5374,"is_live":true,"begin_live":"2016-11-05 19:58:26","netease_tid":"4288585","max_manager":0,"heats":99296,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6084454","rtmp":"http://yiqihdl.8686c.com/pajia/6084454.flv","all_count":512,"user":{"uid":6084454,"parent_uid":3005924,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/93fa3b5c-6e8a-4da9-ac9f-e336b7c200ff?imageView2/1/w/260/h/260","nickname":"Mu_悠悠","gender":2,"age":20,"role_id":1,"credits":70375,"live_credits":9090,"live_credits_1":0,"live_adds":25,"live_shares":12,"province":"广东省","city":"深圳市","sign":"昨天是过去，而今天是礼物。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":11856,"next":12259,"upgrade":403,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5145455,"title":"小猫咪的日常","cover":"http://yiqi1717-10009627.image.myqcloud.com/f6f5358e-e23a-44b4-92e0-eb719e18a714?imageView2/1/w/828/h/828","users":6560,"is_live":true,"begin_live":"2016-11-05 20:10:27","netease_tid":"149599","max_manager":0,"heats":98890,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5145455","rtmp":"http://yiqihdl.8686c.com/pajia/5145455.flv","all_count":512,"user":{"uid":5145455,"parent_uid":4851427,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f6f5358e-e23a-44b4-92e0-eb719e18a714?imageView2/1/w/260/h/260","nickname":"Rx✨超妹儿","gender":2,"age":18,"role_id":1,"credits":1651190,"live_credits":750,"live_credits_1":720,"live_adds":116,"live_shares":27,"province":"安徽省","city":"安庆市","sign":"从你的全世界路过","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":22,"id":2,"grade":"冠","exp":251554,"next":261859,"upgrade":10305,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4387460,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e3df9230-26ec-4b8a-8694-6d1ed762a37b?imageView2/1/w/828/h/828","users":14078,"is_live":true,"begin_live":"2016-11-05 19:02:01","netease_tid":"36523","max_manager":0,"heats":96860,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4387460","rtmp":"http://yiqihdl.8686c.com/pajia/4387460.flv","all_count":512,"user":{"uid":4387460,"parent_uid":4554562,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e3df9230-26ec-4b8a-8694-6d1ed762a37b?imageView2/1/w/260/h/260","nickname":"三哥","gender":1,"age":22,"role_id":2,"credits":3915654,"live_credits":770,"live_credits_1":770,"live_adds":202,"live_shares":6,"province":"山东省","city":"济宁市","sign":"如果你愿意，我带你和吉他一起去流浪！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":71,"id":4,"grade":"火冠","exp":7535750,"next":7662819,"upgrade":127069,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/1d3bb155-d6e2-4102-b5db-e67f9e2eb49e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5946818,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/889cdd31-9ee9-4702-a82b-cf79b5f12c70?imageView2/1/w/828/h/828","users":5317,"is_live":true,"begin_live":"2016-11-05 20:08:31","netease_tid":"3856441","max_manager":0,"heats":95473,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5946818","rtmp":"http://yiqihdl.8686c.com/pajia/5946818.flv","all_count":512,"user":{"uid":5946818,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/889cdd31-9ee9-4702-a82b-cf79b5f12c70?imageView2/1/w/260/h/260","nickname":"DQ可爱","gender":2,"age":20,"role_id":2,"credits":80375,"live_credits":1220,"live_credits_1":50,"live_adds":29,"live_shares":10,"province":"河北省","city":"唐山市","sign":"榜一➕VX","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":5,"id":1,"grade":"星","exp":4273,"next":5499,"upgrade":1226,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6308472,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/eda1d98a-c340-4a15-b1e4-3018fe7ef758?imageView2/1/w/828/h/828","users":5874,"is_live":true,"begin_live":"2016-11-05 19:36:30","netease_tid":"4131869","max_manager":0,"heats":93423,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6308472","rtmp":"http://yiqihdl.8686c.com/pajia/6308472.flv","all_count":512,"user":{"uid":6308472,"parent_uid":4333369,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/eda1d98a-c340-4a15-b1e4-3018fe7ef758?imageView2/1/w/260/h/260","nickname":"God✨星星","gender":2,"age":25,"role_id":1,"credits":341703,"live_credits":992,"live_credits_1":830,"live_adds":35,"live_shares":11,"province":"辽宁省","city":"铁岭市","sign":"一闪一闪亮晶晶  满天都是小星星✨","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":20875,"next":23179,"upgrade":2304,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6092484,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f67a37a7-5f95-4b71-977d-127c0e927672?imageView2/1/w/828/h/828","users":11807,"is_live":true,"begin_live":"2016-11-05 19:36:13","netease_tid":"3953001","max_manager":0,"heats":92934,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6092484","rtmp":"http://yiqihdl.8686c.com/pajia/6092484.flv","all_count":512,"user":{"uid":6092484,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f67a37a7-5f95-4b71-977d-127c0e927672?imageView2/1/w/260/h/260","nickname":"DQ🎀二梦","gender":2,"age":23,"role_id":2,"credits":258496,"live_credits":1910,"live_credits_1":1910,"live_adds":48,"live_shares":2,"province":"广西壮族自治区","city":"来宾市","sign":"\u201c你喜欢的人那么优秀，你怎么甘心懒惰。\u201d","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12772,"next":17139,"upgrade":4367,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6497034,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2e827e65-54cf-4b09-8b1c-dc4c2a8cf4d6?imageView2/1/w/828/h/828","users":5272,"is_live":true,"begin_live":"2016-11-05 17:33:04","netease_tid":"4330515","max_manager":0,"heats":91048,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6497034","rtmp":"http://yiqihdl.8686c.com/pajia/6497034.flv","all_count":512,"user":{"uid":6497034,"parent_uid":6211943,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2e827e65-54cf-4b09-8b1c-dc4c2a8cf4d6?imageView2/1/w/260/h/260","nickname":"💘喧喧💞💜","gender":2,"age":20,"role_id":1,"credits":73240,"live_credits":334,"live_credits_1":327,"live_adds":13,"live_shares":16,"province":"湖北省","city":"武汉市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":3337,"next":3379,"upgrade":42,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6450818,"title":"😋😋😋","cover":"http://yiqi1717-10009627.image.myqcloud.com/e8157409-544b-4bf3-9f2e-b55831bc88e1?imageView2/1/w/828/h/828","users":11328,"is_live":true,"begin_live":"2016-11-05 18:58:39","netease_tid":"4284411","max_manager":0,"heats":90103,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6450818","rtmp":"http://yiqihdl.8686c.com/pajia/6450818.flv","all_count":512,"user":{"uid":6450818,"parent_uid":4416596,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e8157409-544b-4bf3-9f2e-b55831bc88e1?imageView2/1/w/260/h/260","nickname":"蛋蛋的蛋蛋","gender":2,"age":24,"role_id":1,"credits":140818,"live_credits":2014,"live_credits_1":1839,"live_adds":22,"live_shares":4,"province":"四川省","city":"成都市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":23104,"next":23179,"upgrade":75,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":3806159,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/456fd7cf-07e6-4f92-ad6e-2a27ce99eb2d?imageView2/1/w/828/h/828","users":9340,"is_live":true,"begin_live":"2016-11-05 19:55:56","netease_tid":"25641","max_manager":0,"heats":85634,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=3806159","rtmp":"http://yiqihdl.8686c.com/pajia/3806159.flv","all_count":512,"user":{"uid":3806159,"parent_uid":5453772,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/456fd7cf-07e6-4f92-ad6e-2a27ce99eb2d?imageView2/1/w/260/h/260","nickname":"樂～Le","gender":1,"age":99,"role_id":2,"credits":4844201,"live_credits":1227,"live_credits_1":1227,"live_adds":242,"live_shares":17,"province":"广东省","city":"广州市","sign":"\u2026\u2026\u2026\u2026\u2026\u2026","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":49,"id":3,"grade":"彩冠","exp":2471042,"next":2593579,"upgrade":122537,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5795424,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/1/w/828/h/828","users":5505,"is_live":true,"begin_live":"2016-11-05 20:16:02","netease_tid":"3763435","max_manager":0,"heats":83676,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5795424","rtmp":"http://yiqihdl.8686c.com/pajia/5795424.flv","all_count":512,"user":{"uid":5795424,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/1/w/260/h/260","nickname":"DQ✨我宝大人呀","gender":2,"age":99,"role_id":2,"credits":5152237,"live_credits":355,"live_credits_1":355,"live_adds":83,"live_shares":11,"province":"北京市","city":"北京市","sign":"右眼里有个秘密","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":10,"id":1,"grade":"星","exp":30027,"next":30499,"upgrade":472,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6586793,"title":"新主播。ps`我很卡么","cover":"http://yiqi1717-10009627.image.myqcloud.com/37c05a0b-aeca-4c8b-9a6a-4e6abc6852d4?imageView2/1/w/828/h/828","users":403,"is_live":true,"begin_live":"2016-11-05 20:40:11","netease_tid":"4508512","max_manager":0,"heats":82933,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6586793","rtmp":"http://yiqihdl.8686c.com/pajia/6586793.flv","all_count":512,"user":{"uid":6586793,"parent_uid":5191740,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/37c05a0b-aeca-4c8b-9a6a-4e6abc6852d4?imageView2/1/w/260/h/260","nickname":"Gd🌞大光芒","gender":1,"age":18,"role_id":1,"credits":8134,"live_credits":5489,"live_credits_1":0,"live_adds":6,"live_shares":5,"province":"北京市","city":"北京市","sign":"出门踢正步，撸串穿西服。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":8335,"next":8419,"upgrade":84,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5654121,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/bcce2856-eddc-458f-a22a-87ad71be9c6a?imageView2/1/w/828/h/828","users":14687,"is_live":true,"begin_live":"2016-11-05 19:10:28","netease_tid":"3656763","max_manager":0,"heats":81832,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5654121","rtmp":"http://yiqihdl.8686c.com/pajia/5654121.flv","all_count":512,"user":{"uid":5654121,"parent_uid":3817329,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/bcce2856-eddc-458f-a22a-87ad71be9c6a?imageView2/1/w/260/h/260","nickname":"狮子座✨港岛妹妹","gender":2,"age":20,"role_id":1,"credits":450767,"live_credits":127,"live_credits_1":127,"live_adds":63,"live_shares":2,"province":"广西壮族自治区","city":"南宁市","sign":"_     呵，无话可说","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12331,"next":17139,"upgrade":4808,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6536355,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e531dc99-f605-4ef0-a623-82543b10e5e4?imageView2/1/w/828/h/828","users":5477,"is_live":true,"begin_live":"2016-11-05 19:22:46","netease_tid":"4376965","max_manager":0,"heats":73452,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6536355","rtmp":"http://yiqihdl.8686c.com/pajia/6536355.flv","all_count":512,"user":{"uid":6536355,"parent_uid":6347880,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e531dc99-f605-4ef0-a623-82543b10e5e4?imageView2/1/w/260/h/260","nickname":"Cat💫傲骨","gender":1,"age":25,"role_id":2,"credits":48729,"live_credits":535,"live_credits_1":535,"live_adds":16,"live_shares":1,"province":"辽宁省","city":"抚顺市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":16,"id":1,"grade":"星","exp":107576,"next":108019,"upgrade":443,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6460710,"title":"最后还得你自己","cover":"http://yiqi1717-10009627.image.myqcloud.com/fb67324a-26f3-4d5c-9814-d25699f29d9c?imageView2/1/w/828/h/828","users":5568,"is_live":true,"begin_live":"2016-11-05 19:50:55","netease_tid":"4296273","max_manager":0,"heats":71345,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6460710","rtmp":"http://yiqihdl.8686c.com/pajia/6460710.flv","all_count":512,"user":{"uid":6460710,"parent_uid":6066666,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/fb67324a-26f3-4d5c-9814-d25699f29d9c?imageView2/1/w/260/h/260","nickname":"KM王者实力唱将","gender":1,"age":25,"role_id":2,"credits":6657,"live_credits":172,"live_credits_1":22,"live_adds":18,"live_shares":15,"province":"吉林省","city":"四平市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":8643,"next":12259,"upgrade":3616,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6479993,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/03922ad5-dde7-4604-8914-f0f0e1b47167?imageView2/1/w/828/h/828","users":5268,"is_live":true,"begin_live":"2016-11-05 20:11:34","netease_tid":"4312165","max_manager":0,"heats":59125,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6479993","rtmp":"http://yiqihdl.8686c.com/pajia/6479993.flv","all_count":512,"user":{"uid":6479993,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/03922ad5-dde7-4604-8914-f0f0e1b47167?imageView2/1/w/260/h/260","nickname":"润\u2022一言不合就干","gender":1,"age":24,"role_id":1,"credits":128857,"live_credits":30,"live_credits_1":30,"live_adds":23,"live_shares":2,"province":"湖北省","city":"荆州市","sign":"情感专家","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":157039,"next":173779,"upgrade":16740,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6526851,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d0d926d5-3cb3-4d56-9a3e-e7d074ae1f90?imageView2/1/w/828/h/828","users":1144,"is_live":true,"begin_live":"2016-11-05 20:36:47","netease_tid":"4368614","max_manager":0,"heats":41507,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6526851","rtmp":"http://yiqihdl.8686c.com/pajia/6526851.flv","all_count":512,"user":{"uid":6526851,"parent_uid":5385589,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d0d926d5-3cb3-4d56-9a3e-e7d074ae1f90?imageView2/1/w/260/h/260","nickname":"ZS、三宝Man","gender":1,"age":22,"role_id":2,"credits":120692,"live_credits":0,"live_credits_1":0,"live_adds":19,"live_shares":6,"province":"湖北省","city":"武汉市","sign":"求关注，求包养，求守护，😄","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":11,"id":1,"grade":"星","exp":32176,"next":39219,"upgrade":7043,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5601034,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/a0da00ea-476c-4a2f-9765-563887f5c410?imageView2/1/w/828/h/828","users":19,"is_live":true,"begin_live":"2016-11-05 20:42:00","netease_tid":"3614680","max_manager":0,"heats":39690,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5601034","rtmp":"http://yiqihdl.8686c.com/pajia/5601034.flv","all_count":512,"user":{"uid":5601034,"parent_uid":5631439,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a0da00ea-476c-4a2f-9765-563887f5c410?imageView2/1/w/260/h/260","nickname":"Anna *","gender":2,"age":99,"role_id":2,"credits":1215892,"live_credits":0,"live_credits_1":0,"live_adds":60,"live_shares":0,"province":"吉林省","city":"长春市","sign":"。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":23,"id":2,"grade":"冠","exp":279348,"next":296739,"upgrade":17391,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6680212,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/99083899-3560-4db2-847d-fce3090dcb07?imageView2/1/w/828/h/828","users":2096,"is_live":true,"begin_live":"2016-11-05 20:32:14","netease_tid":"4742798","max_manager":0,"heats":31353,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6680212","rtmp":"http://yiqihdl.8686c.com/pajia/6680212.flv","all_count":512,"user":{"uid":6680212,"parent_uid":4645214,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/99083899-3560-4db2-847d-fce3090dcb07?imageView2/1/w/260/h/260","nickname":"AAA琴有独中","gender":1,"age":30,"role_id":1,"credits":1640,"live_credits":0,"live_credits_1":0,"live_adds":2,"live_shares":6,"province":"黑龙江省","city":"哈尔滨市","sign":"毅歌专场(✪ω✪)琴有独中","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":385,"next":619,"upgrade":234,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]}
     */

    private String ret;
    private String msg;
    /**
     * id : 11
     * template : NORMAL
     * numerical : USERS
     * name :
     * parameters :
     * line : 1
     * waterfall : false
     * livelist : [{"uid":5392720,"title":"欢喜就好","cover":"http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/828/h/828","users":14130,"is_live":true,"begin_live":"2016-11-05 18:50:03","netease_tid":"3674655","max_manager":0,"heats":135205,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5392720","rtmp":"http://yiqihdl.8686c.com/pajia/5392720.flv","all_count":512,"user":{"uid":5392720,"parent_uid":4705679,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/260/h/260","nickname":"A🍼愛文儿","gender":2,"age":18,"role_id":1,"credits":5477625,"live_credits":71278,"live_credits_1":12575,"live_adds":48,"live_shares":233,"province":"重庆市","city":"重庆市","sign":"🌶      岁月漫长 要心地善良","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":22831,"next":23179,"upgrade":348,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5371305,"title":"嘿嘿 没洗脑壳。。","cover":"http://yiqi1717-10009627.image.myqcloud.com/bc0e5015-0856-4230-b575-8a28eee1db62?imageView2/1/w/828/h/828","users":13395,"is_live":true,"begin_live":"2016-11-05 19:19:21","netease_tid":"3506895","max_manager":0,"heats":133543,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5371305","rtmp":"http://yiqihdl.8686c.com/pajia/5371305.flv","all_count":512,"user":{"uid":5371305,"parent_uid":4396572,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/bc0e5015-0856-4230-b575-8a28eee1db62?imageView2/1/w/260/h/260","nickname":"NK、Mc觉主","gender":1,"age":25,"role_id":2,"credits":1746994,"live_credits":30143,"live_credits_1":28440,"live_adds":53,"live_shares":41,"province":"内蒙古自治区","city":"呼伦贝尔市","sign":"怀有一颗感恩的心","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":30,"id":2,"grade":"冠","exp":579305,"next":630499,"upgrade":51194,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4704350,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d0c3aaf2-e753-4b76-90a1-610905ee8bc9?imageView2/1/w/828/h/828","users":14391,"is_live":true,"begin_live":"2016-11-05 12:15:07","netease_tid":"59839","max_manager":0,"heats":129622,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4704350","rtmp":"http://yiqihdl.8686c.com/pajia/4704350.flv","all_count":512,"user":{"uid":4704350,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d0c3aaf2-e753-4b76-90a1-610905ee8bc9?imageView2/1/w/260/h/260","nickname":"Coco💐小雨","gender":1,"age":25,"role_id":2,"credits":6663986,"live_credits":15595,"live_credits_1":5150,"live_adds":182,"live_shares":42,"province":"Gangwon-do","city":"Chuncheon","sign":"脚踏实地，努力奋斗！尊师V姐","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":57,"id":3,"grade":"彩冠","exp":3943414,"next":4029259,"upgrade":85845,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5416593,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/476a2aeb-09dc-4c3b-9d53-7269b3782b9f?imageView2/1/w/828/h/828","users":11520,"is_live":true,"begin_live":"2016-11-05 19:41:38","netease_tid":"3423084","max_manager":0,"heats":128922,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5416593","rtmp":"http://yiqihdl.8686c.com/pajia/5416593.flv","all_count":512,"user":{"uid":5416593,"parent_uid":4495523,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/476a2aeb-09dc-4c3b-9d53-7269b3782b9f?imageView2/1/w/260/h/260","nickname":"ZTY💕月儿","gender":2,"age":20,"role_id":2,"credits":1100399,"live_credits":33981,"live_credits_1":4209,"live_adds":67,"live_shares":72,"province":"黑龙江省","city":"哈尔滨市","sign":"微博号:Angle淇儿","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":15,"id":1,"grade":"星","exp":89469,"next":90499,"upgrade":1030,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6318133,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c2366eb9-657b-4bb4-9a22-3700e6eebdf2?imageView2/1/w/828/h/828","users":10878,"is_live":true,"begin_live":"2016-11-05 18:37:09","netease_tid":"4130112","max_manager":0,"heats":127375,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6318133","rtmp":"http://yiqihdl.8686c.com/pajia/6318133.flv","all_count":512,"user":{"uid":6318133,"parent_uid":6211943,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c2366eb9-657b-4bb4-9a22-3700e6eebdf2?imageView2/1/w/260/h/260","nickname":"Hw💋mm梓晴","gender":2,"age":30,"role_id":1,"credits":1320065,"live_credits":9968,"live_credits_1":9968,"live_adds":44,"live_shares":100,"province":"甘肃省","city":"张掖市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":11,"id":1,"grade":"星","exp":31732,"next":39219,"upgrade":7487,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6473290,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2e6c8927-9d36-42fa-87d7-cf4c0d81c8d3?imageView2/1/w/828/h/828","users":11051,"is_live":true,"begin_live":"2016-11-05 18:24:42","netease_tid":"4339543","max_manager":0,"heats":126100,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6473290","rtmp":"http://yiqihdl.8686c.com/pajia/6473290.flv","all_count":512,"user":{"uid":6473290,"parent_uid":4728569,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2e6c8927-9d36-42fa-87d7-cf4c0d81c8d3?imageView2/1/w/260/h/260","nickname":"Only👿诺","gender":2,"age":99,"role_id":2,"credits":622095,"live_credits":21093,"live_credits_1":5224,"live_adds":23,"live_shares":155,"province":"辽宁省","city":"沈阳市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":18,"id":1,"grade":"星","exp":133172,"next":149539,"upgrade":16367,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5981679,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/90aebe78-a618-4426-b522-e34f1f68afcd?imageView2/1/w/828/h/828","users":5463,"is_live":true,"begin_live":"2016-11-05 20:08:34","netease_tid":"3882194","max_manager":0,"heats":126025,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5981679","rtmp":"http://yiqihdl.8686c.com/pajia/5981679.flv","all_count":512,"user":{"uid":5981679,"parent_uid":4416596,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/90aebe78-a618-4426-b522-e34f1f68afcd?imageView2/1/w/260/h/260","nickname":"魔音✝️萱宝","gender":2,"age":20,"role_id":1,"credits":2278327,"live_credits":17185,"live_credits_1":17095,"live_adds":68,"live_shares":5,"province":"江苏省","city":"苏州市","sign":"求守护，求关注，我是新人，需要你们的支持。俊俊💋","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":27,"id":2,"grade":"冠","exp":430493,"next":467059,"upgrade":36566,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6580442,"title":" 粱慧旋","cover":"http://yiqi1717-10009627.image.myqcloud.com/9102fe7f-2589-44ea-9457-88433173f8b9?imageView2/1/w/828/h/828","users":13466,"is_live":true,"begin_live":"2016-11-05 18:56:21","netease_tid":"4516065","max_manager":0,"heats":125068,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6580442","rtmp":"http://yiqihdl.8686c.com/pajia/6580442.flv","all_count":512,"user":{"uid":6580442,"parent_uid":5909476,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9102fe7f-2589-44ea-9457-88433173f8b9?imageView2/1/w/260/h/260","nickname":"粱慧旋","gender":2,"age":20,"role_id":1,"credits":523830,"live_credits":6595,"live_credits_1":6565,"live_adds":9,"live_shares":109,"province":"Seoul","city":"Seongbuk","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":2505,"next":3379,"upgrade":874,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4877400,"title":"快乐开始🤔","cover":"http://yiqi1717-10009627.image.myqcloud.com/26ab4fd3-79df-4fbb-8df6-57e318ee4977?imageView2/1/w/828/h/828","users":13347,"is_live":true,"begin_live":"2016-11-05 19:13:34","netease_tid":"104841","max_manager":0,"heats":124662,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4877400","rtmp":"http://yiqihdl.8686c.com/pajia/4877400.flv","all_count":512,"user":{"uid":4877400,"parent_uid":5631439,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/26ab4fd3-79df-4fbb-8df6-57e318ee4977?imageView2/1/w/260/h/260","nickname":"🈳️🌟小神经","gender":1,"age":25,"role_id":1,"credits":3783769,"live_credits":6694,"live_credits_1":6694,"live_adds":161,"live_shares":34,"province":"辽宁省","city":"铁岭市","sign":"本人全才 （生孩子除外）！","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":27,"id":2,"grade":"冠","exp":445108,"next":467059,"upgrade":21951,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6166239,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/da784e24-12bd-4406-a99a-cf32211c18c5?imageView2/1/w/828/h/828","users":13855,"is_live":true,"begin_live":"2016-11-05 16:21:53","netease_tid":"4016911","max_manager":0,"heats":124586,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6166239","rtmp":"http://yiqihdl.8686c.com/pajia/6166239.flv","all_count":512,"user":{"uid":6166239,"parent_uid":4861292,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/da784e24-12bd-4406-a99a-cf32211c18c5?imageView2/1/w/260/h/260","nickname":"另得儿","gender":2,"age":20,"role_id":2,"credits":615014,"live_credits":10846,"live_credits_1":4068,"live_adds":58,"live_shares":60,"province":"北京市","city":"北京市","sign":"一个人有多不正经 就有多深情","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":149694,"next":173779,"upgrade":24085,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6156365,"title":"怕冷的丫头","cover":"http://yiqi1717-10009627.image.myqcloud.com/13bd0202-983e-4047-bffe-63d01fe778fb?imageView2/1/w/828/h/828","users":13781,"is_live":true,"begin_live":"2016-11-05 18:24:46","netease_tid":"4009209","max_manager":0,"heats":123129,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6156365","rtmp":"http://yiqihdl.8686c.com/pajia/6156365.flv","all_count":512,"user":{"uid":6156365,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/13bd0202-983e-4047-bffe-63d01fe778fb?imageView2/1/w/260/h/260","nickname":"DQ嘉嘉爱家呀","gender":2,"age":20,"role_id":2,"credits":1623316,"live_credits":11460,"live_credits_1":3131,"live_adds":58,"live_shares":16,"province":"山东省","city":"济南市","sign":"动态有我和你的故事❤️注意查收","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":24,"id":2,"grade":"冠","exp":323272,"next":334579,"upgrade":11307,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6164642,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0f6c90bb-dc14-4084-b800-68ed4c79aef3?imageView2/1/w/828/h/828","users":5441,"is_live":true,"begin_live":"2016-11-05 18:39:56","netease_tid":"4385018","max_manager":0,"heats":122831,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6164642","rtmp":"http://yiqihdl.8686c.com/pajia/6164642.flv","all_count":512,"user":{"uid":6164642,"parent_uid":5200275,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0f6c90bb-dc14-4084-b800-68ed4c79aef3?imageView2/1/w/260/h/260","nickname":"St✨V脸男神","gender":1,"age":28,"role_id":1,"credits":40957,"live_credits":16359,"live_credits_1":9615,"live_adds":11,"live_shares":24,"province":"吉林省","city":"延边朝鲜族自治州","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":11000,"next":12259,"upgrade":1259,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6680448,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0032c9ff-9ad7-4e54-9b9d-bed4d794fd4c?imageView2/1/w/828/h/828","users":1841,"is_live":true,"begin_live":"2016-11-05 19:29:38","netease_tid":"4771795","max_manager":0,"heats":122398,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6680448","rtmp":"http://yiqihdl.8686c.com/pajia/6680448.flv","all_count":512,"user":{"uid":6680448,"parent_uid":6631262,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0032c9ff-9ad7-4e54-9b9d-bed4d794fd4c?imageView2/1/w/260/h/260","nickname":"Ms✨汐宝👶","gender":2,"age":20,"role_id":1,"credits":13343,"live_credits":13343,"live_credits_1":13313,"live_adds":0,"live_shares":8,"province":"四川省","city":"绵阳市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":0,"next":619,"upgrade":619,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4944536,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/89a30bf3-bf89-4c60-8741-061b2b720215?imageView2/1/w/828/h/828","users":8627,"is_live":true,"begin_live":"2016-11-05 20:00:09","netease_tid":"103085","max_manager":0,"heats":117624,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4944536","rtmp":"http://yiqihdl.8686c.com/pajia/4944536.flv","all_count":512,"user":{"uid":4944536,"parent_uid":4851427,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/89a30bf3-bf89-4c60-8741-061b2b720215?imageView2/1/w/260/h/260","nickname":"Rx✨阿提蜜斯","gender":2,"age":18,"role_id":1,"credits":992123,"live_credits":9499,"live_credits_1":4049,"live_adds":63,"live_shares":18,"province":"安徽省","city":"安庆市","sign":"演员","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":20799,"next":23179,"upgrade":2380,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5245439,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/00d69a7e-d742-4b9e-90bc-fb4bdd337d73?imageView2/1/w/828/h/828","users":2199,"is_live":true,"begin_live":"2016-11-05 20:31:34","netease_tid":"213319","max_manager":0,"heats":117382,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5245439","rtmp":"http://yiqihdl.8686c.com/pajia/5245439.flv","all_count":512,"user":{"uid":5245439,"parent_uid":4611995,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/00d69a7e-d742-4b9e-90bc-fb4bdd337d73?imageView2/1/w/260/h/260","nickname":"凰权💫雪宝儿","gender":2,"age":66,"role_id":2,"credits":9266932,"live_credits":16877,"live_credits_1":1757,"live_adds":146,"live_shares":6,"province":"安徽省","city":"阜阳市","sign":"\u2014\u2014","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":40,"id":3,"grade":"彩冠","exp":1355874,"next":1440499,"upgrade":84625,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6674659,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/9aa7ca6e-0cf9-476f-8153-916271b99b03?imageView2/1/w/828/h/828","users":9038,"is_live":true,"begin_live":"2016-11-05 18:19:26","netease_tid":"4728314","max_manager":0,"heats":117042,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6674659","rtmp":"http://yiqihdl.8686c.com/pajia/6674659.flv","all_count":512,"user":{"uid":6674659,"parent_uid":4728569,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/9aa7ca6e-0cf9-476f-8153-916271b99b03?imageView2/1/w/260/h/260","nickname":"Only💞狐狸","gender":2,"age":20,"role_id":1,"credits":24434,"live_credits":6482,"live_credits_1":6119,"live_adds":2,"live_shares":5,"province":"辽宁省","city":"大连市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":2,"id":1,"grade":"星","exp":733,"next":1059,"upgrade":326,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5824664,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d920d1f5-3761-4046-a044-376aebad5784?imageView2/1/w/828/h/828","users":5621,"is_live":true,"begin_live":"2016-11-05 20:15:29","netease_tid":"3784675","max_manager":0,"heats":116638,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5824664","rtmp":"http://yiqihdl.8686c.com/pajia/5824664.flv","all_count":512,"user":{"uid":5824664,"parent_uid":4501000,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d920d1f5-3761-4046-a044-376aebad5784?imageView2/1/w/260/h/260","nickname":"NS🔥薇薇","gender":2,"age":20,"role_id":2,"credits":4394612,"live_credits":6755,"live_credits_1":6755,"live_adds":83,"live_shares":9,"province":"四川省","city":"成都市","sign":"晚上9点播！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":22,"id":2,"grade":"冠","exp":257498,"next":261859,"upgrade":4361,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5295536,"title":"深情不及久伴。😊😊","cover":"http://yiqi1717-10009627.image.myqcloud.com/ee9055f7-6d1f-42fb-a7d8-a43d3ce53151?imageView2/1/w/828/h/828","users":13815,"is_live":true,"begin_live":"2016-11-05 19:10:13","netease_tid":"310923","max_manager":0,"heats":115855,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5295536","rtmp":"http://yiqihdl.8686c.com/pajia/5295536.flv","all_count":512,"user":{"uid":5295536,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ee9055f7-6d1f-42fb-a7d8-a43d3ce53151?imageView2/1/w/260/h/260","nickname":"金刚柒月💥","gender":1,"age":99,"role_id":2,"credits":6210572,"live_credits":4070,"live_credits_1":3860,"live_adds":139,"live_shares":22,"province":"浙江省","city":"杭州市","sign":"欲戴王冠，必承其重！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":35,"id":2,"grade":"冠","exp":958248,"next":980499,"upgrade":22251,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5512976,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f0918dff-09ae-4b07-98bd-310795327507?imageView2/1/w/828/h/828","users":2798,"is_live":true,"begin_live":"2016-11-05 20:29:02","netease_tid":"3527209","max_manager":0,"heats":115147,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5512976","rtmp":"http://yiqihdl.8686c.com/pajia/5512976.flv","all_count":512,"user":{"uid":5512976,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f0918dff-09ae-4b07-98bd-310795327507?imageView2/1/w/260/h/260","nickname":"DQ晓玲妹妹","gender":2,"age":20,"role_id":2,"credits":361623,"live_credits":17173,"live_credits_1":16453,"live_adds":74,"live_shares":5,"province":"广东省","city":"广州市","sign":"\u201c 你给的半点好 我都想炫耀 \u201d","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":13,"id":1,"grade":"星","exp":60512,"next":61339,"upgrade":827,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5392629,"title":"回来啦","cover":"http://yiqi1717-10009627.image.myqcloud.com/d1ec4254-ace6-4232-b842-eb50bca10834?imageView2/1/w/828/h/828","users":9344,"is_live":true,"begin_live":"2016-11-05 19:09:06","netease_tid":"3389789","max_manager":0,"heats":112655,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5392629","rtmp":"http://yiqihdl.8686c.com/pajia/5392629.flv","all_count":512,"user":{"uid":5392629,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d1ec4254-ace6-4232-b842-eb50bca10834?imageView2/1/w/260/h/260","nickname":"润\u2022钢琴女王","gender":2,"age":20,"role_id":2,"credits":530524,"live_credits":3848,"live_credits_1":3848,"live_adds":47,"live_shares":8,"province":"吉林省","city":"吉林市","sign":"个性签名","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":172947,"next":173779,"upgrade":832,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6039898,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/35a0b4ce-32ad-49c8-9304-14f846af19cd?imageView2/1/w/828/h/828","users":9384,"is_live":true,"begin_live":"2016-11-05 19:55:08","netease_tid":"3922176","max_manager":0,"heats":112350,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6039898","rtmp":"http://yiqihdl.8686c.com/pajia/6039898.flv","all_count":512,"user":{"uid":6039898,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/35a0b4ce-32ad-49c8-9304-14f846af19cd?imageView2/1/w/260/h/260","nickname":"DQ西点徒喵喵","gender":2,"age":20,"role_id":2,"credits":717137,"live_credits":5858,"live_credits_1":5320,"live_adds":35,"live_shares":6,"province":"江苏省","city":"南京市","sign":"爱玩游戏呀","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":163968,"next":173779,"upgrade":9811,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6176031,"title":"快来看丫丫的新造型","cover":"http://yiqi1717-10009627.image.myqcloud.com/b6732392-fa96-4e0a-8902-4d048701e91b?imageView2/1/w/828/h/828","users":14297,"is_live":true,"begin_live":"2016-11-05 18:34:48","netease_tid":"4035105","max_manager":0,"heats":111891,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6176031","rtmp":"http://yiqihdl.8686c.com/pajia/6176031.flv","all_count":512,"user":{"uid":6176031,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b6732392-fa96-4e0a-8902-4d048701e91b?imageView2/1/w/260/h/260","nickname":"DQ丫丫","gender":2,"age":20,"role_id":2,"credits":892173,"live_credits":5899,"live_credits_1":237,"live_adds":51,"live_shares":19,"province":"浙江省","city":"嘉兴市","sign":"梦想拥有天使的外表，不如修炼一颗天使的心❤️","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":23157,"next":23179,"upgrade":22,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6196582,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f7b33872-08fc-4d34-b999-7fcece357b6a?imageView2/1/w/828/h/828","users":9678,"is_live":true,"begin_live":"2016-11-05 18:33:20","netease_tid":"4060106","max_manager":0,"heats":111819,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6196582","rtmp":"http://yiqihdl.8686c.com/pajia/6196582.flv","all_count":512,"user":{"uid":6196582,"parent_uid":4861292,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f7b33872-08fc-4d34-b999-7fcece357b6a?imageView2/1/w/260/h/260","nickname":"百秀🎨小竹条儿","gender":2,"age":18,"role_id":1,"credits":263513,"live_credits":4828,"live_credits_1":3798,"live_adds":53,"live_shares":16,"province":"浙江省","city":"杭州市","sign":"临摹小画手～","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":13,"id":1,"grade":"星","exp":58460,"next":61339,"upgrade":2879,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4622076,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/98fbca21-3d07-4123-bff9-ed5b11366800?imageView2/1/w/828/h/828","users":5419,"is_live":true,"begin_live":"2016-11-05 18:00:55","netease_tid":"4048285","max_manager":0,"heats":108679,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4622076","rtmp":"http://yiqihdl.8686c.com/pajia/4622076.flv","all_count":512,"user":{"uid":4622076,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/98fbca21-3d07-4123-bff9-ed5b11366800?imageView2/1/w/260/h/260","nickname":"karry。","gender":2,"age":99,"role_id":2,"credits":203849,"live_credits":3502,"live_credits_1":1869,"live_adds":25,"live_shares":12,"province":"四川省","city":"成都市","sign":"િ😳ી 噢多克~","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":13469,"next":17139,"upgrade":3670,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5907926,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e4716692-73b0-43ec-b3fd-a9167511b087?imageView2/1/w/828/h/828","users":3639,"is_live":true,"begin_live":"2016-11-05 20:24:13","netease_tid":"4017447","max_manager":0,"heats":104845,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5907926","rtmp":"http://yiqihdl.8686c.com/pajia/5907926.flv","all_count":512,"user":{"uid":5907926,"parent_uid":3774730,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e4716692-73b0-43ec-b3fd-a9167511b087?imageView2/1/w/260/h/260","nickname":"月亮公主🌸驾到","gender":2,"age":27,"role_id":1,"credits":1712074,"live_credits":1724,"live_credits_1":540,"live_adds":59,"live_shares":18,"province":"江苏省","city":"无锡市","sign":"谈恋伤钱！","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":23,"id":2,"grade":"冠","exp":269816,"next":296739,"upgrade":26923,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6392157,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/b8a2f318-ec0d-49bd-bb16-3b7bc0e40395?imageView2/1/w/828/h/828","users":5796,"is_live":true,"begin_live":"2016-11-05 19:41:06","netease_tid":"4223965","max_manager":0,"heats":101665,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6392157","rtmp":"http://yiqihdl.8686c.com/pajia/6392157.flv","all_count":512,"user":{"uid":6392157,"parent_uid":6043959,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b8a2f318-ec0d-49bd-bb16-3b7bc0e40395?imageView2/1/w/260/h/260","nickname":"AAA-歌手菲梵","gender":2,"age":20,"role_id":1,"credits":1528504,"live_credits":1625,"live_credits_1":1625,"live_adds":24,"live_shares":11,"province":"江苏省","city":"徐州市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":7852,"next":8419,"upgrade":567,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6084454,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/93fa3b5c-6e8a-4da9-ac9f-e336b7c200ff?imageView2/1/w/828/h/828","users":5374,"is_live":true,"begin_live":"2016-11-05 19:58:26","netease_tid":"4288585","max_manager":0,"heats":99296,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6084454","rtmp":"http://yiqihdl.8686c.com/pajia/6084454.flv","all_count":512,"user":{"uid":6084454,"parent_uid":3005924,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/93fa3b5c-6e8a-4da9-ac9f-e336b7c200ff?imageView2/1/w/260/h/260","nickname":"Mu_悠悠","gender":2,"age":20,"role_id":1,"credits":70375,"live_credits":9090,"live_credits_1":0,"live_adds":25,"live_shares":12,"province":"广东省","city":"深圳市","sign":"昨天是过去，而今天是礼物。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":11856,"next":12259,"upgrade":403,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5145455,"title":"小猫咪的日常","cover":"http://yiqi1717-10009627.image.myqcloud.com/f6f5358e-e23a-44b4-92e0-eb719e18a714?imageView2/1/w/828/h/828","users":6560,"is_live":true,"begin_live":"2016-11-05 20:10:27","netease_tid":"149599","max_manager":0,"heats":98890,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5145455","rtmp":"http://yiqihdl.8686c.com/pajia/5145455.flv","all_count":512,"user":{"uid":5145455,"parent_uid":4851427,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f6f5358e-e23a-44b4-92e0-eb719e18a714?imageView2/1/w/260/h/260","nickname":"Rx✨超妹儿","gender":2,"age":18,"role_id":1,"credits":1651190,"live_credits":750,"live_credits_1":720,"live_adds":116,"live_shares":27,"province":"安徽省","city":"安庆市","sign":"从你的全世界路过","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":22,"id":2,"grade":"冠","exp":251554,"next":261859,"upgrade":10305,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":4387460,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e3df9230-26ec-4b8a-8694-6d1ed762a37b?imageView2/1/w/828/h/828","users":14078,"is_live":true,"begin_live":"2016-11-05 19:02:01","netease_tid":"36523","max_manager":0,"heats":96860,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=4387460","rtmp":"http://yiqihdl.8686c.com/pajia/4387460.flv","all_count":512,"user":{"uid":4387460,"parent_uid":4554562,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e3df9230-26ec-4b8a-8694-6d1ed762a37b?imageView2/1/w/260/h/260","nickname":"三哥","gender":1,"age":22,"role_id":2,"credits":3915654,"live_credits":770,"live_credits_1":770,"live_adds":202,"live_shares":6,"province":"山东省","city":"济宁市","sign":"如果你愿意，我带你和吉他一起去流浪！","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":71,"id":4,"grade":"火冠","exp":7535750,"next":7662819,"upgrade":127069,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/1d3bb155-d6e2-4102-b5db-e67f9e2eb49e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5946818,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/889cdd31-9ee9-4702-a82b-cf79b5f12c70?imageView2/1/w/828/h/828","users":5317,"is_live":true,"begin_live":"2016-11-05 20:08:31","netease_tid":"3856441","max_manager":0,"heats":95473,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5946818","rtmp":"http://yiqihdl.8686c.com/pajia/5946818.flv","all_count":512,"user":{"uid":5946818,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/889cdd31-9ee9-4702-a82b-cf79b5f12c70?imageView2/1/w/260/h/260","nickname":"DQ可爱","gender":2,"age":20,"role_id":2,"credits":80375,"live_credits":1220,"live_credits_1":50,"live_adds":29,"live_shares":10,"province":"河北省","city":"唐山市","sign":"榜一➕VX","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":5,"id":1,"grade":"星","exp":4273,"next":5499,"upgrade":1226,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6308472,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/eda1d98a-c340-4a15-b1e4-3018fe7ef758?imageView2/1/w/828/h/828","users":5874,"is_live":true,"begin_live":"2016-11-05 19:36:30","netease_tid":"4131869","max_manager":0,"heats":93423,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6308472","rtmp":"http://yiqihdl.8686c.com/pajia/6308472.flv","all_count":512,"user":{"uid":6308472,"parent_uid":4333369,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/eda1d98a-c340-4a15-b1e4-3018fe7ef758?imageView2/1/w/260/h/260","nickname":"God✨星星","gender":2,"age":25,"role_id":1,"credits":341703,"live_credits":992,"live_credits_1":830,"live_adds":35,"live_shares":11,"province":"辽宁省","city":"铁岭市","sign":"一闪一闪亮晶晶  满天都是小星星✨","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":20875,"next":23179,"upgrade":2304,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6092484,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/f67a37a7-5f95-4b71-977d-127c0e927672?imageView2/1/w/828/h/828","users":11807,"is_live":true,"begin_live":"2016-11-05 19:36:13","netease_tid":"3953001","max_manager":0,"heats":92934,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6092484","rtmp":"http://yiqihdl.8686c.com/pajia/6092484.flv","all_count":512,"user":{"uid":6092484,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/f67a37a7-5f95-4b71-977d-127c0e927672?imageView2/1/w/260/h/260","nickname":"DQ🎀二梦","gender":2,"age":23,"role_id":2,"credits":258496,"live_credits":1910,"live_credits_1":1910,"live_adds":48,"live_shares":2,"province":"广西壮族自治区","city":"来宾市","sign":"\u201c你喜欢的人那么优秀，你怎么甘心懒惰。\u201d","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12772,"next":17139,"upgrade":4367,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6497034,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2e827e65-54cf-4b09-8b1c-dc4c2a8cf4d6?imageView2/1/w/828/h/828","users":5272,"is_live":true,"begin_live":"2016-11-05 17:33:04","netease_tid":"4330515","max_manager":0,"heats":91048,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6497034","rtmp":"http://yiqihdl.8686c.com/pajia/6497034.flv","all_count":512,"user":{"uid":6497034,"parent_uid":6211943,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2e827e65-54cf-4b09-8b1c-dc4c2a8cf4d6?imageView2/1/w/260/h/260","nickname":"💘喧喧💞💜","gender":2,"age":20,"role_id":1,"credits":73240,"live_credits":334,"live_credits_1":327,"live_adds":13,"live_shares":16,"province":"湖北省","city":"武汉市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":3337,"next":3379,"upgrade":42,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6450818,"title":"😋😋😋","cover":"http://yiqi1717-10009627.image.myqcloud.com/e8157409-544b-4bf3-9f2e-b55831bc88e1?imageView2/1/w/828/h/828","users":11328,"is_live":true,"begin_live":"2016-11-05 18:58:39","netease_tid":"4284411","max_manager":0,"heats":90103,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6450818","rtmp":"http://yiqihdl.8686c.com/pajia/6450818.flv","all_count":512,"user":{"uid":6450818,"parent_uid":4416596,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e8157409-544b-4bf3-9f2e-b55831bc88e1?imageView2/1/w/260/h/260","nickname":"蛋蛋的蛋蛋","gender":2,"age":24,"role_id":1,"credits":140818,"live_credits":2014,"live_credits_1":1839,"live_adds":22,"live_shares":4,"province":"四川省","city":"成都市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":23104,"next":23179,"upgrade":75,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":3806159,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/456fd7cf-07e6-4f92-ad6e-2a27ce99eb2d?imageView2/1/w/828/h/828","users":9340,"is_live":true,"begin_live":"2016-11-05 19:55:56","netease_tid":"25641","max_manager":0,"heats":85634,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=3806159","rtmp":"http://yiqihdl.8686c.com/pajia/3806159.flv","all_count":512,"user":{"uid":3806159,"parent_uid":5453772,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/456fd7cf-07e6-4f92-ad6e-2a27ce99eb2d?imageView2/1/w/260/h/260","nickname":"樂～Le","gender":1,"age":99,"role_id":2,"credits":4844201,"live_credits":1227,"live_credits_1":1227,"live_adds":242,"live_shares":17,"province":"广东省","city":"广州市","sign":"\u2026\u2026\u2026\u2026\u2026\u2026","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":49,"id":3,"grade":"彩冠","exp":2471042,"next":2593579,"upgrade":122537,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5795424,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/1/w/828/h/828","users":5505,"is_live":true,"begin_live":"2016-11-05 20:16:02","netease_tid":"3763435","max_manager":0,"heats":83676,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5795424","rtmp":"http://yiqihdl.8686c.com/pajia/5795424.flv","all_count":512,"user":{"uid":5795424,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/11cb20e2-556c-4eca-a06e-95209f7ab9b2?imageView2/1/w/260/h/260","nickname":"DQ✨我宝大人呀","gender":2,"age":99,"role_id":2,"credits":5152237,"live_credits":355,"live_credits_1":355,"live_adds":83,"live_shares":11,"province":"北京市","city":"北京市","sign":"右眼里有个秘密","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":10,"id":1,"grade":"星","exp":30027,"next":30499,"upgrade":472,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6586793,"title":"新主播。ps`我很卡么","cover":"http://yiqi1717-10009627.image.myqcloud.com/37c05a0b-aeca-4c8b-9a6a-4e6abc6852d4?imageView2/1/w/828/h/828","users":403,"is_live":true,"begin_live":"2016-11-05 20:40:11","netease_tid":"4508512","max_manager":0,"heats":82933,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6586793","rtmp":"http://yiqihdl.8686c.com/pajia/6586793.flv","all_count":512,"user":{"uid":6586793,"parent_uid":5191740,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/37c05a0b-aeca-4c8b-9a6a-4e6abc6852d4?imageView2/1/w/260/h/260","nickname":"Gd🌞大光芒","gender":1,"age":18,"role_id":1,"credits":8134,"live_credits":5489,"live_credits_1":0,"live_adds":6,"live_shares":5,"province":"北京市","city":"北京市","sign":"出门踢正步，撸串穿西服。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":8335,"next":8419,"upgrade":84,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5654121,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/bcce2856-eddc-458f-a22a-87ad71be9c6a?imageView2/1/w/828/h/828","users":14687,"is_live":true,"begin_live":"2016-11-05 19:10:28","netease_tid":"3656763","max_manager":0,"heats":81832,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5654121","rtmp":"http://yiqihdl.8686c.com/pajia/5654121.flv","all_count":512,"user":{"uid":5654121,"parent_uid":3817329,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/bcce2856-eddc-458f-a22a-87ad71be9c6a?imageView2/1/w/260/h/260","nickname":"狮子座✨港岛妹妹","gender":2,"age":20,"role_id":1,"credits":450767,"live_credits":127,"live_credits_1":127,"live_adds":63,"live_shares":2,"province":"广西壮族自治区","city":"南宁市","sign":"_     呵，无话可说","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12331,"next":17139,"upgrade":4808,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6536355,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e531dc99-f605-4ef0-a623-82543b10e5e4?imageView2/1/w/828/h/828","users":5477,"is_live":true,"begin_live":"2016-11-05 19:22:46","netease_tid":"4376965","max_manager":0,"heats":73452,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6536355","rtmp":"http://yiqihdl.8686c.com/pajia/6536355.flv","all_count":512,"user":{"uid":6536355,"parent_uid":6347880,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e531dc99-f605-4ef0-a623-82543b10e5e4?imageView2/1/w/260/h/260","nickname":"Cat💫傲骨","gender":1,"age":25,"role_id":2,"credits":48729,"live_credits":535,"live_credits_1":535,"live_adds":16,"live_shares":1,"province":"辽宁省","city":"抚顺市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":16,"id":1,"grade":"星","exp":107576,"next":108019,"upgrade":443,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6460710,"title":"最后还得你自己","cover":"http://yiqi1717-10009627.image.myqcloud.com/fb67324a-26f3-4d5c-9814-d25699f29d9c?imageView2/1/w/828/h/828","users":5568,"is_live":true,"begin_live":"2016-11-05 19:50:55","netease_tid":"4296273","max_manager":0,"heats":71345,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6460710","rtmp":"http://yiqihdl.8686c.com/pajia/6460710.flv","all_count":512,"user":{"uid":6460710,"parent_uid":6066666,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/fb67324a-26f3-4d5c-9814-d25699f29d9c?imageView2/1/w/260/h/260","nickname":"KM王者实力唱将","gender":1,"age":25,"role_id":2,"credits":6657,"live_credits":172,"live_credits_1":22,"live_adds":18,"live_shares":15,"province":"吉林省","city":"四平市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":7,"id":1,"grade":"星","exp":8643,"next":12259,"upgrade":3616,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6479993,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/03922ad5-dde7-4604-8914-f0f0e1b47167?imageView2/1/w/828/h/828","users":5268,"is_live":true,"begin_live":"2016-11-05 20:11:34","netease_tid":"4312165","max_manager":0,"heats":59125,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6479993","rtmp":"http://yiqihdl.8686c.com/pajia/6479993.flv","all_count":512,"user":{"uid":6479993,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/03922ad5-dde7-4604-8914-f0f0e1b47167?imageView2/1/w/260/h/260","nickname":"润\u2022一言不合就干","gender":1,"age":24,"role_id":1,"credits":128857,"live_credits":30,"live_credits_1":30,"live_adds":23,"live_shares":2,"province":"湖北省","city":"荆州市","sign":"情感专家","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":157039,"next":173779,"upgrade":16740,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6526851,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d0d926d5-3cb3-4d56-9a3e-e7d074ae1f90?imageView2/1/w/828/h/828","users":1144,"is_live":true,"begin_live":"2016-11-05 20:36:47","netease_tid":"4368614","max_manager":0,"heats":41507,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6526851","rtmp":"http://yiqihdl.8686c.com/pajia/6526851.flv","all_count":512,"user":{"uid":6526851,"parent_uid":5385589,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d0d926d5-3cb3-4d56-9a3e-e7d074ae1f90?imageView2/1/w/260/h/260","nickname":"ZS、三宝Man","gender":1,"age":22,"role_id":2,"credits":120692,"live_credits":0,"live_credits_1":0,"live_adds":19,"live_shares":6,"province":"湖北省","city":"武汉市","sign":"求关注，求包养，求守护，😄","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":11,"id":1,"grade":"星","exp":32176,"next":39219,"upgrade":7043,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5601034,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/a0da00ea-476c-4a2f-9765-563887f5c410?imageView2/1/w/828/h/828","users":19,"is_live":true,"begin_live":"2016-11-05 20:42:00","netease_tid":"3614680","max_manager":0,"heats":39690,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5601034","rtmp":"http://yiqihdl.8686c.com/pajia/5601034.flv","all_count":512,"user":{"uid":5601034,"parent_uid":5631439,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a0da00ea-476c-4a2f-9765-563887f5c410?imageView2/1/w/260/h/260","nickname":"Anna *","gender":2,"age":99,"role_id":2,"credits":1215892,"live_credits":0,"live_credits_1":0,"live_adds":60,"live_shares":0,"province":"吉林省","city":"长春市","sign":"。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":23,"id":2,"grade":"冠","exp":279348,"next":296739,"upgrade":17391,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6680212,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/99083899-3560-4db2-847d-fce3090dcb07?imageView2/1/w/828/h/828","users":2096,"is_live":true,"begin_live":"2016-11-05 20:32:14","netease_tid":"4742798","max_manager":0,"heats":31353,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6680212","rtmp":"http://yiqihdl.8686c.com/pajia/6680212.flv","all_count":512,"user":{"uid":6680212,"parent_uid":4645214,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/99083899-3560-4db2-847d-fce3090dcb07?imageView2/1/w/260/h/260","nickname":"AAA琴有独中","gender":1,"age":30,"role_id":1,"credits":1640,"live_credits":0,"live_credits_1":0,"live_adds":2,"live_shares":6,"province":"黑龙江省","city":"哈尔滨市","sign":"毅歌专场(✪ω✪)琴有独中","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":385,"next":619,"upgrade":234,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]
     */

    private InfoBean info;
    private List<String> bar;

    @Override
    public String toString() {
        return "CaiYiBean{" +
                "ret='" + ret + '\'' +
                ", msg='" + msg + '\'' +
                ", info=" + info +
                ", bar=" + bar +
                '}';
    }

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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<String> getBar() {
        return bar;
    }

    public void setBar(List<String> bar) {
        this.bar = bar;
    }

    public static class InfoBean {
        private int id;
        private String template;
        private String numerical;
        private String name;
        private String parameters;
        private int line;
        private boolean waterfall;

        @Override
        public String toString() {
            return "InfoBean{" +
                    "id=" + id +
                    ", template='" + template + '\'' +
                    ", numerical='" + numerical + '\'' +
                    ", name='" + name + '\'' +
                    ", parameters='" + parameters + '\'' +
                    ", line=" + line +
                    ", waterfall=" + waterfall +
                    ", livelist=" + livelist +
                    '}';
        }

        /**
         * uid : 5392720
         * title : 欢喜就好
         * cover : http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/828/h/828
         * users : 14130
         * is_live : true
         * begin_live : 2016-11-05 18:50:03
         * netease_tid : 3674655
         * max_manager : 0
         * heats : 135205
         * heats2 : 0
         * displayorder : 1
         * home_displayorder : 99999
         * family_displayorder : 0
         * distance : 貌似在火星
         * display_heats : true
         * html_share : http://www.yiqi1717.com/share/live?live_uid=5392720
         * rtmp : http://yiqihdl.8686c.com/pajia/5392720.flv
         * all_count : 512
         * user : {"uid":5392720,"parent_uid":4705679,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/260/h/260","nickname":"A🍼愛文儿","gender":2,"age":18,"role_id":1,"credits":5477625,"live_credits":71278,"live_credits_1":12575,"live_adds":48,"live_shares":233,"province":"重庆市","city":"重庆市","sign":"🌶      岁月漫长 要心地善良","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":22831,"next":23179,"upgrade":348,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}
         */

        private List<LivelistBean> livelist;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getNumerical() {
            return numerical;
        }

        public void setNumerical(String numerical) {
            this.numerical = numerical;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParameters() {
            return parameters;
        }

        public void setParameters(String parameters) {
            this.parameters = parameters;
        }

        public int getLine() {
            return line;
        }

        public void setLine(int line) {
            this.line = line;
        }

        public boolean isWaterfall() {
            return waterfall;
        }

        public void setWaterfall(boolean waterfall) {
            this.waterfall = waterfall;
        }

        public List<LivelistBean> getLivelist() {
            return livelist;
        }

        public void setLivelist(List<LivelistBean> livelist) {
            this.livelist = livelist;
        }

        public static class LivelistBean implements Parcelable {
            private int uid;
            private String title;
            private String cover;
            private int users;
            private boolean is_live;
            private String begin_live;
            private String netease_tid;
            private int max_manager;
            private int heats;
            private int heats2;
            private int displayorder;
            private int home_displayorder;
            private int family_displayorder;
            private String distance;
            private boolean display_heats;
            private String html_share;
            private String rtmp;
            private int all_count;
            /**
             * uid : 5392720
             * parent_uid : 4705679
             * avatar : http://yiqi1717-10009627.image.myqcloud.com/0e35ed92-1f5a-47c4-b369-6759fecd08b8?imageView2/1/w/260/h/260
             * nickname : A🍼愛文儿
             * gender : 2
             * age : 18
             * role_id : 1
             * credits : 5477625
             * live_credits : 71278
             * live_credits_1 : 12575
             * live_adds : 48
             * live_shares : 233
             * province : 重庆市
             * city : 重庆市
             * sign : 🌶      岁月漫长 要心地善良
             * excellent : false
             * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
             * grade : {"lv":9,"id":1,"grade":"星","exp":22831,"next":23179,"upgrade":348,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
             * certification : {"uid":0,"name":"","describe":"","status":0}
             */

            private UserBean user;

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

            public String getNetease_tid() {
                return netease_tid;
            }

            public void setNetease_tid(String netease_tid) {
                this.netease_tid = netease_tid;
            }

            public int getMax_manager() {
                return max_manager;
            }

            public void setMax_manager(int max_manager) {
                this.max_manager = max_manager;
            }

            public int getHeats() {
                return heats;
            }

            public void setHeats(int heats) {
                this.heats = heats;
            }

            public int getHeats2() {
                return heats2;
            }

            public void setHeats2(int heats2) {
                this.heats2 = heats2;
            }

            public int getDisplayorder() {
                return displayorder;
            }

            public void setDisplayorder(int displayorder) {
                this.displayorder = displayorder;
            }

            public int getHome_displayorder() {
                return home_displayorder;
            }

            public void setHome_displayorder(int home_displayorder) {
                this.home_displayorder = home_displayorder;
            }

            public int getFamily_displayorder() {
                return family_displayorder;
            }

            public void setFamily_displayorder(int family_displayorder) {
                this.family_displayorder = family_displayorder;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public boolean isDisplay_heats() {
                return display_heats;
            }

            public void setDisplay_heats(boolean display_heats) {
                this.display_heats = display_heats;
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

            public int getAll_count() {
                return all_count;
            }

            public void setAll_count(int all_count) {
                this.all_count = all_count;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public static class UserBean implements Parcelable {
                private int uid;
                private int parent_uid;
                private String avatar;
                private String nickname;
                private int gender;
                private int age;
                private int role_id;
                private int credits;
                private int live_credits;
                private int live_credits_1;
                private int live_adds;
                private int live_shares;
                private String province;
                private String city;
                private String sign;
                private boolean excellent;
                /**
                 * vip : false
                 * heat : false
                 * follow : false
                 * official : false
                 * sale : false
                 */

                private IcoBean ico;
                /**
                 * lv : 9
                 * id : 1
                 * grade : 星
                 * exp : 22831
                 * next : 23179
                 * upgrade : 348
                 * vip_image : http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4
                 */

                private GradeBean grade;
                /**
                 * uid : 0
                 * name :
                 * describe :
                 * status : 0
                 */

                private CertificationBean certification;

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public int getParent_uid() {
                    return parent_uid;
                }

                public void setParent_uid(int parent_uid) {
                    this.parent_uid = parent_uid;
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

                public int getRole_id() {
                    return role_id;
                }

                public void setRole_id(int role_id) {
                    this.role_id = role_id;
                }

                public int getCredits() {
                    return credits;
                }

                public void setCredits(int credits) {
                    this.credits = credits;
                }

                public int getLive_credits() {
                    return live_credits;
                }

                public void setLive_credits(int live_credits) {
                    this.live_credits = live_credits;
                }

                public int getLive_credits_1() {
                    return live_credits_1;
                }

                public void setLive_credits_1(int live_credits_1) {
                    this.live_credits_1 = live_credits_1;
                }

                public int getLive_adds() {
                    return live_adds;
                }

                public void setLive_adds(int live_adds) {
                    this.live_adds = live_adds;
                }

                public int getLive_shares() {
                    return live_shares;
                }

                public void setLive_shares(int live_shares) {
                    this.live_shares = live_shares;
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

                public String getSign() {
                    return sign;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public boolean isExcellent() {
                    return excellent;
                }

                public void setExcellent(boolean excellent) {
                    this.excellent = excellent;
                }

                public IcoBean getIco() {
                    return ico;
                }

                public void setIco(IcoBean ico) {
                    this.ico = ico;
                }

                public GradeBean getGrade() {
                    return grade;
                }

                public void setGrade(GradeBean grade) {
                    this.grade = grade;
                }

                public CertificationBean getCertification() {
                    return certification;
                }

                public void setCertification(CertificationBean certification) {
                    this.certification = certification;
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

                public static class CertificationBean implements Parcelable {
                    private int uid;
                    private String name;
                    private String describe;
                    private int status;

                    public int getUid() {
                        return uid;
                    }

                    public void setUid(int uid) {
                        this.uid = uid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescribe() {
                        return describe;
                    }

                    public void setDescribe(String describe) {
                        this.describe = describe;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeInt(this.uid);
                        dest.writeString(this.name);
                        dest.writeString(this.describe);
                        dest.writeInt(this.status);
                    }

                    public CertificationBean() {
                    }

                    protected CertificationBean(Parcel in) {
                        this.uid = in.readInt();
                        this.name = in.readString();
                        this.describe = in.readString();
                        this.status = in.readInt();
                    }

                    public static final Creator<CertificationBean> CREATOR = new Creator<CertificationBean>() {
                        @Override
                        public CertificationBean createFromParcel(Parcel source) {
                            return new CertificationBean(source);
                        }

                        @Override
                        public CertificationBean[] newArray(int size) {
                            return new CertificationBean[size];
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
                    dest.writeInt(this.parent_uid);
                    dest.writeString(this.avatar);
                    dest.writeString(this.nickname);
                    dest.writeInt(this.gender);
                    dest.writeInt(this.age);
                    dest.writeInt(this.role_id);
                    dest.writeInt(this.credits);
                    dest.writeInt(this.live_credits);
                    dest.writeInt(this.live_credits_1);
                    dest.writeInt(this.live_adds);
                    dest.writeInt(this.live_shares);
                    dest.writeString(this.province);
                    dest.writeString(this.city);
                    dest.writeString(this.sign);
                    dest.writeByte(this.excellent ? (byte) 1 : (byte) 0);
                    dest.writeParcelable(this.ico, flags);
                    dest.writeParcelable(this.grade, flags);
                    dest.writeParcelable(this.certification, flags);
                }

                public UserBean() {
                }

                protected UserBean(Parcel in) {
                    this.uid = in.readInt();
                    this.parent_uid = in.readInt();
                    this.avatar = in.readString();
                    this.nickname = in.readString();
                    this.gender = in.readInt();
                    this.age = in.readInt();
                    this.role_id = in.readInt();
                    this.credits = in.readInt();
                    this.live_credits = in.readInt();
                    this.live_credits_1 = in.readInt();
                    this.live_adds = in.readInt();
                    this.live_shares = in.readInt();
                    this.province = in.readString();
                    this.city = in.readString();
                    this.sign = in.readString();
                    this.excellent = in.readByte() != 0;
                    this.ico = in.readParcelable(IcoBean.class.getClassLoader());
                    this.grade = in.readParcelable(GradeBean.class.getClassLoader());
                    this.certification = in.readParcelable(CertificationBean.class.getClassLoader());
                }

                public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
                    @Override
                    public UserBean createFromParcel(Parcel source) {
                        return new UserBean(source);
                    }

                    @Override
                    public UserBean[] newArray(int size) {
                        return new UserBean[size];
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
                dest.writeString(this.title);
                dest.writeString(this.cover);
                dest.writeInt(this.users);
                dest.writeByte(this.is_live ? (byte) 1 : (byte) 0);
                dest.writeString(this.begin_live);
                dest.writeString(this.netease_tid);
                dest.writeInt(this.max_manager);
                dest.writeInt(this.heats);
                dest.writeInt(this.heats2);
                dest.writeInt(this.displayorder);
                dest.writeInt(this.home_displayorder);
                dest.writeInt(this.family_displayorder);
                dest.writeString(this.distance);
                dest.writeByte(this.display_heats ? (byte) 1 : (byte) 0);
                dest.writeString(this.html_share);
                dest.writeString(this.rtmp);
                dest.writeInt(this.all_count);
                dest.writeParcelable(this.user, flags);
            }

            public LivelistBean() {
            }

            protected LivelistBean(Parcel in) {
                this.uid = in.readInt();
                this.title = in.readString();
                this.cover = in.readString();
                this.users = in.readInt();
                this.is_live = in.readByte() != 0;
                this.begin_live = in.readString();
                this.netease_tid = in.readString();
                this.max_manager = in.readInt();
                this.heats = in.readInt();
                this.heats2 = in.readInt();
                this.displayorder = in.readInt();
                this.home_displayorder = in.readInt();
                this.family_displayorder = in.readInt();
                this.distance = in.readString();
                this.display_heats = in.readByte() != 0;
                this.html_share = in.readString();
                this.rtmp = in.readString();
                this.all_count = in.readInt();
                this.user = in.readParcelable(UserBean.class.getClassLoader());
            }

            public static final Creator<LivelistBean> CREATOR = new Creator<LivelistBean>() {
                @Override
                public LivelistBean createFromParcel(Parcel source) {
                    return new LivelistBean(source);
                }

                @Override
                public LivelistBean[] newArray(int size) {
                    return new LivelistBean[size];
                }
            };
        }
    }
}