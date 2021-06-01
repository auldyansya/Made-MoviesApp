package com.auldy.made.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.auldy.made.core.domain.usecase.MoviesUseCase

class FavoriteViewModel(moviesUseCase: MoviesUseCase) : ViewModel() {
    val favoriteMovies = moviesUseCase.getFavoriteMovies().asLiveData()
}

