package com.example.project_somake.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.project_somake.R;
import com.example.project_somake.ui.base.GetPhonePropertiesUtils;
import com.example.project_somake.ui.model.Bean;
import com.example.project_somake.ui.model.Dan;
import com.example.project_somake.ui.prsenter.MyPresenter;
import com.example.project_somake.utlis.ShowLargeLog;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TwFragment extends Fragment {

    private ListView mList;
    List<Bean.DataBean.ActivityinfoBean> listb=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tw, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View view) {
        mList = (ListView) view.findViewById(R.id.mList);
    }
    private void initData() {
        RequestBody requestBodyPost1 = new FormBody.Builder()
                .add("yintaisourceId", "1090610")
                .add("sourceId", "1090610")
                .add("authtype", "md5")
                .add("os", "android")
                .add("ver", "1.2")
                .add("screenwidth", String.valueOf(GetPhonePropertiesUtils.getPhoneWidth(getActivity())))
                .add("screenheight", String.valueOf(GetPhonePropertiesUtils.getPhoneHeigth(getActivity())))
                .add("client_v", "4.0.1")
                .add("osversion", GetPhonePropertiesUtils.getPhoneOsversion())
                .add("devicename", GetPhonePropertiesUtils.getPhoneDeviceName())
                .add("carrier", GetPhonePropertiesUtils.getPhoneCarrier(getActivity()))
                .add("imei", GetPhonePropertiesUtils.getPhoneIMEI(getActivity()))
                .add("macid", GetPhonePropertiesUtils.getPhoneMacId(getActivity()))
                .add("uid", "")
                .add("signtype", "1")
                .add("apptype", "1")
                .add("type", "1")
                .add("timereq", "20171017164939")
                .add("sign", "00cc0a56b6ac882c80c401b183a127f0")
                .add("method", "products.limitbuy")
                .build();
        Dan.getDan().post("https://api.yintai.com/mobile/service", requestBodyPost1, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                ShowLargeLog.show(string,3000);
                Gson gson=new Gson();
                Type type = new TypeToken<Bean>(){}.getType();
                Bean  bean= gson.fromJson(string,type);
                listb.addAll(bean.getData().getActivityinfo());
            }
        });
        MyAdapter adapter=new MyAdapter(getActivity(),listb);
        mList.setAdapter(adapter);
    }
}
