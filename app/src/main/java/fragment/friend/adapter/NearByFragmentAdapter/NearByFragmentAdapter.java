package fragment.friend.adapter.NearByFragmentAdapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;
import java.util.List;

import fragment.friend.bean.NearByBean;
import fragment.zhibo.adatper.nearbyadpter.NearbyAdapter;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/7.
 */
public class NearByFragmentAdapter extends RecyclerView.Adapter<NearByFragmentAdapter.NearByViewHolder> {
    private Context mContext=null;
    private List<NearByBean.ListBean>mNearByBeanList=null;

    public NearByFragmentAdapter(Context context) {
        mContext = context;
        mNearByBeanList=new ArrayList<>();
    }

    public void setNearByBeanList(List<NearByBean.ListBean> nearByBeanList) {
        mNearByBeanList = nearByBeanList;
        notifyDataSetChanged();
    }

    @Override
    public NearByViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.nearbyperson_item,parent,false);
        NearByViewHolder nearByViewHolder=new NearByViewHolder(view);
        return nearByViewHolder;
    }

    @Override
    public void onBindViewHolder(NearByViewHolder holder, int position) {
        holder.nickName.setText(mNearByBeanList.get(position).getNickname());
        holder.age.setText(mNearByBeanList.get(position).getAge()+"");
        holder.star.setText(mNearByBeanList.get(position).getGrade().getLv()+"");
        LoadUtils.loadImage(mContext, holder.icon, mNearByBeanList.get(position).getAvatar()
                , R.mipmap.ic_launcher, R.mipmap.ic_launcher, new CircleTransform());
    }

    @Override
    public int getItemCount() {

        return mNearByBeanList!=null?mNearByBeanList.size():0;
    }
    private OnRecyclerItemClickListener mOnRecyclerItemClickListener=null;

    public void setOnRecyclerItemClickListener(OnRecyclerItemClickListener onRecyclerItemClickListener) {
        mOnRecyclerItemClickListener = onRecyclerItemClickListener;
    }

    public class NearByViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView icon;
        private TextView nickName;
        private ImageView genderIcon;
        private TextView age;
        private TextView star;
        private TextView Vip;
        public NearByViewHolder(View itemView) {
            super(itemView);
            icon= (ImageView) itemView.findViewById(R.id.icon_nearbyPerson);
            genderIcon= (ImageView) itemView.findViewById(R.id.gender_nearbyPerson);
            nickName= (TextView) itemView.findViewById(R.id.nickName_nearbyPerson);
            age= (TextView) itemView.findViewById(R.id.age_nearbyperson);
            star= (TextView) itemView.findViewById(R.id.star_nearbyPerson);
            Vip= (TextView) itemView.findViewById(R.id.vip_nearbyperson);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mOnRecyclerItemClickListener!=null){
                mOnRecyclerItemClickListener.onClick(v,this,getAdapterPosition());
            }
        }
    }
    public interface OnRecyclerItemClickListener{
        void onClick(View view, NearByViewHolder myViewHolder, int position);
    }
}
