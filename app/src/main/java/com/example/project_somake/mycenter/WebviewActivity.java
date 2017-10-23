package com.example.project_somake.mycenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.project_somake.R;


public class WebviewActivity extends AppCompatActivity {

    private WebView wv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        initView();
    }

    private void initView() {
        wv_view = (WebView) findViewById(R.id.wv_view);
        wv_view.getSettings().setJavaScriptEnabled(true);
        wv_view.loadUrl("http://www.yintai.com");
        wv_view.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}
