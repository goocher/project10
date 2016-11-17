package com.gooch.showtogether.UserAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import fragment.friend.adapter.haoyou.HaoyouAdapter;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/9.
 */
public class UserAdaper extends RecyclerView.Adapter<UserAdaper.MyViewHolder> {
    private Context mContext=null;
    private List<String> mList=null;

    public UserAdaper(Context context) {
        mContext = context;
        mList=new ArrayList<>();
    }

    public void setList(List<String> list) {
        mList = list;
        notifyDataSetChanged();
    }
    public void addList(List<String> list) {
        mList.addAll(list);
        notifyDataSetChanged();
    }
    @Override
    public UserAdaper.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView=new ImageView(mContext);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(30, ViewGroup.LayoutParams.WRAP_CONTENT));
        MyViewHolder myViewHolder=new MyViewHolder(imageView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(UserAdaper.MyViewHolder holder, int position) {
        LoadUtils.loadImage(mContext, (ImageView) holder.itemView,mList.get(position),
                R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
    }

    @Override
    public int getItemCount() {
        return mList!=null?mList.size():0;
    }
private OnRecyvlerItemClickListener mOnRecyvlerItemClickListener=null;

    public void setOnRecyvlerItemClickListener(OnRecyvlerItemClickListener onRecyvlerItemClickListener) {
        mOnRecyvlerItemClickListener = onRecyvlerItemClickListener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView mImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView;
            mImageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnRecyvlerItemClickListener.onClick(v,this,getAdapterPosition());
        }
    }
    public interface OnRecyvlerItemClickListener{
        void onClick(View view,MyViewHolder myViewHolder,int position);
    }
}
