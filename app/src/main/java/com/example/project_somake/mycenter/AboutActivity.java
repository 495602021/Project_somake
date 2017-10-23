package com.example.project_somake.mycenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_somake.R;


public class AboutActivity extends AppCompatActivity {

    private TextView tv_webview;
    private ImageView iv_about_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initView();
    }

    private void initView() {
        tv_webview = (TextView) findViewById(R.id.tv_webview);
        tv_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AboutActivity.this, WebviewActivity.class));
            }
        });
        iv_about_left = (ImageView) findViewById(R.id.iv_about_left);
        iv_about_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
