package cn.scxingm.hotfixdemo;

import android.app.Application;
import android.content.Context;

import cn.scxingm.hotfix.Hotfix;
import cn.scxingm.hotfix.HotfixInstall;

/**
 * Created by scxingm on 2018/4/20.
 */

public class DemoApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        HotfixInstall.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Hotfix.init(this);
    }
}
