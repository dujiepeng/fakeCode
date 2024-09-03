package com.hyphenate.myapplication.code;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class EMV2Conversation {
    // 会话Id
    private String conversationId;
    // 会话类型
    private EMConversationType type;
    // At 信息
    private List<EMGroupAtInfo> atInfo;
    // 会话标签
    private List<EMMarkType> markType;
    // 最后一条消息
    private EMMessage latestMessage;
    // 最后一条接收的消息 ？？ 需要保留？
    private EMMessage latestMessageFromOthers;
    // 会话头像
    private String faceUrl;
    // 会话名称
    private String name;
    // 未读数
    private int unreadCount;
    // 获取所有消息数
    private int allMsgCount;
    // 会话免打扰状态
    private EMNotifyType notifyType = EMNotifyType.UnKnow;
    // 草稿
    private String draft;
    // 本地ext，不同步
    private String localExt;
    // ext，同步
    private String ext;

    @NonNull
    public String getConversationId() {
        return conversationId;
    }

    @NonNull
    public EMConversationType getType() {
        return type;
    }

    // 返回@我的列表，列表按照时间排序，和消息挂钩，如果消息过期，则消息对应的@也应该消失。
    @Nullable
    public List<EMGroupAtInfo> getAtInfo() {
        // TODO: 从db中查询@信息，@列表保存在服务器，清理后多端同步。 提供 clearAtInfo(MessageId)， clearAllAtInfo() 方法，清理本地和服务器At信息。多端同步。需要注意撤回，消息变更引起的@信息变更。
        return atInfo;
    }
    // 获取会话标签
    @Nullable
    public List<EMMarkType> getMarkType() {
        // TODO:
        return markType;
    }
    // 最后一条消息
    @Nullable
    public EMMessage getLatestMessage() {
        // TODO: 原逻辑，漫游时需要服务器将最后一条消息返回
        return  latestMessage;
    }
    // 最后接收的消息
    @Nullable
    public EMMessage getLatestMessageFromOthers() {
        // TODO: 是否还需保留？
        return  latestMessageFromOthers;
    }

    @Nullable
    public String getFaceUrl() {
        // TODO: 服务器下发会话时会带上头像。发送消息时需要带上，如果是群聊，还需要带上群头像信息和名称，更新时间，服务器下发消息时会带上头像昵称和更新时间，如果更新时间晚于当前本地最后更新时间，单聊则直接更新本地缓存，群聊则从服务器拉取最新(或者直接更新本地)
        return faceUrl;
    }

    @Nullable
    public String getName() {
        // TODO: 服务器下发会话时会带上昵称。发送消息时需要带上，如果是群聊，还需要带上群头像信息和名称，更新时间，服务器下发消息时会带上头像昵称和更新时间，如果更新时间晚于当前本地最后更新时间，单聊则直接更新本地缓存，群聊则从服务器拉取最新(或者直接更新本地)
        return name;
    }

    @NonNull
    public int getUnreadCount() {
        // TODO: 服务器下发会话时会带上未读数，sdk直接更新到db中。会话未读数以服务器为准。
        return unreadCount;
    }

    @Nullable
    public int getReadMs() {
        // TODO: 服务器下发会带上会话读取时间，表示上次设置清空未读的时间。
        return readMs;
    }

    @NonNull
    public int getAllMsgCount() {
        // TODO: 从本地获取消息数
        return allMsgCount;
    }

    @NonNull
    public EMNotifyType getNotifyType() {
        // TODO: 服务器会下发会话免打扰状态。
        return notifyType;
    }

    // 获取草稿
    @Nullable
    public String getDraft() {
        // TODO:
        return draft;
    }

    // 设置草稿
    public void setDraft(@Nullable String draft) {
        // TODO:
        this.draft = draft;
    }

    @Nullable
    public String getLocalExt() {
        // TODO: 本地db获取
        return localExt;
    }

    public void setLocalExt(@Nullable String localExt) {
        // TODO: save db
        this.localExt = localExt;
    }

    public void syncExt(@Nullable String ext, @Nullable EMCallback callback){
        // TODO: 同步会话时服务器返回，之后更新会同步服务器。
        this.ext = ext;
    }

    // 因为会同步，所以本地的始终是对的。不需要从服务器拉取，只要取缓存就行。
    public String getExt() {
        return ext;
    }

    public void clearAtInfo(String messageId){
        // TODO: 清理服务器和本地@信息，服务器下发变更事件
    }

    public void clearAllAtInfo() {
        // TODO: 清理服务器和本地@信息，服务器下发变更事件
    }
}
