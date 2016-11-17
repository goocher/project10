package fragment.zhibo.adatper.caiyiadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import fragment.zhibo.bean.CaiYiBean;
import utils.CircleTransform;
import utils.LoadUtils;
import utils.LogUtils;


/**
 * Created by Administrator on 2016/11/5.
 */
public class CaiYiFragmentAdapter extends RecyclerView.Adapter<CaiYiFragmentAdapter.CaiYiViewHolder> {
    private Context mContext = null;
    private List<CaiYiBean.InfoBean.LivelistBean> mCaiYiBean = null;
    private OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener = null;

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        mOnRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    public CaiYiFragmentAdapter(Context context) {
        mContext = context;
        mCaiYiBean = new ArrayList<>();
    }

    public void setCaiYiBean(List<CaiYiBean.InfoBean.LivelistBean> livelistBeen) {
        mCaiYiBean.addAll(livelistBeen);
        notifyDataSetChanged();
    }

    @Override
    public CaiYiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.caiyiitem, parent, false);
        CaiYiViewHolder caiYiViewHolder = new CaiYiViewHolder(view);
        return caiYiViewHolder;
    }

    @Override
    public void onBindViewHolder(CaiYiViewHolder holder, int position) {
        LogUtils.i("flag", mCaiYiBean.get(position).getCover());
//        Picasso.with(mContext).load(mCaiYiBean.get(position).getCover())
//                .placeholder(R.mipmap.add_album_cover)
//                .error(R.mipmap.add_album_cover)
//                .into(holder.cover);
        LoadUtils.loadImage(mContext,
                holder.cover,
                mCaiYiBean.get(position).getCover(),
                R.mipmap.add_album_cover,
                R.mipmap.add_album_cover);
        LogUtils.i("flag", mCaiYiBean.get(position).getUser().getAvatar());
//        Picasso.with(mContext).load(mCaiYiBean.get(position).getUser().getAvatar())
//                .placeholder(R.mipmap.ic_launcher)
//                .error(mCaiYiBean.get(position).getUser().getAvatar())
//                .transform(new CircleTransform())
//                .into(holder.icon);
        LoadUtils.loadImage(mContext,
                holder.icon,
                mCaiYiBean.get(position).getUser().getAvatar(),
                R.mipmap.add_album_cover,
                R.mipmap.add_album_cover,
                new CircleTransform());

        holder.nickName.setText(mCaiYiBean.get(position).getUser().getNickname());
        holder.city.setText(mCaiYiBean.get(position).getUser().getCity());
        holder.personCount.setText(mCaiYiBean.get(position).getUsers() + "");

    }

//    @Override
//    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
//        super.onAttachedToRecyclerView(recyclerView);
//        if (recyclerView.getChildAt(5)&&){
//            flowToTop.setVisibility(View.VISIBLE);
//        }
//    }

    @Override
    public int getItemCount() {
//        LogUtils.i("flag",mCaiYiBean.getInfo().toString());
        return mCaiYiBean != null ? mCaiYiBean.size() : 0;
    }

    public class CaiYiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView nickName;
        private TextView city;
        private TextView personCount;
        private ImageView icon;
        private ImageView cover;

        public CaiYiViewHolder(View itemView) {
            super(itemView);
            nickName = (TextView) itemView.findViewById(R.id.nickName_caiyi_item);
            city = (TextView) itemView.findViewById(R.id.city_caiyi_item);
            personCount = (TextView) itemView.findViewById(R.id.personCount);
            icon = (ImageView) itemView.findViewById(R.id.icon_caiyi_item);
            cover = (ImageView) itemView.findViewById(R.id.cover_caiyi_item);
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
        void onClick(View view, CaiYiViewHolder caiYiViewHolder, int position);
    }
}
