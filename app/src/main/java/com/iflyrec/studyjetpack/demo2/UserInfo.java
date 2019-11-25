package com.iflyrec.studyjetpack.demo2;

/**
 * author : twq
 * date : 2019/11/18
 * desc : 用户信息
 */
public class UserInfo {
    private String mUserName;
    private String mAge;
    private String mPhone;

    public UserInfo(String userName, String age, String phone) {
        this.mUserName = userName;
        this.mAge = age;
        this.mPhone = phone;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        this.mUserName = mUserName;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
