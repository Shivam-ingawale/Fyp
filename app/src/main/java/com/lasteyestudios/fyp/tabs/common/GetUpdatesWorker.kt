package com.lasteyestudios.fyp.tabs.common

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.lasteyestudios.fyp.repository.NotificationRepo
import com.lasteyestudios.fyp.utils.IPO_LOG_TAG

class GetUpdatesWorker(context: Context, param: WorkerParameters) :
    CoroutineWorker(context, param) {
    private val notificationRepo = NotificationRepo.getInstance()

    override suspend fun doWork(): Result {
        return try {
            notificationRepo.getIPOCompanyListingsForNotifications()
            Log.d(IPO_LOG_TAG, "GetUpdatesWorker done")

            Result.success()

        } catch (e: Exception) {
            Result.failure()
        }
    }
}