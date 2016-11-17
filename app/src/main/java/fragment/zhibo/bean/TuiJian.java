package fragment.zhibo.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.TuiJianApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by WH on 2016/11/5.
 */
public class TuiJian {


    /**
     * ret : 0
     * msg :
     * bar : [{"id":51,"image":"http://yiqi1717-10009627.image.myqcloud.com/83b3e85a-1253-44fc-a8d2-4e488a9a3eec?imageView2/2/w/800/","parameters":"html|http://yiqihdnew.yiqi1717.com/zzh/qmx/index.html?v=2"},{"id":49,"image":"http://yiqi1717-10009627.image.myqcloud.com/d198eece-a9de-4aa4-9a08-54a0508cd38b?imageView2/2/w/800/","parameters":"html|http://yiqihdnew.yiqi1717.com/zzh/wsj7/sindex.html"},{"id":50,"image":"http://yiqi1717-10009627.image.myqcloud.com/ed508c42-1590-4ff8-8ec5-c0aa7fcf3822?imageView2/2/w/800/","parameters":"html|http://yiqihdnew.yiqi1717.com/zzh/yyhs/index.html?v=1"},{"id":41,"image":"http://yiqi1717-10009627.image.myqcloud.com/e6773881-a668-4ee6-b4ac-bbd6d21fd367?imageView2/2/w/800/","parameters":"html|http://yiqihdnew.yiqi1717.com/zzh/zuojia2/index.html"}]
     * list : [{"id":1,"template":"ONE_AND_TWO","numerical":"USERS","name":"平台推荐","parameters":"tag|2","line":0,"waterfall":false,"livelist":[{"uid":6581057,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/828/h/828","users":5616,"is_live":true,"begin_live":"2016-11-05 15:15:52","netease_tid":"4600734","max_manager":0,"heats":80192,"heats2":0,"displayorder":4,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6581057","rtmp":"http://yiqihdl.8686c.com/pajia/6581057.flv","all_count":306,"user":{"uid":6581057,"parent_uid":6532651,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/260/h/260","nickname":"✨星灿✨♀唯一","gender":2,"age":20,"role_id":1,"credits":91070,"live_credits":63821,"live_credits_1":57271,"live_adds":8,"live_shares":14,"province":"辽宁省","city":"大连市","sign":"喜欢我吗，喜欢我的关注我哦！点关注不迷路。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":3,"id":1,"grade":"星","exp":1652,"next":1939,"upgrade":287,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6554256,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ff6374a5-72f3-419c-93aa-c6d8e69cece6?imageView2/1/w/828/h/828","users":4251,"is_live":true,"begin_live":"2016-11-05 15:29:49","netease_tid":"4402964","max_manager":0,"heats":76299,"heats2":0,"displayorder":1,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6554256","rtmp":"http://yiqihdl.8686c.com/pajia/6554256.flv","all_count":306,"user":{"uid":6554256,"parent_uid":4691034,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ff6374a5-72f3-419c-93aa-c6d8e69cece6?imageView2/1/w/260/h/260","nickname":"Sk🌟七七","gender":2,"age":20,"role_id":1,"credits":1100918,"live_credits":50821,"live_credits_1":12687,"live_adds":14,"live_shares":9,"province":"浙江省","city":"杭州市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":3337,"next":3379,"upgrade":42,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6692340,"title":"下班之前，播一会","cover":"http://yiqi1717-10009627.image.myqcloud.com/c219f408-ccbe-4eda-88b2-b9712c90534b?imageView2/1/w/828/h/828","users":5764,"is_live":true,"begin_live":"2016-11-05 15:14:52","netease_tid":"4769970","max_manager":0,"heats":66789,"heats2":0,"displayorder":4,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6692340","rtmp":"http://yiqihdl.8686c.com/pajia/6692340.flv","all_count":306,"user":{"uid":6692340,"parent_uid":4249699,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c219f408-ccbe-4eda-88b2-b9712c90534b?imageView2/1/w/260/h/260","nickname":"JL王者✾琪","gender":2,"age":26,"role_id":1,"credits":3352,"live_credits":3352,"live_credits_1":3147,"live_adds":0,"live_shares":21,"province":"吉林省","city":"长春市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":26,"next":619,"upgrade":593,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]},{"id":2,"template":"NORMAL","numerical":"USERS","name":"热门红人","parameters":"","line":2,"waterfall":false,"livelist":[{"uid":6027212,"title":"趁阳光正好🤗","cover":"http://yiqi1717-10009627.image.myqcloud.com/ef239f81-99c0-4683-afc5-57a10283aaa6?imageView2/1/w/828/h/828","users":14595,"is_live":true,"begin_live":"2016-11-05 13:47:15","netease_tid":"3915946","max_manager":0,"heats":83275,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6027212","rtmp":"http://yiqihdl.8686c.com/pajia/6027212.flv","all_count":306,"user":{"uid":6027212,"parent_uid":5499125,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ef239f81-99c0-4683-afc5-57a10283aaa6?imageView2/1/w/260/h/260","nickname":"DQ夏梦💫","gender":2,"age":99,"role_id":2,"credits":9254575,"live_credits":122130,"live_credits_1":121116,"live_adds":61,"live_shares":191,"province":"浙江省","city":"嘉兴市","sign":"深情不及久伴 厚爱无需多言   充💰ID：5499125","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":19,"id":1,"grade":"星","exp":157956,"next":173779,"upgrade":15823,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5178414,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/0ece92a2-50ed-42ae-b631-480c4677c3a6?imageView2/1/w/828/h/828","users":9912,"is_live":true,"begin_live":"2016-11-05 15:00:09","netease_tid":"3445369","max_manager":0,"heats":82986,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5178414","rtmp":"http://yiqihdl.8686c.com/pajia/5178414.flv","all_count":306,"user":{"uid":5178414,"parent_uid":3945704,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/0ece92a2-50ed-42ae-b631-480c4677c3a6?imageView2/1/w/260/h/260","nickname":"TOP_蝴蝶","gender":2,"age":20,"role_id":2,"credits":3042277,"live_credits":114580,"live_credits_1":26178,"live_adds":59,"live_shares":139,"province":"辽宁省","city":"盘锦市","sign":"等一个人，也等一种可能。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":12,"id":1,"grade":"星","exp":42823,"next":49459,"upgrade":6636,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5560756,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/b9d9e04d-fada-4b93-b404-56bd5f6a79c7?imageView2/1/w/828/h/828","users":13959,"is_live":true,"begin_live":"2016-11-05 12:11:42","netease_tid":"3962332","max_manager":0,"heats":82554,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5560756","rtmp":"http://yiqihdl.8686c.com/pajia/5560756.flv","all_count":306,"user":{"uid":5560756,"parent_uid":5385589,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/b9d9e04d-fada-4b93-b404-56bd5f6a79c7?imageView2/1/w/260/h/260","nickname":"ZS 鱼宝宝💕","gender":2,"age":21,"role_id":2,"credits":2981014,"live_credits":78717,"live_credits_1":43335,"live_adds":60,"live_shares":125,"province":"辽宁省","city":"丹东市","sign":"人都会变，有一天回过头来，不要忘了最初的自己。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":24,"id":2,"grade":"冠","exp":316133,"next":334579,"upgrade":18446,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5989695,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/a36a5c87-37ec-4ce6-a1f0-c49c78a59c75?imageView2/1/w/828/h/828","users":9568,"is_live":true,"begin_live":"2016-11-05 14:00:52","netease_tid":"3886675","max_manager":0,"heats":80875,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5989695","rtmp":"http://yiqihdl.8686c.com/pajia/5989695.flv","all_count":306,"user":{"uid":5989695,"parent_uid":3945704,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/a36a5c87-37ec-4ce6-a1f0-c49c78a59c75?imageView2/1/w/260/h/260","nickname":"Top 北北","gender":2,"age":20,"role_id":2,"credits":1065899,"live_credits":29318,"live_credits_1":29318,"live_adds":35,"live_shares":31,"province":"辽宁省","city":"大连市","sign":"脾气暴躁性格极端任性，","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12739,"next":17139,"upgrade":4400,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5976065,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/03e9069f-13c8-42e3-954d-9015dc2b940c?imageView2/1/w/828/h/828","users":13888,"is_live":true,"begin_live":"2016-11-05 14:27:06","netease_tid":"3879557","max_manager":0,"heats":80391,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5976065","rtmp":"http://yiqihdl.8686c.com/pajia/5976065.flv","all_count":306,"user":{"uid":5976065,"parent_uid":5215517,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/03e9069f-13c8-42e3-954d-9015dc2b940c?imageView2/1/w/260/h/260","nickname":"时光💕王小鹏","gender":1,"age":23,"role_id":1,"credits":977096,"live_credits":82263,"live_credits_1":82141,"live_adds":36,"live_shares":17,"province":"辽宁省","city":"鞍山市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":12,"id":1,"grade":"星","exp":47542,"next":49459,"upgrade":1917,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6585988,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/3d8d662d-1530-4f68-9cf8-330d94fe7a61?imageView2/1/w/828/h/828","users":5766,"is_live":true,"begin_live":"2016-11-05 13:09:40","netease_tid":"4502390","max_manager":0,"heats":80331,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6585988","rtmp":"http://yiqihdl.8686c.com/pajia/6585988.flv","all_count":306,"user":{"uid":6585988,"parent_uid":3000010,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/3d8d662d-1530-4f68-9cf8-330d94fe7a61?imageView2/1/w/260/h/260","nickname":"Sk🌟萌小狐","gender":2,"age":20,"role_id":1,"credits":481169,"live_credits":25460,"live_credits_1":24800,"live_adds":11,"live_shares":39,"province":"湖南省","city":"怀化市","sign":"❤️❤️❤️","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":5536,"next":8419,"upgrade":2883,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5366221,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c2e8e306-bd0a-4202-9d15-f7fea050b160?imageView2/1/w/828/h/828","users":8875,"is_live":true,"begin_live":"2016-11-05 13:31:25","netease_tid":"3357966","max_manager":0,"heats":79705,"heats2":0,"displayorder":3,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5366221","rtmp":"http://yiqihdl.8686c.com/pajia/5366221.flv","all_count":306,"user":{"uid":5366221,"parent_uid":4697954,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c2e8e306-bd0a-4202-9d15-f7fea050b160?imageView2/1/w/260/h/260","nickname":"Am°C阿思☀️","gender":2,"age":22,"role_id":1,"credits":4474769,"live_credits":28502,"live_credits_1":28332,"live_adds":133,"live_shares":44,"province":"福建省","city":"三明市","sign":"愿快乐常伴我","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":25,"id":2,"grade":"冠","exp":340674,"next":375499,"upgrade":34825,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6499846,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/77fda3f9-2363-48d3-8f03-db78fb5f4dba?imageView2/1/w/828/h/828","users":5866,"is_live":true,"begin_live":"2016-11-05 14:03:57","netease_tid":"4339473","max_manager":0,"heats":79077,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6499846","rtmp":"http://yiqihdl.8686c.com/pajia/6499846.flv","all_count":306,"user":{"uid":6499846,"parent_uid":6336567,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/77fda3f9-2363-48d3-8f03-db78fb5f4dba?imageView2/1/w/260/h/260","nickname":"。","gender":2,"age":99,"role_id":2,"credits":211197,"live_credits":29709,"live_credits_1":29709,"live_adds":13,"live_shares":6,"province":"四川省","city":"成都市","sign":"。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":12,"id":1,"grade":"星","exp":48995,"next":49459,"upgrade":464,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5387639,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/dabb7439-1494-4067-9bfd-7a5604730891?imageView2/1/w/828/h/828","users":13921,"is_live":true,"begin_live":"2016-11-05 12:54:01","netease_tid":"3383483","max_manager":0,"heats":78738,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5387639","rtmp":"http://yiqihdl.8686c.com/pajia/5387639.flv","all_count":306,"user":{"uid":5387639,"parent_uid":5149279,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/dabb7439-1494-4067-9bfd-7a5604730891?imageView2/1/w/260/h/260","nickname":"Mzx_紫涵","gender":2,"age":18,"role_id":2,"credits":3382450,"live_credits":20552,"live_credits_1":15208,"live_adds":129,"live_shares":39,"province":"河北省","city":"石家庄市","sign":"如果有一天，我变得很强大，谢谢你们曾经逼过我。","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":53,"id":3,"grade":"彩冠","exp":3199182,"next":3258939,"upgrade":59757,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6539643,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/fe25b920-f8a7-4a1b-a265-50284ec9a8a9?imageView2/1/w/828/h/828","users":5715,"is_live":true,"begin_live":"2016-11-05 10:18:23","netease_tid":"4383115","max_manager":0,"heats":77924,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6539643","rtmp":"http://yiqihdl.8686c.com/pajia/6539643.flv","all_count":306,"user":{"uid":6539643,"parent_uid":6351537,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/fe25b920-f8a7-4a1b-a265-50284ec9a8a9?imageView2/1/w/260/h/260","nickname":"锦秀⭐上官子陌","gender":1,"age":99,"role_id":1,"credits":378592,"live_credits":15316,"live_credits_1":12904,"live_adds":16,"live_shares":16,"province":"新疆维吾尔自治区","city":"乌鲁木齐市","sign":"新主播，求关注。主播是东北辽宁的，","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":6,"id":1,"grade":"星","exp":8333,"next":8419,"upgrade":86,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]},{"id":3,"template":"NORMAL","numerical":"USERS","name":"新人推荐","parameters":"tag|4","line":3,"waterfall":false,"livelist":[{"uid":5700715,"title":"2小时","cover":"http://yiqi1717-10009627.image.myqcloud.com/81ce131b-8477-4a7b-90ed-c9b6ff2817de?imageView2/1/w/828/h/828","users":5528,"is_live":true,"begin_live":"2016-11-05 15:11:46","netease_tid":"4045752","max_manager":0,"heats":58403,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5700715","rtmp":"http://yiqihdl.8686c.com/pajia/5700715.flv","all_count":306,"user":{"uid":5700715,"parent_uid":4645214,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/81ce131b-8477-4a7b-90ed-c9b6ff2817de?imageView2/1/w/260/h/260","nickname":"AAA清风徐来","gender":2,"age":20,"role_id":1,"credits":35103,"live_credits":500,"live_credits_1":500,"live_adds":10,"live_shares":2,"province":"江苏省","city":"南京市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":2691,"next":3379,"upgrade":688,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5794787,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/02075a1a-ce6a-4483-9f15-7b0d830c8dc6?imageView2/1/w/828/h/828","users":4261,"is_live":true,"begin_live":"2016-11-05 15:29:44","netease_tid":"3762304","max_manager":0,"heats":58229,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5794787","rtmp":"http://yiqihdl.8686c.com/pajia/5794787.flv","all_count":306,"user":{"uid":5794787,"parent_uid":5385589,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/02075a1a-ce6a-4483-9f15-7b0d830c8dc6?imageView2/1/w/260/h/260","nickname":"ZS🌸 小公举","gender":2,"age":20,"role_id":1,"credits":9544,"live_credits":1668,"live_credits_1":1668,"live_adds":28,"live_shares":3,"province":"福建省","city":"福州市","sign":"🌸 我愿躺在你怀里成猫骄而不傲","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":3,"id":1,"grade":"星","exp":1757,"next":1939,"upgrade":182,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6299944,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/889f8486-878a-4862-8202-30e4f8161255?imageView2/1/w/828/h/828","users":227,"is_live":true,"begin_live":"2016-11-05 15:48:37","netease_tid":"4115346","max_manager":0,"heats":57997,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6299944","rtmp":"http://yiqihdl.8686c.com/pajia/6299944.flv","all_count":306,"user":{"uid":6299944,"parent_uid":5163976,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/889f8486-878a-4862-8202-30e4f8161255?imageView2/1/w/260/h/260","nickname":"♌️子座✨吖","gender":2,"age":20,"role_id":2,"credits":89226,"live_credits":47872,"live_credits_1":0,"live_adds":5,"live_shares":9,"province":"上海市","city":"上海市","sign":"","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":2,"id":1,"grade":"星","exp":922,"next":1059,"upgrade":137,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6572989,"title":"为什么会给宝宝卡掉了\u2026\u2026","cover":"http://yiqi1717-10009627.image.myqcloud.com/34982d46-60be-4bd3-9793-58f70287691c?imageView2/1/w/828/h/828","users":5615,"is_live":true,"begin_live":"2016-11-05 12:24:12","netease_tid":"4467386","max_manager":0,"heats":57877,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6572989","rtmp":"http://yiqihdl.8686c.com/pajia/6572989.flv","all_count":306,"user":{"uid":6572989,"parent_uid":6066666,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/34982d46-60be-4bd3-9793-58f70287691c?imageView2/1/w/260/h/260","nickname":"KM王者✨佳佳","gender":2,"age":20,"role_id":2,"credits":24336,"live_credits":777,"live_credits_1":131,"live_adds":10,"live_shares":9,"province":"辽宁省","city":"铁岭市","sign":"4 2 4 0 6 5 5 4 3","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":5,"id":1,"grade":"星","exp":5488,"next":5499,"upgrade":11,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6685558,"title":"闲聊吧，哈哈","cover":"http://yiqi1717-10009627.image.myqcloud.com/1257421d-cca0-4d4c-b50b-e06d6bf9641b?imageView2/1/w/828/h/828","users":1778,"is_live":true,"begin_live":"2016-11-05 14:32:50","netease_tid":"4773013","max_manager":0,"heats":57244,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6685558","rtmp":"http://yiqihdl.8686c.com/pajia/6685558.flv","all_count":306,"user":{"uid":6685558,"parent_uid":6638829,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1257421d-cca0-4d4c-b50b-e06d6bf9641b?imageView2/1/w/260/h/260","nickname":"Hi女神团、甜梅","gender":2,"age":20,"role_id":1,"credits":1196,"live_credits":1196,"live_credits_1":800,"live_adds":0,"live_shares":0,"province":"辽宁省","city":"沈阳市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":5,"id":1,"grade":"星","exp":4510,"next":5499,"upgrade":989,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6621096,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c5e2b535-2035-485a-9a22-d3e849368993?imageView2/1/w/828/h/828","users":5428,"is_live":true,"begin_live":"2016-11-05 14:15:41","netease_tid":"4597608","max_manager":0,"heats":57184,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6621096","rtmp":"http://yiqihdl.8686c.com/pajia/6621096.flv","all_count":306,"user":{"uid":6621096,"parent_uid":0,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c5e2b535-2035-485a-9a22-d3e849368993?imageView2/1/w/260/h/260","nickname":"a_Er.","gender":2,"age":20,"role_id":1,"credits":1368,"live_credits":830,"live_credits_1":710,"live_adds":5,"live_shares":10,"province":"广东省","city":"深圳市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":393,"next":619,"upgrade":226,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6321112,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/d6815cd1-aacf-45d3-9b73-590d0198ea8a?imageView2/1/w/828/h/828","users":1063,"is_live":true,"begin_live":"2016-11-05 15:44:38","netease_tid":"4131537","max_manager":0,"heats":56941,"heats2":0,"displayorder":2,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6321112","rtmp":"http://yiqihdl.8686c.com/pajia/6321112.flv","all_count":306,"user":{"uid":6321112,"parent_uid":4413227,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/d6815cd1-aacf-45d3-9b73-590d0198ea8a?imageView2/1/w/260/h/260","nickname":"Vv💕小幸福","gender":2,"age":23,"role_id":1,"credits":314539,"live_credits":1653,"live_credits_1":0,"live_adds":33,"live_shares":0,"province":"安徽省","city":"安庆市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":8,"id":1,"grade":"星","exp":12677,"next":17139,"upgrade":4462,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6417065,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/1bf8be68-30c2-48f8-83e0-666e1389bcb2?imageView2/1/w/828/h/828","users":7735,"is_live":true,"begin_live":"2016-11-05 15:13:16","netease_tid":"4251648","max_manager":0,"heats":56782,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6417065","rtmp":"http://yiqihdl.8686c.com/pajia/6417065.flv","all_count":306,"user":{"uid":6417065,"parent_uid":5385589,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1bf8be68-30c2-48f8-83e0-666e1389bcb2?imageView2/1/w/260/h/260","nickname":"ZS🏁啊啦明洋","gender":1,"age":20,"role_id":2,"credits":72483,"live_credits":1630,"live_credits_1":1100,"live_adds":32,"live_shares":8,"province":"安徽省","city":"宿州市","sign":"感谢那些人擦过刮过帮我修成正果、","excellent":false,"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":11,"id":1,"grade":"星","exp":35077,"next":39219,"upgrade":4142,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6294244,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/7730ab22-60a2-4b65-8f9f-bd4295dd8009?imageView2/1/w/828/h/828","users":1200,"is_live":true,"begin_live":"2016-11-05 15:44:07","netease_tid":"4113618","max_manager":0,"heats":56662,"heats2":0,"displayorder":4,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6294244","rtmp":"http://yiqihdl.8686c.com/pajia/6294244.flv","all_count":306,"user":{"uid":6294244,"parent_uid":4697954,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/7730ab22-60a2-4b65-8f9f-bd4295dd8009?imageView2/1/w/260/h/260","nickname":"Am°C大脸宁宁","gender":2,"age":20,"role_id":1,"credits":316871,"live_credits":779,"live_credits_1":724,"live_adds":48,"live_shares":5,"province":"湖南省","city":"长沙市","sign":"吃 睡 跳舞哈哈","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":16,"id":1,"grade":"星","exp":103386,"next":108019,"upgrade":4633,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]}]
     */

