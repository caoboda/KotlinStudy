package com.example.coroutines

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**

 * Created  by Administrator on 2022/1/23 11:54

 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this);
    }
}