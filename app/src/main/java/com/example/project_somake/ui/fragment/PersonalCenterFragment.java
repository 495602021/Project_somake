package com.example.project_somake.ui.fragment;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_somake.R;
import com.example.project_somake.mycenter.AboutActivity;
import com.example.project_somake.mycenter.HelpActivity;
import com.example.project_somake.mycenter.IdeaActivity;
import com.example.project_somake.mycenter.LoginActivity;
import com.example.project_somake.mycenter.RegisterActivity;


@SuppressLint("ValidFragment")
public class PersonalCenterFragment extends Fragment implements View.OnClickListener {

    private Button bt_login;
    private Button bt_add;

    private Context context;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private LinearLayout ll_clear;
    private LinearLayout ll_help;
    private RelativeLayout ll_idea;
    private RelativeLayout ll_about;
    private TextView textView5;
    private RelativeLayout ll_phone;
    private ImageView iv_my_img;
    private TextView textView4;
    private TextView tv_vip;
    private TextView tv_my_dingdan;
    private TextView tv_my_zhifu;
    private TextView tv_my_shouhuo;
    private TextView tv_my_tuihuan;
    private ImageView iv_ding_left;
    private RelativeLayout rl_my_haitao;
    private LinearLayout ll_my_jifen;
    private LinearLayout ll_my_yinyuan;
    private LinearLayout ll_my_yu;
    private ImageView iv_car_img;
    private TextView textView6;
    private TextView tv_my_ka;
    private RelativeLayout ll_my_ka;
    private ImageView iv_juan_img;
    private TextView textView7;
    private TextView tv_my_juan;
    private RelativeLayout ll_my_juan;
    private ImageView iv_huzhao_img;
    private TextView textView8;
    private TextView tv_my_huzhao;
    private RelativeLayout ll_my_username;
    private ImageView iv_phone_img;
    private TextView textView9;
    private TextView tv_phone;
    private RelativeLayout ll_my_phone;
    private TextView ll_my_shouchang;
    private TextView ll_my_liulan;
    private TextView ll_my_pass;
    private TextView ll_my_shouhuo;
    private TextView tv_phone_one;
    private Button bt_tui;
    private LinearLayout ll_center_sucess;
    private LinearLayout ll_center_null;

