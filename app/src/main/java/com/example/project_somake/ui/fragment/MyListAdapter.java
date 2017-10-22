package com.example.project_somake.ui.fragment;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.project_somake.R;
import com.example.project_somake.ui.model.Bean;

import java.util.List;

public class MyListAdapter extends BaseAdapter {
    Context context;
    List<Bean.DataBean.ActivityinfoBean> listd;

    public MyListAdapter(Context context, List<Bean.DataBean.ActivityinfoBean> listd) {
        this.context = context;
        this.listd = listd;
    }

    @Override
    public int getCount() {
        return listd.size();
    }

    @Override
    public Object getItem(int position) {
        return listd.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolders h;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_1, null);
            h=new ViewHolders(convertView);
            convertView.setTag(h);
        }else{
            h= (ViewHolders) convertView.getTag();
        }
        h.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,XqActivity.class));
            }
        });
        Glide.with(context).load(listd.get(position).getActivitylist().get(position).getImgurl()).into(h.img2);
        h.name2.setText(listd.get(position).getActivitylist().get(position).getTitle());
        h.money2.setText(listd.get(position).getActivitylist().get(position).getDiscount());
        return convertView;
    }
    public static class ViewHolders {
        public View rootView;
        public ImageView img2;
        public  TextView name2;
        public  TextView money2;
        public ViewHolders(View rootView) {
            this.rootView = rootView;
            this.img2 = (ImageView) rootView.findViewById(R.id.img2);
            this.name2 = (TextView) rootView.findViewById(R.id.name2);
            this.money2 = (TextView) rootView.findViewById(R.id.money2);
        }
    }
}
