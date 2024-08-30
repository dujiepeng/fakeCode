package com.hyphenate.myapplication.code;

import android.content.Context;
import android.content.SharedPreferences;

public class EMClient {
    static private EMClient emClient;


    public EMUserInfoManager userInfoManager;
    public EMGroupManager groupManager;

    private EMDatabase database;

    private EMConnectCallback connectCallback;

    static EMClient shared() {
        if (emClient == null) {
            emClient = new EMClient();
        }

        return emClient;
    }

    private EMClient() {

    }

    public void init(Context context) {
        EMContextHandler.initialize(context);
        userInfoManager = new EMUserInfoManager<EMUserInfo>();
        groupManager = new EMGroupManager<EMGroupInfo>();
    }

    public void connect(String userId, String token, EMConnectCallback callback) throws HyphenateException{
        Context context = EMContextHandler.getContext();
        if(context == null) {
            HyphenateException.throwEMException(1, "SDK not init");
        }
        this.connectCallback = callback;
        SharedPreferences sp = context.getSharedPreferences("em_sdk", Context.MODE_PRIVATE);
        String latestUserId = sp.getString("latest_userId", null);
        if(latestUserId != null && latestUserId.trim().length() != 0 && !userId.equals(latestUserId)) {
            if(database != null) {
                database.close();
            }
        }
        database = new EMDatabase(userId);
        database.openWithUid(new EMCallback() {
            @Override
            public void onError(EMError error) {
                if(callback != null) {
                    callback.onDbOpened(false);
                }
            }

            @Override
            public void onSuccess() {
                if(callback != null) {
                    userInfoManager.database = database;
                    callback.onDbOpened(true);
                }
            }
        });


        Boolean isConnect = false;
        EMError error = null;
        //  TODO: connect

        if(isConnect) {
            callback.onSuccess();
        }else {
            callback.onConnectError(error);
        }
    }
}


