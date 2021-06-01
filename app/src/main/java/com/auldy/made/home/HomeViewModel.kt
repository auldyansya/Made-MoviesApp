package com.auldy.made.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.auldy.made.core.domain.usecase.MoviesUseCase

class HomeViewModel(moviesUseCase: MoviesUseCase) : ViewModel() {
    val movies = moviesUseCase.getAllMovies().asLiveData()
}

