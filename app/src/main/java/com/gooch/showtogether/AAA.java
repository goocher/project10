package com.gooch.showtogether;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/11/23.
 */
public class AAA extends View {
    public AAA(Context context) {
        super(context);
    }

    public AAA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AAA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray=getResources().obtainAttributes(attrs,R.styleable.AAA);
    }
}
