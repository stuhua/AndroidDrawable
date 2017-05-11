package io.stuhua.androiddrawable.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.stuhua.androiddrawable.R;
import io.stuhua.androiddrawable.mvp.ui.view.InnerView;
import io.stuhua.androiddrawable.mvp.ui.view.OutViewGroup;
import io.stuhua.androiddrawable.util.LogUtils;

/**
 * Created by liulh on 2017/5/5 11:08 星期五
 */

public class ThirdActivity extends AppCompatActivity {
    private OutViewGroup mOutView;
    private InnerView mInnerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initView();
        LogUtils.print("mOutView...width=" + mOutView.getLayoutParams().width + "...height=" + mOutView.getLayoutParams().height);
        LogUtils.print("mInnerView...width=" + mInnerView.getLayoutParams().width + "...height=" + mInnerView.getLayoutParams().height);
    }

    private void initView() {
        mOutView = getViewById(R.id.outView);
        mInnerView = getViewById(R.id.innerView);

    }

    private <T extends View> T getViewById(int id) {
        return (T) findViewById(id);
    }
}
