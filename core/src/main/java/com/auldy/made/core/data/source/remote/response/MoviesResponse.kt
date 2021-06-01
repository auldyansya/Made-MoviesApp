package com.auldy.made.core.data.source.remote.response

import com.google.gson.annotations.SerializedName


data class MoviesResponse(
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("backdrop_path")
    val backdrop_path: String,

    @field:SerializedName("poster_path")
    val poster_path: String,

    @field:SerializedName("original_title")
    val original_title: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("release_date")
    val release_date: String,

    @field:SerializedName("vote_average")
    val vote_average: String,

    @field:SerializedName("vote_count")
    val vote_count: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("original_language")
    val original_language: String,

    @field:SerializedName("popularity")
    val popularity: String
)

