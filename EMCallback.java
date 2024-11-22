package com.hyphenate.myapplication.code;

public interface EMCallback {
    void onError(EMError error);

    void onSuccess();
}



public interface EMValueCallback<T> {
    void onError(EMError error);

    void onSuccess(T value);
}
