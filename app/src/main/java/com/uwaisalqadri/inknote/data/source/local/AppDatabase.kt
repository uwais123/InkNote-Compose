package com.uwaisalqadri.inknote.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.uwaisalqadri.inknote.data.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}