    public PersonalCenterFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_center, container, false);
        initView(view);
        return view;

    }

    private void initView(View view) {
        bt_login = (Button) view.findViewById(R.id.bt_login);
        bt_add = (Button) view.findViewById(R.id.bt_add);

        bt_login.setOnClickListener(this);
        bt_add.setOnClickListener(this);
        textView = (TextView) view.findViewById(R.id.textView);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        ll_clear = (LinearLayout) view.findViewById(R.id.ll_clear);
        ll_clear.setOnClickListener(this);
        ll_help = (LinearLayout) view.findViewById(R.id.ll_help);
        ll_help.setOnClickListener(this);
        ll_idea = (RelativeLayout) view.findViewById(R.id.ll_idea);
        ll_idea.setOnClickListener(this);
        ll_about = (RelativeLayout) view.findViewById(R.id.ll_about);
        ll_about.setOnClickListener(this);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        ll_phone = (RelativeLayout) view.findViewById(R.id.ll_phone);
        ll_phone.setOnClickListener(this);
        iv_my_img = (ImageView) view.findViewById(R.id.iv_my_img);
        iv_my_img.setOnClickListener(this);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
        tv_vip = (TextView) view.findViewById(R.id.tv_vip);
        tv_vip.setOnClickListener(this);
        tv_my_dingdan = (TextView) view.findViewById(R.id.tv_my_dingdan);
        tv_my_dingdan.setOnClickListener(this);
        tv_my_zhifu = (TextView) view.findViewById(R.id.tv_my_zhifu);
        tv_my_zhifu.setOnClickListener(this);
        tv_my_shouhuo = (TextView) view.findViewById(R.id.tv_my_shouhuo);
        tv_my_shouhuo.setOnClickListener(this);
        tv_my_tuihuan = (TextView) view.findViewById(R.id.tv_my_tuihuan);
        tv_my_tuihuan.setOnClickListener(this);
        iv_ding_left = (ImageView) view.findViewById(R.id.iv_ding_left);
        iv_ding_left.setOnClickListener(this);
        rl_my_haitao = (RelativeLayout) view.findViewById(R.id.rl_my_haitao);
        rl_my_haitao.setOnClickListener(this);
        ll_my_jifen = (LinearLayout) view.findViewById(R.id.ll_my_jifen);
        ll_my_jifen.setOnClickListener(this);
        ll_my_yinyuan = (LinearLayout) view.findViewById(R.id.ll_my_yinyuan);
        ll_my_yinyuan.setOnClickListener(this);
        ll_my_yu = (LinearLayout) view.findViewById(R.id.ll_my_yu);
        ll_my_yu.setOnClickListener(this);
        iv_car_img = (ImageView) view.findViewById(R.id.iv_car_img);
        iv_car_img.setOnClickListener(this);
        textView6 = (TextView) view.findViewById(R.id.textView6);
        textView6.setOnClickListener(this);
        tv_my_ka = (TextView) view.findViewById(R.id.tv_my_ka);
        tv_my_ka.setOnClickListener(this);
        ll_my_ka = (RelativeLayout) view.findViewById(R.id.ll_my_ka);
        ll_my_ka.setOnClickListener(this);
        iv_juan_img = (ImageView) view.findViewById(R.id.iv_juan_img);
        iv_juan_img.setOnClickListener(this);
        textView7 = (TextView) view.findViewById(R.id.textView7);
        textView7.setOnClickListener(this);
        tv_my_juan = (TextView) view.findViewById(R.id.tv_my_juan);
        tv_my_juan.setOnClickListener(this);
        ll_my_juan = (RelativeLayout) view.findViewById(R.id.ll_my_juan);
        ll_my_juan.setOnClickListener(this);
        iv_huzhao_img = (ImageView) view.findViewById(R.id.iv_huzhao_img);
        iv_huzhao_img.setOnClickListener(this);
        textView8 = (TextView) view.findViewById(R.id.textView8);
        textView8.setOnClickListener(this);
        tv_my_huzhao = (TextView) view.findViewById(R.id.tv_my_huzhao);
        tv_my_huzhao.setOnClickListener(this);
        ll_my_username = (RelativeLayout) view.findViewById(R.id.ll_my_username);
        ll_my_username.setOnClickListener(this);
        iv_phone_img = (ImageView) view.findViewById(R.id.iv_phone_img);
        iv_phone_img.setOnClickListener(this);
        textView9 = (TextView) view.findViewById(R.id.textView9);
        textView9.setOnClickListener(this);
        tv_phone = (TextView) view.findViewById(R.id.tv_phone);
        tv_phone.setOnClickListener(this);
        ll_my_phone = (RelativeLayout) view.findViewById(R.id.ll_my_phone);
        ll_my_phone.setOnClickListener(this);
        ll_my_shouchang = (TextView) view.findViewById(R.id.ll_my_shouchang);
        ll_my_shouchang.setOnClickListener(this);
        ll_my_liulan = (TextView) view.findViewById(R.id.ll_my_liulan);
        ll_my_liulan.setOnClickListener(this);
        ll_my_pass = (TextView) view.findViewById(R.id.ll_my_pass);
        ll_my_pass.setOnClickListener(this);
        ll_my_shouhuo = (TextView) view.findViewById(R.id.ll_my_shouhuo);
        ll_my_shouhuo.setOnClickListener(this);
        tv_phone_one = (TextView) view.findViewById(R.id.tv_phone_one);
        tv_phone_one.setOnClickListener(this);
        bt_tui = (Button) view.findViewById(R.id.bt_tui);
        bt_tui.setOnClickListener(this);
        ll_center_sucess = (LinearLayout) view.findViewById(R.id.ll_center_sucess);
        ll_center_sucess.setOnClickListener(this);
        ll_center_null = (LinearLayout) view.findViewById(R.id.ll_center_null);
        ll_center_null.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login://登录
                Intent intent1 = new Intent(context, LoginActivity.class);
                startActivityForResult(intent1,12);
                break;
            case R.id.bt_add://注册
                startActivity(new Intent(context, RegisterActivity.class));
                break;
            case R.id.ll_clear://清除缓存
                textView2.setText("0B");
                Toast.makeText(context, "缓存已经清理", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_about:
                //关于银泰
                startActivity(new Intent(context, AboutActivity.class));
                break;
            case R.id.ll_help:
                //帮助中心
                startActivity(new Intent(context, HelpActivity.class));
                break;
            case R.id.ll_idea:
                startActivity(new Intent(context, IdeaActivity.class));
                //意见反馈
                break;
            case R.id.ll_phone:
                //客服电话
                Toast.makeText(context, "拨打电话", Toast.LENGTH_SHORT).show();
                String s = tv_phone_one.getText().toString().trim();
                Intent intent = new Intent(Intent.ACTION_CALL, Uri
                        .parse("tel:" + s));
                startActivity(intent);
                break;
            case R.id.tv_my_dingdan://订单
                Toast.makeText(context, "订单", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_my_zhifu://待支付
                Toast.makeText(context, "待支付", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_my_shouhuo://代收货
                Toast.makeText(context, "代收货", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_my_tuihuan://退换货
                Toast.makeText(context, "退换货", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_my_haitao://海涛
                Toast.makeText(context, "海淘", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_jifen://积分
                Toast.makeText(context, "积分", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_yinyuan://银元
                Toast.makeText(context, "银元", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_yu://余额
                Toast.makeText(context, "余额", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_ka://银泰卡
                Toast.makeText(context, "银泰卡", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_juan://优惠券
                Toast.makeText(context, "优惠券", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_username://银泰护照
                Toast.makeText(context, "银泰护照", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_phone://手机号
                Toast.makeText(context, "手机号", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_shouchang://收藏
                Toast.makeText(context, "收藏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_liulan://浏览记录
                Toast.makeText(context, "浏览记录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_pass://支付密码
                Toast.makeText(context, "支付密码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_my_shouhuo://收货地址
                Toast.makeText(context, "收货地址", Toast.LENGTH_SHORT).show();
                break;


            case R.id.bt_tui://退出登录
                ll_center_sucess.setVisibility(View.GONE);
                ll_center_null.setVisibility(View.VISIBLE);
                bt_tui.setVisibility(View.GONE);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==12&&resultCode==10){
            String log = data.getStringExtra("log");
            if (log.equals("1")){
                ll_center_sucess.setVisibility(View.VISIBLE);
                ll_center_null.setVisibility(View.GONE);
                bt_tui.setVisibility(View.VISIBLE);
            }
        }
    }

}
