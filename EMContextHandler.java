package com.hyphenate.myapplication.code;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.ref.WeakReference;

public class EMContextHandler {
    private static WeakReference<Context> weakReference;

    private EMContextHandler() {
    }

    public static void initialize(@NonNull Context context) {
        weakReference = new WeakReference<>(context);
    }

    @Nullable
    public static Context getContext() {
        return weakReference != null ? weakReference.get() : null;
    }
}
