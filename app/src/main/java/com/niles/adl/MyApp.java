package com.niles.adl;

import android.app.Application;
import android.content.Context;

import com.niles.androidsupport.multidex.NilesMultiDex;

/**
 * Created by Negro
 * Date 2018/1/31
 * Email niulinguo@163.com
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        NilesMultiDex.install(this);
    }
}
