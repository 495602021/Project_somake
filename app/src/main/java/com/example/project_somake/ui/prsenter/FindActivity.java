package com.example.project_somake.ui.prsenter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.project_somake.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener, TextWatcher {


    private ImageView imageView;
    private EditText find;
    private TextView textView;
    private RadioButton mRadioButton;
    private RadioButton mRadioButton2;
    private RadioGroup mRadioGroup;
    private RelativeLayout activity_find;
    private LinearLayout find_lin;
    private LinearLayout find_lin2;
    private LinearLayout find_lin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        initView();
        initData();
    }

    private void initdata() {
        String s = find.getText().toString();
        if (s.equals("")){
            textView.setText("取消");
        }else {
            textView.setText("搜索");
        }

    }


    private void initData() {
        WindowManager wm = (WindowManager) this
                .getSystemService(Context.WINDOW_SERVICE);
        float width = wm.getDefaultDisplay().getWidth();
        ObjectAnimator animator = ObjectAnimator.ofFloat(find_lin2, "translationX", -width, 0.0f);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(find_lin3, "translationX", width, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator,animator1);
        animatorSet.setDuration(1000);
        animatorSet.start();
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        find = (EditText) findViewById(R.id.find);
        find.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(this);
        mRadioButton = (RadioButton) findViewById(R.id.mRadioButton);
        mRadioButton.setOnClickListener(this);
        mRadioButton2 = (RadioButton) findViewById(R.id.mRadioButton2);
        mRadioButton2.setOnClickListener(this);
        mRadioGroup = (RadioGroup) findViewById(R.id.mRadioGroup);
        mRadioGroup.setOnClickListener(this);
        activity_find = (RelativeLayout) findViewById(R.id.activity_find);
        mRadioButton.setBackgroundColor(Color.BLACK);
        mRadioButton.setTextColor(Color.WHITE);
        find_lin = (LinearLayout) findViewById(R.id.find_lin);
        find_lin.setOnClickListener(this);
        find_lin2 = (LinearLayout) findViewById(R.id.find_lin2);
        find_lin2.setOnClickListener(this);
        find_lin3 = (LinearLayout) findViewById(R.id.find_lin3);
        find_lin3.setOnClickListener(this);
        find.addTextChangedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                finish();
                break;
            case R.id.textView:
                finish();
                break;
            case R.id.mRadioButton:
                if (mRadioButton.isChecked()) {
                    mRadioButton.setBackgroundColor(Color.BLACK);
                    mRadioButton.setTextColor(Color.WHITE);
                    mRadioButton2.setBackgroundColor(Color.WHITE);
                    mRadioButton2.setTextColor(Color.BLACK);

                    initData();

                }
                break;
            case R.id.mRadioButton2:
                if (mRadioButton2.isChecked()) {
                    mRadioButton.setBackgroundColor(Color.WHITE);
                    mRadioButton.setTextColor(Color.BLACK);
                    mRadioButton2.setBackgroundColor(Color.BLACK);
                    mRadioButton2.setTextColor(Color.WHITE);
                    initData();
                }
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
initdata();
    }
}
