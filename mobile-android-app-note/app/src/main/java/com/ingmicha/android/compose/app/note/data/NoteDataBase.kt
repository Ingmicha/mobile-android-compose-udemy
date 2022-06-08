package com.ingmicha.android.compose.app.note.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ingmicha.android.compose.app.note.model.Note
import com.ingmicha.android.compose.app.note.util.DateConverter
import com.ingmicha.android.compose.app.note.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDataBaseDao

}