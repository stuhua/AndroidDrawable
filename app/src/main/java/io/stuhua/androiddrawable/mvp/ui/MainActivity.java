package io.stuhua.androiddrawable.mvp.ui;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.orhanobut.logger.Logger;

import io.stuhua.androiddrawable.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Logger.d("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("onDestroy");
    }
}
