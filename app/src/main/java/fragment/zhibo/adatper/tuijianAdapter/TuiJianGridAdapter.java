package fragment.zhibo.adatper.tuijianAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.gooch.showtogether.ToPlayActivity;

import java.util.ArrayList;
import java.util.List;

import fragment.zhibo.bean.TuiJian;
import utils.LoadUtils;
import utils.ToPlay;

/**
 * Created by WH on 2016/11/5.
 */
public class TuiJianGridAdapter extends BaseAdapter implements View.OnClickListener, ToPlay {

    private List<TuiJian.ListBean.LivelistBean> mList;
    private Context context;
    private boolean flag;

    public TuiJianGridAdapter(Context context, boolean flag) {
        this.context = context;
        this.flag = flag;
        mList = new ArrayList<>();
    }

    public void setList(List<TuiJian.ListBean.LivelistBean> list) {
        mList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mList != null ? mList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder holder = null;
        if (convertView != null) {
            holder = (MyViewHolder) convertView.getTag();
        } else {
            holder = new MyViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.tuijian_griditem, parent, false);
            holder.name = (TextView) convertView.findViewById(R.id.tuijian_griditem1_name);
            holder.user = (TextView) convertView.findViewById(R.id.tuijian_griditem1_user);
            holder.icon = (ImageView) convertView.findViewById(R.id.tuijian_griditem1_icon);
            if (!flag) {
                holder.name.setVisibility(View.INVISIBLE);
                holder.user.setVisibility(View.INVISIBLE);
            }
            convertView.setTag(holder);
        }

        holder.name.setText(mList.get(position).getUser().getNickname());
        holder.user.setText(mList.get(position).getUsers() + "");
        LoadUtils.loadImage(context, holder.icon, mList.get(position).getCover(), R.mipmap.add_album_cover, R.mipmap.add_album_cover);

        holder.icon.setTag(mList.get(position));
        holder.icon.setOnClickListener(this);

        return convertView;
    }

    @Override
    public void onClick(View v) {

        TuiJian.ListBean.LivelistBean listBean = (TuiJian.ListBean.LivelistBean) v.getTag();
        toPlay(listBean);
    }


    @Override
    public void toPlay(Object o) {
        TuiJian.ListBean.LivelistBean livelistBean = (TuiJian.ListBean.LivelistBean) o;
            Intent intent = new Intent(context, ToPlayActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("livelistBean", livelistBean);
            bundle.putInt("class", 0);
            intent.putExtra("bundle", bundle);
            context.startActivity(intent);
    }

    static class MyViewHolder {

        ImageView icon;
        TextView name, user;
    }
}
