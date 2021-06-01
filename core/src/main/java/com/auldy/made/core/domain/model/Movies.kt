package com.auldy.made.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movies(
    val id: Int,
    val backdrop_path: String,
    val poster_path: String,
    val original_title: String,
    val title: String,
    val release_date: String,
    val vote_average: String,
    val vote_count: String,
    val overview: String,
    val original_language: String,
    val popularity: String,
    val isFavorite: Boolean
) : Parcelable