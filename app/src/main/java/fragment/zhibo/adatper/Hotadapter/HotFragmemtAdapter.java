package fragment.zhibo.adatper.Hotadapter;

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

import fragment.zhibo.bean.HotBean;
import utils.CircleTransform;
import utils.LoadUtils;
import utils.LogUtils;


/**
 * Created by Administrator on 2016/11/5.
 */
public class HotFragmemtAdapter extends RecyclerView.Adapter<HotFragmemtAdapter.HotViewHolder> {
    private static final int TYPE_HEADER = 0, TYPE_ITEM = 1;
    private Context mContext = null;
    private List<HotBean.InfoBean.LivelistBean> mLivelistBeen = null;
    private OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener = null;
    private int headViewSize = 0;
    private View headView;
    private boolean isAddHead = false;
    private HotViewHolder mHotViewHolder;

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        mOnRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        int type = TYPE_ITEM;
        if (headViewSize == 1 && position == 0) {
            type = TYPE_HEADER;
        }
        return type;
    }

    public HotFragmemtAdapter(Context context) {
        mContext = context;
        mLivelistBeen = new ArrayList<>();
    }

    public void setHotBeanList(List<HotBean.InfoBean.LivelistBean> livelistBeen) {
        mLivelistBeen.addAll(livelistBeen);
        notifyDataSetChanged();
    }

    public void addHeadView(View view) {
        headView = view;
        headViewSize = 1;
        isAddHead = true;
    }

    @Override
    public HotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPE_HEADER:
                view = headView;
                break;

            case TYPE_ITEM:
                view = LayoutInflater.from(mContext).inflate(R.layout.caiyiitem, parent, false);
                break;

        }

        mHotViewHolder = new HotViewHolder(view);

        return mHotViewHolder;
    }

    @Override
    public void onBindViewHolder(HotViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_ITEM:

                holder.cover.setMaxHeight(300);
                LogUtils.i("flag", mLivelistBeen.get(position).getCover());
                LoadUtils.loadImage(mContext,
                        holder.cover,
                        mLivelistBeen.get(position).getCover(),
                        R.mipmap.add_album_cover,
                        R.mipmap.add_album_cover);
                LogUtils.i("flag", mLivelistBeen.get(position).getUser().getAvatar());

                LoadUtils.loadImage(mContext,
                        holder.icon,
                        mLivelistBeen.get(position).getUser().getAvatar(),
                        R.mipmap.add_album_cover,
                        R.mipmap.add_album_cover,
                        new CircleTransform());
                holder.nickName.setText(mLivelistBeen.get(position).getUser().getNickname());
                holder.city.setText(mLivelistBeen.get(position).getUser().getCity());
                holder.personCount.setText(mLivelistBeen.get(position).getUsers() + "");
                break;
        }

    }


    @Override
    public int getItemCount() {
//        LogUtils.i("flag",mCaiYiBean.getInfo().toString());
        return mLivelistBeen != null ? mLivelistBeen.size() + headViewSize : 0;
    }

    public class HotViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView nickName;
        private TextView city;
        private TextView personCount;
        private ImageView icon;
        private ImageView cover;

        public HotViewHolder(View itemView) {
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
        void onClick(View view, HotViewHolder hotViewHolder, int position);
    }
}
