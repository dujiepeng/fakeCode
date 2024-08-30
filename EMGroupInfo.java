package com.hyphenate.myapplication.code;

public class EMGroupInfo {
    String groupName;
    String groupFaceUrl;
    String nameCard;
    Boolean isMuteAll;
    Boolean isMute;
    Boolean isAllow;
    GroupRoleType roleType;
}


enum GroupRoleType {
    OWNER(1),
    ADMIN(2),
    MEMBER(3),
    NONE(4);

    private int aIntType;
    GroupRoleType(int type) {
        this.aIntType = type;
    }

    public int getTypeIntValue() {
        return this.aIntType;
    }
}