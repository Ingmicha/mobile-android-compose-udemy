package com.ingmicha.android.compose.app.note.repository

import com.ingmicha.android.compose.app.note.data.NoteDataBaseDao
import com.ingmicha.android.compose.app.note.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDataBaseDao: NoteDataBaseDao) {
    suspend fun addNote(note: Note) = noteDataBaseDao.insert(note)
    suspend fun updateNote(note: Note) = noteDataBaseDao.update(note)
    suspend fun deleteNote(note: Note) = noteDataBaseDao.delete(note)
    suspend fun deleteAllNotes() = noteDataBaseDao.deleteAll()
    fun getAllNotes(): Flow<List<Note>> = noteDataBaseDao.getNotes().flowOn(Dispatchers.IO)
        .conflate()
}