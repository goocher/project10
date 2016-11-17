package fragment.zhibo.adatper.guanzhuadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import fragment.zhibo.bean.GuanZhuBean;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by WH on 2016/11/6.
 */
public class GuanZhuAdapter extends RecyclerView.Adapter<GuanZhuAdapter.MyViewHolder> {

    private Context context;
    private GuanZhuBean mGuanZhuBean;
    public static final int NORMAL_TYPE = 0;
    public static final int RECOMMEND_TYPE = 1;

    public GuanZhuAdapter(Context context) {
        this.context = context;
    }

    public void setGuanZhuBean(GuanZhuBean guanZhuBean) {
        mGuanZhuBean = guanZhuBean;

        notifyDataSetChanged();

    }

    @Override
    public int getItemViewType(int position) {

        return mGuanZhuBean.getInfo().getTemplate().equals("NORMAL") ? NORMAL_TYPE : RECOMMEND_TYPE;
//        return 1;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;
        MyViewHolder holder = null;
        switch (viewType) {
            case NORMAL_TYPE:
                view = LayoutInflater.from(context).inflate(R.layout.recycler_guanzhu_item0, parent, false);
                view.setTag(viewType);
                holder = new MyViewHolder(view);
                break;
            case RECOMMEND_TYPE:
                view = LayoutInflater.from(context).inflate(R.layout.recycler_guanzhu_item1, parent, false);
                view.setTag(viewType);
                holder = new MyViewHolder(view);
                break;
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        int type = getItemViewType(position);
        switch (type) {
            case NORMAL_TYPE:
                holder.name0.setText(mGuanZhuBean.getInfo().getLivelist().get(position).getUser().getNickname());
                holder.city0.setText(mGuanZhuBean.getInfo().getLivelist().get(position).getUser().getProvince());
                holder.count0.setText(mGuanZhuBean.getInfo().getLivelist().get(position).getUsers() + "");

                LoadUtils.loadImage(context,
                        holder.icon0,
                        mGuanZhuBean.getInfo().getLivelist().get(position).getUser().getAvatar(),
                        R.mipmap.add_album_cover,
                        R.mipmap.add_album_cover,
                        new CircleTransform());
                LoadUtils.loadImage(context,
                        holder.cover0,
                        mGuanZhuBean.getInfo().getLivelist().get(position).getCover(),
                        R.mipmap.add_album_cover,
                        R.mipmap.add_album_cover);

                break;
            case RECOMMEND_TYPE:

                GuanZhuGridViewAdapter guanZhuGridViewAdapter = new GuanZhuGridViewAdapter(context);
                holder.mGridView.setAdapter(guanZhuGridViewAdapter);
                guanZhuGridViewAdapter.setList(mGuanZhuBean.getInfo().getLivelist());
                break;
        }
    }

    @Override
    public int getItemCount() {

        if (mGuanZhuBean != null && mGuanZhuBean.getInfo() != null) {

            if (mGuanZhuBean.getInfo().getTemplate().equals("RECOMMEND")) {
                return 1;
            }
            return mGuanZhuBean.getInfo().getLivelist().size();
        }
        return 0;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name0, city0, count0;
        ImageView icon0, cover0;
        GridView mGridView;



        public MyViewHolder(View itemView) {
            super(itemView);
            int type = (int) itemView.getTag();
            switch (type) {
                case NORMAL_TYPE:
                    name0 = (TextView) itemView.findViewById(R.id.nickName_guanzhu_item);
                    city0 = (TextView) itemView.findViewById(R.id.city_guanzhu_item);
                    count0 = (TextView) itemView.findViewById(R.id.personCount_guanzhu);
                    icon0 = (ImageView) itemView.findViewById(R.id.icon_guanzhu_item);
                    cover0 = (ImageView) itemView.findViewById(R.id.cover_guanzhu_item);
                    break;
                case RECOMMEND_TYPE:

                    mGridView = (GridView) itemView.findViewById(R.id.recyclerItem_guanzhu_gridview);
                    break;
            }
        }
    }
}
