package com.gooch.showtogether.bangdan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import fragment.friend.bean.PaiHangBean;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class BangdanAdapter2 extends BaseAdapter {

    private List<PaiHangBean.GoldBean> mGoldBeen=null;
    private Context mContext=null;

    public BangdanAdapter2(Context context) {
        mContext = context;
        mGoldBeen=new ArrayList<>();
    }

    public void setGoldBeen(List<PaiHangBean.GoldBean> goldBeen) {
        mGoldBeen = goldBeen;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mGoldBeen!=null?mGoldBeen.size()-3:0;
    }

    @Override
    public Object getItem(int position) {
        return mGoldBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ret=null;
        MyViewHolder myViewHolder=null;

        if (convertView == null) {
            myViewHolder=new MyViewHolder();
            ret= LayoutInflater.from(mContext).inflate(R.layout.item_bangdan,parent,false);
            myViewHolder.icon= (ImageView) ret.findViewById(R.id.icon_nearbyPerson);
            myViewHolder.genderIcon= (ImageView) ret.findViewById(R.id.gender_nearbyPerson);
            myViewHolder. nickName= (TextView) ret.findViewById(R.id.nickName_nearbyPerson);
            myViewHolder.age= (TextView) ret.findViewById(R.id.age_nearbyperson);
            myViewHolder.star= (TextView) ret.findViewById(R.id.star_nearbyPerson);
            myViewHolder.Vip= (TextView) ret.findViewById(R.id.vip_nearbyperson);
            myViewHolder.count= (TextView) ret.findViewById(R.id.count);
            myViewHolder.value= (TextView) ret.findViewById(R.id.value);
            ret.setTag(myViewHolder);
        }else {
            ret=convertView;
            myViewHolder= (MyViewHolder) ret.getTag();
        }
        position+=3;
        PaiHangBean.GoldBean goldBean = mGoldBeen.get(position);
        LoadUtils.loadImage(mContext,myViewHolder.icon,goldBean.getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        myViewHolder.value.setText(goldBean.getValue()+"");
        myViewHolder.count.setText(position+1+"");
        myViewHolder.age.setText(goldBean.getAge()+"");
        myViewHolder.nickName.setText(goldBean.getNickname());
        myViewHolder.star.setText(goldBean.getGrade().getLv()+"");
        if (!goldBean.getIco().isVip()) {
            myViewHolder.Vip.setVisibility(View.INVISIBLE);
        }
        return ret;
    }
    static class MyViewHolder{
        private ImageView icon;
        private TextView nickName;
        private ImageView genderIcon;
        private TextView age;
        private TextView star;
        private TextView Vip;
        private TextView count;
        private TextView value;
    }

}
