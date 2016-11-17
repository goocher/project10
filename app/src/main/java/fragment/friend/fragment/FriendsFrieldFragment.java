package fragment.friend.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.gooch.showtogether.R;

import java.util.ArrayList;
import java.util.List;

import base.BaseFragment;
import fragment.friend.adapter.pengyouquan.adapter.WeChatAdapter;
import fragment.friend.adapter.pengyouquan.bean.UserInfo;
import retrofit2.Call;
import retrofit2.Response;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFrieldFragment extends BaseFragment {


    private WeChatAdapter mWeChatAdapter;

    public FriendsFrieldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_friends_frield, container, false);
        mListView = (ListView) view.findViewById(R.id.lv_main);
        init();
        return view ;
    }
private ListView mListView=null;
    private void init() {

        UserInfo.load(this);
        setData();
    }

    private void setData() {
//        List<UserInfo> mList = new ArrayList<>();
//        UserInfo mUserInfo = new UserInfo();
//        UserImgs m = new UserImgs();
//        m.setUrls("https://www.baidu.com/img/bd_logo1.png");
//        mUserInfo.getUi().add(m);
//        mList.add(mUserInfo);
//        //---------------------------------------------
//        UserInfo mUserInfo2 = new UserInfo();
//        UserImgs m2 = new UserImgs();
//        m2.setUrls("https://www.baidu.com/img/bd_logo1.png");
//        mUserInfo2.getUi().add(m2);
//        UserImgs m21 = new UserImgs();
//        m21.setUrls("https://www.baidu.com/img/bd_logo1.png");
//        mUserInfo2.getUi().add(m21);
//        mList.add(mUserInfo2);

        mWeChatAdapter = new WeChatAdapter(getContext());

        mListView.setAdapter(mWeChatAdapter);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        UserInfo userInfo= (UserInfo) response.body();
        LogUtils.i("flag","0000000000000000");
        mWeChatAdapter.setData(userInfo);
    }
}
