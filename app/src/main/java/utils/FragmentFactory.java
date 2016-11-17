package utils;

import android.support.v4.app.Fragment;

import com.gooch.showtogether.R;

import fragment.friend.FriendFragment;
import fragment.friend.fragment.HaoYouFragment;
import fragment.friend.fragment.NearByPersonFragment;
import fragment.friend.fragment.PaiHangBangFragment;
import fragment.message.MessageFragment;
import fragment.mine.MineFragment;
import fragment.zhibo.ZhiBoFragment;
import fragment.zhibo.fragment.CaiYiFragment;
import fragment.zhibo.fragment.GuanZhuFragment;
import fragment.zhibo.fragment.HotFragment;
import fragment.zhibo.fragment.NearByFragment;
import fragment.zhibo.fragment.TuiJianFragment;
import fragment.zhibo.fragment.XinRenFragment;


/**
 * Created by Administrator on 2016/10/17.
 */
public class FragmentFactory {
    public static Fragment createById(int resId){
        Fragment fragment=null;
        switch (resId){
            case R.id.radioButton_main:
                fragment=new ZhiBoFragment();
                break;
            case R.id.radioButton_friend:
                fragment=new FriendFragment();
                break;
//            case R.id.radioButton_play_default:
//                fragment=new PlayFragment();
//                break;
            case R.id.radioButton_message:
                fragment=new MessageFragment();
                break;
            case R.id.radioButton_mine:
                fragment=new MineFragment();
                break;
        }
        return fragment;
    }
    public static Fragment createZhiBoById(int layoutId){
        Fragment fragment=null;
        switch (layoutId){
            case R.layout.fragment_tui_jian:
                fragment=new TuiJianFragment();
                break;
            case R.layout.fragment_hot:
                fragment=new HotFragment();
                break;

            case R.layout.fragment_cai_yi:
                fragment=new CaiYiFragment();
                break;
            case R.layout.fragment_guan_zhu:
                fragment=new GuanZhuFragment();
                break;
            case R.layout.fragment_xin_ren:
                fragment=new XinRenFragment();
                break;
            case R.layout.fragment_near_by:
                fragment=new NearByFragment();
                break;
        }
        return fragment;
    }
//    public static Fragment createFriendById(int layoutId){
//        Fragment fragment=null;
//        switch (layoutId){
//            case R.layout.fragment_friends_frield:
//                fragment=new FriendFragment();
//                break;
//            case R.layout.fragment_hao_you:
//                fragment=new HaoYouFragment();
//                break;
//
//            case R.layout.fragment_pai_hang_bang:
//                fragment=new PaiHangBangFragment();
//                break;
//            case R.layout.fragment_near_by_person:
//                fragment=new NearByPersonFragment();
//                break;
//
//        }
//        return fragment;
//    }
}
