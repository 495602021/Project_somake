package com.example.project_somake.mycenter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_somake.R;
import com.example.project_somake.utlis.Regular;
import com.example.project_somake.utlis.SPUtils;




public class RegisterActivity extends AppCompatActivity implements View.OnClickListener, TextWatcher {

    private ImageView iv_left;
    private EditText et_name;
    private EditText et_yan;
    private EditText et_pass;
    private Button bt_zhuche;
    private Button bt_zhuche_2;
    private Button bt_yanzheng;
    private TextView tv_title;
    private TextView tv_title2;
    private TextView tv_content;
    private String s;
    private String v1;
    private String yan;
    private String pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        Intent intent = getIntent();

        int key = intent.getIntExtra("key",2);
        if (key==1) {
            tv_title.setText("忘记密码");
            tv_title2.setText("请输入手机号进行验证和重置密码");
            tv_content.setTextColor(Color.RED);
            tv_content.setText("如果您已关联银泰网和银泰护照号，重置密码将同时重置两个账号。");
            bt_zhuche_2.setText("重置密码");
        }


    }

    private void initView() {
        iv_left = (ImageView) findViewById(R.id.iv_left);
        et_name = (EditText) findViewById(R.id.et_name);
        et_yan = (EditText) findViewById(R.id.et_yan);
        et_pass = (EditText) findViewById(R.id.et_pass);
        bt_zhuche = (Button) findViewById(R.id.bt_zhuche);
        bt_zhuche.setOnClickListener(this);
        bt_zhuche_2 = (Button) findViewById(R.id.bt_zhuche_2);

        bt_zhuche_2.setOnClickListener(this);
        bt_yanzheng = (Button) findViewById(R.id.bt_yanzheng);
        bt_yanzheng.setOnClickListener(this);
        iv_left.setOnClickListener(this);
        et_name.addTextChangedListener(this);
        et_yan.addTextChangedListener(this);
        et_pass.addTextChangedListener(this);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title2 = (TextView) findViewById(R.id.tv_title2);
        tv_content = (TextView) findViewById(R.id.tv_content);
        s = et_name.getText().toString();


    }
    public void sendSmsWithBody(Context context, String number, String body) {

        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);

        sendIntent.setData(Uri.parse("smsto:" + number));

        sendIntent.putExtra("sms_body", body);

        context.startActivity(sendIntent);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_left:
                finish();
                break;
            case R.id.bt_zhuche:
                String name1 = et_name.getText().toString();
                String s = et_yan.getText().toString();
                if (Regular.getInstance().isMobileNO(name1)&&s.equals(v1)){
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    SPUtils.put(RegisterActivity.this,"login",et_name.getText().toString());
                    SPUtils.put(RegisterActivity.this,"logpaw",et_pass.getText().toString());
                    finish();
                }else {
                    Toast.makeText(RegisterActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.bt_yanzheng:
                initYanzheng();
                break;
        }
    }

    private void initYanzheng() {
        String s1 = et_name.getText().toString();
        if (s1.equals("") || !Regular.getInstance().isMobileNO(s1)) {
            new AlertDialog.Builder(RegisterActivity.this)
                    .setTitle("温馨提示")
                    .setMessage("请输入手机号")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).create().show();

        } else {
            v1 = String.valueOf((int) (Math.random() * 1000000));
            if (!TextUtils.isEmpty(s1)) {
                sendSmsWithBody(RegisterActivity.this, s1, v1);
                et_yan.setText(v1);
            }
            //倒计时验证码
            new CountDownTimer(10 * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    // TODO Auto-generated method stub
                    bt_yanzheng.setText(millisUntilFinished / 1000 + "s");
                }

                @Override
                public void onFinish() {
                    bt_yanzheng.setText("获取验证码");
                }
            }.start();
        }
    }

    private void submit() {
        String s2 = et_name.getText().toString();
        String pass1 = et_pass.getText().toString();
        String yan1 = et_yan.getText().toString();
        if (s2.equals("") || pass1.equals("") || yan1.equals("")) {
            bt_zhuche.setVisibility(View.GONE);
            bt_zhuche_2.setVisibility(View.VISIBLE);
        } else {
            bt_zhuche.setVisibility(View.VISIBLE);
            bt_zhuche_2.setVisibility(View.GONE);
        }
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        submit();
    }
}
