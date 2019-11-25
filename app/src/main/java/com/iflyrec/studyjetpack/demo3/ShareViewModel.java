package com.iflyrec.studyjetpack.demo3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.iflyrec.studyjetpack.demo2.UserInfo;

/**
 * author : twq
 * date : 2019/11/18
 * desc :
 */
public class ShareViewModel extends ViewModel {
    private final MutableLiveData<UserInfo> userInfoModel = new MutableLiveData<>();

    public void setUserInfo(UserInfo userInfo) {
        userInfoModel.setValue(userInfo);
    }

    public MutableLiveData<UserInfo> getUserInfoModel() {
        return userInfoModel;
    }
}
