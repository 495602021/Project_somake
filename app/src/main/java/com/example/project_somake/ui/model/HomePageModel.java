package com.example.project_somake.ui.model;


import android.content.Context;

import com.example.project_somake.Intenfaces.HttpCallBack;

import java.util.Map;

public interface HomePageModel {
     void request(Context context, Map<String, String> mParams, HttpCallBack callback);
}
