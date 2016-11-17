package fragment.friend.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gooch.showtogether.R;

import base.BaseFragment;
import fragment.friend.adapter.haoyou.HaoyouAdapter;
import fragment.friend.bean.HaoyouBean;
import retrofit2.Call;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class HaoYouFragment extends BaseFragment implements HaoyouAdapter.OnRecyclerItemClickListener {


    private HaoyouAdapter mHaoyouAdapter;
    private Context  context;
    private HaoyouBean mHaoyouBean;

    public HaoYouFragment() {
        // Required empty public constructor
    }

    private RecyclerView mRecyclerView=null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_hao_you, container, false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.recyclerView_haoyou);
        init();
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private void init() {
        initRecycler();
        initData();
    }

    private void initData() {
        HaoyouBean.load(this);
    }

    private void initRecycler() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager((context)));
        mHaoyouAdapter = new HaoyouAdapter(getContext());
        mRecyclerView.setAdapter(mHaoyouAdapter);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        mHaoyouBean = (HaoyouBean) response.body();
        LogUtils.i("flag","+"+ mHaoyouBean.toString());
        mHaoyouAdapter.setHaoyouBean(mHaoyouBean);
        mHaoyouAdapter.setOnRecyclerItemClickListener(this);
    }

    @Override
    public void onClick(View view, HaoyouAdapter.MyViewHolder myViewHolder, int position) {
        LoadUtils.toPersonActivity(getContext(),getActivity(),mHaoyouBean);
    }
}
