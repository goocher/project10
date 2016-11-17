package fragment.zhibo.adatper.guanzhuadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import java.util.List;

import fragment.zhibo.bean.GuanZhuBean;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * Created by WH on 2016/11/6.
 */
public class GuanZhuGridViewAdapter extends BaseAdapter implements View.OnClickListener {

    private Context context;
    private List<GuanZhuBean.InfoBean.LivelistBean> mList;

    public GuanZhuGridViewAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<GuanZhuBean.InfoBean.LivelistBean> list) {
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

    private boolean isSelected = true;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder holder = null;
        if (convertView != null) {
            holder = (MyViewHolder) convertView.getTag();
        } else {
            holder = new MyViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.gridview_guanzhu_item, parent, false);
            holder.icon = (ImageView) convertView.findViewById(R.id.gridView_guanzhu_icon);
            holder.name = (TextView) convertView.findViewById(R.id.gridView_guanzhu_name);

            holder.selector = (ImageView) convertView.findViewById(R.id.gridView_guanzhu_selector);
            holder.selector.setSelected(true);
            holder.selector.setOnClickListener(this);

            holder.icon.setOnClickListener(this);
            holder.icon.setTag(holder.selector);
            convertView.setTag(holder);
        }

        holder.name.setText(mList.get(position).getUser().getNickname());
        LoadUtils.loadImage(context,
                holder.icon, mList.get(position).getCover(),
                R.mipmap.add_album_cover,
                R.mipmap.add_album_cover,
                new CircleTransform());

        return convertView;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.gridView_guanzhu_selector) {
            v.setSelected(isSelected);
            isSelected = !isSelected;
        } else {
            ImageView imageView = (ImageView) v.getTag();
            imageView.setSelected(true);
        }
    }

    static class MyViewHolder {
        ImageView icon, selector;
        TextView name;
    }
}
