package com.iflyrec.studyjetpack.demo2;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/18
 * desc :livedata 和 viewmodel 的简单使用
 */
public class Demo2Activity extends AppCompatActivity {

    private UserViewModel mViewModel;
    private TextView mTxtButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        initViewModel();
        initView();


    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
    }

    private void initView() {
        mTxtButton = findViewById(R.id.txt_button);

        mTxtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getAccount().setValue(new UserInfo("Taodede：" + System.currentTimeMillis(), "18", "13939399438"));
            }
        });

        mViewModel.getAccount().observe(this, new Observer<UserInfo>() {
            @Override
            public void onChanged(@Nullable UserInfo accountBean) {
                mTxtButton.setText(accountBean.getUserName());
            }
        });
    }
}
