package com.example.project_somake.ui.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.project_somake.R;
import com.example.project_somake.entity.HomeBean;
import com.example.project_somake.ui.adapter.HomeListViewAdapter;
import com.example.project_somake.ui.base.BaseParams;
import com.example.project_somake.ui.iview.IhomePageView;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * -------- This is 羊驼! -------
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * Created by 习爸爸 on 2017/9/28.
 */
/*
代码获取
screenwidth	：		//屏幕宽度
        screenheight	：		//屏幕高度
        osversion	：			//系统版本
        devicename	：		//设备名称
        carrier	：			//设备运营商
        imei	：				//设备Id
        macid	：				//设备Mac地址

*/
public class HomePageFragment extends Fragment implements IhomePageView<HomeBean> {
    private ArrayList<HomeBean.DataBean.TemplatelistBean> mList = new ArrayList<>();
    private ArrayList<String> banner = new ArrayList<>();
    private HomeListViewAdapter adapter;
    private ListView listView;
    private View inflate;
    private FlyBanner mHomeActivity_banner;
    public  SharedPreferences pref;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        listView = new ListView(getActivity());
        inflate = View.inflate(getActivity(), R.layout.homeactivity_banner, null);
        mHomeActivity_banner = (FlyBanner) inflate.findViewById(R.id.mHomeActivity_Banner);
        adapter = new HomeListViewAdapter(mList, getActivity());
        listView.setAdapter(adapter);
        HomePagePresenter presenter = new HomePagePresenter(this);
        Map<String,String> mParams= new HashMap<>();
        BaseParams.getParams(mParams,getActivity());
        pref = getActivity().getSharedPreferences("publicfile", 0);
        String appuid = pref.getString("appguid", "");
        String userid = pref.getString("userId", "");
        mParams.put("method", "products.template.getpage");
        mParams.put("pageid", "104001");
        mParams.put("pageindex", "1");
        mParams.put("ver", "3.0");
        presenter.request(getActivity(),mParams);

        return listView;
    }


    @Override
    public void success(HomeBean homeBean) {
        Log.e("TAG",homeBean.toString());
        HomeBean.DataBean data = homeBean.getData();
        List<HomeBean.DataBean.TemplatelistBean> templatelist = data.getTemplatelist();
        List<HomeBean.DataBean.BannerlistBean> bannerlist = data.getBannerlist();
        mList.addAll(templatelist);
        for (int i = 0; i < bannerlist.size(); i++) {
            banner.add(bannerlist.get(i).getImgurl());
        }
        mHomeActivity_banner.setImagesUrl(banner);
        listView.addHeaderView(inflate);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Throwable t) {
    Log.e("TAG",t.toString());
    }

}
