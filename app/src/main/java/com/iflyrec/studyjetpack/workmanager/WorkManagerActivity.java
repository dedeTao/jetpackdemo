package com.iflyrec.studyjetpack.workmanager;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
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
        initOneTimeWork();
//        init
    }

    /**
     * 一次性任务
     */
    private void initOneTimeWork() {

        Data data = new Data.Builder()
                .putString("data", "ttwqwqw")
                .putInt("intdata", 10086)
                .build();

        //创建request
        OneTimeWorkRequest myWorkRequest = new OneTimeWorkRequest
                .Builder(MyWorker.class)
                .setInputData(data)
                .build();

        //将上面定义的MyWorker加入到OneTimeRequest.Builder方法中
        WorkManager.getInstance(this).enqueue(myWorkRequest);//获取WorkManager实例并将WorkRequest进队

        //监听work返回的数据
        WorkManager.getInstance(this)
                .getWorkInfoByIdLiveData(myWorkRequest.getId())
                .observe(this, new Observer<WorkInfo>() {
                    @Override
                    public void onChanged(WorkInfo workInfo) {

                        if (workInfo.getState().equals(WorkInfo.State.SUCCEEDED)) {
                            String dataString = workInfo.getOutputData().getString("out");//获取数据

                            Log.d("twq", "outdata: " + dataString);
                        }
                    }
                });
    }


}
