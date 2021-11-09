package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun display_course_info(view: View) {
        info.text = "Android Application Development ,Android Security Essentials and Monetize Android Applications "
    }
    fun display_exam_info(view: View) {
        info.text = "exam"
    }
    fun display_freelance_info(view: View) {
        info.text = "freelance"
    }
}