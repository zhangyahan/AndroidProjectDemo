package com.example.androidprojectdemo.app;

import android.app.Application;

/**
 * @author zhangyahan
 * 应用入口
 */
public final class AppApplication extends Application {

    /**
     * 程序创建
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 程序销毁
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * 设备低内存
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * 设备低内存，你应该在此回调函数中对应用程序中的资源进行释放，以求取该软件在设备上运行的空间。
     * @param level 级别
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
