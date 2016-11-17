package fragment.zhibo.adatper.XinRenadapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import fragment.zhibo.bean.XinrenInfo;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/6.
 */
public class XinrenAdapter extends RecyclerView.Adapter<XinrenAdapter.MyViewHolder> {

    private Context context;
    private List<XinrenInfo.InfoBean.LivelistBean> list = null;
    private View headView, footView;
    private boolean isAddHead = false;
    private boolean isAddFoot = false;
    public static final int TYPT_HEADER = 0, TYPR_ITEM = 1, TYPE_FOOT = 2;
    private int headViewSize = 0;
    private int footViewSize = 0;
    private OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener;

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        mOnRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    public XinrenAdapter(Context context) {

        this.context = context;
        list = new ArrayList<>();
    }

    public void addFootView(View view) {
        footView = view;
        footViewSize = 1;
        isAddHead = true;

    }

    @Override
    public int getItemViewType(int position) {
        int type = TYPR_ITEM;
        if (headViewSize == 1 && position == 0) {
            return TYPT_HEADER;
        }
        return type;
    }

    public void setList(List<XinrenInfo.InfoBean.LivelistBean> list) {
        this.list = list;
        notifyDataSetChanged();

    }

    public void addHeadView(View view) {

        headView = view;
        headViewSize = 1;
        isAddHead = true;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPT_HEADER:

                view = headView;
                // 获取cardview的布局属性，记住这里要是布局的最外层的控件的布局属性，如果是里层的会报cast错误

                StaggeredGridLayoutManager.LayoutParams clp = (StaggeredGridLayoutManager.LayoutParams) headView.getLayoutParams();
                // 最最关键一步，设置当前view占满列数，这样就可以占据两列实现头部了
                if (clp != null)
                    clp.setFullSpan(true);
//                ((RecyclerView)(holder.itemView.getParent())).setLayoutManager(new LinearLayoutManager(context));
                break;
            case TYPR_ITEM:
                view = LayoutInflater.from(context).inflate(R.layout.xinren_view, parent, false);
                break;
            case TYPE_FOOT:
//                  view=footView;
                break;
        }
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //设置数据
        switch (getItemViewType(position)) {
            case TYPR_ITEM:
                position -= headViewSize;
                holder.position.setText(list.get(position).getUsers() + "");
                holder.userName.setText(list.get(position).getUser().getNickname() + "");

                LoadUtils.loadImage(context,
                        holder.icon,
                        list.get(position).getCover(),
                        R.mipmap.add_album_cover,
                        R.mipmap.add_album_cover);
                break;
            case TYPT_HEADER:
                // 获取cardview的布局属性，记住这里要是布局的最外层的控件的布局属性，如果是里层的会报cast错误

                StaggeredGridLayoutManager.LayoutParams clp = (StaggeredGridLayoutManager.LayoutParams) holder.itemView.getLayoutParams();
                // 最最关键一步，设置当前view占满列数，这样就可以占据两列实现头部了
                if (clp != null)
                    clp.setFullSpan(true);
//                ((RecyclerView)(holder.itemView.getParent())).setLayoutManager(new LinearLayoutManager(context));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size() + headViewSize;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView position, userName;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            position = (TextView) itemView.findViewById(R.id.xinren_position);
            userName = (TextView) itemView.findViewById(R.id.xinren_userName);
            icon = (ImageView) itemView.findViewById(R.id.xinren_icon);

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
        void onClick(View view, MyViewHolder myViewHolder, int position);
    }
}
