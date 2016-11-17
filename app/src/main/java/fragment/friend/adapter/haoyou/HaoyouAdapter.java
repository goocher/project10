package fragment.friend.adapter.haoyou;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import fragment.friend.bean.HaoyouBean;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class HaoyouAdapter extends RecyclerView.Adapter<HaoyouAdapter.MyViewHolder> {
    private Context mContext=null;
    private HaoyouBean mHaoyouBean=null;
    public HaoyouAdapter(Context context) {
        mContext = context;

    }
    private OnRecyclerItemClickListener mOnRecyclerItemClickListener=null;

    public void setOnRecyclerItemClickListener(OnRecyclerItemClickListener onRecyclerItemClickListener) {
        mOnRecyclerItemClickListener = onRecyclerItemClickListener;
    }

    public void setHaoyouBean(HaoyouBean haoyouBean) {
        mHaoyouBean = haoyouBean;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.haoyou_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nickName.setText(mHaoyouBean.getList().get(position).getNickname());
        holder.age.setText(mHaoyouBean.getList().get(position).getAge()+"");
        holder.star.setText(mHaoyouBean.getList().get(position).getGrade().getLv()+"");
        LoadUtils.loadImage(mContext,holder.icon,mHaoyouBean.getList().get(position).getAvatar(),
                R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
//        LoadUtils.loadImage(mContext,holder.icon,mHaoyouBean.getList().get(position).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return mHaoyouBean!=null?mHaoyouBean.getList().size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView icon;
        private ImageView genderIcon;
        private TextView nickName;
        private TextView star;
        private TextView age;

        public MyViewHolder(View itemView) {
            super(itemView);
            icon= (ImageView) itemView.findViewById(R.id.icon_haoyou);
            genderIcon= (ImageView) itemView.findViewById(R.id.gender_haoyou);
            nickName= (TextView) itemView.findViewById(R.id.nickName_haoyou);
            star= (TextView) itemView.findViewById(R.id.star_haoyou);
            age= (TextView) itemView.findViewById(R.id.age_haoyou);
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
        void onClick(View view, MyViewHolder myViewHolder, int position);
    }
}
