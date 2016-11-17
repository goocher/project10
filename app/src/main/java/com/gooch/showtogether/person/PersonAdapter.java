package com.gooch.showtogether.person;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.gooch.showtogether.R;

import fragment.friend.bean.PaiHangBean;
import utils.LoadUtils;

/**
 * Created by Administrator on 2016/11/8.
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

private Context mContext=null;
    private PersonBean mPersonBean=null;

    public void setPersonBean(PersonBean personBean) {
        mPersonBean = personBean;
        notifyDataSetChanged();
    }

    public PersonAdapter(Context context) {
        mContext = context;

    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView=new ImageView(mContext);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100);
        params.rightMargin=2;
        params.bottomMargin=2;
        params.topMargin=2;
        params.leftMargin=2;
        imageView.setLayoutParams(params);

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        PersonViewHolder personViewHolder=new PersonViewHolder(imageView);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        LoadUtils.loadImage(mContext,holder.mImageView,mPersonBean.getImage().get(position).getImage(),
                R.mipmap.add_album_cover,R.mipmap.add_album_cover);

    }

    @Override
    public int getItemCount() {
        return mPersonBean!=null?mPersonBean.getImage().size():0;
    }

    class PersonViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImageView;
        public PersonViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView;
        }
    }
}
