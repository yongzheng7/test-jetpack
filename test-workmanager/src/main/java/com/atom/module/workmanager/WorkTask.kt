package com.atom.module.workmanager

import android.content.Context
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest

class WorkTask {

    val workRequest: WorkRequest = OneTimeWorkRequestBuilder<LogWork>().build()

    constructor(context: Context) {
        WorkManager.getInstance(context).enqueue(workRequest)
    }
}