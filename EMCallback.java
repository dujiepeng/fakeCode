package com.hyphenate.myapplication.code;

interface EMCallback {
    void onError(EMError error);

    void onSuccess();
}



interface EMValueCallback<T> {
    void onError(EMError error);

    void onSuccess(T value);
}
