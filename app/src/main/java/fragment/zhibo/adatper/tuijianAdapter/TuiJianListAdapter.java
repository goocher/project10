package fragment.zhibo.adatper.tuijianAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.gooch.showtogether.ToPlayActivity;

import java.util.List;

import fragment.zhibo.bean.TuiJian;
import utils.LoadUtils;
import utils.ToPlay;

/**
 * Created by WH on 2016/11/5.
 */
public class TuiJianListAdapter extends RecyclerView.Adapter<TuiJianListAdapter.MyViewHolder>
        implements View.OnClickListener, ToPlay {
    private static final int TYPE_HEADER = 0;
    private TuiJian mTuiJian;
    private Context context;
    private boolean flag = false;
    private int headViewSize = 0;
    private View headView;
    private boolean isAddHead = false;

    public TuiJianListAdapter(Context context) {
        this.context = context;
    }

    public void setTuiJian(TuiJian tuiJian) {
        mTuiJian = tuiJian;
        notifyDataSetChanged();
    }

    public void addHeadView(View view) {
        headView = view;
        headViewSize = 1;
        isAddHead = true;
    }

    @Override
    public int getItemViewType(int position) {
        if (headViewSize == 1 && position == 0) {
            return TYPE_HEADER;
        }
        return mTuiJian.getList().get(position - 1).getId();
    }

    @Override
    public TuiJianListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;
        MyViewHolder holder = null;
        switch (viewType) {
            case TYPE_HEADER:
                view = headView;
                break;
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.listitem0_tuijian_gridview, parent, false);
                break;
            case 2:
                view = LayoutInflater.from(context).inflate(R.layout.listitem1_tuijian_gridview, parent, false);

                break;
            case 3:
                view = LayoutInflater.from(context).inflate(R.layout.listitem2_tuijian_gridview, parent, false);
                break;

        }
        view.setTag(viewType);
        holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(TuiJianListAdapter.MyViewHolder holder, int position) {

        int type = getItemViewType(position);
        position -= 1;
        switch (type) {
            case 1:

                holder.name0.setText(mTuiJian.getList().get(position).getLivelist().get(0).getUser().getNickname());
                holder.name1.setText(mTuiJian.getList().get(position).getLivelist().get(1).getUser().getNickname());
                holder.name2.setText(mTuiJian.getList().get(position).getLivelist().get(2).getUser().getNickname());

                holder.user0.setText(mTuiJian.getList().get(position).getLivelist().get(0).getUsers() + "");
                holder.user1.setText(mTuiJian.getList().get(position).getLivelist().get(1).getUsers() + "");
                holder.user2.setText(mTuiJian.getList().get(position).getLivelist().get(2).getUsers() + "");

                LoadUtils.loadImage(context, holder.icon0, mTuiJian.getList().get(position).getLivelist().get(0).getCover(), R.mipmap.add_album_cover, R.mipmap.add_album_cover);
                LoadUtils.loadImage(context, holder.icon1, mTuiJian.getList().get(position).getLivelist().get(1).getCover(), R.mipmap.add_album_cover, R.mipmap.add_album_cover);
                LoadUtils.loadImage(context, holder.icon2, mTuiJian.getList().get(position).getLivelist().get(2).getCover(), R.mipmap.add_album_cover, R.mipmap.add_album_cover);

                holder.icon0.setOnClickListener(this);
                holder.icon0.setTag(mTuiJian.getList().get(position).getLivelist().get(0));
                holder.icon1.setOnClickListener(this);
                holder.icon1.setTag(mTuiJian.getList().get(position).getLivelist().get(1));
                holder.icon2.setOnClickListener(this);
                holder.icon2.setTag(mTuiJian.getList().get(position).getLivelist().get(2));


                break;
            case 2:
                flag = true;
                TuiJianGridAdapter tuiJianGridAdapter1 = new TuiJianGridAdapter(context, flag);
                holder.mGridView1.setAdapter(tuiJianGridAdapter1);
                List<TuiJian.ListBean.LivelistBean> livelist1 = mTuiJian.getList().get(position).getLivelist();
                tuiJianGridAdapter1.setList(livelist1);

                break;
            case 3:
                flag = false;
                TuiJianGridAdapter tuiJianGridAdapter2 = new TuiJianGridAdapter(context, flag);
                holder.mGridView2.setAdapter(tuiJianGridAdapter2);
                List<TuiJian.ListBean.LivelistBean> livelist2 = mTuiJian.getList().get(position).getLivelist();
                tuiJianGridAdapter2.setList(livelist2);

                break;
            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return mTuiJian != null &&
                mTuiJian.getList() != null ? mTuiJian.getList().size() + headViewSize : 0;
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


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name0, name1, name2, user0, user1, user2;
        ImageView icon0, icon1, icon2;
        GridView mGridView1;
        GridView mGridView2;


        public MyViewHolder(View itemView) {
            super(itemView);
            int type = (int) itemView.getTag();
            switch (type) {
                case 1:

                    this.name0 = (TextView) itemView.findViewById(R.id.tuijian_item0_name0);
                    this.name1 = (TextView) itemView.findViewById(R.id.tuijian_item0_name1);
                    this.name2 = (TextView) itemView.findViewById(R.id.tuijian_item0_name2);

                    this.user0 = (TextView) itemView.findViewById(R.id.tuijian_item0_user0);
                    this.user1 = (TextView) itemView.findViewById(R.id.tuijian_item0_user1);
                    this.user2 = (TextView) itemView.findViewById(R.id.tuijian_item0_user2);

                    this.icon0 = (ImageView) itemView.findViewById(R.id.tuijian_item0_icon0);
                    this.icon1 = (ImageView) itemView.findViewById(R.id.tuijian_item0_icon1);
                    this.icon2 = (ImageView) itemView.findViewById(R.id.tuijian_item0_icon2);

                    break;
                case 2:
                    this.mGridView1 = (GridView) itemView.findViewById(R.id.tuijian_item1);

                    break;
                case 3:
                    this.mGridView2 = (GridView) itemView.findViewById(R.id.tuijian_item2);
                    break;
                default:
                    break;
            }

        }


    }


}
