package com.hyphenate.myapplication.code;

import com.hyphenate.myapplication.code.types.EMConversationType;
import com.hyphenate.myapplication.code.types.EMMarkType;
import com.hyphenate.myapplication.code.types.EMNotifyType;

import java.util.List;

class EMV2Conversation {
    String conversationId;
    EMConversationType type;
    List<EMGroupAtInfo> atList;
    List<EMMarkType> markType;
    EMMessage latestMessage;

    String nameCard;
    Boolean isPinned;
    int unreadCount;
    int allMsgCount;
    EMNotifyType notifyType;
    String extField;
    String draft;
    long olderKey;
    long modifyMs;

    public String getConversationId() {
        return conversationId;
    }

    public EMConversationType getType() {
        return type;
    }

    public List<EMGroupAtInfo> getAtList() {
        return atList;
    }

    public List<EMMarkType> getMarkType() {
        return markType;
    }

    public EMMessage getLatestMessage() {
        return latestMessage;
    }

    public String getFaceUrl() {
        if(type == EMConversationType.Chat) {
            return EMClient.shared().userInfoManager.getLocalUserInfo(latestMessage.conversationId).avatar;
        }else {
            return EMClient.shared().groupManager.getLocalGroupInfo(latestMessage.conversationId).groupFaceUrl;
        }
    }

    public String getName() {
        if(type == EMConversationType.Chat) {
            return EMClient.shared().userInfoManager.getLocalUserInfo(latestMessage.conversationId).nickname;
        }else {
            return EMClient.shared().groupManager.getLocalGroupInfo(latestMessage.conversationId).groupName;
        }
    }

    public String getRemark() {
        return EMClient.shared().contactManager.getLocalContact(latestMessage.from).remark;
    }

    public String getNameCard() {
        return nameCard;
    }

    public Boolean getPinned() {
        return isPinned;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public int getAllMsgCount() {
        return allMsgCount;
    }

    public EMNotifyType getNotifyType() {
        return notifyType;
    }

    public String getDraft() {
        return draft;
    }

    public String getExtField() {
        return extField;
    }

    public long getOlderKey() {
        return olderKey;
    }

    public long getModifyMs() {
        return modifyMs;
    }
}
