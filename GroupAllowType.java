package com.hyphenate.myapplication.code;

public enum GroupAllowType {
    ALLOW_ANY(1),
    NEED_CONFIRM(2),
    DENY_ANY(3);

    private int aIntType;
    GroupAllowType(int type) {
        this.aIntType = type;
    }

    public int getTypeIntValue() {
        return this.aIntType;
    }
}
