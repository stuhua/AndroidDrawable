package io.stuhua.androiddrawable.mvp.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import android.widget.TextView;

import io.stuhua.androiddrawable.util.LogUtils;

/**
 * Created by liulh on 2017/5/11 09:47 星期四
 */

public class InnerView extends TextView {
    public InnerView(Context context) {
        super(context);
    }

    public InnerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InnerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpaceSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightSpaceSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        LogUtils.print("widthSpaceSize=" + widthSpaceSize + "...widthSpecMode=" + widthSpecMode + "heightSpaceSize=" + heightSpaceSize + "...heightSpecMode=" + heightSpecMode);

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
        LogUtils.print("返回=" + super.onTouchEvent(ev));
        return super.onTouchEvent(ev);
    }
}
