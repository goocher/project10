
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

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.gooch.showtogether.R;
import com.gooch.showtogether.ToPlayActivity;

import java.util.ArrayList;
import java.util.List;

import DefineView.shafflingview.ShufflingView;
import base.BaseFragment;
import fragment.zhibo.adatper.Hotadapter.HotFragmemtAdapter;
import fragment.zhibo.bean.HotBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;
import utils.ToPlay;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, ToPlay {


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private Context context;
    private HotFragmemtAdapter mHotFragmemtAdapter;
    private RecyclerView mRecyclerView;
    private ImageView flowToTop;
    private TextView bottomText = null;
    private List<HotBean.InfoBean.LivelistBean> mLivelistBeen;
    private HotBean mHotBean;
    private RecyclerViewHeader mHeader;

    public HotFragment() {
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
        View ret = inflater.inflate(R.layout.fragment_hot, container, false);
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
//        LoadUtils.initRecyclerViewDecoratinon(mRecyclerView,10,0);
        LoadUtils.initRVDecoratinonHasHeader(mRecyclerView, 10, 0);
        initListener();

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
        mHotFragmemtAdapter = new HotFragmemtAdapter(context);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mHotFragmemtAdapter);

    }

    private void initHeader() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.header, null);

        ShufflingView shufflingView = (ShufflingView) view.findViewById(R.id.shufflingView);
        List<String> imageUrls = new ArrayList<>();
        for (int i = 0; i < mHotBean.getBar().size(); i++) {
            ;
            imageUrls.add(mHotBean.getBar().get(i).getImage());
        }
        shufflingView.setImagers(imageUrls);
        mHotFragmemtAdapter.addHeadView(view);
        shufflingView.setOnitemClicklistener(new ShufflingView.OnitemClicklistener() {
            @Override
            public void setOnitemClicklistener(int position) {
                LoadUtils.toWebActivity(getContext(), getActivity(), mHotBean.getBar().get(position).getParameters());
//                LoadUtils.toWebActivity(getContext(), getActivity(), "html|http://api.yiqi1717.com/h5/grade?token=00f51617b02368a384ab62cff77f2bc5");

            }
        });
    }

    private void initData() {
        LogUtils.i("flag", "initData");
        HotBean.load(new Callback<HotBean>() {
            @Override
            public void onResponse(Call call, Response response) {
                LoadUtils.competeRefresh(mSwipeRefreshLayout);
                mHotBean = (HotBean) response.body();
                LogUtils.i("flag", "onResponse()" + mHotBean.getInfo().getLivelist().size());
                mLivelistBeen = new ArrayList<>();
                if (mHotBean != null && mHotBean.getInfo() != null) {

                    mLivelistBeen.addAll(mHotBean.getInfo().getLivelist());
                }
                initHeader();
                mHotFragmemtAdapter.setHotBeanList(mLivelistBeen);

                mHotFragmemtAdapter.setOnRecyclerViewItemClickListener(new HotFragmemtAdapter.OnRecyclerViewItemClickListener() {
                    @Override
                    public void onClick(View view, HotFragmemtAdapter.HotViewHolder hotViewHolder, int position) {
                        mHotBean.getInfo().getLivelist().get(position);
                        toPlay(mHotBean.getInfo().getLivelist().get(position));
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
        HotBean.InfoBean.LivelistBean livelistBean = (HotBean.InfoBean.LivelistBean) o;
            Intent intent = new Intent(context, ToPlayActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("livelistBean", livelistBean);
            bundle.putInt("class", 1);
            intent.putExtra("bundle", bundle);
            context.startActivity(intent);
            getActivity().overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
}
