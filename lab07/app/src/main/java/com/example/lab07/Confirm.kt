package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_confirm.*

class Confirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        info.text = intent.getStringExtra("name") + ", " + intent.getStringExtra("city") + ", " + intent.getStringExtra("street")
    }

    fun onAcceptButtonClicked(view : View) {
        var intent = Intent(this, ThankYou::class.java)
        startActivity(intent)
    }

    fun onEditButtonClicked(view : View) {
        onBackPressed()
    }
}