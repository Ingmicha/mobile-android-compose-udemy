package com.ingmicha.android.compose.app.note.di

import android.content.Context
import androidx.room.Room
import com.ingmicha.android.compose.app.note.data.NoteDataBase
import com.ingmicha.android.compose.app.note.data.NoteDataBaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatabase: NoteDataBase): NoteDataBaseDao = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context: Context): NoteDataBase =
        Room.databaseBuilder(context, NoteDataBase::class.java, "note_db").build()

}