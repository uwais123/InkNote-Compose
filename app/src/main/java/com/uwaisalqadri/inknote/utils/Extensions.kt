package com.uwaisalqadri.inknote.utils

import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.Window
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.uwaisalqadri.inknote.data.model.Note
import java.util.*

val date = Date()
//val today = date.toDateEMYShort()

fun Context.showToast(msg: String) {
    Toast.makeText(
        this,
        msg,
        Toast.LENGTH_SHORT
    ).show()
}

//fun View.deleteSnackBar(msg: String, position: Note, viewModel: NoteViewModel) {
//    viewModel.updateNoteType(false, position.id)
//    Snackbar
//        .make(this, msg, Snackbar.LENGTH_LONG)
//        .setAction("UNDO") {
//            viewModel.updateNoteType(true, position.id)
//            Snackbar.make(it, "Note Restored", Snackbar.LENGTH_SHORT).show()
//        }
//        .show()
//}

//fun Context.noteDialog(title: String?, desc: String?, time: String?, image: String?) {
//    val dialog = Dialog(this)
//    dialog.apply {
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        val binding = DialogDetailNoteBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.apply {
//            tvNoteTitle.text = title
//            tvNoteTime.text = time
//            tvNoteDesc.apply {
//                text = desc
//                movementMethod = ScrollingMovementMethod() }
//            if (image == null) imgCard.isVisible = false
//            else {
//                imgCard.isVisible = true
//                imgNoteDesc.load(image)
//            }
//        }
//        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        show()
//    }
//}