package com.example.project_somake.utlis;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;


/**
 * Created by Administrator on 2017-09-26.
 */
public  class ShowStyle {

    private static AlertDialog.Builder builder;
    private static ProgressDialog dialog;


    //显示一个按钮
    public static void ShowFirst(Context context,int icon, String title, String message, String text,DialogInterface.OnClickListener a){
        builder = new AlertDialog.Builder(context);
        builder.setIcon(icon);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(text,a);
        builder.create();
        builder.show();
    }
    //显示两个按钮
    public static void ShowTwo(Context context,int icon, String title, String message, String text,
                               DialogInterface.OnClickListener a,String text2,DialogInterface.OnClickListener b){
        builder = new AlertDialog.Builder(context);
        builder.setIcon(icon);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(text,a);
        builder.setNegativeButton(text2,b);
        builder.create();
        builder.show();
    }
    //显示酷炫的进度条
    public  static  void  ShowProgesses(Context context){
        dialog = new ProgressDialog(context);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setMessage("正在加载");
        dialog.show();
        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                }
            },3000);

    }


}

