package com.niles.androidsupport.multidex;

import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by Negro
 * Date 2018/1/31
 * Email niulinguo@163.com
 */

public final class NilesMultiDex {

    private NilesMultiDex() {
    }

    public static void install(Context context) {
        MultiDex.install(context);
    }

}
