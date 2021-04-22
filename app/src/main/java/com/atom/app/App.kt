package com.atom.app

import android.app.Application
import com.atom.module.app.WordInit
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        WordInit(this)
    }
}