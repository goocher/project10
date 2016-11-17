package fragment.friend.adapter.pengyouquan.adapter;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import fragment.friend.adapter.pengyouquan.bean.UserInfo;
import utils.LoadUtils;

public class MyGridAdapter extends BaseAdapter {
	private List<UserInfo.ListBean.ImagelistBean> mList;
	private  Context mContext=null;
	private LayoutInflater mLayoutInflater;

	public MyGridAdapter(List<UserInfo.ListBean.ImagelistBean> ui, Context context) {
		mLayoutInflater = LayoutInflater.from(context);
		mContext=context;
	    mList=ui;
	}

	@Override
	public int getCount() {
		return mList == null ? 0 : mList.size();
	}

	@Override
	public String getItem(int position) {
		return mList.get(position).getImage();
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		MyGridViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new MyGridViewHolder();

			convertView = mLayoutInflater.inflate(R.layout.user_img_item,
					parent, false);
			viewHolder.imageView = (ImageView) convertView
					.findViewById(R.id.iv_user_img);

			convertView.setTag(viewHolder);
		} else {
			viewHolder = (MyGridViewHolder) convertView.getTag();
		}
		String url = getItem(position);
//		ImageLoader.getInstance().displayImage(url, viewHolder.imageView,R.mipmap.default_img,R.mipmap.default_img);
		LoadUtils.loadImage(mContext,viewHolder.imageView,url,R.mipmap.add_album_cover,R.mipmap.add_album_cover);
		return convertView;
	}

	private static class MyGridViewHolder {
		ImageView imageView;


	}
}
