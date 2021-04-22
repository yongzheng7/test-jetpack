package com.atom.app

abstract class SimpleModule {

    fun providerSimpleAdapter(): SimpleAdapter {
        return SimpleAdapter()
    }
}