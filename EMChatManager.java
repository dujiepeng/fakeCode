package com.hyphenate.myapplication.code;

public class EMChatManager {
    public void sendMessage(EMMessage msg, EMCallback callback) {
        EMFullUserInfo info = EMClient.shared().userInfoManager.currInfo;
        if(info == null) {
            info = EMClient.shared().userInfoManager.syncFetchSelfInfo();
        }
        msg.userInfoLatestUpdateMs = info.getLastModifyMs();
        msg.faceUrl = info.avatar;
        msg.nickname = info.nickname;

        if(msg.isGroup) {
            /**
             * 将本地的群组信息添加到消息中，如果本地也没有群信息，先从服务器取拉取一次。逻辑和用户信息
             */
        }

        // TODO: sendMessage.
    }


}
