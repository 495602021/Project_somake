package com.example.project_somake.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<String> listt;
    List<Fragment> listf;
    public MyPagerAdapter(FragmentManager fm, List<Fragment> listf, List<String> listt) {
         super(fm);
     this.listt=listt;
     this.listf=listf;
    }

    @Override
    public Fragment getItem(int position) {
        return listf.get(position);
    }

    @Override
    public int getCount() {
        return listf.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listt.get(position);
    }
}
