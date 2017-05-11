package io.stuhua.androiddrawable.mvp.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

import io.stuhua.androiddrawable.util.LogUtils;

/**
 * Created by liulh on 2017/5/11 09:47 星期四
 */

public class InnerListView extends ListView {
    public InnerListView(Context context) {
        super(context);
    }

    public InnerListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InnerListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        LogUtils.print("action=" + ev.getAction());
        LogUtils.print("返回=" + super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        LogUtils.print("action=" + ev.getAction());
        LogUtils.print("返回=" + super.dispatchTouchEvent(ev));
        return super.onTouchEvent(ev);
    }
}
