package fragment.zhibo.bean;

import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.GuanZhuApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by WH on 2016/11/6.
 */
public class GuanZhuBean {

    /**
     * ret : 0
     * msg :
     * bar : []
     * info : {"id":7,"template":"NORMAL","numerical":"USERS","name":"","parameters":"","line":1,"waterfall":false,"livelist":[{"uid":6339842,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/828/h/828","users":9417,"is_live":true,"begin_live":"2016-11-06 19:29:20","netease_tid":"4150131","max_manager":0,"heats":112762,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6339842","rtmp":"http://yiqihdl.8686c.com/pajia/6339842.flv","all_count":443,"user":{"uid":6339842,"parent_uid":6351537,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/260/h/260","nickname":"锦秀🌼赫妍🌼","gender":2,"age":23,"role_id":1,"credits":980497,"live_credits":40479,"live_credits_1":5796,"live_adds":26,"live_shares":163,"province":"吉林省","city":"延边朝鲜族自治州","sign":"🌬🌬🌬赫妍是温暖的🌬🌬🌬","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":19082,"next":23179,"upgrade":4097,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5822729,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2c823956-4cbe-46fa-a435-9cf107f67665?imageView2/1/w/828/h/828","users":6605,"is_live":true,"begin_live":"2016-11-06 19:42:46","netease_tid":"3795370","max_manager":0,"heats":72594,"heats2":0,"displayorder":3,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5822729","rtmp":"http://yiqihdl.8686c.com/pajia/5822729.flv","all_count":443,"user":{"uid":5822729,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2c823956-4cbe-46fa-a435-9cf107f67665?imageView2/1/w/260/h/260","nickname":"胡萝卜妹儿 i","gender":2,"age":22,"role_id":1,"credits":1213661,"live_credits":70,"live_credits_1":70,"live_adds":63,"live_shares":5,"province":"黑龙江省","city":"牡丹江市","sign":"一生随性喜欢就好","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":17,"id":1,"grade":"星","exp":117349,"next":127659,"upgrade":10310,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]}
     */

    private String ret;
    private String msg;
    /**
     * id : 7
     * template : NORMAL
     * numerical : USERS
     * name :
     * parameters :
     * line : 1
     * waterfall : false
     * livelist : [{"uid":6339842,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/828/h/828","users":9417,"is_live":true,"begin_live":"2016-11-06 19:29:20","netease_tid":"4150131","max_manager":0,"heats":112762,"heats2":0,"displayorder":1,"home_displayorder":99999,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=6339842","rtmp":"http://yiqihdl.8686c.com/pajia/6339842.flv","all_count":443,"user":{"uid":6339842,"parent_uid":6351537,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/260/h/260","nickname":"锦秀🌼赫妍🌼","gender":2,"age":23,"role_id":1,"credits":980497,"live_credits":40479,"live_credits_1":5796,"live_adds":26,"live_shares":163,"province":"吉林省","city":"延边朝鲜族自治州","sign":"🌬🌬🌬赫妍是温暖的🌬🌬🌬","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":19082,"next":23179,"upgrade":4097,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}},{"uid":5822729,"title":"我发起了一个直播，快来看看吧！","cover":"http://yiqi1717-10009627.image.myqcloud.com/2c823956-4cbe-46fa-a435-9cf107f67665?imageView2/1/w/828/h/828","users":6605,"is_live":true,"begin_live":"2016-11-06 19:42:46","netease_tid":"3795370","max_manager":0,"heats":72594,"heats2":0,"displayorder":3,"home_displayorder":3,"family_displayorder":0,"distance":"貌似在火星","display_heats":true,"html_share":"http://www.yiqi1717.com/share/live?live_uid=5822729","rtmp":"http://yiqihdl.8686c.com/pajia/5822729.flv","all_count":443,"user":{"uid":5822729,"parent_uid":4548255,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/2c823956-4cbe-46fa-a435-9cf107f67665?imageView2/1/w/260/h/260","nickname":"胡萝卜妹儿 i","gender":2,"age":22,"role_id":1,"credits":1213661,"live_credits":70,"live_credits_1":70,"live_adds":63,"live_shares":5,"province":"黑龙江省","city":"牡丹江市","sign":"一生随性喜欢就好","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":17,"id":1,"grade":"星","exp":117349,"next":127659,"upgrade":10310,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}}]
     */

    private InfoBean info;
    private List<?> bar;

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

    public List<?> getBar() {
        return bar;
    }

    public void setBar(List<?> bar) {
        this.bar = bar;
    }

