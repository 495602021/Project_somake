package com.example.project_somake.ui.model;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Dan {
    private static Dan dan;
    private OkHttpClient client;
    private Dan(){
       client= new OkHttpClient.Builder().build();
    }
    public static Dan getDan(){
      if(dan==null){
          dan=new Dan();
      }
        return dan;
    }
    public void get(){}
    public void post(String url, RequestBody formBody, Callback callback) {
        Request request = new Request.Builder().url(url).post(formBody).build();
        client.newCall(request).enqueue(callback);
    }
}
