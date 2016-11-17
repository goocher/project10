package fragment.zhibo.fragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gooch.showtogether.R;
import com.gooch.showtogether.ToPlayActivity;

import fragment.zhibo.adatper.nearbyadpter.NearbyAdapter;
import fragment.zhibo.bean.NearByInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.LogUtils;
import utils.ToPlay;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearByFragment extends Fragment implements Callback, ToPlay {

    private RecyclerView recyclerView = null;
    private SwipeRefreshLayout swipeRefreshLayout = null;
    private NearbyAdapter adapter = null;

    public NearByFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ret = inflater.inflate(R.layout.fragment_near_by, container, false);

        //下拉刷新
        swipeRefreshLayout = (SwipeRefreshLayout) ret.findViewById(R.id.nearby_swipeRefreshLayout);
        recyclerView = (RecyclerView) ret.findViewById(R.id.nearby_recyclerView);
        initData();
        initSwipFresh();
        initAdapter();

        return ret;
    }

    private void initSwipFresh() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //这里放入网络请求的数据
                initData();
            }
        });
        swipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED);
    }


    private void initData() {
        NearByInfo.load(this);
        LogUtils.e("flag", "-----------------<NearByInfo.load(this)");
        swipeRefreshLayout.setRefreshing(false);
    }

    private void initAdapter() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        adapter = new NearbyAdapter(getContext());
        recyclerView.setAdapter(adapter);

    }


    @Override
    public void onResponse(Call call, Response response) {
        final NearByInfo nearByInfo = (NearByInfo) response.body();
        LogUtils.i("flag", "----------->nearByInfo.getInfo()" + nearByInfo.toString());
        adapter.setNearByInfo(nearByInfo.getInfo().getLivelist());

        adapter.setOnRecyclerViewItemClickListener(new NearbyAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, NearbyAdapter.MyViewHolder holder, int position) {
                toPlay(nearByInfo.getInfo().getLivelist().get(position));

            }
        });
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }

    @Override
    public void toPlay(Object o) {
        NearByInfo.InfoBean.LivelistBean livelistBean = (NearByInfo.InfoBean.LivelistBean) o;
            Intent intent = new Intent(getContext(), ToPlayActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("livelistBean", livelistBean);
            bundle.putInt("class", 5);
            intent.putExtra("bundle", bundle);
            getContext().startActivity(intent);
            getActivity().overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);

    }
}
