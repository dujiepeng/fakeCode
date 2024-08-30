package com.hyphenate.myapplication.code;

import java.util.List;

public class EMDatabase {
    public Boolean isOpened;

    public Boolean isLogin;

    EMDatabase(String userId){}

    public void openWithUid(EMCallback callback) {
        isOpened = true;
        callback.onSuccess();
    }

    public void close() {
        isOpened = false;
    }

    public void saveCurrentUserInfo(EMFullUserInfo info) {}

    public void updateUserInfos(List<EMUserInfo> list) {

    }
}
