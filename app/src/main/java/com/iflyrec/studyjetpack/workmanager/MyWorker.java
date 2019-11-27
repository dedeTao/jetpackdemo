package com.iflyrec.studyjetpack.workmanager;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * Author: twq
 * Create: 2019/11/25
 * desc:
 */
public class MyWorker extends Worker {

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        String data = getInputData().getString("data");//获取数据

        Log.d("twq", "doWork: " + data);

        //返回点什么
        Data outData = new Data.Builder().putString("out", "返回点什么").build();
        return Worker.Result.success(outData);
//        return Worker.Result.failure();//失败
//        return Worker.Result.retry();//重试
    }
}
