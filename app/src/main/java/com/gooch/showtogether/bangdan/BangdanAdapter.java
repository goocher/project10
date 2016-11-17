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
public class BangdanAdapter extends BaseAdapter {
    private List<PaiHangBean.CreditsBean>mCreditsBeen=null;
    private Context mContext=null;

    public BangdanAdapter(Context context) {
        mContext = context;
        mCreditsBeen=new ArrayList<>();
    }

    public void setCreditsBeen(List<PaiHangBean.CreditsBean> creditsBeen) {
        mCreditsBeen = creditsBeen;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mCreditsBeen.size()-3;
    }

    @Override
    public Object getItem(int position) {
        return mCreditsBeen.get(position);
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
        PaiHangBean.CreditsBean creditsBean = mCreditsBeen.get(position);
        LoadUtils.loadImage(mContext,myViewHolder.icon,creditsBean.getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        myViewHolder.value.setText(creditsBean.getValue()+"");
        myViewHolder.count.setText(position+1+"");
        myViewHolder.age.setText(creditsBean.getAge()+"");
        myViewHolder.nickName.setText(creditsBean.getNickname());
        if (!creditsBean.getIco().isVip()) {
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
