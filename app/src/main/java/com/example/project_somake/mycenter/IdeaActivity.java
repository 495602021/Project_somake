package com.example.project_somake.mycenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_somake.R;
import com.example.project_somake.utlis.Regular;




public class IdeaActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_idea_left;
    private TextView tv_idea_phone;
    private RadioButton rb_xingneng;
    private RadioButton rb_tiyan;
    private RadioButton rb_error;
    private RadioButton rb_qita;
    private EditText et_idea_edittext;
    private EditText et_idea_phone;
    private Button bt_idea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);
        initView();
    }

    private void initView() {
        iv_idea_left = (ImageView) findViewById(R.id.iv_idea_left);
        tv_idea_phone = (TextView) findViewById(R.id.tv_idea_phone);
        rb_xingneng = (RadioButton) findViewById(R.id.rb_xingneng);
        rb_tiyan = (RadioButton) findViewById(R.id.rb_tiyan);
        rb_error = (RadioButton) findViewById(R.id.rb_error);
        rb_qita = (RadioButton) findViewById(R.id.rb_qita);
        et_idea_edittext = (EditText) findViewById(R.id.et_idea_edittext);
        et_idea_phone = (EditText) findViewById(R.id.et_idea_phone);
        bt_idea = (Button) findViewById(R.id.bt_idea);
        tv_idea_phone.setOnClickListener(this);
        iv_idea_left.setOnClickListener(this);
        String s = tv_idea_phone.getText().toString();

        String s1="<font color='#FF0000'>400-119-1111</font>";

        tv_idea_phone.setText(s+ Html.fromHtml(s1));


        bt_idea.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_idea://提交意见
                submit();
                break;
            case R.id.iv_idea_left://左箭头退出界面
                finish();
                break;
            case R.id.tv_idea_phone://打电话联系客服
                Toast.makeText(IdeaActivity.this, "打电话", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void submit() {
        // validate
        String edittext = et_idea_edittext.getText().toString().trim();
        if (TextUtils.isEmpty(edittext)) {
            Toast.makeText(this, "请输入你的意见或建议，完美将不断改进", Toast.LENGTH_SHORT).show();
            return;
        }

        String phone = et_idea_phone.getText().toString().trim();
        if (TextUtils.isEmpty(phone) && !Regular.getInstance().isMobileNO(phone)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }else {
            Toast.makeText(IdeaActivity.this, "信息提交成功", Toast.LENGTH_SHORT).show();
            finish();
        }

        // TODO validate success, do something


    }
}
