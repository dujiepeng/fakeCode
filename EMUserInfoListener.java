package com.hyphenate.myapplication.code;

import com.hyphenate.myapplication.code.EMFullUserInfo;
import com.hyphenate.myapplication.code.EMUserInfo;

public interface EMUserInfoListener {
    // 修改后多设备回调，自己回调。
    default void onSelfInfoUpdated(EMFullUserInfo info){}
    default void onFriendInfoChanged(EMUserInfo info) {}
}
