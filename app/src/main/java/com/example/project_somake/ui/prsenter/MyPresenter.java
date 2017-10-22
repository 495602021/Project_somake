package com.example.project_somake.ui.prsenter;

import android.support.v4.app.Fragment;
import com.example.project_somake.ui.fragment.InterfaceView;
import com.example.project_somake.ui.model.InterfaceModel;
import com.example.project_somake.ui.model.RealizeInterfaceModel;

import java.util.List;

public class MyPresenter {
   private RealizeInterfaceModel model;
   private InterfaceView view;
    public MyPresenter(InterfaceView view) {
        this.view = view;
         model=new RealizeInterfaceModel();
    }
    public  void  min(){
        model.listf(new InterfaceModel() {
            @Override
            public void datas(List<Fragment> listf, List<String> lists) {
                view.isShowViewPager(listf,lists);
            }
        });
    }
}
