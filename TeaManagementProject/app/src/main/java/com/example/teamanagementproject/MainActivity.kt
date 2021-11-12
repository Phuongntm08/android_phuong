package com.example.teamanagementproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Tea cup"

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var clickedItem = item.itemId
        when (clickedItem) {
            R.id.addMenuId -> //Snackbar.make(
                //findViewById(R.id.main_layout), "You have clicked add" , Snackbar.LENGTH_LONG).show()
                startActivity(Intent(this, AddEditTea::class.java))
            R.id.timerMenuId -> Snackbar.make(
                findViewById(R.id.main_layout), "You have clicked timer" , Snackbar.LENGTH_LONG).show()

        }

        return true
    }
}