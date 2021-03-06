package io.stuhua.androiddrawable.mvp.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import io.stuhua.androiddrawable.util.LogUtils;

/**
 * Created by liulh on 2017/5/11 09:41 星期四
 */

public class OutViewGroup extends LinearLayout {
    public OutViewGroup(Context context) {
        super(context);
    }

    public OutViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OutViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public OutViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpaceSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightSpaceSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        LogUtils.print("widthSpaceSize=" + widthSpaceSize + "...widthSpecMode=" + widthSpecMode + "heightSpaceSize=" + heightSpaceSize + "...heightSpecMode=" + heightSpecMode);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        int childCount = getChildCount();

        LogUtils.print("onLayout...childCount=" + childCount);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        LogUtils.print("action=" + ev.getAction());
        LogUtils.print("返回=" + super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        LogUtils.print("action=" + ev.getAction());
        LogUtils.print("返回=" + super.onInterceptTouchEvent(ev));
        switch (ev.getAction()) {
            //0
            case MotionEvent.ACTION_DOWN:
                break;
            //2
            case MotionEvent.ACTION_MOVE:
                break;
            //1
            case MotionEvent.ACTION_UP:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.print("action=" + event.getAction());
        LogUtils.print("返回=" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
