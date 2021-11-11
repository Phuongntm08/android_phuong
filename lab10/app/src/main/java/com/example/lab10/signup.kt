package com.example.lab10

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_signup.*

class signup : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        auth = FirebaseAuth.getInstance()

        createBtn.setOnClickListener() {
            val eSignupTxt = emailSignupId.text.trim().toString()
            val pSignupTxt = passwordSignupId.text.toString()
            if (eSignupTxt.isNotEmpty() || pSignupTxt.isNotEmpty()) {
                createUser(eSignupTxt, pSignupTxt)
                createCustomer()
            }
            else {
                Snackbar.make(findViewById(R.id.createBtn), "Check your username and password!!", Snackbar.LENGTH_LONG).show()
            }
        }

    }

    fun createUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) {
            task -> if (task.isSuccessful) {
                startActivity(Intent(this, thankyou::class.java))
            } else {
                Snackbar.make(findViewById(R.id.createBtn),"Enter a valid username and password (6 characters)",
                    Snackbar.LENGTH_LONG).show()
            }
        }
    }

    fun createCustomer() {
        val customer = hashMapOf(
            "name" to nameId.text.toString().trim(),
            "city" to cityId.text.toString().trim(),
            "country" to countryId.text.toString().trim(),
            "phone" to phoneId.text.toString().trim()
        )

        db.collection("Customer")
            .add(customer)
            .addOnSuccessListener { documentReference  ->
                Log.d(TAG, "Document Snapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }
    }
}