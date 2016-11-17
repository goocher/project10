package fragment.friend.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gooch.showtogether.R;

import base.BaseFragment;
import fragment.friend.adapter.NearByFragmentAdapter.NearByFragmentAdapter;
import fragment.friend.bean.NearByBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.LoadUtils;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearByPersonFragment extends BaseFragment implements NearByFragmentAdapter.OnRecyclerItemClickListener {
    private RecyclerView mRecyclerView=null;
    private NearByFragmentAdapter mAdapter;
    private NearByBean mNearByBean;

    public NearByPersonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_near_by_person, container, false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.recyclerView_nearByPerson);
        init();
        return view;
    }

    private void init() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new NearByFragmentAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);
        initData();

    }

    private void initData() {
        NearByBean.load(this);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        mNearByBean = (NearByBean) response.body();
//        LogUtils.i("flag",222222+ mNearByBean.getList().size()+"");
        mAdapter.setNearByBeanList(mNearByBean.getList());
        mAdapter.setOnRecyclerItemClickListener(this);
    }


    @Override
    public void onClick(View view, NearByFragmentAdapter.NearByViewHolder myViewHolder, int position) {
        LoadUtils.toPersonActivity(getContext(),getActivity(),mNearByBean);
    }
}
