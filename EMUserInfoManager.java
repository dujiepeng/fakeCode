package com.hyphenate.myapplication.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EMUserInfoManager<T> extends EMBaseManager<T> {

    EMFullUserInfo currInfo;

    protected void clear() {
        super.clear();
        currInfo = null;
    }

    // 设置成功后 [EMUserInfoListener.currentUserInfoChanged] 会执行。
    // 设置后需要存到本地
    public void uploadSelfInfo(EMFullUserInfo info, EMCallback callback) {
        database.saveCurrentUserInfo(info);
        currInfo = info;
        callback.onSuccess();
    }

    // sdk 自动后自动获取。
    public void fetchSelfInfo(EMCallback callback) {
        // TODO:
        // 1. fetch server.
        // 2. update currInfo
        new Thread(()->{
            currInfo = syncFetchSelfInfo();
        }).run();
    }

    protected EMFullUserInfo syncFetchSelfInfo() {
        // TODO: fetch from server.
        return null;
    }

    // 获取后需要存到本地
    public Map<String, EMUserInfo> fetchUserInfoWithIds(List<String> list, EMCallback callback) {
        Map<String, EMUserInfo> ret = new HashMap();

        // TODO:
        // 1. fetch list from server.
        // 2. database.updateUserInfos(infoList);
        // 3. update cachedMap.
        return ret;
    }

    public Map<String, EMUserInfo> getUserInfoFromLocal(List<String> list) {
        // TODO:
        // 1. load from cachedMap
        // 2. load from db.
        // 3. add to cachedMap.
        return null;
    }

    public EMUserInfo getLocalUserInfo(String userId) {
        // TODO:
        // 1. load from cachedMap
        // 2. load from db.
        // 3. add to cachedMap.
        return null;
    }

    protected void syncLocalUserInfo(String userId, String nickname, String faceUrl, long lastModifyMs) {
        // TODO:
        // 1. load userInfo from cachedMap
        // 2. diff modifyMs
        // 3. add or update into cachedMap and db if need.
    }
}

