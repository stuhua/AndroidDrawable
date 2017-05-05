package io.stuhua.androiddrawable.mvp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import io.stuhua.androiddrawable.R;

/**
 * Created by liulh on 2017/5/5 11:08 星期五
 */

public class SecondActivity extends AppCompatActivity {
    private LayoutInflater mInflater;
    private View mOuterView;
    private View mInnerView;
    private LinearLayout mParentLL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mParentLL = (LinearLayout) findViewById(R.id.parent);
        mInflater = LayoutInflater.from(this);
        mInnerView = mInflater.inflate(R.layout.textview, null, false);
        mParentLL.addView(mInnerView);
    }
}
