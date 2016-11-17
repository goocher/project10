package fragment.friend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.HaoyouApi;
import net.api.PaiHanggApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class HaoyouBean implements Parcelable {
/*http://api.yiqi1717.com/
user/get_follow2
?nonce=prw61n3ics&pageindex=1&publickey=3.9&timestamp=1478513224&token=00f51617b02368a384ab62cff77f2bc5&signature=0d334ac03032dd8f36c715ee8cfde2fe*/
    public static void load(Callback callback) {
        LogUtils.i("flag","load()1");
        HaoyouApi haoyouApi = BaseRetrofit.getRetrofit().create(HaoyouApi.class);

        ArrayMap<String, String> map = new ArrayMap<>();
        map.put("nonce", "prw61n3ics");
        map.put("pageindex", "1");
        map.put("publickey", "3.9");
        map.put("timestamp", "1478513224");
        map.put("token", "00f51617b02368a384ab62cff77f2bc5");
        map.put("signature", "0d334ac03032dd8f36c715ee8cfde2fe");

        LogUtils.i("flag","load2()");
        Call<HaoyouBean> call = haoyouApi.getHaoyou(map);
        LogUtils.i("flag","load3()");
        call.enqueue(callback);
        LogUtils.i("flag","load4()");

    }
    /**
     * ret : 0
     * msg :
     * list : [{"uid":5660157,"avatar":"http://yiqi1717-10009627.image.myqcloud.com/467d8464-1f94-483f-a7d5-143474117778?imageView2/1/w/260/h/260","nickname":"A💋鱼鱼鱼鱼儿","gender":2,"age":20,"constellation":"魔羯座","lastvisit":"23分钟前","distance":"貌似在火星","sign":"越努力越幸运🍀","grade":{"lv":17,"id":1,"grade":"星","exp":108115,"next":127659,"upgrade":19544,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"},"ico":{"vip":false,"heat":false,"follow":false,"official":false,"sale":false},"live":{"uid":0,"title":"","cover":"http://yiqi1717-10009627.image.myqcloud.com/467d8464-1f94-483f-a7d5-143474117778?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-08 16:30:51","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=0","rtmp":""}}]
     */

    private String ret;
    private String msg;
    /**
     * uid : 5660157
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/467d8464-1f94-483f-a7d5-143474117778?imageView2/1/w/260/h/260
     * nickname : A💋鱼鱼鱼鱼儿
     * gender : 2
     * age : 20
     * constellation : 魔羯座
     * lastvisit : 23分钟前
     * distance : 貌似在火星
     * sign : 越努力越幸运🍀
     * grade : {"lv":17,"id":1,"grade":"星","exp":108115,"next":127659,"upgrade":19544,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/7184ffe5-f774-43de-a224-ce5446a2f0f4"}
     * ico : {"vip":false,"heat":false,"follow":false,"official":false,"sale":false}
     * live : {"uid":0,"title":"","cover":"http://yiqi1717-10009627.image.myqcloud.com/467d8464-1f94-483f-a7d5-143474117778?imageView2/2/w/800/","users":0,"is_live":false,"begin_live":"2016-11-08 16:30:51","displayorder":6,"html_share":"http://www.yiqi1717.com/live/html_share?live_uid=0","rtmp":""}
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
        private String distance;
        private String sign;
        /**
         * lv : 17
         * id : 1
         * grade : 星
         * exp : 108115
         * next : 127659
         * upgrade : 19544
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
         * uid : 0
         * title :
         * cover : http://yiqi1717-10009627.image.myqcloud.com/467d8464-1f94-483f-a7d5-143474117778?imageView2/2/w/800/
         * users : 0
         * is_live : false
         * begin_live : 2016-11-08 16:30:51
         * displayorder : 6
         * html_share : http://www.yiqi1717.com/live/html_share?live_uid=0
         * rtmp :
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
            dest.writeString(this.distance);
            dest.writeString(this.sign);
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
            this.distance = in.readString();
            this.sign = in.readString();
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

    public HaoyouBean() {
    }

    protected HaoyouBean(Parcel in) {
        this.ret = in.readString();
        this.msg = in.readString();
        this.list = new ArrayList<ListBean>();
        in.readList(this.list, ListBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<HaoyouBean> CREATOR = new Parcelable.Creator<HaoyouBean>() {
        @Override
        public HaoyouBean createFromParcel(Parcel source) {
            return new HaoyouBean(source);
        }

        @Override
        public HaoyouBean[] newArray(int size) {
            return new HaoyouBean[size];
        }
    };
}
