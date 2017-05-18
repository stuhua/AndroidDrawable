package io.stuhua.androiddrawable.mvp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import io.stuhua.androiddrawable.R;
import io.stuhua.androiddrawable.mvp.presenter.AirConditioner1;
import io.stuhua.androiddrawable.util.LogUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn1, mBtn2;
    private Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("onCreate");
        initView();
        mGson = new Gson();
        test();
    }

    public void test() {
        AirConditioner1 airConditioner = mGson
                .fromJson(
                                "{\"focus\":\"airControl\",\"rawText\":\"空调升高10度\",\"operation\":\"SET\",\"temperature\":\"1\", \"device\":\"空调\" }",
                        AirConditioner1.class);
        LogUtils.print(airConditioner.getFocus()+"..."+airConditioner.getTemperature()+"");
    }

    private void initView() {
        mBtn1 = getViewById(R.id.btn1);
        mBtn2 = getViewById(R.id.btn2);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
    }

    private <T extends View> T getViewById(int id) {
        return (T) findViewById(id);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                Intent intent1 = new Intent(this, ThirdActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
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
