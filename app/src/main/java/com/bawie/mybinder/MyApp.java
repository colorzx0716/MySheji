package com.bawie.mybinder;

import android.app.Application;
import android.content.Context;

/**
 * Created by 张肖肖 on 2017/12/14.
 */

public class MyApp extends Application {

    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

    }
}
