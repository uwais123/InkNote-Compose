package com.uwaisalqadri.inknote.data.source.remote

import android.content.Context
import com.google.firebase.database.FirebaseDatabase
import com.uwaisalqadri.inknote.data.model.Note
import com.uwaisalqadri.inknote.utils.Constants
import com.uwaisalqadri.inknote.utils.showToast

class FirebaseManager {

    private val databaseReference = FirebaseDatabase.getInstance().reference

    fun saveNotesToDb(userName: String, notes: List<Note>, context: Context) {
        val addData = databaseReference.child(Constants.BACKUP_DATABASE_NAME)
            .child(userName)
            .setValue(notes)
        addData.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                context.showToast("Back Up Success")
            } else {
                context.showToast("Error : ${task.exception.toString()}")
            }
        }
    }
}