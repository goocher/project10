package com.gooch.showtogether;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fragment.friend.adapter.haoyou.HaoyouAdapter;

/**
 * Created by Administrator on 2016/11/10.
 */
public class LiveListAdapter extends RecyclerView.Adapter<LiveListAdapter.MyViewHolder> {
    private Context mContext=null;

    public LiveListAdapter(Context context) {
        mContext = context;
        mList=new ArrayList<>();
    }
private List<String>mList=null;

    public void setList(List<String> list) {
        mList = list;
        notifyDataSetChanged();
    }
    public void addList(String s) {
        mList.add(s);
        notifyItemRangeInserted(mList.size(),1);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.item_live_chat,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList!=null?mList.size():0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView,mTextView1;
       public MyViewHolder(View itemView) {
           super(itemView);
           mTextView= (TextView) itemView.findViewById(R.id.chat_live);
       }
   }
}
