package com.auldy.made.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListMoviesResponse(

    @field:SerializedName("results")
    val results: List<MoviesResponse>
)
