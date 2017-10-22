package com.example.project_somake.ui.model;

import android.support.v4.app.Fragment;

import com.example.project_somake.ui.fragment.OneFragment;
import com.example.project_somake.ui.fragment.TwFragment;
import java.util.ArrayList;
import java.util.List;

public class RealizeInterfaceModel implements MyCallBack{
    @Override
    public void listf(InterfaceModel model) {
        List<Fragment> listff = new ArrayList<>();
        listff.add(new OneFragment());
        listff.add(new TwFragment());
        listff.add(new OneFragment());
       List<String> listt = new ArrayList<>();
        listt.add("推荐");
        listt.add("最新");
        listt.add("特卖爆推");
        model.datas(listff,listt);
    }
}
