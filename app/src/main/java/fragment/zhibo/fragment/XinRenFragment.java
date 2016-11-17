package fragment.zhibo.fragment;


import android.content.Intent;
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

import java.util.ArrayList;
import java.util.List;

import DefineView.shafflingview.ShufflingView;
import fragment.zhibo.adatper.XinRenadapter.XinrenAdapter;
import fragment.zhibo.bean.XinrenInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.LoadUtils;
import utils.ToPlay;

/**
 * A simple {@link Fragment} subclass.
 */
public class XinRenFragment extends Fragment implements Callback, ToPlay {

    private SwipeRefreshLayout swipeRefreshLayout = null;
    private RecyclerView recyclerView = null;
    private XinrenAdapter adapter;
    private XinrenInfo xinrenInfo;
    private String baidu="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
    public XinRenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ret = inflater.inflate(R.layout.fragment_xin_ren, container, false);
        recyclerView = (RecyclerView) ret.findViewById(R.id.xinren_recyclerView);
        swipeRefreshLayout = (SwipeRefreshLayout) ret.findViewById(R.id.xinren_swipeRefreshLayout);
        initSwipeRefreshLayout();
        initAdapter();
        initData();
        initData();

        return ret;

    }

    @Override
    public void onStart() {
        super.onStart();
        initSwipeRefreshLayout();
    }

    private void initAdapter() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        adapter = new XinrenAdapter(getContext());

        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        XinrenInfo.load(this);
//        swipeRefreshLayout.setRefreshing(false);
    }

    private void initSwipeRefreshLayout() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initData();

            }
        });
//        swipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED);

    }


    @Override
    public void onResponse(Call call, Response response) {
        xinrenInfo = (XinrenInfo) response.body();
        if (xinrenInfo!=null){

            LoadUtils.competeRefresh(swipeRefreshLayout);
        }
        initHead();
        adapter.setList(xinrenInfo.getInfo().getLivelist());
        adapter.setOnRecyclerViewItemClickListener(new XinrenAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, XinrenAdapter.MyViewHolder myViewHolder, int position) {
                toPlay(xinrenInfo.getInfo().getLivelist().get(position));
            }
        });
    }

    private void initHead() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.header, null);
        ShufflingView shufflingView = (ShufflingView) view.findViewById(R.id.shufflingView);
        List<String> listUrl = new ArrayList<>();
        for (int i = 0; i < xinrenInfo.getBar().size(); i++) {
            if (xinrenInfo.getBar().size() == 1) {
                listUrl.add(xinrenInfo.getBar().get(0).getImage());
                listUrl.add(xinrenInfo.getBar().get(0).getImage());
                listUrl.add(xinrenInfo.getBar().get(0).getImage());
            }
            listUrl.add(xinrenInfo.getBar().get(i).getImage());
        }
        shufflingView.setImagers(listUrl);
        adapter.addHeadView(view);

        shufflingView.setOnitemClicklistener(new ShufflingView.OnitemClicklistener() {
            @Override
            public void setOnitemClicklistener(int position) {
                LoadUtils.toWebActivity(getContext(), getActivity(), xinrenInfo.getBar().get(0).getParameters());
            }
        });
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }

    @Override
    public void toPlay(Object o) {
        XinrenInfo.InfoBean.LivelistBean livelistBean = (XinrenInfo.InfoBean.LivelistBean) o;
            Intent intent = new Intent(getContext(), ToPlayActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("livelistBean", livelistBean);
            bundle.putInt("class", 4);
            intent.putExtra("bundle", bundle);
            getContext().startActivity(intent);
            getActivity().overridePendingTransition(R.anim.push_in_right, R.anim.push_out_left);
    }
}