    private String ret;
    private String msg;
    /**
     * id : 51
     * image : http://yiqi1717-10009627.image.myqcloud.com/83b3e85a-1253-44fc-a8d2-4e488a9a3eec?imageView2/2/w/800/
     * parameters : html|http://yiqihdnew.yiqi1717.com/zzh/qmx/index.html?v=2
     */

    private List<BarBean> bar;
    /**
     * id : 1
     * template : ONE_AND_TWO
     * numerical : USERS
     * name : 平台推荐
     * parameters : tag|2
     * line : 0
     * waterfall : false
     * livelist : [{"uid":6581057,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/828/h/828","users":5616,"is_live":true,"begin_live":"2016-11-05 15:15:52","netease_tid":"4600734","max_manager":0,"heats":80192,"heats2":0,"displayorder":4,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6581057","rtmp":"http://yiqihdl.8686c.com/pajia/6581057.flv","all_count":306,"user":{"uid":6581057,"parent_uid":6532651,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/260/h/260","nickname":"✨星灿✨♀唯一","gender":2,"age":20,"role_id":1,"credits":91070,"live_credits":63821,"live_credits_1":57271,"live_adds":8,"live_shares":14,"province":"辽宁省","city":"大连市","sign":"喜欢我吗，喜欢我的关注我哦！点关注不迷路。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":3,"id":1,"grade":"星","exp":1652,"next":1939,"upgrade":287,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6554256,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/ff6374a5-72f3-419c-93aa-c6d8e69cece6?imageView2/1/w/828/h/828","users":4251,"is_live":true,"begin_live":"2016-11-05 15:29:49","netease_tid":"4402964","max_manager":0,"heats":76299,"heats2":0,"displayorder":1,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6554256","rtmp":"http://yiqihdl.8686c.com/pajia/6554256.flv","all_count":306,"user":{"uid":6554256,"parent_uid":4691034,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ff6374a5-72f3-419c-93aa-c6d8e69cece6?imageView2/1/w/260/h/260","nickname":"Sk🌟七七","gender":2,"age":20,"role_id":1,"credits":1100918,"live_credits":50821,"live_credits_1":12687,"live_adds":14,"live_shares":9,"province":"浙江省","city":"杭州市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":4,"id":1,"grade":"星","exp":3337,"next":3379,"upgrade":42,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":6692340,"title":"下班之前，播一会","cover":"http://yiqi1717-10009627.image.myqcloud.com/c219f408-ccbe-4eda-88b2-b9712c90534b?imageView2/1/w/828/h/828","users":5764,"is_live":true,"begin_live":"2016-11-05 15:14:52","netease_tid":"4769970","max_manager":0,"heats":66789,"heats2":0,"displayorder":4,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6692340","rtmp":"http://yiqihdl.8686c.com/pajia/6692340.flv","all_count":306,"user":{"uid":6692340,"parent_uid":4249699,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c219f408-ccbe-4eda-88b2-b9712c90534b?imageView2/1/w/260/h/260","nickname":"JL王者✾琪","gender":2,"age":26,"role_id":1,"credits":3352,"live_credits":3352,"live_credits_1":3147,"live_adds":0,"live_shares":21,"province":"吉林省","city":"长春市","sign":"","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":1,"id":1,"grade":"星","exp":26,"next":619,"upgrade":593,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]
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

    public List<BarBean> getBar() {
        return bar;
    }

    public void setBar(List<BarBean> bar) {
        this.bar = bar;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static void load(Callback callback) {
        LogUtils.i("flag", "load()tuiJianApi");
        TuiJianApi tuiJianApi = BaseRetrofit.getRetrofit().create(TuiJianApi.class);
        ArrayMap<String, String> map = new ArrayMap<>();
// nonce=unldf6egis
// &pageindex=1
// &publickey=3.9
// &tag_id=1
// &timestamp=1478310033
// &token=e9a3a4a0d90159b8b70c397a64fd6c00
// &signature=932ff7462f2050f4dd4ad63390abd31c
        map.put("nonce", "unldf6egis");
        map.put("pageindex", "1");
        map.put("publickey", "3.9");
        map.put("tag_id", "1");
        map.put("timestamp", "1478310033");
        map.put("token", "e9a3a4a0d90159b8b70c397a64fd6c00");
        map.put("signature", "932ff7462f2050f4dd4ad63390abd31c");
        Call<TuiJian> call = tuiJianApi.getTuiJian(map);
        call.enqueue(callback);

    }


    public static class BarBean {
        private int id;
        private String image;
        private String parameters;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getParameters() {
            return parameters;
        }

        public void setParameters(String parameters) {
            this.parameters = parameters;
        }
    }

    public static class ListBean {
        private int id;
        private String template;
        private String numerical;
        private String name;
        private String parameters;
        private int line;
        private boolean waterfall;
        /**
         * uid : 6581057
         * title : 我发起了一个直播，快来看看吧！
         * cover : http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/828/h/828
         * users : 5616
         * is_live : true
         * begin_live : 2016-11-05 15:15:52
         * netease_tid : 4600734
         * max_manager : 0
         * heats : 80192
         * heats2 : 0
         * displayorder : 4
         * home_displayorder : 3
         * family_displayorder : 0
         * distance : 貌似在火星
         * display_heats : true
         * html_share : http://www.yiqi1717.com/share/live?live_uid=6581057
         * rtmp : http://yiqihdl.8686c.com/pajia/6581057.flv
         * all_count : 306
         * user : {"uid":6581057,"parent_uid":6532651,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/260/h/260","nickname":"✨星灿✨♀唯一","gender":2,"age":20,"role_id":1,"credits":91070,"live_credits":63821,"live_credits_1":57271,"live_adds":8,"live_shares":14,"province":"辽宁省","city":"大连市","sign":"喜欢我吗，喜欢我的关注我哦！点关注不迷路。","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":3,"id":1,"grade":"星","exp":1652,"next":1939,"upgrade":287,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}
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
             * uid : 6581057
             * parent_uid : 6532651
             * avatar : http://yiqi1717-10009627.image.myqcloud.com/e2983fe9-7e4e-4a4f-84d4-9096e5da425c?imageView2/1/w/260/h/260
             * nickname : ✨星灿✨♀唯一
             * gender : 2
             * age : 20
             * role_id : 1
             * credits : 91070
             * live_credits : 63821
             * live_credits_1 : 57271
             * live_adds : 8
             * live_shares : 14
             * province : 辽宁省
             * city : 大连市
             * sign : 喜欢我吗，喜欢我的关注我哦！点关注不迷路。
             * excellent : false
             * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
             * grade : {"lv":3,"id":1,"grade":"星","exp":1652,"next":1939,"upgrade":287,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
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
                 * lv : 3
                 * id : 1
                 * grade : 星
                 * exp : 1652
                 * next : 1939
                 * upgrade : 287
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
