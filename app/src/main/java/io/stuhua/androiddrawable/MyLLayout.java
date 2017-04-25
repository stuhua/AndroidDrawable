package io.stuhua.androiddrawable;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.orhanobut.logger.Logger;

/**
 * Created by liulh on 2017/4/24.
 */

public class MyLLayout extends LinearLayout {
    private int mLastXIntercept;
    private int mLastYIntercept;

    public MyLLayout(Context context) {
        super(context);
    }

    public MyLLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyLLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.print("(event.getAction()=" + event.getAction());
        return super.onTouchEvent(event);
    }


 @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercepted = false;
        int x = (int) event.getX();
        int y = (int) event.getY();
        Logger.d("x=" + x + "...y=" + y);
        Logger.d("(event.getAction()=" + event.getAction());
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                intercepted = false;
                break;
            case MotionEvent.ACTION_MOVE:
                int deltax = x - mLastXIntercept;
                int deltay = x - mLastYIntercept;
                Logger.d("deltax=" + deltax + "...deltay" + deltay);
                if (deltax > 500) {
                    Logger.d("拦截成功...");
                    intercepted = true;
                } else {
                    Logger.d("拦截失败...");
                    intercepted = false;
                }
                break;
            case MotionEvent.ACTION_UP:
                intercepted = false;
                break;
            default:
                break;
        }
        mLastXIntercept = x;
        mLastYIntercept = y;
        return intercepted;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int childCount = getChildCount();
        LogUtils.print("childCount="+childCount);
        int widthMeasureSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMeasureSpecMode = MeasureSpec.getMode(heightMeasureSpec);
//        Logger.d("widthMeasureSpecMode=" + widthMeasureSpecMode);
//        Logger.d("heightMeasureSpecMode=" + heightMeasureSpecMode);
        if (widthMeasureSpecMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(200, 200);
        }
    }
}
