package com.gooch.showtogether;


import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GiftFragment extends Fragment {

    private GridView mGridView=null;
    private List<Gift> mGifts;

    public GiftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_gift, container, false);
        initData();
        mGridView= (GridView) view.findViewById(R.id.gridView_gift);
        GiftGridViewAdapter gridViewAdapter =new GiftGridViewAdapter(getContext());
        mGridView.setAdapter(gridViewAdapter);
        gridViewAdapter.setGiftList(mGifts);
        return view;
    }

    private void initData() {
        mGifts = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.giftname);
        String[] values = getResources().getStringArray(R.array.giftvalue);
        for (int i = 0; i < 8; i++) {

            int resId=getResources().getIdentifier("t"+(i+1),"mipmap",getContext().getPackageName());
            Gift gift=new Gift();
            gift.setBitmap(BitmapFactory.decodeResource(getResources(),resId));
            gift.setName(names[i]);
            gift.setValue(values[i]);
            mGifts.add(gift);
        }
    }

}
