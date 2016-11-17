package fragment.friend.adapter.pengyouquan.bean;

import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.HaoyouApi;
import net.api.PengYouQuangApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

public class UserInfo {
//	http://api.yiqi1717.com/quan/get_follow?
// city=北京市
// &lat=40.043426
// &lng=116.376632
// &nonce=8aevobgycz
// &pageindex=1
// &province=北京市
// &publickey=3.9
// &timestamp=1478513501
// &token=00f51617b02368a384ab62cff77f2bc5
// &signature=ca0501515403db0a1634201b9118b35d
public static void load(Callback callback) {
	LogUtils.i("flag","load()1");
	PengYouQuangApi pengYouQuangApi = BaseRetrofit.getRetrofit().create(PengYouQuangApi.class);

	ArrayMap<String, String> map = new ArrayMap<>();
	map.put("city", "北京市");
	map.put("lat", "40.043426");
	map.put("lng", "116.376632");
	map.put("nonce", "8aevobgycz");
	map.put("pageindex", "1");
	map.put("province", "北京市");
	map.put("publickey", "3.9");
	map.put("timestamp", "1478513501");
	map.put("token", "00f51617b02368a384ab62cff77f2bc5");
	map.put("signature", "ca0501515403db0a1634201b9118b35d");

	LogUtils.i("flag","load2()");
	Call<UserInfo> call = pengYouQuangApi.getPengyouquang(map);
	LogUtils.i("flag","load3()");
	call.enqueue(callback);
	LogUtils.i("flag","load4()");

}
	/**
	 * ret : 0
	 * msg :
	 * list : [{"id":761268,"uid":6027904,"text":"够无聊啊\u2026\u2026没人聊天","location":"","praises":2,"comments":0,"dateline":"1天前","dateline2":"2016-11-11","dateline3":"2016-11-11 10:56:42","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/6807243a-bd6f-4759-93bc-853f3cc2f484?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/6807243a-bd6f-4759-93bc-853f3cc2f484?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/beb80d4a-854b-4582-ae9e-bb05b106219f?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/beb80d4a-854b-4582-ae9e-bb05b106219f?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/22331bcb-5233-4143-bb7f-af414af73805?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/22331bcb-5233-4143-bb7f-af414af73805?imageView2/2/w/800/"}],"praiselist":[{"uid":6571929,"nickname":"Alan   "},{"uid":5696981,"nickname":"191☞宁儿"}],"commentlist":[],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":760348,"uid":6688920,"text":"么么","location":"","praises":0,"comments":0,"dateline":"1天前","dateline2":"2016-11-10","dateline3":"2016-11-10 14:24:48","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/9a5160ab-64a3-4536-9d7f-466a3018237d?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/9a5160ab-64a3-4536-9d7f-466a3018237d?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":6688920,"nickname":"有何不可","gender":1,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ae7ce0d5-f300-43e3-b936-4e6d0e7e18a0?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":14,"next":619,"upgrade":605,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":760347,"uid":6688920,"text":"么么","location":"","praises":0,"comments":0,"dateline":"1天前","dateline2":"2016-11-10","dateline3":"2016-11-10 14:24:18","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/151c74ae-57a6-400f-921d-54d8e039a41c?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/151c74ae-57a6-400f-921d-54d8e039a41c?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":6688920,"nickname":"有何不可","gender":1,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ae7ce0d5-f300-43e3-b936-4e6d0e7e18a0?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":14,"next":619,"upgrade":605,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":759850,"uid":4677750,"text":"🎂🎂🎂生日快乐，撒花撒花撒花🎂🎂🎂","location":"","praises":4,"comments":0,"dateline":"2天前","dateline2":"2016-11-10","dateline3":"2016-11-10 00:22:51","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/d084e558-40fc-4ae7-ab3e-14d1f99f3bce?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/d084e558-40fc-4ae7-ab3e-14d1f99f3bce?imageView2/2/w/800/"}],"praiselist":[{"uid":5968289,"nickname":"爱酸酸的宝宝"},{"uid":3748170,"nickname":"Zeno﷽﷽﷽﷽"},{"uid":5944125,"nickname":"难得一梦"},{"uid":6028660,"nickname":"不卖汉堡的蟹老板"}],"commentlist":[],"user":{"uid":4677750,"nickname":"FV.小冰冰","gender":2,"age":21,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/aa5616fb-1278-4aa3-8e9c-2c212db371a6?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":17,"id":1,"grade":"星","exp":114425,"next":127659,"upgrade":13234,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":759823,"uid":6027904,"text":"再见👋游轮梦，再见你们👋！","location":"","praises":6,"comments":3,"dateline":"2天前","dateline2":"2016-11-09","dateline3":"2016-11-09 23:48:42","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/4f69a63f-33ab-4ea3-8b26-6617a23a2f50?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/4f69a63f-33ab-4ea3-8b26-6617a23a2f50?imageView2/2/w/800/"}],"praiselist":[{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":6049699,"nickname":"桀骜🐯婉婉"},{"uid":6257999,"nickname":"粉丝*伤感"},{"uid":6032895,"nickname":"191 ☞Amy"},{"uid":6367554,"nickname":"☞遺莣℡☜"}],"commentlist":[{"id":771817,"reply_uid":0,"reply_nickname":"","uid":6525648,"nickname":"无心无爱","text":"好性感"},{"id":771990,"reply_uid":0,"reply_nickname":"","uid":6407567,"nickname":"萌萌片+我","text":"3409292838"},{"id":772416,"reply_uid":0,"reply_nickname":"","uid":6435548,"nickname":"吴哥","text":"为啥把屁股搞成那样子呀，迷人吗"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":759267,"uid":6027904,"text":"老照片，现在的确过老年人生活了！","location":"","praises":3,"comments":8,"dateline":"2天前","dateline2":"2016-11-09","dateline3":"2016-11-09 13:22:02","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/64b91c1c-5681-4b98-8685-6b14dea5be0e?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/64b91c1c-5681-4b98-8685-6b14dea5be0e?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/b8ca3627-dc70-495c-86b2-a5b38f679485?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/b8ca3627-dc70-495c-86b2-a5b38f679485?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/285b4ec0-9338-41da-9b4d-7544d4c0abbd?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/285b4ec0-9338-41da-9b4d-7544d4c0abbd?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/e625ff80-55d0-49bb-abb8-2954b76bb781?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/e625ff80-55d0-49bb-abb8-2954b76bb781?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/2f44de88-28a0-4854-9900-e8d4e9a81a37?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/2f44de88-28a0-4854-9900-e8d4e9a81a37?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/7b9c9e44-0c2c-4856-91fc-63753eb581e2?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/7b9c9e44-0c2c-4856-91fc-63753eb581e2?imageView2/2/w/800/"}],"praiselist":[{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":6032895,"nickname":"191 ☞Amy"},{"uid":6367554,"nickname":"☞遺莣℡☜"}],"commentlist":[{"id":770165,"reply_uid":6027904,"reply_nickname":"191 ☞宓","uid":6716140,"nickname":"亲爱的老公","text":"装什么，"},{"id":770167,"reply_uid":0,"reply_nickname":"","uid":6716140,"nickname":"亲爱的老公","text":"你去问你狗吧"},{"id":770168,"reply_uid":0,"reply_nickname":"","uid":6716140,"nickname":"亲爱的老公","text":"你去问你狗吧"},{"id":770174,"reply_uid":0,"reply_nickname":"","uid":6027904,"nickname":"191 ☞宓","text":"无语了\u2026\u2026我好心解释了，你非说我拉黑你，你去问问拉黑了还能不能私信，"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":758819,"uid":6027904,"text":"因为内心是寂寞的。","location":"","praises":2,"comments":2,"dateline":"3天前","dateline2":"2016-11-08","dateline3":"2016-11-08 23:36:37","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/9de78696-d977-414c-8451-b0bc533a8441?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/9de78696-d977-414c-8451-b0bc533a8441?imageView2/2/w/800/"}],"praiselist":[{"uid":5345905,"nickname":"俺是宝宝"},{"uid":6367554,"nickname":"☞遺莣℡☜"}],"commentlist":[{"id":769631,"reply_uid":0,"reply_nickname":"","uid":4768219,"nickname":"Only💞迪文","text":"🙄🙄🙄"},{"id":769663,"reply_uid":4768219,"reply_nickname":"Only💞迪文","uid":6027904,"nickname":"191 ☞宓","text":"[困死了][困死了][困死了][困死了][困死了]"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":758759,"uid":6688920,"text":"哈喽，大家好。","location":"海淀","praises":0,"comments":0,"dateline":"3天前","dateline2":"2016-11-08","dateline3":"2016-11-08 22:51:29","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/8f1a5dcb-9900-418a-81e5-c1e894077b57?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/8f1a5dcb-9900-418a-81e5-c1e894077b57?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":6688920,"nickname":"有何不可","gender":1,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ae7ce0d5-f300-43e3-b936-4e6d0e7e18a0?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":14,"next":619,"upgrade":605,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":757544,"uid":6027904,"text":"遗忘哥的土豪4件套，一路走来，真的废话不多，喜欢就是刷了，不矫情，今天特么为遗忘哥发了一个动态，陪伴着就是陪伴吧，谢谢支持！","location":"","praises":5,"comments":6,"dateline":"4天前","dateline2":"2016-11-07","dateline3":"2016-11-07 17:48:26","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/e7541739-d2b8-42cc-a046-be7497e1c9ff?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/e7541739-d2b8-42cc-a046-be7497e1c9ff?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/37823070-92dc-4c50-bd02-ff71d2e0808e?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/37823070-92dc-4c50-bd02-ff71d2e0808e?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/f8ee78f8-8789-4784-9562-7a10c02cb84b?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/f8ee78f8-8789-4784-9562-7a10c02cb84b?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/4ffc40c4-0e46-4e64-b2e8-32c2dd1dad99?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/4ffc40c4-0e46-4e64-b2e8-32c2dd1dad99?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/d6081bd8-14df-4a4a-9b08-5bf86d11e5c9?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/d6081bd8-14df-4a4a-9b08-5bf86d11e5c9?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/393a15bd-b51e-4367-b863-c4e6b0734b94?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/393a15bd-b51e-4367-b863-c4e6b0734b94?imageView2/2/w/800/"}],"praiselist":[{"uid":5696981,"nickname":"191☞宁儿"},{"uid":4632243,"nickname":"N✩镆宁🐾"},{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":6027904,"nickname":"191 ☞宓"},{"uid":4614748,"nickname":"独行者🚶虞永乐"}],"commentlist":[{"id":766093,"reply_uid":6367554,"reply_nickname":"☞遺莣℡☜","uid":6027904,"nickname":"191 ☞宓","text":"怎么的，我就是矫情，我就是开心啊，[狂笑]"},{"id":766113,"reply_uid":0,"reply_nickname":"","uid":6014957,"nickname":"Coco💐牛掰","text":"羡慕"},{"id":766215,"reply_uid":6014957,"reply_nickname":"Coco💐牛掰","uid":6027904,"nickname":"191 ☞宓","text":"啊\u2026\u2026羡慕啥，好几个月了关系不错"},{"id":766278,"reply_uid":0,"reply_nickname":"","uid":6651295,"nickname":"1元1部自拍视频","text":"974835508"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":757492,"uid":4677750,"text":"等等等等\u2026\u2026做梦你们都把我取关了","location":"","praises":3,"comments":0,"dateline":"4天前","dateline2":"2016-11-07","dateline3":"2016-11-07 16:38:24","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/ebf4ec1f-f01c-4433-838f-3d5b92cb34c6?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/ebf4ec1f-f01c-4433-838f-3d5b92cb34c6?imageView2/2/w/800/"}],"praiselist":[{"uid":5398460,"nickname":"污妖貓"},{"uid":6058864,"nickname":"天龙"},{"uid":5944125,"nickname":"难得一梦"}],"commentlist":[],"user":{"uid":4677750,"nickname":"FV.小冰冰","gender":2,"age":21,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/aa5616fb-1278-4aa3-8e9c-2c212db371a6?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":17,"id":1,"grade":"星","exp":114425,"next":127659,"upgrade":13234,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":757303,"uid":6027904,"text":"这特么昨天让我看的一夜没睡好\u2026\u2026","location":"","praises":3,"comments":11,"dateline":"4天前","dateline2":"2016-11-07","dateline3":"2016-11-07 12:40:08","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/e47e2ca4-bfd7-416b-aedd-005d2712a633?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/e47e2ca4-bfd7-416b-aedd-005d2712a633?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/cbdcf5ab-40e4-4205-99e5-6074b04812da?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/cbdcf5ab-40e4-4205-99e5-6074b04812da?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/164ad97c-dbd6-4c8b-9c7e-a9dd96d785d3?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/164ad97c-dbd6-4c8b-9c7e-a9dd96d785d3?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/7a5bc85f-a855-4fbb-aaf3-422dd1278ec4?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/7a5bc85f-a855-4fbb-aaf3-422dd1278ec4?imageView2/2/w/800/"}],"praiselist":[{"uid":5187729,"nickname":"191👍"},{"uid":4595341,"nickname":"扒骑🐎探花郎"},{"uid":6650622,"nickname":"191☞瑾儿"}],"commentlist":[{"id":765954,"reply_uid":4595341,"reply_nickname":"扒骑🐎探花郎","uid":6027904,"nickname":"191 ☞宓","text":"屁，我去看开车的"},{"id":765955,"reply_uid":5168137,"reply_nickname":"犇犇哥🔥🔥","uid":6027904,"nickname":"191 ☞宓","text":"对啊"},{"id":767433,"reply_uid":0,"reply_nickname":"","uid":6317939,"nickname":"","text":"一夜没睡好美女"},{"id":767434,"reply_uid":6027904,"reply_nickname":"191 ☞宓","uid":6317939,"nickname":"","text":"不告诉我"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":756236,"uid":4858671,"text":"需要加家族的主播联系我，好处多多","location":"","praises":8,"comments":14,"dateline":"6天前","dateline2":"2016-11-06","dateline3":"2016-11-06 11:27:09","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/9aa0c7d6-d8da-4871-b7de-871b54abd297?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/9aa0c7d6-d8da-4871-b7de-871b54abd297?imageView2/2/w/800/"}],"praiselist":[{"uid":6686056,"nickname":"莲升，孤独的男人"},{"uid":6507483,"nickname":"隐.雪--冰美人"},{"uid":5944125,"nickname":"难得一梦"},{"uid":5558502,"nickname":"ZS小萌新"},{"uid":6315923,"nickname":"百里屠苏"}],"commentlist":[{"id":770393,"reply_uid":0,"reply_nickname":"","uid":5394879,"nickname":"雪嫣","text":"有什么好处"},{"id":770392,"reply_uid":0,"reply_nickname":"","uid":5394879,"nickname":"雪嫣","text":"有什么好处"},{"id":773565,"reply_uid":0,"reply_nickname":"","uid":6406531,"nickname":"空姐💋","text":"给你私信了，回一下"},{"id":774350,"reply_uid":0,"reply_nickname":"","uid":5297703,"nickname":"彩鸿的悲殇","text":"我加"}],"user":{"uid":4858671,"nickname":"N.B~章鱼🐙","gender":2,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2ee66a9e-981a-445f-adba-16c5c1a7042b?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":85,"id":4,"grade":"火冠","exp":12677946,"next":13005499,"upgrade":327553,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/1d3bb155-d6e2-4102-b5db-e67f9e2eb49e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":755528,"uid":4736376,"text":"谢谢你们让我感觉到十八年的第一次春天😊","location":"","praises":20,"comments":18,"dateline":"6天前","dateline2":"2016-11-05","dateline3":"2016-11-05 17:34:05","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/3960cb25-70ef-4dea-9fa2-b6398c9fe0f6?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/3960cb25-70ef-4dea-9fa2-b6398c9fe0f6?imageView2/2/w/800/"}],"praiselist":[{"uid":6662191,"nickname":"水哥"},{"uid":6687845,"nickname":"过客"},{"uid":6697284,"nickname":"王小胖"},{"uid":6688446,"nickname":"熊二"},{"uid":6646250,"nickname":"站在角落发光"}],"commentlist":[{"id":767543,"reply_uid":0,"reply_nickname":"","uid":6697284,"nickname":"王小胖","text":"我勒个去，小P娃儿啊[媚眼]"},{"id":767542,"reply_uid":0,"reply_nickname":"","uid":6697284,"nickname":"王小胖","text":"我勒个去，小P娃儿啊[媚眼]"},{"id":771153,"reply_uid":0,"reply_nickname":"","uid":6723829,"nickname":"主播","text":". 大直播，一起玩JJBB90520"},{"id":772233,"reply_uid":6697284,"reply_nickname":"王小胖","uid":4736376,"nickname":"空空一空空😊","text":"这叫女人味好不"}],"user":{"uid":4736376,"nickname":"空空一空空😊","gender":2,"age":23,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/ec810fd1-485d-46e9-b712-7f3a3306acea?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":29,"id":2,"grade":"冠","exp":563727,"next":572379,"upgrade":8652,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":754959,"uid":6027904,"text":"我最可爱，可是没人爱。你的性格迥异，你的特别没人能懂，今生我孤傲今世我骄傲。活到现在没干过任何伤害别人的事，但是伤害自己的挺多，简单明亮，希望这种单纯可以保持下去。好乱，我也不知道自己要表达什么，尽管我现在不知道身体什么时候才可以修养好。","location":"","praises":8,"comments":7,"dateline":"1周前","dateline2":"2016-11-05","dateline3":"2016-11-05 00:57:46","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/ccd34219-bc88-4af8-80ad-cd7b4ccb9174?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/ccd34219-bc88-4af8-80ad-cd7b4ccb9174?imageView2/2/w/800/"}],"praiselist":[{"uid":6663468,"nickname":"㏒ 蘇♛斯"},{"uid":5176338,"nickname":"专宠哇塞💔心碎"},{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":6032895,"nickname":"191 ☞Amy"},{"uid":6436449,"nickname":""}],"commentlist":[{"id":760280,"reply_uid":6027904,"reply_nickname":"191 ☞宓","uid":5696981,"nickname":"191☞宁儿","text":"我"},{"id":760283,"reply_uid":5696981,"reply_nickname":"191☞宁儿","uid":6027904,"nickname":"191 ☞宓","text":"男人，你懂吗？算了，半夜我发春了，哈哈"},{"id":760311,"reply_uid":6027904,"reply_nickname":"191 ☞宓","uid":5696981,"nickname":"191☞宁儿","text":"\u2026\u2026"},{"id":762661,"reply_uid":0,"reply_nickname":"","uid":6407567,"nickname":"萌萌片+我","text":"3409292838"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":754795,"uid":6273693,"text":"明天早上播不要让我一个人直言直语好吗😭","location":"","praises":0,"comments":0,"dateline":"1周前","dateline2":"2016-11-04","dateline3":"2016-11-04 23:06:08","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/2838854e-e796-4193-8793-a78ff6e0b748?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/2838854e-e796-4193-8793-a78ff6e0b748?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":6273693,"nickname":"ZTY💕啊宜兒","gender":2,"age":18,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/1bc81c6d-c99f-45e4-a741-f493e3bcc30c?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":4,"id":1,"grade":"星","exp":2498,"next":3379,"upgrade":881,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":754656,"uid":6687316,"text":"fddddddd","location":"","praises":0,"comments":0,"dateline":"1周前","dateline2":"2016-11-04","dateline3":"2016-11-04 21:03:12","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/acb9b31c-18a9-4b9b-be61-35a89db7cdc2?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/acb9b31c-18a9-4b9b-be61-35a89db7cdc2?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":6687316,"nickname":"酒人心情","gender":1,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/189a82a3-4d0c-442f-bff3-18b9feb27eca?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":1,"id":1,"grade":"星","exp":3,"next":619,"upgrade":616,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":754357,"uid":6027904,"text":"终于买到了，然后回家。","location":"","praises":4,"comments":10,"dateline":"1周前","dateline2":"2016-11-04","dateline3":"2016-11-04 15:31:47","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/658c047c-06bb-42e6-890a-625d19427f8b?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/658c047c-06bb-42e6-890a-625d19427f8b?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/493a07b5-78eb-4e30-9ec4-56f5be241799?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/493a07b5-78eb-4e30-9ec4-56f5be241799?imageView2/2/w/800/"}],"praiselist":[{"uid":5696981,"nickname":"191☞宁儿"},{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":4632243,"nickname":"N✩镆宁🐾"},{"uid":5176338,"nickname":"专宠哇塞💔心碎"}],"commentlist":[{"id":759351,"reply_uid":6653806,"reply_nickname":"主播","uid":6553426,"nickname":"","text":"[大哭]"},{"id":759370,"reply_uid":6553426,"reply_nickname":"","uid":6027904,"nickname":"191 ☞宓","text":"？"},{"id":759743,"reply_uid":0,"reply_nickname":"","uid":6651295,"nickname":"1元1部自拍视频","text":"974835508"},{"id":762664,"reply_uid":0,"reply_nickname":"","uid":6407567,"nickname":"萌萌片+我","text":"34092 92838"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":753796,"uid":4858671,"text":"感谢你们哦","location":"","praises":11,"comments":2,"dateline":"1周前","dateline2":"2016-11-03","dateline3":"2016-11-03 23:25:36","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/c2f2d5e7-c272-462f-8cfe-d007d4155d05?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/c2f2d5e7-c272-462f-8cfe-d007d4155d05?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/c211acae-8f06-448f-a75d-119e763eed45?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/c211acae-8f06-448f-a75d-119e763eed45?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/68a1b52e-7603-4a58-983b-014018ba39ea?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/68a1b52e-7603-4a58-983b-014018ba39ea?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/1d2849ee-a33e-40c8-9fc7-194b8db22232?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/1d2849ee-a33e-40c8-9fc7-194b8db22232?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/742f452f-6670-4889-8e8b-1efe94785e72?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/742f452f-6670-4889-8e8b-1efe94785e72?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/211c606e-2af6-4983-9e8c-ff6612b0d8f2?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/211c606e-2af6-4983-9e8c-ff6612b0d8f2?imageView2/2/w/800/"}],"praiselist":[{"uid":5944125,"nickname":"难得一梦"},{"uid":6175479,"nickname":"操莓🍓"},{"uid":4964389,"nickname":"七宝🍀"},{"uid":5558502,"nickname":"ZS小萌新"},{"uid":6315923,"nickname":"百里屠苏"}],"commentlist":[],"user":{"uid":4858671,"nickname":"N.B~章鱼🐙","gender":2,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2ee66a9e-981a-445f-adba-16c5c1a7042b?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":85,"id":4,"grade":"火冠","exp":12677946,"next":13005499,"upgrade":327553,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/1d3bb155-d6e2-4102-b5db-e67f9e2eb49e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":753564,"uid":6027904,"text":"换个小房间，今晚睡的要安稳点。","location":"","praises":5,"comments":5,"dateline":"1周前","dateline2":"2016-11-03","dateline3":"2016-11-03 19:55:50","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/c769ea00-bad2-4007-8ad2-0764ead371eb?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/c769ea00-bad2-4007-8ad2-0764ead371eb?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/d672cdd9-88a1-4787-87b9-5acf843f6d20?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/d672cdd9-88a1-4787-87b9-5acf843f6d20?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/58c86e3c-888a-425b-9176-e1d08d55a606?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/58c86e3c-888a-425b-9176-e1d08d55a606?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/594eefaf-ad70-49da-b633-9c2c13f5a26e?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/594eefaf-ad70-49da-b633-9c2c13f5a26e?imageView2/2/w/800/"}],"praiselist":[{"uid":5696981,"nickname":"191☞宁儿"},{"uid":5345905,"nickname":"俺是宝宝"},{"uid":5907926,"nickname":"月妃🌸娘娘"},{"uid":6650622,"nickname":"191☞瑾儿"},{"uid":6032895,"nickname":"191 ☞Amy"}],"commentlist":[{"id":758157,"reply_uid":0,"reply_nickname":"","uid":6419888,"nickname":"無🔥默愁","text":"Eric_Liumai"},{"id":758743,"reply_uid":0,"reply_nickname":"","uid":5168137,"nickname":"犇犇哥🔥🔥","text":"没有人陪啊[色色哒][色色哒]"},{"id":759048,"reply_uid":5168137,"reply_nickname":"犇犇哥🔥🔥","uid":6027904,"nickname":"191 ☞宓","text":"没有啊，你也不来，讨厌"},{"id":762669,"reply_uid":0,"reply_nickname":"","uid":6407567,"nickname":"萌萌片+我","text":"340929 2838"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}},{"id":753106,"uid":6027904,"text":"还是好爱这句话，早安！","location":"","praises":4,"comments":2,"dateline":"1周前","dateline2":"2016-11-03","dateline3":"2016-11-03 09:15:08","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/83de8903-3f37-4bfa-b412-7708117f3f26?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/83de8903-3f37-4bfa-b412-7708117f3f26?imageView2/2/w/800/"}],"praiselist":[{"uid":5345905,"nickname":"俺是宝宝"},{"uid":6547045,"nickname":"如戏👑七次郎"},{"uid":6436449,"nickname":""},{"uid":6032895,"nickname":"191 ☞Amy"}],"commentlist":[{"id":757836,"reply_uid":0,"reply_nickname":"","uid":6651295,"nickname":"1元1部自拍视频","text":"974835508"}],"user":{"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}}]
	 */

