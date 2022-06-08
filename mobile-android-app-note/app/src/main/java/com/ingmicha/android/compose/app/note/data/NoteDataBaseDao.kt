package com.ingmicha.android.compose.app.note.data

import androidx.room.*
import com.ingmicha.android.compose.app.note.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDataBaseDao {

    @Query("SELECT * FROM notes_tbl")
    fun getNotes(): Flow<List<Note>>

    @Query(value = "SELECT * FROM notes_tbl where id =:id")
    suspend fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    @Query(value = "DELETE FROM notes_tbl")
    suspend fun deleteAll()

    @Delete
    suspend fun delete(note: Note)
}