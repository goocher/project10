package fragment.zhibo.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.gooch.showtogether.R;

import base.BaseFragment;
import fragment.zhibo.adatper.guanzhuadapter.GuanZhuAdapter;
import fragment.zhibo.bean.GuanZhuBean;
import retrofit2.Call;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuanZhuFragment extends BaseFragment {


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private GuanZhuAdapter mGuanZhuAdapter;
    private Context context;
    private LinearLayout mLayout0;
    private RelativeLayout mLayout1;

    public GuanZhuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ret = inflater.inflate(R.layout.fragment_guan_zhu, container, false);

        mSwipeRefreshLayout = (SwipeRefreshLayout) ret.findViewById(R.id.swipeRefreshLayout_guanzhu);
        mRecyclerView = (RecyclerView) ret.findViewById(R.id.recyclerView_guanzhu);

        mLayout0 = (LinearLayout) ret.findViewById(R.id.guanzhu_noGuanZhu0);
        mLayout1 = (RelativeLayout) ret.findViewById(R.id.guanzhu_noGuanZhu1);


        initData();
        initRecyclerView();

        return ret;
    }


    private void initRecyclerView() {

        mGuanZhuAdapter = new GuanZhuAdapter(context);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mGuanZhuAdapter);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initData();
                LoadUtils.competeRefresh(mSwipeRefreshLayout);
            }
        });
    }

    private void initData() {
        GuanZhuBean.load(this);
    }

    @Override
    public void onResponse(Call call, Response response) {

        GuanZhuBean guanZhuBean = (GuanZhuBean) response.body();
        LogUtils.i("flag", "------------->guanzhu_cover:" + guanZhuBean.getInfo().getLivelist().get(0).getCover());
        mGuanZhuAdapter.setGuanZhuBean(guanZhuBean);
        if (guanZhuBean.getInfo().getTemplate().equals("NORMAL")) {
            mLayout0.setVisibility(View.GONE);
            mLayout1.setVisibility(View.GONE);
        }else {
            mLayout0.setVisibility(View.VISIBLE);
            mLayout1.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
