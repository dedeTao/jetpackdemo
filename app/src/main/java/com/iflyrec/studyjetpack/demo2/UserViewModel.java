package com.iflyrec.studyjetpack.demo2;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/**
 * author : twq
 * date : 2019/11/18 11:24
 * desc :user的viewmodel
 */
public class UserViewModel extends AndroidViewModel {

    //创建livedata
    private MutableLiveData<UserInfo> mutableLiveData = new MutableLiveData<>();

    public UserViewModel(@NonNull Application application) {
        super(application);
    }

    public UserViewModel(Application application, String param) {
        super(application);
    }

    public MutableLiveData<UserInfo> getAccount() {
        return mutableLiveData;
    }

    // 当MyActivity被销毁时，Framework会调用ViewModel的onCleared()方法
    @Override
    protected void onCleared() {
        Log.e("twq", "========== ViewModel onCleared  ==========");
        super.onCleared();
    }
}
