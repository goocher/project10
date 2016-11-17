package com.gooch.showtogether;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */
public class GiftGridViewAdapter extends BaseAdapter {
    private Context mContext=null;
    private List<Gift>mGiftList=null;

    public GiftGridViewAdapter(Context context) {
        mContext = context;
        mGiftList=new ArrayList<>();
    }

    public void setGiftList(List<Gift> giftList) {
        mGiftList = giftList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mGiftList!=null?mGiftList.size():0;
    }

    @Override
    public Object getItem(int position) {
        return mGiftList.get(position);
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
            ret= LayoutInflater.from(mContext).inflate(R.layout.giftlist_item_live,parent,false);
            myViewHolder.mImageView= (ImageView) ret.findViewById(R.id.imageView_gift_live);
            myViewHolder.name= (TextView) ret.findViewById(R.id.textView_name_gift_live);
            myViewHolder.value= (TextView) ret.findViewById(R.id.textView_value_gift_live);
            ret.setTag(myViewHolder);
        }else {
            ret=convertView;
            myViewHolder= (MyViewHolder) ret.getTag();
        }
        myViewHolder.mImageView.setImageBitmap(mGiftList.get(position).getBitmap());
        myViewHolder.name.setText(mGiftList.get(position).getName());
        myViewHolder.value.setText(mGiftList.get(position).getValue());
        return ret;
    }
    static class MyViewHolder{
        private ImageView mImageView;
        private TextView name,value;
    }
}
