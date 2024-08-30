package com.hyphenate.myapplication.code;

enum EMConversationType {
    Chat, GroupChat
}


enum EMNotifyType {
    UnKnow(-1),
    Mute(1),
    UnMute(2),
    MentionOnly(3);

    EMNotifyType(int id) {
        this.id = id;
    }

    private int id = -1;

    public int id() {
        return id;
    }
}

enum EMMarkType {}