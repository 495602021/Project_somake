package com.example.project_somake.mycenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.project_somake.R;
public class HelpActivity extends AppCompatActivity {

    private ImageView iv_help_left;
    private ListView lv_help_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        initView();
    }

    private void initView() {
        iv_help_left = (ImageView) findViewById(R.id.iv_help_left);
        lv_help_list = (ListView) findViewById(R.id.lv_help_list);
        iv_help_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
