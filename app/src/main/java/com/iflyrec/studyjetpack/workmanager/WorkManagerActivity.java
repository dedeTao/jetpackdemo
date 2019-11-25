package com.iflyrec.studyjetpack.workmanager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/25
 * desc :
 */
public class WorkManagerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workmanager);
        initWork();
    }

    private void initWork() {
        OneTimeWorkRequest myWorkRequest =
                new OneTimeWorkRequest.Builder(MyWorker.class)
                        .build();
        //将上面定义的MyWorker加入到OneTimeRequest.Builder方法中
        WorkManager.getInstance(this).enqueue(myWorkRequest);//获取WorkManager实例并将WorkRequest进队
    }
}