	private String ret;
	private String msg;
	/**
	 * id : 761268
	 * uid : 6027904
	 * text : 够无聊啊……没人聊天
	 * location :
	 * praises : 2
	 * comments : 0
	 * dateline : 1天前
	 * dateline2 : 2016-11-11
	 * dateline3 : 2016-11-11 10:56:42
	 * distance : 貌似在火星
	 * imagelist : [{"image":"http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/6807243a-bd6f-4759-93bc-853f3cc2f484?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/6807243a-bd6f-4759-93bc-853f3cc2f484?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/beb80d4a-854b-4582-ae9e-bb05b106219f?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/beb80d4a-854b-4582-ae9e-bb05b106219f?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/22331bcb-5233-4143-bb7f-af414af73805?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/22331bcb-5233-4143-bb7f-af414af73805?imageView2/2/w/800/"}]
	 * praiselist : [{"uid":6571929,"nickname":"Alan   "},{"uid":5696981,"nickname":"191☞宁儿"}]
	 * commentlist : []
	 * user : {"uid":6027904,"nickname":"191 ☞宓","gender":2,"age":22,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"},"ico":{"vip":true,"heat":false,"follow":false,"official":false,"sale":false}}
	 * praise : {"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}
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

	public static class ListBean {
		private int id;
		private int uid;
		private String text;
		private String location;
		private int praises;
		private int comments;
		private String dateline;
		private String dateline2;
		private String dateline3;
		private String distance;
		/**
		 * uid : 6027904
		 * nickname : 191 ☞宓
		 * gender : 2
		 * age : 22
		 * avatar : http://yiqi1717-10009627.image.myqcloud.com/e99933c2-697a-4de7-af12-bf531b3d2346?imageView2/1/w/260/h/260
		 * active : {"id":0,"category_id":0,"name":""}
		 * grade : {"lv":25,"id":2,"grade":"冠","exp":343514,"next":375499,"upgrade":31985,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e"}
		 * ico : {"vip":true,"heat":false,"follow":false,"official":false,"sale":false}
		 */

