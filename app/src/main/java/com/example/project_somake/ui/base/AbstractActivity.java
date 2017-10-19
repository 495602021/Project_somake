package com.example.project_somake.ui.base;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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

public abstract class AbstractActivity extends AppCompatActivity {
    /**
     * 默认不显示头布局
     */

    public boolean isShowFooterView = false;
    /**
     * 默认不显示底布局
     */

    public boolean isShowHeaderView = false;

    /**
     * 默认不显示非滚动布局
     */
    public boolean isShowNotScrollView = false;
    /**
     * 默认不显示滚动布局
     */
    public boolean isShowScrollView = false;
    /**
     * 默认不显示刷新布局
     */
    public boolean isShowRefreshView = false;
    /**
     * 默认不显示错误布局
     */
    public boolean isShowErrorView = false;

    /**
     * 初始化BodyView显示
     * 控制体布局使用哪一个
     * 不带滚动的View
     * setShowNotScrollView(int visible)
     * 带滚动的View
     * setShowScrollView(int visible)
     * 带刷新的View
     * setShowRefreshView(int visible)
     * 失败的View
     * setShowErrorView(int visible)
     */
    public abstract void initBodyView();

    /**
     * 控制alertdialog 的显示
     *
     * @param dialog
     */
    public abstract void showDialog(AlertDialog dialog);

    /**
     * 控制alertdialog 不显示
     *
     * @param dialog
     */
    public abstract void dismissDialog(AlertDialog dialog);

    /**
     * 设置头布局
     *
     * @param id
     */
    public abstract void setHeaderView(int id);

    /**
     * 设置是否显示头布局
     */
    public abstract void setHeaderViewVisible(int visible);

    /**
     * 设置主体布局
     *
     * @param id
     */
    public abstract void setBodyView(int id);

    /**
     * 设置底部布局
     *
     * @param id
     */
    public abstract void setFooterView(int id);

    /**
     * 设置是否显示底布局
     */
    public abstract void setFooterViewVisible(int visible);

    /**
     * 设置是否显示 非滚动 View
     *
     * @param visible
     */

    public abstract void setShowNotScrollView(int visible);

    /**
     * 设置是否显示 滚动 View
     *
     * @param visible
     */
    public abstract void setShowScrollView(int visible);

    /**
     * 设置是否显示 刷新 View
     *
     * @param visible
     */
    public abstract void setShowRefreshView(int visible);

    /**
     * 设置是否显示 错误 View
     *
     * @param visible
     */
    public abstract void setShowErrorView(int visible);

    /**
     * 设置是否显示 点击调至顶端View
     *
     * @param visible
     */
    public abstract void setToTopView(int visible);

    /**
     * 检查是否显示头布局
     */
    public abstract void checkHeaderView();

    /**
     * 检查选择哪个布局进行显示
     */
    public abstract void checkBodyView();

    /**
     * 检查是否显示底布局
     */
    public abstract void checkFooterView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initBodyView();
    }

}
