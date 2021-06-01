package com.auldy.made.core.domain.usecase

import com.auldy.made.core.domain.model.Movies
import com.auldy.made.core.domain.repository.IMoviesRepository

class MoviesInteractor(private val moviesRepository: IMoviesRepository) : MoviesUseCase {

    override fun getAllMovies() = moviesRepository.getAllMovies()

    override fun getFavoriteMovies() = moviesRepository.getFavoriteMovies()

    override fun setFavoriteMovies(movies: Movies, state: Boolean) =
        moviesRepository.setFavoriteMovies(movies, state)
}