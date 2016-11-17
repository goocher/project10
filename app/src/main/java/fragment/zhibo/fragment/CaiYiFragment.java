
package fragment.zhibo.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.gooch.showtogether.ToPlayActivity;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.zhibo.adatper.caiyiadapter.CaiYiFragmentAdapter;
import fragment.zhibo.bean.CaiYiBean;
import fragment.zhibo.bean.CaiYiBean.InfoBean.LivelistBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;
import utils.ToPlay;


/**
 * A simple {@link Fragment} subclass.
 */
public class CaiYiFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, ToPlay {


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private Context context;
    private CaiYiFragmentAdapter mCaiYiFragmentAdapter;
    private RecyclerView mRecyclerView;
    private ImageView flowToTop;
    private TextView bottomText = null;
    private List<LivelistBean> mLivelistBeen;
    private CaiYiBean mCaiYiBean;

    public CaiYiFragment() {
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
        View ret = inflater.inflate(R.layout.fragment_cai_yi, container, false);
        mSwipeRefreshLayout = (SwipeRefreshLayout) ret.findViewById(R.id.swipeRefreshLayout_caiyi);
        mRecyclerView = (RecyclerView) ret.findViewById(R.id.recyclerView_caiyi);
        flowToTop = (ImageView) ret.findViewById(R.id.flowToTop);
        bottomText = (TextView) ret.findViewById(R.id.bottom_text_caiyi);
        init();
        return ret;
    }

    private void init() {
        initView();
        initData();
        initSwiperefresh();
        LoadUtils.initFlowToTop(flowToTop, mRecyclerView, bottomText);
        LoadUtils.initRecyclerViewDecoratinon(mRecyclerView, 10, 0);

        initListener();
//        initHeader();
    }

    private void initListener() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                LoadUtils.isBottom(mRecyclerView, bottomText);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        flowToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               mRecyclerView.scrollToPosition(0);
                mRecyclerView.smoothScrollToPosition(0);
            }
        });
    }


    private void initSwiperefresh() {
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    private void initView() {
        LogUtils.i("flag", "initView");
        mCaiYiFragmentAdapter = new CaiYiFragmentAdapter(context);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mCaiYiFragmentAdapter);

    }


    private void initData() {
        LogUtils.i("flag", "initData");
        CaiYiBean.load(new Callback<CaiYiBean>() {
            @Override
            public void onResponse(Call call, Response response) {
                LoadUtils.competeRefresh(mSwipeRefreshLayout);
                mCaiYiBean = (CaiYiBean) response.body();
                LogUtils.i("flag", "onResponse()" + mCaiYiBean.getInfo().getLivelist().size());
                mLivelistBeen = new ArrayList<LivelistBean>();
                if (mCaiYiBean != null && mCaiYiBean.getInfo() != null) {

                    mLivelistBeen.addAll(mCaiYiBean.getInfo().getLivelist());
                }
                mCaiYiFragmentAdapter.setCaiYiBean(mLivelistBeen);
                mCaiYiFragmentAdapter.setOnRecyclerViewItemClickListener(new CaiYiFragmentAdapter.OnRecyclerViewItemClickListener() {
                    @Override
                    public void onClick(View view, CaiYiFragmentAdapter.CaiYiViewHolder caiYiViewHolder, int position) {
                        toPlay(mCaiYiBean.getInfo().getLivelist().get(position));
                    }
                });
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                LogUtils.i("flag", "onFailure()");
            }
        });
    }

    @Override
    public void onRefresh() {
        initData();
    }

    @Override
    public void toPlay(Object o) {
        CaiYiBean.InfoBean.LivelistBean livelistBean = (CaiYiBean.InfoBean.LivelistBean) o;
            Intent intent = new Intent(context, ToPlayActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("livelistBean", livelistBean);
            bundle.putInt("class", 2);
            intent.putExtra("bundle", bundle);
            context.startActivity(intent);
            getActivity().overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }


}
