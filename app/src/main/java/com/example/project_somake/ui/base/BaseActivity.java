package com.example.project_somake.ui.base;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.project_somake.R;


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

public abstract class BaseActivity extends AbstractActivity {

    /**
     * 头布局
     */
    private LinearLayout mHeaderView;
    /**
     * 尾部布局
     */
    private LinearLayout mFooterView;
    /**
     * 主体布局
     */
    private RelativeLayout mBodyView;
    /**
     * 刷新布局
     */
    private LinearLayout mRefreshiBody;
    /**
     * 主体： 刷新控件
     */
    private SwipeRefreshLayout mRefreshiBody_SwipeRefreshView;
    /**
     * 主体： 滑动布局
     */
    private LinearLayout mScrollBody;
    /**
     * 主体： 滑动控件
     */
    private ScrollView mScrollBody_ScrollView;
    /**
     * 主体： 非滑动布局
     */
    private LinearLayout mNotScrollBody;
    /**
     * 主体： 错误的布局
     */
    private LinearLayout mErrorBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initView();
        checkHeaderView();
        checkBodyView();
        checkFooterView();
    }

    /**
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
    @Override
    public abstract void initBodyView();

    /**
     * 显示Dialog
     *
     * @param dialog
     */
    @Override
    public void showDialog(AlertDialog dialog) {
        dialog.show();
    }

    /**
     * 隐藏Dialog
     *
     * @param dialog
     */
    @Override
    public void dismissDialog(AlertDialog dialog) {
        dialog.dismiss();
    }

    /**
     * 设置头部View
     *
     * @param id View的ID
     */
    @Override
    public void setHeaderView(int id) {
        View headerView = View.inflate(this, id, null);
        mHeaderView.addView(headerView);
    }

    /**
     * 设置主体View
     *
     * @param id View的ID
     */
    @Override
    public void setBodyView(int id) {
        View bodyView = View.inflate(this, id, null);
        /**
         * 判断使用的是哪个布局
         *              如果是就把 通过传过来的id获取到的布局 加载进主体布局
         */
        if (isShowRefreshView) {
            mRefreshiBody.addView(bodyView);
            return;
        }
        if (isShowScrollView) {
            mScrollBody.addView(bodyView);
            return;
        }
        if (isShowNotScrollView) {
            mNotScrollBody.addView(bodyView);
            return;
        }
        if (isShowErrorView) {
            TextView textView = new TextView(this);
            textView.setText("错误");
            mErrorBody.addView(textView);
            return;
        }

    }

    /**
     * 设置底布局
     *
     * @param id
     */
    @Override
    public void setFooterView(int id) {
        View footerView = View.inflate(this, id, null);
        mFooterView.addView(footerView);

    }

    /**
     * 设置是否显示 非滚动 的View
     *
     * @param visible
     */
    @Override
    public void setShowNotScrollView(int visible) {
        isShowNotScrollView = visible == View.VISIBLE;
    }

    /**
     * 设置是否显示 滚动 的View
     *
     * @param visible
     */
    @Override
    public void setShowScrollView(int visible) {
        isShowScrollView = visible == View.VISIBLE;
    }

    /**
     * 设置是否显示 刷新 的View
     *
     * @param visible
     */
    @Override
    public void setShowRefreshView(int visible) {
        isShowRefreshView = visible == View.VISIBLE;

    }

    /**
     * 设置是否显示 错误 的View
     *
     * @param visible
     */
    @Override
    public void setShowErrorView(int visible) {
        isShowErrorView = visible == View.VISIBLE;
    }

    /**
     * 设置是否显示 点击跳到顶部 的View
     *
     * @param visible
     */
    @Override
    public void setToTopView(int visible) {

    }

    /**
     * 更改是否显示头布局的 布尔值
     *
     * @param visible
     */
    @Override
    public void setHeaderViewVisible(int visible) {
        isShowHeaderView = visible == View.VISIBLE;
    }

    /**
     * 更改是否显示尾布局的 布尔值
     *
     * @param visible
     */
    @Override
    public void setFooterViewVisible(int visible) {
        isShowFooterView = visible == View.VISIBLE;

    }

    /**
     * 判断是否显示头布局
     */
    @Override
    public void checkHeaderView() {
        if (isShowHeaderView) {
            mHeaderView.setVisibility(View.VISIBLE);
        } else {
            mHeaderView.setVisibility(View.GONE);
        }
    }

    /**
     * 判断显示哪个主题布局
     */

    @Override
    public void checkBodyView() {
        if (isShowNotScrollView) {
            mNotScrollBody.setVisibility(View.VISIBLE);
        } else {
            mNotScrollBody.setVisibility(View.GONE);
        }
        if (isShowScrollView) {
            mScrollBody_ScrollView.setVisibility(View.VISIBLE);
        } else {
            mScrollBody_ScrollView.setVisibility(View.GONE);
        }
        if (isShowErrorView) {
            mErrorBody.setVisibility(View.VISIBLE);
        } else {
            mErrorBody.setVisibility(View.GONE);
        }
        if (isShowRefreshView) {
            mRefreshiBody_SwipeRefreshView.setVisibility(View.VISIBLE);
        } else {
            mRefreshiBody_SwipeRefreshView.setVisibility(View.GONE);
        }

    }

    /**
     * 判断是否显示底布局
     */
    @Override
    public void checkFooterView() {
        if (isShowFooterView) {
            mFooterView.setVisibility(View.VISIBLE);
        } else {
            mFooterView.setVisibility(View.GONE);
        }
    }

    /**
     * 查找资源控件
     */
    private void initView() {
        mHeaderView = (LinearLayout) findViewById(R.id.mHeaderView);
        mFooterView = (LinearLayout) findViewById(R.id.mFooterView);
        mRefreshiBody = (LinearLayout) findViewById(R.id.mRefreshiBody);
        mRefreshiBody_SwipeRefreshView = (SwipeRefreshLayout) findViewById(R.id.mRefreshiBody_SwipeRefreshView);
        mScrollBody = (LinearLayout) findViewById(R.id.mScrollBody);
        mScrollBody_ScrollView = (ScrollView) findViewById(R.id.mScrollBody_ScrollView);
        mNotScrollBody = (LinearLayout) findViewById(R.id.mNotScrollBody);
        mErrorBody = (LinearLayout) findViewById(R.id.mErrorBody);
        mBodyView = (RelativeLayout) findViewById(R.id.mBodyView);
    }
}
