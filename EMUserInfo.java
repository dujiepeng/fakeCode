package com.hyphenate.myapplication.code;

import android.view.LayoutInflater;

public class EMUserInfo {
    String avatar;
    String nickname;
    //...
    // 返回对方最后一次更新信息的时间
    public long getLastModifyMs() {
        return lastModifyMs;
    }

    // 不提供set，当调用<EMUserInfoManager.setSelfInfo> 时由SDK为其赋值，取当前时间。
    protected long lastModifyMs;

    protected Boolean syncFromMsg = false;

}

class EMUserInfoFactory {
    public static EMUserInfo createByMsg(String userId, String nickname, String faceUrl, long syncMs) {
        EMUserInfo info = new EMUserInfo();
        info.avatar = faceUrl;
        info.nickname = nickname;
        info.lastModifyMs = syncMs;
        info.syncFromMsg = true;
        return info;
    }

    public static EMUserInfo copyFromOldInfo(EMUserInfo oldInfo, String nickname, String faceUrl, long syncMs) {
        EMUserInfo info = new EMUserInfo();
        info.avatar = faceUrl;
        info.nickname = nickname;
        info.lastModifyMs = syncMs;
        info.syncFromMsg = true;
        // info.gender = oldInfo.gender;
        // info.email = oldInfo.email;
        // ...
        return info;
    }
}
