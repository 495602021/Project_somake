package com.example.project_somake.mycenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_somake.R;
import com.example.project_somake.ui.fragment.LoginFragment;
import com.example.project_somake.ui.prsenter.MyAdapter;
import com.example.project_somake.utlis.SPUtils;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView iv_login_left;
    private TextView tv_add;
    private TextView tv_login_hu;
    private TextView tv_login_zhang;
    private EditText et_log_name;
    private EditText et_log_pass;
    private Button bt_login_button;
    private TextView tv_wang;
    private ViewPager vp_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initDate();
    }

    private void initDate() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new LoginFragment(LoginActivity.this));
        fragments.add(new LoginFragment(LoginActivity.this));
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(), LoginActivity.this, fragments);
        vp_login.setAdapter(myAdapter);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login_add:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.tv_login_hu:
                vp_login.setCurrentItem(0);
                LoginFragment.ll_login_text.setVisibility(View.VISIBLE);
                LoginFragment.ll_login_text2.setVisibility(View.GONE);

                break;
            case R.id.tv_login_zhang:
                vp_login.setCurrentItem(1);
                LoginFragment.ll_login_text.setVisibility(View.GONE);
                LoginFragment.ll_login_text2.setVisibility(View.VISIBLE);

                break;
            case R.id.iv_login_left:
                finish();
                break;
            case R.id.bt_login_button:
                initLog();


                break;
            case R.id.tv_wang:
                Toast.makeText(LoginActivity.this, "忘记密码", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                intent.putExtra("key",1);
                startActivity(intent);
                break;

        }

    }

    private void initLog() {
        String name = String.valueOf(SPUtils.get(LoginActivity.this, "login", "123"));
        String logpaw = String.valueOf(SPUtils.get(LoginActivity.this, "logpaw", "123"));
        String s = et_log_name.getText().toString();
        String s1 = et_log_pass.getText().toString();

        if (s.equals(name)&&s1.equals(logpaw)){
            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent();
            intent1.putExtra("log","1");
            setResult(10,intent1);
            finish();
        }


    }


    private void initView() {
        iv_login_left = (ImageView) findViewById(R.id.iv_login_left);
        tv_add = (TextView) findViewById(R.id.tv_login_add);
        tv_login_hu = (TextView) findViewById(R.id.tv_login_hu);
        tv_login_zhang = (TextView) findViewById(R.id.tv_login_zhang);
        et_log_name = (EditText) findViewById(R.id.et_log_name);
        et_log_pass = (EditText) findViewById(R.id.et_log_pass);
        bt_login_button = (Button) findViewById(R.id.bt_login_button);
        tv_wang = (TextView) findViewById(R.id.tv_wang);
        vp_login = (ViewPager) findViewById(R.id.vp_login);
        tv_login_hu.setOnClickListener(this);
        tv_login_zhang.setOnClickListener(this);
        iv_login_left.setOnClickListener(this);

        bt_login_button.setOnClickListener(this);
        tv_wang.setOnClickListener(this);
        tv_add.setOnClickListener(this);
    }



}
