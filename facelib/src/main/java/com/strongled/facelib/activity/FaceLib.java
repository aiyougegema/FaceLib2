package com.strongled.facelib.activity;

import android.content.Context;

public class  FaceLib {
    private static Context appCtx;

    public static void init(Context context) {
        if (null != context) {
            appCtx = context;
        }
    }


}
