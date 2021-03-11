package com.uwaisalqadri.inknote.data.source.local

import androidx.room.*
import com.uwaisalqadri.inknote.data.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Query("SELECT * FROM note_table ORDER BY id")
    fun getAllNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note_table WHERE isReady=:isReady")
    fun getAllNotesByType(isReady: Boolean): Flow<List<Note>>

    @Query("UPDATE note_table SET isReady = :isReady WHERE id = :id")
    suspend fun updateNoteType(isReady: Boolean, id: Int)

    @Update
    suspend fun update(note: Note)

    @Query("DELETE FROM note_table")
    suspend fun deleteAllNotes()

    @Query("DELETE FROM note_table WHERE isReady=:isReady")
    suspend fun deleteAllNotesByType(isReady: Boolean)

    @Delete
    suspend fun deleteNote(note: Note)
}