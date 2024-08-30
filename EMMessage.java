package com.hyphenate.myapplication.code;

import androidx.annotation.Nullable;

import java.util.List;

public class EMMessage {

    Boolean isGroup;

    protected long userInfoLatestUpdateMs;
    protected String nickname;
    protected String faceUrl;
    protected String nameCard;
    protected String groupName;
    protected String groupFaceURL;
    public String from;

    //...
    @Nullable
    public String getNameCard() {
        // 发送方在群组中的名字
        return null;
    }

    @Nullable
    public String getNickname() {
        /*
            作为发送方，需要设置自己的信息，其中包括头像和昵称，设置后会在发消息时由sdk自动把它带入到消息中，
         */

        EMUserInfo userInfo = EMClient.shared().userInfoManager.getLocalUserInfo(from);
        return userInfo.nickname;
    }

    @Nullable
    public String getFaceUrl() {
        EMUserInfo userInfo = EMClient.shared().userInfoManager.getLocalUserInfo(from);
        return userInfo.avatar;
    }

    @Nullable
    public String getFriendRemark() {
        return null;
    }

    @Nullable
    public EMPinInfo getPinInfo() {
        return null;
    }

    @Nullable
    public EMUserInfo getRevokerInfo() {
        return  null;
    }

    public void setAtList(@Nullable List<String> atList) {
        // TODO: @信息从ext中移出，单独存放处理，不再干扰用户使用ext；
    }

    @Nullable
    public List<String> getAlList() {
        return null;
    }

    public void setPushInfo(@Nullable EMOfflinePushInfo pushInfo) {
        // TODO: push 内容也不再使用ext；
    }

    @Nullable
    public EMOfflinePushInfo getPushInfo() {
        // TODO: 推送信息从ext中移出，单独存放处理，不再干扰用户使用ext；
        return null;
    }

    public String getSeq() {
        // 返回本地id，本地id字段和server id不再合并，需要单独暴露出来
        return null;
    }

    protected String groupFaceUrl() {
        // 不对外，sdk内部用于收到消息时更新本地存储
        return null;
    }

    protected String groupName() {
        // 不对外，sdk内部用于收到消息时更新本地存储
        return null;
    }
 }
