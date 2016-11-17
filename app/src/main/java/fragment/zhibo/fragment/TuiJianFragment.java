package fragment.zhibo.fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import DefineView.shafflingview.ShufflingView;
import base.BaseFragment;
import fragment.zhibo.adatper.tuijianAdapter.TuiJianListAdapter;
import fragment.zhibo.bean.TuiJian;
import retrofit2.Call;
import retrofit2.Response;
import utils.LoadUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class TuiJianFragment extends BaseFragment {


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private Context context;
    private TuiJianListAdapter mTuiJianListAdapter;
    private RecyclerView mRecyclerView;
    private TuiJian mTuijian;


    public TuiJianFragment() {
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
        View ret = inflater.inflate(R.layout.fragment_tui_jian, container, false);
        mSwipeRefreshLayout = (SwipeRefreshLayout) ret.findViewById(R.id.swipeRefreshLayout_tuijian);
        mRecyclerView = (RecyclerView) ret.findViewById(R.id.recyclerView_tuijian);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(context);
        mRecyclerView.setLayoutManager(manager);
        initData();

        initView();

        return ret;
    }

    private void initView() {
        mTuiJianListAdapter = new TuiJianListAdapter(context);
        mRecyclerView.setAdapter(mTuiJianListAdapter);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initData();
                LoadUtils.competeRefresh(mSwipeRefreshLayout);
            }
        });
    }

    private void initData() {
        TuiJian.load(this);
    }

    private void initHeader() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.header, null);

        ShufflingView shufflingView = (ShufflingView) view.findViewById(R.id.shufflingView);
        List<String> imageUrls = new ArrayList<>();
        for (int i = 0; i < mTuijian.getBar().size(); i++) {

            imageUrls.add(mTuijian.getBar().get(i).getImage());
        }
        shufflingView.setImagers(imageUrls);
        mTuiJianListAdapter.addHeadView(view);
        shufflingView.setOnitemClicklistener(new ShufflingView.OnitemClicklistener() {
            @Override
            public void setOnitemClicklistener(int position) {
                LoadUtils.toWebActivity(getContext(), getActivity(), mTuijian.getBar().get(position).getParameters());
            }
        });
    }

    @Override
    public void onResponse(Call call, Response response) {
        mTuijian = (TuiJian) response.body();
//        LogUtils.i("flag", "---------------" + tuijian.getList().get(0).getLivelist().get(0).getCover());
        mTuiJianListAdapter.setTuiJian(mTuijian);
        initHeader();
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }

}
