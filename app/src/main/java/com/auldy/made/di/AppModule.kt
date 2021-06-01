package com.auldy.made.di

import com.auldy.made.core.domain.usecase.MoviesInteractor
import com.auldy.made.core.domain.usecase.MoviesUseCase
import com.auldy.made.detail.DetailMoviesViewModel
import com.auldy.made.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MoviesUseCase> { MoviesInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMoviesViewModel(get()) }
}