package com.uwaisalqadri.inknote.di

import android.content.Context
import androidx.room.Room
import com.uwaisalqadri.inknote.data.source.local.AppDatabase
import com.uwaisalqadri.inknote.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        Constants.DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideNoteDao(db: AppDatabase) = db.noteDao()
}