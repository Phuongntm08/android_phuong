package com.example.teamanagementproject

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_add_edit_tea.*
import android.view.ViewGroup

import android.widget.EditText




class AddEditTea : AppCompatActivity() {

    val db = Firebase.firestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_tea)

        addTeaBtn.setOnClickListener() {
            createNewTea()
//            var viewGroup = findViewById(R.id.AddEditTea);
//            clearForm(viewGroup)
        }
    }

    private fun createNewTea() {
        val newTea = hashMapOf(
            "tea" to newTeaNameid.text.toString().trim(),
            "description" to newDescriptionId.text.toString().trim(),
            "origin" to newOriginId.text.toString().trim(),
            "ingredients" to newIngredientsId.text.toString().trim(),
            "timer" to newTimerId.text.toString().trim(),
            "caffeineLevel" to newCaffeineLevelId.text.toString().trim()
        )

        db.collection("TeaCollection")
            .add(newTea)
            .addOnSuccessListener { documentReference  ->
                Log.d(ContentValues.TAG, "Document Snapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(ContentValues.TAG, "Error adding document", e)
            }
            .addOnCompleteListener() {
                it -> if (!it.isSuccessful) {
                    Snackbar.make(findViewById(R.id.addTeaBtn), it.exception?.message.toString().take(100) , Snackbar.LENGTH_LONG).show()
                    it.exception.toString()
                } else {
                    Snackbar.make(findViewById(R.id.addTeaBtn), "Successful!!" , Snackbar.LENGTH_LONG).show()
                }
            }
    }

//    private fun clearForm(group: ViewGroup) {
//        var i = 0
//        val count = group.childCount
//        while (i < count) {
//            val view: View = group.getChildAt(i)
//            if (view is EditText) {
//                (view as EditText).setText("")
//            }
//            if (view is ViewGroup && (view as ViewGroup).childCount > 0) clearForm(view as ViewGroup)
//            ++i
//        }
//    }
}