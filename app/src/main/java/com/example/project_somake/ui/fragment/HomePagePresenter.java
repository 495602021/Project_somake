package com.example.project_somake.ui.fragment;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import com.example.project_somake.Intenfaces.HttpCallBack;
import com.example.project_somake.entity.HomeBean;
import com.example.project_somake.ui.iview.IhomePageView;
import com.example.project_somake.ui.model.HomePageModel;
import com.example.project_somake.ui.model.HomePageModelimp;

import java.util.Map;


public class HomePagePresenter {
    private IhomePageView view;
    private HomePageModel model;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    HomeBean obj = (HomeBean) msg.obj;
                    view.success(obj);

                    break;
                case 2:
                    view.failure((Throwable) msg.obj);
                    break;
            }
        }
    };

    public HomePagePresenter(HomePageFragment view) {
        this.view = view;
        model = new HomePageModelimp();
    }

    public void request(Context context, Map<String,String> mParams) {
        model.request(context, mParams, new HttpCallBack() {
            @Override
            public void success(Object o) {
                Message message = new Message();
                message.what=1;
                message.obj=o;
                handler.sendMessage(message);
            }

            @Override
            public void failure(Throwable t) {
                Message message = new Message();
                message.what=2;
                message.obj=t;
                handler.sendMessage(message);
            }
        });
    }
}