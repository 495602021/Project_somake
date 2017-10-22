package com.example.project_somake.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.project_somake.R;
import com.example.project_somake.ui.adapter.MyPagerAdapter;
import com.example.project_somake.ui.base.MyViewPage;
import com.example.project_somake.ui.prsenter.MyPresenter;
import java.util.List;

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

public class ClassificationFragment extends Fragment implements InterfaceView {
    private TabLayout tab;
    private MyViewPage pager_view;
    MyPagerAdapter adapter;
    MyPresenter presenter=new MyPresenter(this);
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.qiangxian, container, false);
        initView(inflate);
        return inflate;
    }
    private void initView(View inflate) {
        tab = (TabLayout) inflate.findViewById(R.id.tab);
        pager_view = (MyViewPage) inflate.findViewById(R.id.pager_view);
        presenter.min();
    }

    @Override
    public void isShowViewPager(List<Fragment> listf, List<String> lists) {
        tab.setupWithViewPager(pager_view);
        adapter = new MyPagerAdapter(getFragmentManager(),listf, lists);
        pager_view.setAdapter(adapter);
        pager_view.setPagingEnabled(false);
        pager_view.setCurrentItem(0);
    }
}
