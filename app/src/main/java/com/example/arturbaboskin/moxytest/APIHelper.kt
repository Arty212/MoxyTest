package com.example.arturbaboskin.moxytest

import android.annotation.SuppressLint
import android.os.AsyncTask


class APIHelper {
    companion object {
        fun login(body: () -> Unit) {
            val task = object : AsyncTask<Void, Void, Void>() {
                override fun doInBackground(vararg p0: Void?): Void? {
                    Thread.sleep(5000)
                    return null
                }

                override fun onPostExecute(result: Void?) {
                    body()
                }
            }.execute()
        }
    }
}