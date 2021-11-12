package com.example.teamanagementproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Timer : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    private var tvTimer: TextView? = null
    private var btnStartStop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        initView()
    }

    private fun initView() {
        tvTimer = findViewById(R.id.timerTxt)
        btnStartStop = findViewById(R.id.timerBtn)
    }


}