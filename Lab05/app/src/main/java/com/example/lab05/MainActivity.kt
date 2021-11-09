package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicked(view : View) {
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when {
            rb_small.isChecked -> pizzaSizePrice =5.0
            rb_medium.isChecked -> pizzaSizePrice=7.0
            rb_large.isChecked -> pizzaSizePrice=9.0}
        if (cb_onion.isChecked) { toppingsTotal += 1 }
        if (cb_olive.isChecked) { toppingsTotal += 2 }
        if (cb_tomato.isChecked) { toppingsTotal += 3}
        tv_total.text =  (pizzaSizePrice + toppingsTotal).toString()
    }

    fun onChoosePizzaTypeButtonClicked(view : View) {

        when {
            rb_beef.isChecked -> img_banner.setImageResource(R.drawable.img_pizza_beef)
            rb_cheese.isChecked -> img_banner.setBackgroundResource(R.drawable.img_pizza_cheese_onion)
            rb_vegetarian.isChecked -> img_banner.setBackgroundResource(R.drawable.img_pizza_vegetarian)
        }
    }
}