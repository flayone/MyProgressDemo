package com.example.liyayu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.liyayu.myapplication.recycle_demo.RecycleActivity;
import com.example.liyayu.myapplication.ripple_demo.RippleActivity;
import com.example.liyayu.myapplication.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by liyayu on 2018/3/1.
 */

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    AppCompatTextView text1;
    @BindView(R.id.text2)
    AppCompatTextView text2;
    @BindView(R.id.button1)
    AppCompatButton button1;
    @BindView(R.id.button2)
    AppCompatButton button2;
    @BindView(R.id.liner1)
    LinearLayout liner1;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text1, R.id.text2, R.id.button1, R.id.button2, R.id.liner1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text1:
            case R.id.text2:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.button1:
                intent = new Intent(this,RecycleActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this,RippleActivity.class);
                startActivity(intent);
                break;
            case R.id.liner1:
                ToastUtil.showToast(this,"this is liner1");
                break;
        }
    }
}