package com.uwaisalqadri.inknote.data.repository

import com.uwaisalqadri.inknote.data.model.Note
import com.uwaisalqadri.inknote.data.source.local.NoteDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {
    fun insert(note: Note) {
        noteDao.insert(note)
    }

    fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes()

    fun getAllNotesByType(isReady: Boolean): Flow<List<Note>> = noteDao.getAllNotesByType(isReady)

    suspend fun updateNoteType(isReady: Boolean, id: Int) {
        noteDao.updateNoteType(isReady, id)
    }

    suspend fun update(note: Note) {
        noteDao.update(note)
    }

    suspend fun deleteAllNotes() {
        noteDao.deleteAllNotes()
    }

    suspend fun deleteAllNotesByType(isReady: Boolean) {
        noteDao.deleteAllNotesByType(isReady)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}