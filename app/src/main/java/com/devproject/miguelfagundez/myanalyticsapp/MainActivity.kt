package com.devproject.miguelfagundez.myanalyticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.measurement.module.Analytics
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {

    // FirabseAnalytics instance
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the FirebaseAnalytics instance (Singleton pattern)
        firebaseAnalytics = FirebaseAnalytics.getInstance(this@MainActivity)
        // Creating log events - some events are recommended for all apps
        // Common events that apply to all apps:
        // https://support.google.com/firebase/answer/6317498?hl=en&ref_topic=6317484
        // Bundle variable - Creating an action
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "AppId")
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "MyFirebaseAnalyticsApp")
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "text")

        // Creating an Firebase Event
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)




    }
}
