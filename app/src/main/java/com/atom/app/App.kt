package com.atom.app

import android.app.Application
import com.atom.module.app.WordInit

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        WordInit(this)
    }
}