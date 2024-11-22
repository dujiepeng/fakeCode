package com.hyphenate.myapplication.code;

import com.hyphenate.myapplication.code.types.EMGroupMemberRole;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EMGroupMemberInfo {
    @Nullable
    public String userId;
    @Nullable
    public String nickname;
    @Nullable
    public String avatar;
    @Nullable
    public String nameCard;
    @NotNull
    public EMGroupMemberRole role;
    @Nullable
    public String customData;
}
