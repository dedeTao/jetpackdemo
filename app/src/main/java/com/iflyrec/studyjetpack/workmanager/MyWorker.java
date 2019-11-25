package com.iflyrec.studyjetpack.workmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * Author: twq
 * Create: 2019/11/25 23:09
 * desc:
 */
public class MyWorker extends Worker {

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        String name = getInputData().getString("data");//获取数据
        //做些什么
        Data data = new Data.Builder().putString("out","返回点什么").build();
//        (data);//返回数据
        return Worker.Result.success(data);
//        return Worker.Result.failure();//失败
//        return Worker.Result.retry();//重试
    }
}
