package com.uwaisalqadri.inknote.ui.write

import androidx.lifecycle.ViewModel
import com.uwaisalqadri.inknote.data.repository.NoteRepository
import javax.inject.Inject

class WriteNoteViewModel @Inject constructor(
    private val noteRepository: NoteRepository
) : ViewModel() {


}