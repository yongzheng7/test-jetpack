package com.atom.module.app

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob


class WordInit(private val context: Application) {

    companion object {
        lateinit var init: WordInit
    }

    init {
        init = this
    }
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDatabase(context) }
    val repository by lazy { WordRepository(database.wordDao()) }

}