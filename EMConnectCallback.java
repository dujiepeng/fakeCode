package com.hyphenate.myapplication.code;

public interface EMConnectCallback {
    void onConnectError(EMError error);
    void onSuccess();
    void onDbOpened(Boolean opened);
}
