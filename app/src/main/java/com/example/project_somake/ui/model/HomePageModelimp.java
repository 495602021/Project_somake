package com.example.project_somake.ui.model;


import android.content.Context;

import com.example.project_somake.Intenfaces.HttpCallBack;
import com.example.project_somake.concat.Concat;
import com.example.project_somake.entity.HomeBean;
import com.example.project_somake.http.product.HttpRequest;
import com.example.project_somake.ui.factor.HttpRequestFactor;
import com.example.project_somake.ui.factor.HttpRequestFactorImp;
import com.example.project_somake.utlis.RetofitHttpRequest;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class HomePageModelimp implements HomePageModel {
    @Override
    public void request(Context context, Map<String,String> mParams, HttpCallBack callback) {
        HttpRequestFactor factor = new HttpRequestFactorImp();
        HttpRequest httpRequest = factor.create(RetofitHttpRequest.class);

        Type types = new TypeToken<HomeBean>(){}.getType();
        httpRequest.post(Concat.NEWSAPI,types,mParams,callback);
    }
}