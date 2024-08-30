package com.hyphenate.myapplication.code;

public interface EMUserInfoListener {
    // 修改后多设备回调，自己回调。
    default void onSelfInfoUpdated(EMFullUserInfo info){}
    default void onFriendInfoChanged(EMUserInfo info) {}
}
