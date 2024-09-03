package com.hyphenate.myapplication.code;

import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;

public class EMOfflinePushInfo {
    // 推送模板
    @Nullable
    String template;

    // 是否为强制使用模板 (目前后台还不支持)
    Boolean forceTemplate;

    // 模板使用标题
    List<String> titleArgs;

    // 模板使用内容
    List<String> contentArgs;

    Map<String, String> customs;

    String title;

    String content;

    Map<String, String> ext;

    // 不体现@，@应该由消息api实现。不再单独从推送中设置。

    String iosSound;
    String androidSound;

    // 如果为false,则消息不产生推送。
    Boolean enablePush = true;

    // 在群组中的昵称
    String groupNameCard;
}
