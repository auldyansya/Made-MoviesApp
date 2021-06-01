package com.auldy.made.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MoviesEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "backdrop_path")
    var backdrop_path: String,

    @ColumnInfo(name = "poster_path")
    var poster_path: String,

    @ColumnInfo(name = "original_title")
    var original_title: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "release_date")
    var release_date: String,

    @ColumnInfo(name = "vote_average")
    var vote_average: String,

    @ColumnInfo(name = "vote_count")
    var vote_count: String,

    @ColumnInfo(name = "overview")
    var overview: String,

    @ColumnInfo(name = "original_language")
    var original_language: String,

    @ColumnInfo(name = "popularity")
    var popularity: String,

    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = false
)
