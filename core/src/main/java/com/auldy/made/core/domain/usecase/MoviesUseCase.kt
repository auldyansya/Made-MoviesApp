package com.auldy.made.core.domain.usecase

import com.auldy.made.core.data.Resource
import com.auldy.made.core.domain.model.Movies
import kotlinx.coroutines.flow.Flow


interface MoviesUseCase {
    fun getAllMovies(): Flow<Resource<List<Movies>>>
    fun getFavoriteMovies(): Flow<List<Movies>>
    fun setFavoriteMovies(movies: Movies, state: Boolean)
}