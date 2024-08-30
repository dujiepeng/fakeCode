package com.hyphenate.myapplication.code;

import java.util.HashMap;
import java.util.Map;

class EMBaseManager<T> {
     Map<String, T> cachedMap;
     EMDatabase database;

    protected void clear() {
        cachedMap.clear();
        cachedMap = null;
    }
    EMBaseManager() {
        cachedMap = new HashMap<>();
    }

}
