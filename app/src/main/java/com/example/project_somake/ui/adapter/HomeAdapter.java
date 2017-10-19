package com.example.project_somake.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class HomeAdapter extends FragmentPagerAdapter {

    private  ArrayList<String> mTabList;
    private  ArrayList<Fragment> mList;



    public HomeAdapter(FragmentManager fm, ArrayList<Fragment> mList, ArrayList<String> mTabList) {
        super(fm);
        this.mList = mList;
        this.mTabList = mTabList;
    }




    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabList.get(position);
    }
}
