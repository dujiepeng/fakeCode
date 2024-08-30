package com.hyphenate.myapplication.code;

import java.util.List;

public class EMAMessageListener {
    void onMessageReceived(List<EMMessage> messages) {
        for (EMMessage msg : messages) {
            EMClient.shared().userInfoManager.syncLocalUserInfo(msg.from, msg.nickname, msg.faceUrl, msg.userInfoLatestUpdateMs);
            // EMClient.shared().groupManager.syncLocalGroupInfo(msg.)
        }
    }
}
