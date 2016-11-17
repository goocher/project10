package fragment.friend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import net.BaseRetrofit;
import net.api.NearByPerson;
import net.api.PaiHanggApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class PaiHangBean implements Parcelable {


    private String ret;
    private String msg;
    /**
     * uid : 3779886
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/d3147fce-52ef-4d0f-b223-3c779345ecb0?imageView2/1/w/260/h/260
     * avatar_original : http://yiqi1717-10009627.image.myqcloud.com/d3147fce-52ef-4d0f-b223-3c779345ecb0?imageView2/2/w/800/
     * nickname : Miya美少女༄
     * gender : 2
     * age : 18
     * value : 10045271
     * grade : {"lv":57,"id":3,"grade":"彩冠","exp":3973783,"next":4029259,"upgrade":55476,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf"}
     * ico : {"vip":true,"heat":false,"follow":false,"official":false,"sale":false}
     */

    private List<CreditsBean> credits;
    /**
     * uid : 4265877
     * avatar : http://yiqi1717-10009627.image.myqcloud.com/313f5132-710c-4c4c-be6f-619e3be2b34b?imageView2/1/w/260/h/260
     * avatar_original : http://yiqi1717-10009627.image.myqcloud.com/313f5132-710c-4c4c-be6f-619e3be2b34b?imageView2/2/w/800/
     * nickname : Miya的Y哥༄
     * gender : 1
     * age : 99
     * value : 53190820
     * grade : {"lv":350,"id":7,"grade":"傲天","exp":865459271,"next":869750499,"upgrade":4291228,"vip_image":"http://yiqi1717-10009627.image.myqcloud.com/67f625ec-b479-4018-b3c8-00b217b4b5b0"}
     * ico : {"vip":true,"heat":false,"follow":false,"official":false,"sale":false}
     */

    private List<GoldBean> gold;

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

    public List<CreditsBean> getCredits() {
        return credits;
    }

    public void setCredits(List<CreditsBean> credits) {
        this.credits = credits;
    }

    public List<GoldBean> getGold() {
        return gold;
    }

    public void setGold(List<GoldBean> gold) {
        this.gold = gold;
    }

    public static class CreditsBean implements Parcelable {
        private int uid;
        private String avatar;
        private String avatar_original;
        private String nickname;
        private int gender;
        private int age;
        private int value;
        /**
         * lv : 57
         * id : 3
         * grade : 彩冠
         * exp : 3973783
         * next : 4029259
         * upgrade : 55476
         * vip_image : http://yiqi1717-10009627.image.myqcloud.com/488c7f35-0c31-42d7-8a8f-6eaa9da834cf
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

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.uid);
            dest.writeString(this.avatar);
            dest.writeString(this.avatar_original);
            dest.writeString(this.nickname);
            dest.writeInt(this.gender);
            dest.writeInt(this.age);
            dest.writeInt(this.value);
            dest.writeParcelable(this.grade, flags);
            dest.writeParcelable(this.ico, flags);
        }

        public CreditsBean() {
        }

        protected CreditsBean(Parcel in) {
            this.uid = in.readInt();
            this.avatar = in.readString();
            this.avatar_original = in.readString();
            this.nickname = in.readString();
            this.gender = in.readInt();
            this.age = in.readInt();
            this.value = in.readInt();
            this.grade = in.readParcelable(GradeBean.class.getClassLoader());
            this.ico = in.readParcelable(IcoBean.class.getClassLoader());
        }

        public static final Creator<CreditsBean> CREATOR = new Creator<CreditsBean>() {
            @Override
            public CreditsBean createFromParcel(Parcel source) {
                return new CreditsBean(source);
            }

            @Override
            public CreditsBean[] newArray(int size) {
                return new CreditsBean[size];
            }
        };
    }

    public static class GoldBean implements Parcelable {
        private int uid;
        private String avatar;
        private String avatar_original;
        private String nickname;
        private int gender;
        private int age;
        private int value;
        /**
         * lv : 350
         * id : 7
         * grade : 傲天
         * exp : 865459271
         * next : 869750499
         * upgrade : 4291228
         * vip_image : http://yiqi1717-10009627.image.myqcloud.com/67f625ec-b479-4018-b3c8-00b217b4b5b0
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

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.uid);
            dest.writeString(this.avatar);
            dest.writeString(this.avatar_original);
            dest.writeString(this.nickname);
            dest.writeInt(this.gender);
            dest.writeInt(this.age);
            dest.writeInt(this.value);
            dest.writeParcelable(this.grade, flags);
            dest.writeParcelable(this.ico, flags);
        }

        public GoldBean() {
        }

        protected GoldBean(Parcel in) {
            this.uid = in.readInt();
            this.avatar = in.readString();
            this.avatar_original = in.readString();
            this.nickname = in.readString();
            this.gender = in.readInt();
            this.age = in.readInt();
            this.value = in.readInt();
            this.grade = in.readParcelable(GradeBean.class.getClassLoader());
            this.ico = in.readParcelable(IcoBean.class.getClassLoader());
        }

        public static final Creator<GoldBean> CREATOR = new Creator<GoldBean>() {
            @Override
            public GoldBean createFromParcel(Parcel source) {
                return new GoldBean(source);
            }

            @Override
            public GoldBean[] newArray(int size) {
                return new GoldBean[size];
            }
        };
    }

//    http://api.yiqi1717.com/rank/all
// ?nonce=67vgwfy1m2
// &publickey=3.9
// &timestamp=1478513271
// &token=00f51617b02368a384ab62cff77f2bc5
// &signature=c6fdddc6021ad109abd483ef8db3a624
public static void load(Callback callback) {
    LogUtils.i("flag","load()1");
    PaiHanggApi paiHanggApi = BaseRetrofit.getRetrofit().create(PaiHanggApi.class);

    ArrayMap<String, String> map = new ArrayMap<>();
    map.put("nonce", "67vgwfy1m2");
    map.put("publickey", "3.9");
    map.put("timestamp", "1478513271");
    map.put("token", "00f51617b02368a384ab62cff77f2bc5");
    map.put("signature", "c6fdddc6021ad109abd483ef8db3a624");

    LogUtils.i("flag","load2()");
    Call<PaiHangBean> call = paiHanggApi.getPaiHang(map);
    LogUtils.i("flag","load3()");
    call.enqueue(callback);
    LogUtils.i("flag","load4()");

}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.ret);
        dest.writeString(this.msg);
        dest.writeList(this.credits);
        dest.writeList(this.gold);
    }

    public PaiHangBean() {
    }

    protected PaiHangBean(Parcel in) {
        this.ret = in.readString();
        this.msg = in.readString();
        this.credits = new ArrayList<CreditsBean>();
        in.readList(this.credits, CreditsBean.class.getClassLoader());
        this.gold = new ArrayList<GoldBean>();
        in.readList(this.gold, GoldBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<PaiHangBean> CREATOR = new Parcelable.Creator<PaiHangBean>() {
        @Override
        public PaiHangBean createFromParcel(Parcel source) {
            return new PaiHangBean(source);
        }

        @Override
        public PaiHangBean[] newArray(int size) {
            return new PaiHangBean[size];
        }
    };
}
