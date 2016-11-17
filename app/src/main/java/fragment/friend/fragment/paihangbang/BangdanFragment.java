package fragment.friend.fragment.paihangbang;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gooch.showtogether.R;
import com.gooch.showtogether.bangdan.BangdanAdapter;
import com.gooch.showtogether.bangdan.BangdanAdapter2;

import fragment.friend.bean.PaiHangBean;
import url.AppConfig;
import utils.CircleTransform;
import utils.LoadUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class BangdanFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView mListView=null;
    private PaiHangBean mPaiHangBean;
    private View mHeadView1;
    private View mHeadView2;

    public BangdanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bangdan, container, false);
        mListView= (ListView) view.findViewById(R.id.listaView_bangdan);
        mHeadView1 = LayoutInflater.from(getContext()).inflate(R.layout.headview_bangdan,null);
        mHeadView2 = LayoutInflater.from(getContext()).inflate(R.layout.headview_bangdan2,null);
        init();
        return view ;
    }

    private void init() {
        initData();
        mListView.setOnItemClickListener(this);
    }

    private void initHeadView() {

        getViewId(mHeadView1);
        getViewId2(mHeadView2);

        mListView.addHeaderView(mHeadView1);
        mListView.addHeaderView(mHeadView2);

    }

    private void getViewId2(View headView) {
        ImageView icon= (ImageView) headView.findViewById(R.id.icon_nearbyPerson);
        ImageView genderIcon= (ImageView) headView.findViewById(R.id.gender_nearbyPerson);
        TextView nickName= (TextView) headView.findViewById(R.id.nickName_nearbyPerson);
        TextView age= (TextView) headView.findViewById(R.id.age_nearbyperson);
        TextView star= (TextView) headView.findViewById(R.id.star_nearbyPerson);
        TextView Vip= (TextView) headView.findViewById(R.id.vip_nearbyperson);
        TextView value= (TextView) headView.findViewById(R.id.value);
        ImageView icon1= (ImageView) headView.findViewById(R.id.icon1_nearbyPerson);
        ImageView genderIcon1= (ImageView) headView.findViewById(R.id.gender1_nearbyPerson);
        TextView nickName1= (TextView) headView.findViewById(R.id.nickName1_nearbyPerson);
        TextView age1= (TextView) headView.findViewById(R.id.age1_nearbyperson);
        TextView star1= (TextView) headView.findViewById(R.id.star1_nearbyPerson);
        TextView Vip1= (TextView) headView.findViewById(R.id.vip1_nearbyperson);
        TextView value1= (TextView) headView.findViewById(R.id.value1);
        LoadUtils.loadImage(getContext(),icon,mPaiHangBean.getCredits().get(1).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value.setText(mPaiHangBean.getCredits().get(1).getValue()+"");

        age.setText(mPaiHangBean.getCredits().get(1).getAge()+"");
        nickName.setText(mPaiHangBean.getCredits().get(1).getNickname());
        star.setText(mPaiHangBean.getCredits().get(1).getGrade().getLv()+"");
        if (!mPaiHangBean.getCredits().get(1).getIco().isVip()) {
            Vip.setVisibility(View.INVISIBLE);
        }
        LoadUtils.loadImage(getContext(),icon1,mPaiHangBean.getCredits().get(2).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value1.setText(mPaiHangBean.getCredits().get(2).getValue()+"");

        age1.setText(mPaiHangBean.getCredits().get(2).getAge()+"");
        nickName1.setText(mPaiHangBean.getCredits().get(2).getNickname());
        star1.setText(mPaiHangBean.getCredits().get(2).getGrade().getLv()+"");
        if (!mPaiHangBean.getCredits().get(2).getIco().isVip()) {
            Vip1.setVisibility(View.INVISIBLE);
        }

    }
    private void getViewId4(View headView) {
        ImageView icon= (ImageView) headView.findViewById(R.id.icon_nearbyPerson);
        ImageView genderIcon= (ImageView) headView.findViewById(R.id.gender_nearbyPerson);
        TextView nickName= (TextView) headView.findViewById(R.id.nickName_nearbyPerson);
        TextView age= (TextView) headView.findViewById(R.id.age_nearbyperson);
        TextView star= (TextView) headView.findViewById(R.id.star_nearbyPerson);
        TextView Vip= (TextView) headView.findViewById(R.id.vip_nearbyperson);
        TextView value= (TextView) headView.findViewById(R.id.value);
        ImageView icon1= (ImageView) headView.findViewById(R.id.icon1_nearbyPerson);
        ImageView genderIcon1= (ImageView) headView.findViewById(R.id.gender1_nearbyPerson);
        TextView nickName1= (TextView) headView.findViewById(R.id.nickName1_nearbyPerson);
        TextView age1= (TextView) headView.findViewById(R.id.age1_nearbyperson);
        TextView star1= (TextView) headView.findViewById(R.id.star1_nearbyPerson);
        TextView Vip1= (TextView) headView.findViewById(R.id.vip1_nearbyperson);
        TextView value1= (TextView) headView.findViewById(R.id.value1);
        LoadUtils.loadImage(getContext(),icon,mPaiHangBean.getGold().get(1).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value.setText(mPaiHangBean.getGold().get(1).getValue()+"");

        age.setText(mPaiHangBean.getGold().get(1).getAge()+"");
        nickName.setText(mPaiHangBean.getGold().get(1).getNickname());
        star.setText(mPaiHangBean.getGold().get(1).getGrade().getLv()+"");
        if (!mPaiHangBean.getGold().get(1).getIco().isVip()) {
            Vip.setVisibility(View.INVISIBLE);
        }
        LoadUtils.loadImage(getContext(),icon1,mPaiHangBean.getGold().get(2).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value1.setText(mPaiHangBean.getGold().get(2).getValue()+"");

        age1.setText(mPaiHangBean.getGold().get(2).getAge()+"");
        nickName1.setText(mPaiHangBean.getGold().get(2).getNickname());
        star1.setText(mPaiHangBean.getGold().get(2).getGrade().getLv()+"");
        if (!mPaiHangBean.getGold().get(2).getIco().isVip()) {
            Vip1.setVisibility(View.INVISIBLE);
        }

    }
    private void getViewId(View headView) {
        ImageView icon= (ImageView) headView.findViewById(R.id.icon_nearbyPerson);
        ImageView genderIcon= (ImageView) headView.findViewById(R.id.gender_nearbyPerson);
        TextView nickName= (TextView) headView.findViewById(R.id.nickName_nearbyPerson);
        TextView age= (TextView) headView.findViewById(R.id.age_nearbyperson);
        TextView star= (TextView) headView.findViewById(R.id.star_nearbyPerson);
        TextView Vip= (TextView) headView.findViewById(R.id.vip_nearbyperson);
        TextView count= (TextView) headView.findViewById(R.id.count);
        TextView value= (TextView) headView.findViewById(R.id.value);
        LoadUtils.loadImage(getContext(),icon,mPaiHangBean.getCredits().get(0).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value.setText(mPaiHangBean.getCredits().get(0).getValue()+"");

        age.setText(mPaiHangBean.getCredits().get(0).getAge()+"");
        nickName.setText(mPaiHangBean.getCredits().get(0).getNickname());
        star.setText(mPaiHangBean.getCredits().get(0).getGrade().getLv()+"");
        if (!mPaiHangBean.getCredits().get(0).getIco().isVip()) {
            Vip.setVisibility(View.INVISIBLE);
        }

    }
    private void getViewId3(View headView) {
        ImageView icon= (ImageView) headView.findViewById(R.id.icon_nearbyPerson);
        ImageView genderIcon= (ImageView) headView.findViewById(R.id.gender_nearbyPerson);
        TextView nickName= (TextView) headView.findViewById(R.id.nickName_nearbyPerson);
        TextView age= (TextView) headView.findViewById(R.id.age_nearbyperson);
        TextView star= (TextView) headView.findViewById(R.id.star_nearbyPerson);
        TextView Vip= (TextView) headView.findViewById(R.id.vip_nearbyperson);
        TextView count= (TextView) headView.findViewById(R.id.count);
        TextView value= (TextView) headView.findViewById(R.id.value);
        LoadUtils.loadImage(getContext(),icon,mPaiHangBean.getGold().get(0).getAvatar(),R.mipmap.ic_launcher,R.mipmap.ic_launcher);
        value.setText(mPaiHangBean.getCredits().get(0).getValue()+"");

        age.setText(mPaiHangBean.getGold().get(0).getAge()+"");
        nickName.setText(mPaiHangBean.getGold().get(0).getNickname());
        star.setText(mPaiHangBean.getGold().get(0).getGrade().getLv()+"");
        if (!mPaiHangBean.getGold().get(0).getIco().isVip()) {
            Vip.setVisibility(View.INVISIBLE);
        }

    }
    private void initData() {
        Bundle bundle=getArguments();
        mPaiHangBean = bundle.getParcelable("bean");
        switch (bundle.getInt("type")){
            case AppConfig.MELIBANG:

                BangdanAdapter adapter=new BangdanAdapter(getContext());
                mListView.setAdapter(adapter);
                adapter.setCreditsBeen(mPaiHangBean.getCredits());
                initHeadView();
                break;
            case  AppConfig.FUHAGO:
                BangdanAdapter2 bangdanAdapter2=new BangdanAdapter2(getContext());
                mListView.setAdapter(bangdanAdapter2);
                bangdanAdapter2.setGoldBeen(mPaiHangBean.getGold());
                initHeadView1();
                break;
        }
    }

    private void initHeadView1() {
        getViewId3(mHeadView1);
        getViewId4(mHeadView2);

        mListView.addHeaderView(mHeadView1);
        mListView.addHeaderView(mHeadView2);
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LoadUtils.toPersonActivity(getContext(),getActivity(),mPaiHangBean);
    }
}
