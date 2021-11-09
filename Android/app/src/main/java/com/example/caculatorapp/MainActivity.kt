package com.example.caculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = number1.text
        val n2 = number2.text

        button_plus.setOnClickListener {
            val sumResult = n1.toString().toDouble() + n2.toString().toDouble()
            view_result.text = sumResult.toString()
        }
    }
}