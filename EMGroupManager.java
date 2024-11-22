package com.hyphenate.myapplication.code;

import com.hyphenate.myapplication.EMGroup;

import com.hyphenate.myapplication.code.types.EMGroupMemberRole;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class EMGroupManager<T> extends EMBaseManager<T>{

    // new
    public void fetchGroupOverviews(List<String> groupIds, EMValueCallback<List<EMGroupOverview>> valueCallback) {}

    // new
    @Nullable
    public EMGroupOverview getGroupOverview(String groupId) {
        return null;
    }

    // new
    public List<EMGroupOverview> getJoinedGroupOverviews() {
        return null;
    }

    // 不变
    public void cleanAllGroupsFromDB() { }

    // 不变
    public List<EMGroup> getAllGroups() { return null; }

    //
    @Nullable
    public EMGroup getGroup(String groupId) { return null; }

    // 不变
    public void asyncGetJoinedGroupsFromServer(int pageNum, int pageSize, bool needMemberCount, bool needRole, EMValueCallback<EMCursorResult<EMGroup>> callback) {}

    // new
    public void fetchJoinedGroups(int pageNum, int pageSize, EMValueCallback<EMCursorResult<EMGroupOverview>> callback) {}

    // 过期
    public void asyncGetPublicGroupsFromServer(int pageSize, String cursor, EMValueCallback<EMCursorResult<EMGroupInfo>> callback) {}

    // new ? 后台没有提供新的api。需要和后台确认是否可以提供
    public void fetchPublicGroups(int pageSize, String cursor, EMValueCallback<EMCursorResult<EMGroupOverview>> callback) {}

    // 不变
    public void asyncCreateGroup(String groupName, String desc, List<String> members, String inviteReason, EMGroupOptions options, EMValueCallback<EMGroup> callback) {}

    // new 需要和后台确认能传avatar ？ inviteMembers ，nameCard 需要后台提供？
    public void createGroup(String groupName, String groupAvatar, String desc, List<EMGroupMemberInfo> inviteMembers, String inviteReason, EMGroupOptions options, EMValueCallback<EMGroup> callback) {}

    // new
    public void changeAvatar(String groupId, String groupAvatar, EMCallback callback) {}

    // 不变
    public void getGroupServer(String groupId, boolean fetchMembers, EMValueCallback<EMGroup> callback) {}

    // new
    public void fetchGroupInfo(String groupId, EMValueCallback<EMGroup> callback) {}

    // 不变
    public void asyncFetchGroupMembers(String groupId, String cursor, int pageSize, EMValueCallback<EMCursorResult<String>> result) {}

    // new
    public void fetchGroupMemberInfoWithIds(String groupId, List<String> memberIds, EMValueCallback<Map<String, EMGroupMemberInfo>> callback) {}

    // new, 需要排序，先返回群主和管理员？
    public void fetchGroupMemberInfos(String groupId, EMGroupMemberRole role, String cursor, int pageSize, EMValueCallback<EMCursorResult<EMGroupMemberInfo>> callback) {}

    // 不变
    public void asyncGetBlockedUsers(String groupId, int pageNum, int pageSize, EMValueCallback<String> callback) {}

    // 不变
    public void asyncFetchGroupMuteList(String groupId, int pageNum, int pageSize, EMValueCallback<EMCursorResult<String>> callback) {}

    // new
    public void fetchGroupMuteList(String groupId, int pageNum, int pageSize, EMValueCallback<EMCursorResult<EMGroupMemberInfo>> callback) {}

    // 不变
    public void fetchGroupWhiteList(String groupId, EMValueCallback<List<String>> callback) {}

    // new
    public void fetchGroupAllowList(String groupId, EMValueCallback<List<EMGroupMemberInfo>> callback) {}

    // 不变
    public void checkIfInGroupWhiteList(String groupId, EMValueCallback<bool> callback) {}

    // 不变
    public void asyncInviteUser(String groupId, String[] members, String reason, EMCallback callback) {}

    // 不变
    public void addUsersToGroup(String groupId, String[] members, EMCallback callback) {}

    // new
    public void inviteUser(String groupId, List<EMGroupMemberInfo> members, String reason, EMCallback callback) {}

    // 不变
    public void asyncRemoveUsersFromGroup(String groupId, List<String> members, EMCallback callback) {}

    // 不变
    public void asyncBlockUsers(String groupId, List<String> members, EMCallback callback) {}

    // 不变
    public void asyncUnblockUsers(String groupId, List<String> members, EMCallback callback) {}

    // 不变
    public void asyncChangeGroupName(String groupId, String subject, EMCallback callback) {}

    // 不变
    public void asyncChangeGroupDescription(String groupId, String desc, EMCallback callback) {}

    // 不变
    public void asyncLeaveGroup(String groupId, EMCallback callback) {}

    // 不变
    public void asyncDestroyGroup(String groupId, EMCallback callback) {}

    // 不变
    public void asyncBlockGroupMessage(String groupId, EMCallback callback) {}

    // 不变
    public void asyncUnblockGroupMessage(String groupId, EMCallback callback) {}

    // 不变
    public void asyncChangeOwner(String groupId, String newOwner, EMValueCallback<EMGroup> callback) {}

    // 不变
    public void asyncAddGroupAdmin(String groupId, String memberId, EMValueCallback<EMGroup> callback){}

    // 不变
    public void asyncRemoveGroupAdmin(String groupId, String adminId, EMValueCallback<EMGroup> callback){}

    // 不变
    public void asyncMuteGroupMembers(String groupId, List<String> members, int duration, EMValueCallback<EMGroup> callback) {}

    // 不变
    public void asyncUnMuteGroupMembers(String groupId, List<String> members, EMValueCallback<EMGroup> callback) {}

    // 不变
    public void muteAllMembers(String groupId, EMCallback callback) {}

    // 不变
    public void unmuteAllMembers(String groupId, EMCallback callback) {}

    // 不变
    public void addToGroupWhiteList(String groupId, List<String>members, EMCallback callback) {}

    // 不变
    public void removeFromGroupWhiteList(String groupId, List<String>members, EMCallback callback) {}

    // 不变
    public void joinGroup(String groupId, EMCallback callback) {}

    // 不变
    public void asyncApplyJoinToGroup(String groupId, String reason, EMCallback callback) {}

    // 不变
    public void asyncAcceptApplication(String username, String groupId, EMCallback callback) {}

    // 不变
    public void declineJoinApplication(String username, String groupId, String reason, EMCallback callback) {}

    // 不变
    public void asyncAcceptInvitation(String groupId, String inviter, EMCallback callback) {}

    // 不变
    public void asyncDeclineInvitation(String groupId, String inviter, String reason, EMCallback callback) {}

    // new 、 管理员可修改群成员？
    public void updateMemberInfo(String groupId, @Nullable String nameCard, @Nullable String customData, EMValueCallback<EMGroupMemberInfo> callback) {}

    // new
    public void fetchSelfInfo(String groupId, EMValueCallback<EMGroupMemberInfo> callback) {}

}
