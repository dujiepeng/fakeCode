package com.hyphenate.myapplication.code;


import androidx.annotation.NonNull;

public class EMFullUserInfo extends EMUserInfo{

    // 用户层api new出来的EMFullUserInfo, 其中的userId永远是当前登录的用户。 同服务器获取时则为服务器返回的userId。
    @NonNull
    public String getUserId() {
        return "";
    }

    public void setFriendAllowType(FriendAllowType type) {
        // 设置好友申请规则
    }

    public void setGroupAllowType(GroupAllowType type) {

    }
}


