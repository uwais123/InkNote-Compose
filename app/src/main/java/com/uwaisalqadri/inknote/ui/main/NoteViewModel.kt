package com.uwaisalqadri.inknote.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uwaisalqadri.inknote.data.model.Note
import com.uwaisalqadri.inknote.data.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    private val noteRepository: NoteRepository
): ViewModel() {

    fun insert(note: Note) = viewModelScope.launch {
        noteRepository.insert(note)
    }

    fun getAllNotes(): Flow<List<Note>> = noteRepository.getAllNotes()
        .flowOn(Dispatchers.Main)
        .conflate()

    fun getAllNotesByType(isReady: Boolean): Flow<List<Note>> = noteRepository.getAllNotesByType(isReady)
        .flowOn(Dispatchers.Main)
        .conflate()

    fun updateNoteType(isReady: Boolean, id: Int) = viewModelScope.launch {
        noteRepository.updateNoteType(isReady, id)
    }

    fun update(note: Note) = viewModelScope.launch {
        noteRepository.update(note)
    }

    fun deleteAllNotes() = viewModelScope.launch {
        noteRepository.deleteAllNotes()
    }

    fun deleteAllNotesByType(isReady: Boolean) = viewModelScope.launch {
        noteRepository.deleteAllNotesByType(isReady)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        noteRepository.deleteNote(note)
    }
}