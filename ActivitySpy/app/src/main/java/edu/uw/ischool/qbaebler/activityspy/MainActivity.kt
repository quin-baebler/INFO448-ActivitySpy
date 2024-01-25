package edu.uw.ischool.qbaebler.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy event fired")
        Log.e("MainActivity", "'I'll be back!' --Terminator, The Terminator")
    }
}