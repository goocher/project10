package com.gooch.showtogether;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Parcelable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.gooch.showtogether.person.PersonAdapter;
import com.gooch.showtogether.person.PersonBean;

import base.BaseActivity;
import retrofit2.Call;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;

public class PersonActivity extends BaseActivity {
    private RecyclerView mRecyclerView=null;
    private Parcelable mParcelable;
    private ImageView back=null;
    private ImageView cover=null;
    private TextView title=null;
    private ImageView menu=null;
    private PersonAdapter mAdapter;
    private View grayLayout=null;
    private TextView mCacel;
    private TextView mLahei;
    private TextView mJubao;
    private PopupWindow mPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
//        Intent intent=new Intent();
////
//        Bundle bundle=intent.getExtras();
//        mParcelable = bundle.getParcelable("parcelable");

        init();
    }

    private void init() {
        initView();
        initRecyclerView();
        PersonBean.load(this);
        initTitle();
    }

    private void initTitle() {

    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,4));
        mAdapter = new PersonAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void initView() {
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView_person);
        back= (ImageView) findViewById(R.id.backToPersonActivity);
        title= (TextView) findViewById(R.id.title_person);
        menu= (ImageView) findViewById(R.id.menu_person);
        cover= (ImageView) findViewById(R.id.cover_person);
        grayLayout = findViewById(R.id.gray_layout);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        PersonBean personBean= (PersonBean) response.body();
        LogUtils.i("flag",""+personBean.toString());
        mAdapter.setPersonBean(personBean);
        LoadUtils.loadImage(this,cover,personBean.getUser().getAvatar_original(),R.mipmap.focus_img_nonet,R.mipmap.focus_img_nonet);
        title.setText(personBean.getUser().getNickname());

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.backToPersonActivity:
                PersonActivity.this.finish();
                break;
            case R.id.menu_person:
                View contentView= LayoutInflater.from(this).inflate(R.layout.popup_layout, null);
                mCacel = (TextView) contentView.findViewById(R.id.cancel_popup);
                mLahei = (TextView) contentView.findViewById(R.id.lahei);
                mJubao = (TextView) contentView.findViewById(R.id.jubao);
                //参数四：设置popupWindow是否获取焦点
                mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
                //设置
                //popupWindow不会占满全屏，当点击其他位置是否允许窗口取消
                mPopupWindow.setOutsideTouchable(true);

                //如果想让popupWindow必须设置setBackgroundDrawable方法，漏洞
                mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.alpha(0x47C7C4C7)));

                //参数1：只要是一个当前activity下的view就行       getWindowToken识别的窗体
                //参数三和四  偏移量  x轴和y轴
                grayLayout.setVisibility(View.VISIBLE);
		        mPopupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);
                //参数四；只能是right或left   只能是左对齐或右对齐
//                popupWindow.showAsDropDown(view, 0, 0, Gravity.LEFT);
                mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        grayLayout.setVisibility(View.GONE);
                    }
                });
                break;
        }
    }

    public void onPop(View view) {
        switch (view.getId()){
            case R.id.cancel_popup:
                mPopupWindow.dismiss();

                break;
            case R.id.lahei:
                mPopupWindow.dismiss();
                Toast.makeText(PersonActivity.this, "已拉黑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jubao:
                mPopupWindow.dismiss();
                Toast.makeText(PersonActivity.this, "已举报", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
