package com.gooch.showtogether;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Gift {

    private String name;
    private String value;
    private Bitmap mBitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }
}
