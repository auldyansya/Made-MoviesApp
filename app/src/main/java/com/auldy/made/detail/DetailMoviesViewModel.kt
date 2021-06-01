package com.auldy.made.detail

import androidx.lifecycle.ViewModel
import com.auldy.made.core.domain.model.Movies
import com.auldy.made.core.domain.usecase.MoviesUseCase

class DetailMoviesViewModel(private val moviesUseCase: MoviesUseCase) : ViewModel() {
    fun setFavoriteMovies(movies: Movies, newStatus: Boolean) =
        moviesUseCase.setFavoriteMovies(movies, newStatus)
}