package com.atom.module.app

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BaseDao<T> {

    fun table() : String

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): List<T>

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWordsByFlow(): Flow<List<T>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: T)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

}