package fragment.friend.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;

import base.BaseFragment;
import fragment.friend.bean.PaiHangBean;
import retrofit2.Call;
import retrofit2.Response;
import url.AppConfig;
import utils.CircleTransform;
import utils.LoadUtils;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaiHangBangFragment extends BaseFragment implements View.OnClickListener {


    private PaiHangBean mPaiHangBean;
    private View mView;
    private TextView mMeiliBangTitle;
    private TextView mFuhaoBangTitle;

    public PaiHangBangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_pai_hang_bang, container, false);
        mMeiliBangTitle = (TextView) mView.findViewById(R.id.meilibang);
        mFuhaoBangTitle = (TextView) mView.findViewById(R.id.fuhaobang);
        init();
        return mView;
    }

    private void init() {
        initData();

    }

    private void initBangdan() {
        mFuhaoBangTitle.setOnClickListener(this);
        mMeiliBangTitle.setOnClickListener(this);
    }

    private void initData() {
        PaiHangBean.load(this);
    }

    private void initView(View view) {


        ImageView imageView1= (ImageView) view.findViewById(R.id.icon_bangdan1);
        ImageView imageView2= (ImageView) view.findViewById(R.id.icon_bangdan2);
        ImageView imageView3= (ImageView) view.findViewById(R.id.icon_bangdan3);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        TextView textView1= (TextView) view.findViewById(R.id.name_bangdan1);
        TextView textView2= (TextView) view.findViewById(R.id.name_bangdan2);
        TextView textView3= (TextView) view.findViewById(R.id.name_bangdan3);
        TextView textView1_1= (TextView) view.findViewById(R.id.count_bangdan1);
        TextView textView2_1= (TextView) view.findViewById(R.id.count_bangdan2);
        TextView textView3_1= (TextView) view.findViewById(R.id.count_bangdan3);
        ImageView imageView4= (ImageView) view.findViewById(R.id.icon2_bangdan1);
        ImageView imageView5= (ImageView) view.findViewById(R.id.icon2_bangdan2);
        ImageView imageView6= (ImageView) view.findViewById(R.id.icon2_bangdan3);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        TextView textView4= (TextView) view.findViewById(R.id.name2_bangdan1);
        TextView textView5= (TextView) view.findViewById(R.id.name2_bangdan2);
        TextView textView6= (TextView) view.findViewById(R.id.name2_bangdan3);
        TextView textView4_1= (TextView) view.findViewById(R.id.count2_bangdan1);
        TextView textView5_1= (TextView) view.findViewById(R.id.count2_bangdan2);
        TextView textView6_1= (TextView) view.findViewById(R.id.count2_bangdan3);
        LoadUtils.loadImage(getContext(),imageView1,mPaiHangBean.getCredits().get(1).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LoadUtils.loadImage(getContext(),imageView2,mPaiHangBean.getCredits().get(0).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LoadUtils.loadImage(getContext(),imageView3,mPaiHangBean.getCredits().get(2).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LoadUtils.loadImage(getContext(),imageView4,mPaiHangBean.getGold().get(1).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LoadUtils.loadImage(getContext(),imageView5,mPaiHangBean.getGold().get(0).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LoadUtils.loadImage(getContext(),imageView6,mPaiHangBean.getGold().get(2).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher,new CircleTransform());
        LogUtils.i("flag","-----mPaiHangBean.getCredits().get(1).getNickname()");
        textView1.setText(mPaiHangBean.getCredits().get(1).getNickname());
        textView2.setText(mPaiHangBean.getCredits().get(0).getNickname());
        textView3.setText(mPaiHangBean.getCredits().get(2).getNickname());
        textView4.setText(mPaiHangBean.getGold().get(1).getNickname());
        textView5.setText(mPaiHangBean.getGold().get(0).getNickname());
        textView6.setText(mPaiHangBean.getGold().get(2).getNickname());
        textView1_1.setText(mPaiHangBean.getCredits().get(1).getValue()+"");
        textView2_1.setText(mPaiHangBean.getCredits().get(0).getValue()+"");
        textView3_1.setText(mPaiHangBean.getCredits().get(2).getValue()+"");
        textView4_1.setText(mPaiHangBean.getGold().get(1).getValue()+"");
        textView5_1.setText(mPaiHangBean.getGold().get(0).getValue()+"");
        textView6_1.setText(mPaiHangBean.getGold().get(2).getValue()+"");
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);

        mPaiHangBean = (PaiHangBean) response.body();
        LogUtils.i("flag","====="+mPaiHangBean.getCredits().toString());
        initView(mView);
        initBangdan();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.meilibang:
                LoadUtils.toBangdanActivity(getContext(),getActivity(), AppConfig.MELIBANG,mPaiHangBean);
                break;
            case R.id.fuhaobang:
                LoadUtils.toBangdanActivity(getContext(),getActivity(), AppConfig.FUHAGO,mPaiHangBean);
                break;
            case R.id.icon_bangdan1:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
            case R.id.icon_bangdan2:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
            case R.id.icon_bangdan3:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
            case R.id.icon2_bangdan1:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
            case R.id.icon2_bangdan2:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
            case R.id.icon2_bangdan3:
                LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
                break;
        }
    }
}
