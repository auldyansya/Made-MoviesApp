package com.auldy.made.core.data.source.remote.network

import com.auldy.made.core.data.source.remote.response.ListMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/top_rated")
    suspend fun getMovies(
        @Query("api_key") query: String = "c0654a2d6b78b5e317c91bab517c9036"
    ): ListMoviesResponse
}