package com.niles.androidsupport.multidex;

import android.app.Application;
import android.content.Context;

/**
 * Created by Negro
 * Date 2018/1/31
 * Email niulinguo@163.com
 */

@SuppressWarnings("unused")
public class NilesMultiDexApplication extends Application {

    public NilesMultiDexApplication() {
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        NilesMultiDex.install(this);
    }

}
