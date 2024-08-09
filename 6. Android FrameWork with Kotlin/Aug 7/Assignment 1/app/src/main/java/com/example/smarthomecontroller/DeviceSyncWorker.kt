package com.example.smarthomecontroller

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class DeviceSyncWorker(appContext: Context, workerParams: WorkerParameters) :
    CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        try {
            // Sync device states with the server
            ApiService.toggleLight(false)  // Example: turn off light
            ApiService.setTemperature(20)  // Example: set temperature to 20°C
            return Result.success()
        } catch (e: Exception) {
            return Result.retry()
        }
    }
}