		private UserBean user;
		/**
		 * id : 0
		 * uid : 0
		 * quan_id : 0
		 * status : 0
		 * dateline : null
		 * user : null
		 * is_praise : false
		 */

		private PraiseBean praise;
		/**
		 * image : http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/1/w/500/h/500
		 * image_original : http://yiqi1717-10009627.image.myqcloud.com/cff1bc21-40df-49a2-8ad7-757bd378c6bf?imageView2/2/w/800/
		 */

		private List<ImagelistBean> imagelist;
		/**
		 * uid : 6571929
		 * nickname : Alan
		 */

		private List<PraiselistBean> praiselist;
		private List<?> commentlist;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getPraises() {
			return praises;
		}

		public void setPraises(int praises) {
			this.praises = praises;
		}

		public int getComments() {
			return comments;
		}

		public void setComments(int comments) {
			this.comments = comments;
		}

		public String getDateline() {
			return dateline;
		}

		public void setDateline(String dateline) {
			this.dateline = dateline;
		}

		public String getDateline2() {
			return dateline2;
		}

		public void setDateline2(String dateline2) {
			this.dateline2 = dateline2;
		}

		public String getDateline3() {
			return dateline3;
		}

		public void setDateline3(String dateline3) {
			this.dateline3 = dateline3;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public UserBean getUser() {
			return user;
		}

		public void setUser(UserBean user) {
			this.user = user;
		}

		public PraiseBean getPraise() {
			return praise;
		}

		public void setPraise(PraiseBean praise) {
			this.praise = praise;
		}

		public List<ImagelistBean> getImagelist() {
			return imagelist;
		}

		public void setImagelist(List<ImagelistBean> imagelist) {
			this.imagelist = imagelist;
		}

		public List<PraiselistBean> getPraiselist() {
			return praiselist;
		}

		public void setPraiselist(List<PraiselistBean> praiselist) {
			this.praiselist = praiselist;
		}

		public List<?> getCommentlist() {
			return commentlist;
		}

		public void setCommentlist(List<?> commentlist) {
			this.commentlist = commentlist;
		}

		public static class UserBean {
			private int uid;
			private String nickname;
			private int gender;
			private int age;
			private String avatar;
			/**
			 * id : 0
			 * category_id : 0
			 * name :
			 */

			private ActiveBean active;
			/**
			 * lv : 25
			 * id : 2
			 * grade : 冠
			 * exp : 343514
			 * next : 375499
			 * upgrade : 31985
			 * vip_image : http://yiqi1717-10009627.image.myqcloud.com/4da262c4-af6c-490e-8924-ea4e720b461e
			 */

			private GradeBean grade;
			/**
			 * vip : true
			 * heat : false
			 * follow : false
			 * official : false
			 * sale : false
			 */

			private IcoBean ico;

			public int getUid() {
				return uid;
			}

			public void setUid(int uid) {
				this.uid = uid;
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

			public String getAvatar() {
				return avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
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

			public static class ActiveBean {
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
			}

			public static class GradeBean {
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
			}

			public static class IcoBean {
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
			}
		}

		public static class PraiseBean {
			private int id;
			private int uid;
			private int quan_id;
			private int status;
			private Object dateline;
			private Object user;
			private boolean is_praise;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getUid() {
				return uid;
			}

			public void setUid(int uid) {
				this.uid = uid;
			}

			public int getQuan_id() {
				return quan_id;
			}

			public void setQuan_id(int quan_id) {
				this.quan_id = quan_id;
			}

			public int getStatus() {
				return status;
			}

			public void setStatus(int status) {
				this.status = status;
			}

			public Object getDateline() {
				return dateline;
			}

			public void setDateline(Object dateline) {
				this.dateline = dateline;
			}

			public Object getUser() {
				return user;
			}

			public void setUser(Object user) {
				this.user = user;
			}

			public boolean isIs_praise() {
				return is_praise;
			}

			public void setIs_praise(boolean is_praise) {
				this.is_praise = is_praise;
			}
		}

		public static class ImagelistBean {
			private String image;
			private String image_original;

			public String getImage() {
				return image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getImage_original() {
				return image_original;
			}

			public void setImage_original(String image_original) {
				this.image_original = image_original;
			}
		}

		public static class PraiselistBean {
			private int uid;
			private String nickname;

			public int getUid() {
				return uid;
			}

			public void setUid(int uid) {
				this.uid = uid;
			}

			public String getNickname() {
				return nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}
		}
	}
}
