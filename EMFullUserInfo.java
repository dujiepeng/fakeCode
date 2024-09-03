package com.hyphenate.myapplication.code;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class EMFullUserInfo extends EMUserInfo{

    // 用户层api new出来的EMFullUserInfo, 其中的userId永远是当前登录的用户。 同服务器获取时则为服务器返回的userId。
    @NonNull
    public String getUserId() {
        return "";
    }

    private FriendAllowType friendAllowType;

    private GroupAllowType groupAllowType;

    private String pushTranslationLanguage;

    @Nullable
    public String getPushTranslationLanguage() {
        return pushTranslationLanguage;
    }

    @Nullable
    public FriendAllowType getFriendAllowType() {
        return friendAllowType;
    }


    @Nullable
    public GroupAllowType getGroupAllowType() {
        return  groupAllowType;
    }


    public void setPushTranslationLanguage(@Nullable String language) {
        //  设置推送首选语言
    }

    public void setFriendAllowType(@NonNull FriendAllowType type) {
        // 设置好友申请规则
    }

    public void setGroupAllowType(@NonNull GroupAllowType type) {

    }
}


