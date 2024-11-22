package com.hyphenate.myapplication.code;

public class EMOptions {

    final private boolean enableAutoSyncConversations;
    final private boolean usingContacts;
    final private boolean usingGroups;
    final private String appKey;

    EMOptions(String appKey, boolean enableAutoSyncConversations, boolean usingContacts, boolean usingGroups){
        this.appKey = appKey;
        this.enableAutoSyncConversations = enableAutoSyncConversations;
        this.usingContacts = usingContacts;
        this.usingGroups = usingGroups;
    }
}
