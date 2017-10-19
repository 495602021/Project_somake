package com.example.project_somake.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.project_somake.R;
import com.example.project_somake.utlis.SPUtils;
import com.example.project_somake.utlis.ShowStyle;

import java.util.ArrayList;

public class WelcomeActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ImageView iv_log;
    private ViewPager vp_view;

    private ImageView iv_img1;
    private ImageView iv_img2;
    private ImageView iv_img3;
    private ImageView iv_img4;
    private LinearLayout out;
    private Context context=WelcomeActivity.this;
    private int x=0;
    private Handler h = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    vp_view.setVisibility(View.VISIBLE);
                    iv_log.setVisibility(View.GONE);

                    break;
            }
        }
    };
    private ArrayList<View> list;
    private Button bt_com;
    private ArrayList<ImageView> views;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        initView();


        int ve = (int) SPUtils.get(context, "ve", 0);
        if (ve == 0) {
            SPUtils.put(context, "ve", 1);
            ShowStyle.ShowProgesses(context);
            //引导页显示
            h.sendEmptyMessageDelayed(1, 3000);

            //轮播图
            initData();
        } else {
            //跳入首页
            vp_view.setVisibility(View.GONE);
            ShowStyle.ShowProgesses(context);
            startActivity(new Intent(context, MainActivity.class));
        }
    }



    private void initData() {
        list = new ArrayList<>();
        list.add(View.inflate(context, R.layout.welcome1, null));
        list.add(View.inflate(context, R.layout.welcome2, null));
        list.add(View.inflate(context, R.layout.welcome3, null));
        list.add(View.inflate(context, R.layout.welcome4, null));
        View view = View.inflate(context, R.layout.welcome5, null);
        list.add(view);
        bt_com = (Button) view.findViewById(R.id.button);
//        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(list, context);
//        vp_view.setAdapter(myViewPagerAdapter);
        vp_view.setOnPageChangeListener(this);



    }


    private void initView() {
        iv_log = (ImageView) findViewById(R.id.iv_log);
        vp_view = (ViewPager) findViewById(R.id.vp_view);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (list.size()-1==position){
            bt_com.setVisibility(View.VISIBLE);

        }else {
            bt_com.setVisibility(View.GONE);

        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
