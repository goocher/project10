package com.gooch.showtogether;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import utils.LoadUtils;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        ImageView pic= (ImageView) findViewById(R.id.pic);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String s= (String) bundle.get("imgUrl");
        LoadUtils.loadImage(this,pic,s,R.mipmap.add_album_cover,R.mipmap.add_album_cover);
    }
}
