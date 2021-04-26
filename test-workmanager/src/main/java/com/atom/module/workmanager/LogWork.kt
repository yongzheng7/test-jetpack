package com.atom.module.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.atom.module.utils.Logs

class LogWork (appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {
    override fun doWork(): Result {
        Logs.e("LogWork doWork")
        return Result.success()
    }
}