    public static void load(Callback callback) {
        GuanZhuApi guanZhuApi = BaseRetrofit.getRetrofit().create(GuanZhuApi.class);
        ArrayMap<String, String> map0 = new ArrayMap<>();
//        nonce=t9358gnr1a
// &pageindex=1
// &publickey=3.9
// &tag_id=3
// &timestamp=1478434447
// &token=490c6fdf36fa8fe0df4cb98f3a154ae6
// &signature=fbc3b5bcb0e8c9455db70f9cf68458d3
        map0.put("nonce", "t9358gnr1a");
        map0.put("pageindex", "1");
        map0.put("publickey", "3.9");
        map0.put("tag_id", "3");
        map0.put("timestamp", "1478434447");
        map0.put("token", "490c6fdf36fa8fe0df4cb98f3a154ae6");
        map0.put("signature", "fbc3b5bcb0e8c9455db70f9cf68458d3");

        ArrayMap<String, String> map1 = new ArrayMap<>();
//    http://api.yiqi1717.com/home/get_single?
// nonce=i92xgdy1a3
// &pageindex=1
// &publickey=3.9
// &tag_id=3
// &timestamp=1478497262
// &token=5f2e8d2364dd819a4121648fe819b533
// &signature=b4d99fb1806f96e89bd6c0b01acf51bd
        map1.put("nonce", "i92xgdy1a3");
        map1.put("pageindex", "1");
        map1.put("publickey", "3.9");
        map1.put("tag_id", "3");
        map1.put("timestamp", "1478497262");
        map1.put("token", "5f2e8d2364dd819a4121648fe819b533");
        map1.put("signature", "b4d99fb1806f96e89bd6c0b01acf51bd");


        int index = (int) (Math.random() * 2);
        switch (index) {
            case 0:
                Call<GuanZhuBean> call0 = guanZhuApi.getGuanZhu(map0);
                call0.enqueue(callback);
                break;
            case 1:
                Call<GuanZhuBean> call1 = guanZhuApi.getGuanZhu(map1);
                call1.enqueue(callback);
                break;
        }

    }

    public static class InfoBean {
        private int id;
        private String template;
        private String numerical;
        private String name;
        private String parameters;
        private int line;
        private boolean waterfall;
        /**
         * uid : 6339842
         * title : 我发起了一个直播，快来看看吧！
         * cover : http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/828/h/828
         * users : 9417
         * is_live : true
         * begin_live : 2016-11-06 19:29:20
         * netease_tid : 4150131
         * max_manager : 0
         * heats : 112762
         * heats2 : 0
         * displayorder : 1
         * home_displayorder : 99999
         * family_displayorder : 0
         * distance : 貌似在火星
         * display_heats : true
         * html_share : http://www.yiqi1717.com/share/live?live_uid=6339842
         * rtmp : http://yiqihdl.8686c.com/pajia/6339842.flv
         * all_count : 443
         * user : {"uid":6339842,"parent_uid":6351537,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/260/h/260","nickname":"锦秀🌼赫妍🌼","gender":2,"age":23,"role_id":1,"credits":980497,"live_credits":40479,"live_credits_1":5796,"live_adds":26,"live_shares":163,"province":"吉林省","city":"延边朝鲜族自治州","sign":"🌬🌬🌬赫妍是温暖的🌬🌬🌬","excellent":false,"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"grade":{"lv":9,"id":1,"grade":"星","exp":19082,"next":23179,"upgrade":4097,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"certification":{"uid":0,"name":"","describe":"","status":0}}
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

        public static class LivelistBean {
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
             * uid : 6339842
             * parent_uid : 6351537
             * avatar : http://yiqi1717-10009627.image.myqcloud.com/c32a41fa-aa05-4a3c-a840-1d2f41fcf391?imageView2/1/w/260/h/260
             * nickname : 锦秀🌼赫妍🌼
             * gender : 2
             * age : 23
             * role_id : 1
             * credits : 980497
             * live_credits : 40479
             * live_credits_1 : 5796
             * live_adds : 26
             * live_shares : 163
             * province : 吉林省
             * city : 延边朝鲜族自治州
             * sign : 🌬🌬🌬赫妍是温暖的🌬🌬🌬
             * excellent : false
             * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
             * grade : {"lv":9,"id":1,"grade":"星","exp":19082,"next":23179,"upgrade":4097,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
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

            public static class UserBean {
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
                 * exp : 19082
                 * next : 23179
                 * upgrade : 4097
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
            }
        }
    }
}
