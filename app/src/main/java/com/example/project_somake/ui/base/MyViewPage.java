package com.example.project_somake.ui.base;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPage extends ViewPager {
    private boolean enabled = false;
    public MyViewPage(Context context) {
        super(context);
    }

    public MyViewPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }
    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
