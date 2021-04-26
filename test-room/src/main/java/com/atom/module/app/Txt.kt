package com.atom.module.app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

open class Txt {
    @ColumnInfo(name = "length")
    var length: Int? = null
}
