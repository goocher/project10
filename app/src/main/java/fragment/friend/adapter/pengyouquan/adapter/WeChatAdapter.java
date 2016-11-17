package fragment.friend.adapter.pengyouquan.adapter;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gooch.showtogether.R;

import fragment.friend.adapter.pengyouquan.bean.UserInfo;
import fragment.friend.adapter.pengyouquan.widget.NoScrollGridView;
import utils.CircleTransform;
import utils.LoadUtils;


public class WeChatAdapter extends BaseAdapter {

	private UserInfo mUserInfo;
	private Context mContext;

	public WeChatAdapter(Context context) {
		this.mContext = context;
	}

	public void setData(UserInfo userInfo) {
		mUserInfo=userInfo;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return mUserInfo!=null?mUserInfo.getList().size():0;
	}

	@Override
	public UserInfo.ListBean getItem(int position) {
		return mUserInfo.getList().get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.friends_circle_item, parent, false);
			holder.gridView = (NoScrollGridView) convertView
					.findViewById(R.id.gridView);
			holder.address= (TextView) convertView.findViewById(R.id.address);
			holder.content= (TextView) convertView.findViewById(R.id.content);
			holder.dateLine= (TextView) convertView.findViewById(R.id.dateLine);
			holder.nickName= (TextView) convertView.findViewById(R.id.nickName_pengyouquan);
			holder.icon= (ImageView) convertView.findViewById(R.id.icon_pengyouquan);
			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		final UserInfo.ListBean listBean = getItem(position);

			holder.gridView.setVisibility(View.VISIBLE);
			holder.gridView.setAdapter(new MyGridAdapter(listBean.getImagelist(),
					mContext));
			holder.address.setText(listBean.getLocation());
			holder.content.setText(listBean.getText());
			holder.dateLine.setText(listBean.getDateline());
			holder.nickName.setText(listBean.getUser().getNickname());
		LoadUtils.loadImage(mContext,holder.icon,listBean.getUser().getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());

			holder.gridView
					.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> parent,
								View view, int position, long id) {
							// imageBrower(position,bean.urls);
						LoadUtils.toPictureActivity(mContext,listBean.getImagelist().get(position).getImage_original());
						}
					});

		return convertView;
	}

	public class ViewHolder {
		LinearLayout mContentimg;
		NoScrollGridView gridView;
		TextView content,nickName,address,dateLine;
		ImageView icon;
	}

}
