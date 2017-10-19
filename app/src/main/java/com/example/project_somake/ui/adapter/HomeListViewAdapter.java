package com.example.project_somake.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.project_somake.entity.HomeBean;
import com.example.project_somake.utlis.HomeListViewUtils;

import java.util.ArrayList;


public class HomeListViewAdapter extends BaseAdapter {
    private ArrayList<HomeBean.DataBean.TemplatelistBean> mList;
    private Context context;

    public HomeListViewAdapter(ArrayList<HomeBean.DataBean.TemplatelistBean> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public int getViewTypeCount() {
        return HomeListViewUtils.ITEM_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        return HomeListViewUtils.getItemType(mList.get(position).getTemplatetype());
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return HomeListViewUtils.getView(context, convertView, getItemViewType(position),mList.get(position));
    }
}
