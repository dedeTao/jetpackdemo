package com.iflyrec.studyjetpack.demo1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/15
 * desc :Lifecycle的简单使用
 */
public class Demo1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        Demo1Presenter demo1Presenter = new Demo1Presenter();
        getLifecycle().addObserver(demo1Presenter);
    }
}
