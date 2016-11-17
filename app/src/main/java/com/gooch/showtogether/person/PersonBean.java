package com.gooch.showtogether.person;

import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.HaoyouApi;
import net.api.PersonApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class PersonBean {
    /*http://api.yiqi1717.com/user/get_imploded
    ?lat=40.043326
    &lng=116.376624
    &nonce=0c58l6stah
    &publickey=3.9
    &timestamp=1478612973
    &token=00f51617b02368a384ab62cff77f2bc5
    &uid=5739921
    &visit_uid=6688920
    &signature=78a6224b5e162b86aaf0da1a84a27fad*/
    public static void load(Callback callback) {
        LogUtils.i("flag","load()1");
        PersonApi personApi = BaseRetrofit.getRetrofit().create(PersonApi.class);

        ArrayMap<String, String> map = new ArrayMap<>();
        map.put("lat", "40.043326");
        map.put("lng", "116.376624");
        map.put("nonce", "0c58l6stah");
        map.put("publickey", "3.9");
        map.put("timestamp", "1478612973");
        map.put("token", "00f51617b02368a384ab62cff77f2bc5");
        map.put("uid", "5739921");
        map.put("visit_uid", "6688920");
        map.put("signature", "78a6224b5e162b86aaf0da1a84a27fad");

        LogUtils.i("flag","load2()");
        Call<PersonBean> call = personApi.getPerson(map);
        LogUtils.i("flag","load3()");
        call.enqueue(callback);
        LogUtils.i("flag","load4()");

    }
    /**
     * ret : 0
     * msg :
     * follow : False
     * black : false
     * user : {"uid":5739921,"parent_uid":4396572,"nickname":"👄NK彤彤👄","gender":2,"bday":"1900-01-01","constellation":"魔羯座","age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260","avatar_original":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/","job":"","company":"","school":"","haunt":"","hobby":"","height":0,"weight":0,"income":"5000元/月以上","sign":"没事找我来唠唠嗑","body":"","marriage":"","vip_on":"1900-01-01","vip_off":"1900-01-01","vip_try":false,"complete":100,"regdate":"2016/7/28","regip":"115.33.20.181  ","lastedit":"4天前","status":1,"sum_follow":59,"sum_fans":428,"official":false,"sale":false,"role_id":1,"live_role_id":1,"lastvisit":"6小时前","lastip":"117.136.0.232  ","lat":40.036431,"lng":116.352749,"province":"北京市","city":"北京市","keys":0,"free_keys":5,"heats":0,"tromba_gold":0,"exp":18413,"credits":11535,"gold":0,"rmb":0,"sum_credits":1135,"sum_gold":13740,"sum_keys":0,"logins":722,"quans":2,"distance":"貌似在火星","locked":{"image":false,"fans":false,"heat":false,"rank":false},"grade":{"lv":9,"id":1,"grade":"星","exp":18413,"next":23179,"upgrade":4766,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":5739921,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-08 15:06:52","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5739921","rtmp":"http://yiqihdl.8686c.com/pajia/5739921.flv"},"certification":{"uid":0,"name":"","describe":"","status":0},"family":{"uid":0,"name":"","slogan":"","notice":"","avatar":"","successful":false,"lives":0,"credits_day":0,"credits_hour":0,"displayorder_trend":0,"owner":false,"member":false}}
     * image : [{"id":5365060,"image":"http://yiqi1717-10009627.image.myqcloud.com/598ec08e-6abc-4dd3-a9c1-362221fa8487?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/598ec08e-6abc-4dd3-a9c1-362221fa8487","is_avatar":false},{"id":5365061,"image":"http://yiqi1717-10009627.image.myqcloud.com/83146e9d-afb6-4513-bba2-1f9190c3fec6?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/83146e9d-afb6-4513-bba2-1f9190c3fec6","is_avatar":false},{"id":5365062,"image":"http://yiqi1717-10009627.image.myqcloud.com/31fb1489-6e1c-4948-a13d-6176be9bd3dc?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/31fb1489-6e1c-4948-a13d-6176be9bd3dc","is_avatar":false},{"id":5365063,"image":"http://yiqi1717-10009627.image.myqcloud.com/4ca256d9-e80f-4a1e-9133-66ce662d739c?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/4ca256d9-e80f-4a1e-9133-66ce662d739c","is_avatar":false},{"id":5365108,"image":"http://yiqi1717-10009627.image.myqcloud.com/a9ed9072-8fdc-4911-a96a-5872f93362fc?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/a9ed9072-8fdc-4911-a96a-5872f93362fc","is_avatar":false},{"id":5365109,"image":"http://yiqi1717-10009627.image.myqcloud.com/4f79caeb-6eff-4bf1-a06b-71874354a967?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/4f79caeb-6eff-4bf1-a06b-71874354a967","is_avatar":false},{"id":5365110,"image":"http://yiqi1717-10009627.image.myqcloud.com/4702921c-cb7d-40b8-8de6-515b147dbe60?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/4702921c-cb7d-40b8-8de6-515b147dbe60","is_avatar":false},{"id":5365111,"image":"http://yiqi1717-10009627.image.myqcloud.com/96e010a0-677b-48d5-bb15-d215a9fffc6e?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/96e010a0-677b-48d5-bb15-d215a9fffc6e","is_avatar":false},{"id":5397384,"image":"http://yiqi1717-10009627.image.myqcloud.com/8bdd94de-a759-4bf4-b28c-c0fb76a83824?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/8bdd94de-a759-4bf4-b28c-c0fb76a83824","is_avatar":false},{"id":5432060,"image":"http://yiqi1717-10009627.image.myqcloud.com/d90a6424-778a-43f5-9c04-391f3bde7228?imageView2/1/w/260/h/260","image_original":"http://yiqi1717-10009627.image.myqcloud.com/d90a6424-778a-43f5-9c04-391f3bde7228","is_avatar":false}]
     * quan : [{"id":644331,"uid":5739921,"text":"今天播了四个小时，嘴都说干皮了。","location":"","praises":6,"comments":1,"dateline":"2016/8/1","dateline2":"2016-08-01","dateline3":"2016-08-01 16:02:14","distance":"貌似在火星","imagelist":[{"image":"http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/3e7a17fb-17dd-42bc-bc93-af7abbb9177b?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/3e7a17fb-17dd-42bc-bc93-af7abbb9177b?imageView2/2/w/800/"}],"praiselist":[],"commentlist":[],"user":{"uid":5739921,"nickname":"👄NK彤彤👄","gender":2,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}},"praise":{"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}}]
     * most_dealing : {"uid":5169977,"nickname":"NK聖爵曉磊💂","avatar":"http://yiqi1717-10009627.image.myqcloud.com/3bf06c57-46a5-4812-85a6-1a5d66ec5e92?imageView2/1/w/260/h/260","gold":3300}
     * most_dealing_list : [{"credits":1650,"user":{"uid":5169977,"nickname":"NK聖爵曉磊💂","avatar":"http://yiqi1717-10009627.image.myqcloud.com/3bf06c57-46a5-4812-85a6-1a5d66ec5e92?imageView2/1/w/260/h/260","grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}}},{"credits":1475,"user":{"uid":5722636,"nickname":"NK俊熙她哥","avatar":"http://yiqi1717-10009627.image.myqcloud.com/86ac8aad-2ad8-4445-9245-9bc6b41717ac?imageView2/1/w/260/h/260","grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}}},{"credits":1245,"user":{"uid":5718859,"nickname":"NK～懒猫儿","avatar":"http://yiqi1717-10009627.image.myqcloud.com/6478cc70-4454-4ecd-b469-f3826dbe6e39?imageView2/1/w/260/h/260","grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}}}]
     * active : []
     * visit : []
     * dealing : []
     */

    private String ret;
    private String msg;
    private String follow;
    private boolean black;
    /**
     * uid : 5739921
     * parent_uid : 4396572
     * nickname : 👄NK彤彤👄
     * gender : 2
     * bday : 1900-01-01
     * constellation : 魔羯座
     * age : 20
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260
     * avatar_original : http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/
     * job :
     * company :
     * school :
     * haunt :
     * hobby :
     * height : 0
     * weight : 0
     * income : 5000元/月以上
     * sign : 没事找我来唠唠嗑
     * body :
     * marriage :
     * vip_on : 1900-01-01
     * vip_off : 1900-01-01
     * vip_try : false
     * complete : 100
     * regdate : 2016/7/28
     * regip : 115.33.20.181
     * lastedit : 4天前
     * status : 1
     * sum_follow : 59
     * sum_fans : 428
     * official : false
     * sale : false
     * role_id : 1
     * live_role_id : 1
     * lastvisit : 6小时前
     * lastip : 117.136.0.232
     * lat : 40.036431
     * lng : 116.352749
     * province : 北京市
     * city : 北京市
     * keys : 0
     * free_keys : 5
     * heats : 0
     * tromba_gold : 0
     * exp : 18413
     * credits : 11535
     * gold : 0
     * rmb : 0.0
     * sum_credits : 1135
     * sum_gold : 13740
     * sum_keys : 0
     * logins : 722
     * quans : 2
     * distance : 貌似在火星
     * locked : {"image":false,"fans":false,"heat":false,"rank":false}
     * grade : {"lv":9,"id":1,"grade":"星","exp":18413,"next":23179,"upgrade":4766,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
     * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
     * live : {"uid":5739921,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-08 15:06:52","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=5739921","rtmp":"http://yiqihdl.8686c.com/pajia/5739921.flv"}
     * certification : {"uid":0,"name":"","describe":"","status":0}
     * family : {"uid":0,"name":"","slogan":"","notice":"","avatar":"","successful":false,"lives":0,"credits_day":0,"credits_hour":0,"displayorder_trend":0,"owner":false,"member":false}
     */

    private UserBean user;
    /**
     * uid : 5169977
     * nickname : NK聖爵曉磊💂
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/3bf06c57-46a5-4812-85a6-1a5d66ec5e92?imageView2/1/w/260/h/260
     * gold : 3300
     */

    private MostDealingBean most_dealing;
    /**
     * id : 5365060
     * image : http://yiqi1717-10009627.image.myqcloud.com/598ec08e-6abc-4dd3-a9c1-362221fa8487?imageView2/1/w/260/h/260
     * image_original : http://yiqi1717-10009627.image.myqcloud.com/598ec08e-6abc-4dd3-a9c1-362221fa8487
     * is_avatar : false
     */

    private List<ImageBean> image;
    /**
     * id : 644331
     * uid : 5739921
     * text : 今天播了四个小时，嘴都说干皮了。
     * location :
     * praises : 6
     * comments : 1
     * dateline : 2016/8/1
     * dateline2 : 2016-08-01
     * dateline3 : 2016-08-01 16:02:14
     * distance : 貌似在火星
     * imagelist : [{"image":"http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/2/w/800/"},{"image":"http://yiqi1717-10009627.image.myqcloud.com/3e7a17fb-17dd-42bc-bc93-af7abbb9177b?imageView2/1/w/500/h/500","image_original":"http://yiqi1717-10009627.image.myqcloud.com/3e7a17fb-17dd-42bc-bc93-af7abbb9177b?imageView2/2/w/800/"}]
     * praiselist : []
     * commentlist : []
     * user : {"uid":5739921,"nickname":"👄NK彤彤👄","gender":2,"age":20,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260","active":{"id":0,"category_id":0,"name":""},"grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false}}
     * praise : {"id":0,"uid":0,"quan_id":0,"status":0,"dateline":null,"user":null,"is_praise":false}
     */

    private List<QuanBean> quan;
    /**
     * credits : 1650
     * user : {"uid":5169977,"nickname":"NK聖爵曉磊💂","avatar":"http://yiqi1717-10009627.image.myqcloud.com/3bf06c57-46a5-4812-85a6-1a5d66ec5e92?imageView2/1/w/260/h/260","grade":{"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}}
     */

    private List<MostDealingListBean> most_dealing_list;
    private List<?> active;
    private List<?> visit;
    private List<?> dealing;

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

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public MostDealingBean getMost_dealing() {
        return most_dealing;
    }

    public void setMost_dealing(MostDealingBean most_dealing) {
        this.most_dealing = most_dealing;
    }

    public List<ImageBean> getImage() {
        return image;
    }

    public void setImage(List<ImageBean> image) {
        this.image = image;
    }

    public List<QuanBean> getQuan() {
        return quan;
    }

    public void setQuan(List<QuanBean> quan) {
        this.quan = quan;
    }

    public List<MostDealingListBean> getMost_dealing_list() {
        return most_dealing_list;
    }

    public void setMost_dealing_list(List<MostDealingListBean> most_dealing_list) {
        this.most_dealing_list = most_dealing_list;
    }

    public List<?> getActive() {
        return active;
    }

    public void setActive(List<?> active) {
        this.active = active;
    }

    public List<?> getVisit() {
        return visit;
    }

    public void setVisit(List<?> visit) {
        this.visit = visit;
    }

    public List<?> getDealing() {
        return dealing;
    }

    public void setDealing(List<?> dealing) {
        this.dealing = dealing;
    }

    public static class UserBean {
        private int uid;
        private int parent_uid;
        private String nickname;
        private int gender;
        private String bday;
        private String constellation;
        private int age;
        private String avatar;
        private String avatar_original;
        private String job;
        private String company;
        private String school;
        private String haunt;
        private String hobby;
        private int height;
        private int weight;
        private String income;
        private String sign;
        private String body;
        private String marriage;
        private String vip_on;
        private String vip_off;
        private boolean vip_try;
        private int complete;
        private String regdate;
        private String regip;
        private String lastedit;
        private int status;
        private int sum_follow;
        private int sum_fans;
        private boolean official;
        private boolean sale;
        private int role_id;
        private int live_role_id;
        private String lastvisit;
        private String lastip;
        private double lat;
        private double lng;
        private String province;
        private String city;
        private int keys;
        private int free_keys;
        private int heats;
        private int tromba_gold;
        private int exp;
        private int credits;
        private int gold;
        private double rmb;
        private int sum_credits;
        private int sum_gold;
        private int sum_keys;
        private int logins;
        private int quans;
        private String distance;
        /**
         * image : false
         * fans : false
         * heat : false
         * rank : false
         */

        private LockedBean locked;
        /**
         * lv : 9
         * id : 1
         * grade : 星
         * exp : 18413
         * next : 23179
         * upgrade : 4766
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
         * uid : 5739921
         * title : 我发起了一个直播，快来看看吧！
         * cover : http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/2/w/800/
         * users : 0
         * is_live : false
         * begin_live : 2016-11-08 15:06:52
         * displayorder : 6
         * html_share : http://www.yiqi1717.com/live/html_share?live_uid=5739921
         * rtmp : http://yiqihdl.8686c.com/pajia/5739921.flv
         */

        private LiveBean live;
        /**
         * uid : 0
         * name :
         * describe :
         * status : 0
         */

        private CertificationBean certification;
        /**
         * uid : 0
         * name :
         * slogan :
         * notice :
         * avatar :
         * successful : false
         * lives : 0
         * credits_day : 0
         * credits_hour : 0
         * displayorder_trend : 0
         * owner : false
         * member : false
         */

        private FamilyBean family;

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

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public String getConstellation() {
            return constellation;
        }

        public void setConstellation(String constellation) {
            this.constellation = constellation;
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

        public String getAvatar_original() {
            return avatar_original;
        }

        public void setAvatar_original(String avatar_original) {
            this.avatar_original = avatar_original;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getHaunt() {
            return haunt;
        }

        public void setHaunt(String haunt) {
            this.haunt = haunt;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getIncome() {
            return income;
        }

        public void setIncome(String income) {
            this.income = income;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getMarriage() {
            return marriage;
        }

        public void setMarriage(String marriage) {
            this.marriage = marriage;
        }

        public String getVip_on() {
            return vip_on;
        }

        public void setVip_on(String vip_on) {
            this.vip_on = vip_on;
        }

        public String getVip_off() {
            return vip_off;
        }

        public void setVip_off(String vip_off) {
            this.vip_off = vip_off;
        }

        public boolean isVip_try() {
            return vip_try;
        }

        public void setVip_try(boolean vip_try) {
            this.vip_try = vip_try;
        }

        public int getComplete() {
            return complete;
        }

        public void setComplete(int complete) {
            this.complete = complete;
        }

        public String getRegdate() {
            return regdate;
        }

        public void setRegdate(String regdate) {
            this.regdate = regdate;
        }

        public String getRegip() {
            return regip;
        }

        public void setRegip(String regip) {
            this.regip = regip;
        }

        public String getLastedit() {
            return lastedit;
        }

        public void setLastedit(String lastedit) {
            this.lastedit = lastedit;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSum_follow() {
            return sum_follow;
        }

        public void setSum_follow(int sum_follow) {
            this.sum_follow = sum_follow;
        }

        public int getSum_fans() {
            return sum_fans;
        }

        public void setSum_fans(int sum_fans) {
            this.sum_fans = sum_fans;
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

        public int getRole_id() {
            return role_id;
        }

        public void setRole_id(int role_id) {
            this.role_id = role_id;
        }

        public int getLive_role_id() {
            return live_role_id;
        }

        public void setLive_role_id(int live_role_id) {
            this.live_role_id = live_role_id;
        }

        public String getLastvisit() {
            return lastvisit;
        }

        public void setLastvisit(String lastvisit) {
            this.lastvisit = lastvisit;
        }

        public String getLastip() {
            return lastip;
        }

        public void setLastip(String lastip) {
            this.lastip = lastip;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
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

        public int getKeys() {
            return keys;
        }

        public void setKeys(int keys) {
            this.keys = keys;
        }

        public int getFree_keys() {
            return free_keys;
        }

        public void setFree_keys(int free_keys) {
            this.free_keys = free_keys;
        }

        public int getHeats() {
            return heats;
        }

        public void setHeats(int heats) {
            this.heats = heats;
        }

        public int getTromba_gold() {
            return tromba_gold;
        }

        public void setTromba_gold(int tromba_gold) {
            this.tromba_gold = tromba_gold;
        }

        public int getExp() {
            return exp;
        }

        public void setExp(int exp) {
            this.exp = exp;
        }

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public double getRmb() {
            return rmb;
        }

        public void setRmb(double rmb) {
            this.rmb = rmb;
        }

        public int getSum_credits() {
            return sum_credits;
        }

        public void setSum_credits(int sum_credits) {
            this.sum_credits = sum_credits;
        }

        public int getSum_gold() {
            return sum_gold;
        }

        public void setSum_gold(int sum_gold) {
            this.sum_gold = sum_gold;
        }

        public int getSum_keys() {
            return sum_keys;
        }

        public void setSum_keys(int sum_keys) {
            this.sum_keys = sum_keys;
        }

        public int getLogins() {
            return logins;
        }

        public void setLogins(int logins) {
            this.logins = logins;
        }

        public int getQuans() {
            return quans;
        }

        public void setQuans(int quans) {
            this.quans = quans;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public LockedBean getLocked() {
            return locked;
        }

        public void setLocked(LockedBean locked) {
            this.locked = locked;
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

        public CertificationBean getCertification() {
            return certification;
        }

        public void setCertification(CertificationBean certification) {
            this.certification = certification;
        }

        public FamilyBean getFamily() {
            return family;
        }

        public void setFamily(FamilyBean family) {
            this.family = family;
        }

        public static class LockedBean {
            private boolean image;
            private boolean fans;
            private boolean heat;
            private boolean rank;

            public boolean isImage() {
                return image;
            }

            public void setImage(boolean image) {
                this.image = image;
            }

            public boolean isFans() {
                return fans;
            }

            public void setFans(boolean fans) {
                this.fans = fans;
            }

            public boolean isHeat() {
                return heat;
            }

            public void setHeat(boolean heat) {
                this.heat = heat;
            }

            public boolean isRank() {
                return rank;
            }

            public void setRank(boolean rank) {
                this.rank = rank;
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

        public static class LiveBean {
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
        }

        public static class CertificationBean {
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
        }

        public static class FamilyBean {
            private int uid;
            private String name;
            private String slogan;
            private String notice;
            private String avatar;
            private boolean successful;
            private int lives;
            private int credits_day;
            private int credits_hour;
            private int displayorder_trend;
            private boolean owner;
            private boolean member;

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

            public String getSlogan() {
                return slogan;
            }

            public void setSlogan(String slogan) {
                this.slogan = slogan;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public boolean isSuccessful() {
                return successful;
            }

            public void setSuccessful(boolean successful) {
                this.successful = successful;
            }

            public int getLives() {
                return lives;
            }

            public void setLives(int lives) {
                this.lives = lives;
            }

            public int getCredits_day() {
                return credits_day;
            }

            public void setCredits_day(int credits_day) {
                this.credits_day = credits_day;
            }

            public int getCredits_hour() {
                return credits_hour;
            }

            public void setCredits_hour(int credits_hour) {
                this.credits_hour = credits_hour;
            }

            public int getDisplayorder_trend() {
                return displayorder_trend;
            }

            public void setDisplayorder_trend(int displayorder_trend) {
                this.displayorder_trend = displayorder_trend;
            }

            public boolean isOwner() {
                return owner;
            }

            public void setOwner(boolean owner) {
                this.owner = owner;
            }

            public boolean isMember() {
                return member;
            }

            public void setMember(boolean member) {
                this.member = member;
            }
        }
    }

    public static class MostDealingBean {
        private int uid;
        private String nickname;
        private String avatar;
        private int gold;

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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }

    public static class ImageBean {
        private int id;
        private String image;
        private String image_original;
        private boolean is_avatar;

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

        public String getImage_original() {
            return image_original;
        }

        public void setImage_original(String image_original) {
            this.image_original = image_original;
        }

        public boolean isIs_avatar() {
            return is_avatar;
        }

        public void setIs_avatar(boolean is_avatar) {
            this.is_avatar = is_avatar;
        }
    }

    public static class QuanBean {
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
         * uid : 5739921
         * nickname : 👄NK彤彤👄
         * gender : 2
         * age : 20
         * avatar : http://yiqi1717-10009627.image.myqcloud.com/5fe5e4ae-363b-40a6-a278-25e6f2ae4997?imageView2/1/w/260/h/260
         * active : {"id":0,"category_id":0,"name":""}
         * grade : {"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}
         * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
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
         * image : http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/1/w/500/h/500
         * image_original : http://yiqi1717-10009627.image.myqcloud.com/b823ff5f-5c04-4eff-aeb3-74807d365bdc?imageView2/2/w/800/
         */

        private List<ImagelistBean> imagelist;
        private List<?> praiselist;
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

        public List<?> getPraiselist() {
            return praiselist;
        }

        public void setPraiselist(List<?> praiselist) {
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
             * lv : 0
             * id : 0
             * grade : null
             * exp : 0
             * next : 0
             * upgrade : 0
             * vip_image : null
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
                private Object grade;
                private int exp;
                private int next;
                private int upgrade;
                private Object vip_image;

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

                public Object getGrade() {
                    return grade;
                }

                public void setGrade(Object grade) {
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

                public Object getVip_image() {
                    return vip_image;
                }

                public void setVip_image(Object vip_image) {
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
    }

    public static class MostDealingListBean {
        private int credits;
        /**
         * uid : 5169977
         * nickname : NK聖爵曉磊💂
         * avatar : http://yiqi1717-10009627.image.myqcloud.com/3bf06c57-46a5-4812-85a6-1a5d66ec5e92?imageView2/1/w/260/h/260
         * grade : {"lv":0,"id":0,"grade":null,"exp":0,"next":0,"upgrade":0,"vip_image":null}
         */

        private UserBean user;

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            private int uid;
            private String nickname;
            private String avatar;
            /**
             * lv : 0
             * id : 0
             * grade : null
             * exp : 0
             * next : 0
             * upgrade : 0
             * vip_image : null
             */

            private GradeBean grade;

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

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public GradeBean getGrade() {
                return grade;
            }

            public void setGrade(GradeBean grade) {
                this.grade = grade;
            }

            public static class GradeBean {
                private int lv;
                private int id;
                private Object grade;
                private int exp;
                private int next;
                private int upgrade;
                private Object vip_image;

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

                public Object getGrade() {
                    return grade;
                }

                public void setGrade(Object grade) {
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

                public Object getVip_image() {
                    return vip_image;
                }

                public void setVip_image(Object vip_image) {
                    this.vip_image = vip_image;
                }
            }
        }
    }
}
