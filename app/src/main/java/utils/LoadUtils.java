package utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.ChongZhiActivity;
import com.gooch.showtogether.PersonActivity;
import com.gooch.showtogether.PictureActivity;
import com.gooch.showtogether.bangdan.BangdanActivity;
import com.gooch.showtogether.R;
import com.gooch.showtogether.SearchActivity;
import com.gooch.showtogether.WebActivity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import fragment.friend.bean.PaiHangBean;

/**
 * Created by Administrator on 2016/11/6.
 */
public class LoadUtils {



    public static void loadImage(Context context, ImageView imageView, String url, int placeHolder, int errorImage) {
        Picasso.with(context)
                .load(url)
                .placeholder(placeHolder)
                .error(errorImage)
//                .resize(400, 400)
//                .centerCrop()
                .into(imageView);
    }

    public static void loadImage(Context context, ImageView imageView, String url) {
        Picasso.with(context)
                .load(url)
                .resize(400, 400)
                .centerCrop()
                .into(imageView);
    }

    public static void loadImage(Context context, ImageView imageView, String url, int placeHolder, int errorImage, Transformation transformation) {
        Picasso.with(context)
                .load(url)
                .placeholder(placeHolder)
                .error(errorImage)
                .transform(transformation)
                .into(imageView);
    }

    public static void initFlowToTop(ImageView flowToTop, final RecyclerView recyclerView, final TextView bottomText) {


        flowToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               mRecyclerView.scrollToPosition(0);
                recyclerView.smoothScrollToPosition(0);
            }
        });
    }

    public static void initRecyclerViewDecoratinon(RecyclerView recyclerView, final int spaceTop, final int spaceBottom) {
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                if (parent.getChildLayoutPosition(view) != 0) {
                    outRect.top = spaceTop;
                    outRect.bottom = spaceBottom;
                }
            }

        });
    }

    public static void initRVDecoratinonHasHeader(RecyclerView recyclerView, final int spaceTop, final int spaceBottom) {
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                if (parent.getChildLayoutPosition(view) > 1) {
                    outRect.top = spaceTop;
                    outRect.bottom = spaceBottom;
                }

            }

        });
    }

    public static boolean isBottom(RecyclerView recyclerView, TextView bottomText) {
        if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()
                >= recyclerView.computeVerticalScrollRange()) {
            bottomText.setVisibility(View.VISIBLE);
            return true;
        } else {
            bottomText.setVisibility(View.INVISIBLE);
        }
        return false;
    }

    public static void competeRefresh(SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public static void toWebActivity(Context context, Activity activity, String htmlUrl) {
        Intent intent = new Intent();
        intent.putExtra("parameters", htmlUrl.substring(5));
        intent.setClass(context, WebActivity.class);
        context.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }

    public static void toSearchActivity(Context context, Activity activity) {
        Intent intent = new Intent(context, SearchActivity.class);
        context.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
    public static void toBangdanActivity(Context context, Activity activity, int type, PaiHangBean paiHangBean){
        Intent intent=new Intent(context, BangdanActivity.class);
        intent.putExtra("type",type);
        Bundle bundle=new Bundle();
        bundle.putParcelable("paihangbean",paiHangBean);
        intent.putExtras(bundle);
        context.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
    public static void toPersonActivity(Context context, Activity activity, Parcelable parcelable){
        Intent intent=new Intent(context, PersonActivity.class);

        Bundle bundle=new Bundle();
        bundle.putParcelable("parcelable",parcelable);
        intent.putExtras(bundle);
        context.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
    public static void toChongZhiActivity(Context context, Activity activity){
        Intent intent=new Intent(context, ChongZhiActivity.class);

        Bundle bundle=new Bundle();
//        bundle.putParcelable("parcelable",parcelable);
//        intent.putExtras(bundle);
        context.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
    public static  void toPictureActivity(Context context,String s){
        Intent intent=new Intent(context, PictureActivity.class);

        Bundle bundle=new Bundle();
        bundle.putString("imgUrl",s);
        intent.putExtras(bundle);
        context.startActivity(intent);
//        .overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
}
