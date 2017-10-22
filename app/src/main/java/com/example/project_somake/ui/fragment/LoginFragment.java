package com.example.project_somake.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.project_somake.R;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;



@SuppressLint("ValidFragment")
public class LoginFragment extends Fragment implements View.OnClickListener {
    private Context context;
    public static LinearLayout ll_login_text;
    private TextView iv_login_wei;
    private TextView iv_login_qq;
    private TextView iv_login_zhi;
    private TextView iv_login_xinlang;
    public static  LinearLayout ll_login_text2;


    public LoginFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        initView(view);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_login_qq:
                initDate();
                break;
        }
    }

    private void initDate() {
        UMShareAPI.get(context).getPlatformInfo((Activity) context, SHARE_MEDIA.QQ, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {

            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {

            }
        });
    }

    private void initView(View view) {
        ll_login_text = (LinearLayout) view.findViewById(R.id.ll_login_text);
        iv_login_wei = (TextView) view.findViewById(R.id.iv_login_wei);
        iv_login_qq = (TextView) view.findViewById(R.id.iv_login_qq);
        iv_login_zhi = (TextView) view.findViewById(R.id.iv_login_zhi);
        iv_login_xinlang = (TextView) view.findViewById(R.id.iv_login_xinlang);
        ll_login_text2 = (LinearLayout) view.findViewById(R.id.ll_login_text2);
        iv_login_qq.setOnClickListener(this);
    }
}
