package com.atom.module.app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word : Txt{

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int

    @ColumnInfo(name = "word")
    val word: String

    constructor(word: String, id: Int) : super() {
        this.word = word
        this.id = id
    }
}
