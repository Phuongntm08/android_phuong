package com.example.lab08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_thanks.*

class Thanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        nameId.text = intent.getStringExtra("name").toString()
        phoneID.text = intent.getStringExtra("phone").toString()
        sizeId.text = intent.getStringExtra("size").toString()
        phoneID.text = intent.getStringExtra("date").toString()
        pickTimeId.text = intent.getStringExtra("time").toString()

        reorderBtn.setOnClickListener() {
//            var intent = Intent(this, MainActivity::class.java)
//
//            startActivity(intent)
            ratingText.text = ratingBar.rating.toString()
        }

//        ratingBar.setOnClickListener() {
//            ratingText.text = ratingBar.rating.toString()
//        }
    }


}