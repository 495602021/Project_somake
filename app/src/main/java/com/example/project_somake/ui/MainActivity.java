package com.example.project_somake.ui;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.example.project_somake.R;
import com.example.project_somake.ui.adapter.HomeAdapter;
import com.example.project_somake.ui.base.BaseActivity;
import com.example.project_somake.ui.fragment.ClassificationFragment;
import com.example.project_somake.ui.fragment.HomePageFragment;
import com.example.project_somake.ui.fragment.PersonalCenterFragment;
import com.example.project_somake.ui.fragment.ShoppingCartFragment;
import com.example.project_somake.ui.fragment.SpecialOfferFragment;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends BaseActivity {
    private ViewPager mViewPager;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private ArrayList<String> mTabList = new ArrayList<>();
    private HomeAdapter adapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 设置 传给主题布局的布局
         */
        setHeaderView(R.layout.header);
        setBodyView(R.layout.activity_main);
        setFooterView(R.layout.homeacvtivity_footer);
        initView();
    }

    /**
     * 重写方法 设置 头部局是否显示
     * 尾布局是否显示
     * 主体布局显示哪个
     */

    @Override
    public void initBodyView() {
        setHeaderViewVisible(View.VISIBLE);
        setShowNotScrollView(View.VISIBLE);
        setFooterViewVisible(View.VISIBLE);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();      //调用双击退出函数
        }
        return false;
    }

    /**
     * 双击退出函数
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish();
            System.exit(0);
        }
    }



    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mList.add(new HomePageFragment());
        mList.add(new SpecialOfferFragment());
        mList.add(new ClassificationFragment());
        mList.add(new ShoppingCartFragment());
        mList.add(new PersonalCenterFragment(MainActivity.this));
        mTabList.add("首页");
        mTabList.add("分类");
        mTabList.add("特卖");
        mTabList.add("购物车");
        mTabList.add("我的银泰");
        adapter = new HomeAdapter(getSupportFragmentManager(), mList, mTabList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        TabLayout.Tab one = mTabLayout.getTabAt(0);
        TabLayout.Tab two = mTabLayout.getTabAt(1);
        TabLayout.Tab three = mTabLayout.getTabAt(2);
        TabLayout.Tab four = mTabLayout.getTabAt(3);
        TabLayout.Tab fou = mTabLayout.getTabAt(4);
        one.setIcon(getResources().getDrawable(R.mipmap.shouye1));
        two.setIcon(getResources().getDrawable(R.mipmap.temai));
        three.setIcon(getResources().getDrawable(R.mipmap.fenlei));
        four.setIcon(getResources().getDrawable(R.mipmap.gouwuche1));
        fou.setIcon(getResources().getDrawable(R.mipmap.gerenzhongxin1));
        //设置默认选中第一个
        mTabLayout.getTabAt(0).select();
    }

}
