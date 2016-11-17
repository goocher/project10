package com.gooch.showtogether;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import base.BaseActivity;
import utils.LogUtils;

public class WebActivity extends BaseActivity {

    private WebView webView=null;
    //说明这个方法中有关于javascript的接口，用于给javascript使用的方法

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        webView= (WebView) findViewById(R.id.webView);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        Intent intent=getIntent();
        String htmlUrl=intent.getStringExtra("parameters");
        LogUtils.i("flag","-------------"+htmlUrl);
        webView.loadUrl(htmlUrl);


    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_webactivity:
                WebActivity.this.finish();
                break;
            case R.id.fenxiang_webactivity:

                break;
        }
    }
}
