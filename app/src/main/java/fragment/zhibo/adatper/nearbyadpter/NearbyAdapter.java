package fragment.zhibo.adatper.nearbyadpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import java.util.List;

import fragment.zhibo.bean.NearByInfo;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/5.
 */
public class NearbyAdapter extends RecyclerView.Adapter<NearbyAdapter.MyViewHolder> {

    private Context context = null;
    private List<NearByInfo.InfoBean.LivelistBean> nearByInfo = null;
    private OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener;

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        mOnRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    public NearbyAdapter(Context context) {
        this.context = context;
//        nearByInfo=new NearByInfo();
    }

//    public void setNearByInfo(NearByInfo nearByInfo) {
//        this.nearByInfo = nearByInfo;
//        LogUtils.e("falg","--------------->nearbyInfo"+nearByInfo);
//        notifyDataSetChanged();
//    }

    public void setNearByInfo(List<NearByInfo.InfoBean.LivelistBean> nearByInfo) {
        this.nearByInfo = nearByInfo;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //类似于convertView=null时
        View view = LayoutInflater.from(context).inflate(R.layout.nearby_view, parent, false);

        //view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //设置数据
        holder.position1.setText(nearByInfo.get(position).getDistance() + "");
        holder.userName1.setText(nearByInfo.get(position).getUser().getNickname() + "");

//        Picasso.with(context).load(nearByInfo.get(position).getCover()).into(holder.icon1);

        LoadUtils.loadImage(context,
                holder.icon1,
                nearByInfo.get(position).getCover(),
                R.mipmap.add_album_cover,
                R.mipmap.add_album_cover);
    }

    @Override
    public int getItemCount() {

        return nearByInfo != null ? nearByInfo.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView position1, userName1;
        ImageView icon1;

        public MyViewHolder(final View itemView) {
            super(itemView);
            position1 = (TextView) itemView.findViewById(R.id.nearby_position1);
            userName1 = (TextView) itemView.findViewById(R.id.nearby_userName);
            icon1 = (ImageView) itemView.findViewById(R.id.nearby_icon1);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mOnRecyclerViewItemClickListener != null) {
                mOnRecyclerViewItemClickListener.onClick(v, this, getAdapterPosition());
            }
        }
    }

    public interface OnRecyclerViewItemClickListener {
        void onClick(View view, MyViewHolder holder, int position);
    }
}
