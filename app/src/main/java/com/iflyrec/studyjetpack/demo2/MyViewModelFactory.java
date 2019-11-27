package com.iflyrec.studyjetpack.demo2;

import android.app.Application;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * Author: twq
 * Create: 2019/11/25
 * desc:
 */
public class MyViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private Application mApplication;
    private String mParam;


    public MyViewModelFactory(Application application, String param) {
        this.mApplication = application;
        this.mParam = param;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new UserViewModel(mApplication, mParam);
    }
}
