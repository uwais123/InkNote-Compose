package com.uwaisalqadri.inknote.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "title")
    var title: String?,

    @ColumnInfo(name = "description")
    var description: String?,

    @ColumnInfo(name = "date")
    var date: String?,

    @ColumnInfo(name = "isReady")
    var isReady: Boolean,

    @ColumnInfo(name = "imageUrl")
    var imageUrl: String?
) : Parcelable