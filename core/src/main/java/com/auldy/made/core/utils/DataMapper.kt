package com.auldy.made.core.utils


import com.auldy.made.core.data.source.local.entity.MoviesEntity
import com.auldy.made.core.data.source.remote.response.MoviesResponse
import com.auldy.made.core.domain.model.Movies

object DataMapper {
    fun mapResponsesToEntities(input: List<MoviesResponse>): List<MoviesEntity> {
        val moviesList = ArrayList<MoviesEntity>()
        input.map {
            val movies = MoviesEntity(
                id = it.id,
                backdrop_path = it.backdrop_path,
                poster_path = it.poster_path,
                original_title = it.original_title,
                title = it.title,
                release_date = it.release_date,
                vote_average = it.vote_average,
                vote_count = it.vote_count,
                overview = it.overview,
                original_language = it.original_language,
                popularity = it.popularity,
                isFavorite = false
            )
            moviesList.add(movies)
        }
        return moviesList
    }

    fun mapEntitiesToDomain(input: List<MoviesEntity>): List<Movies> =
        input.map {
            Movies(
                id = it.id,
                backdrop_path = it.backdrop_path,
                poster_path = it.poster_path,
                original_title = it.original_title,
                title = it.title,
                release_date = it.release_date,
                vote_average = it.vote_average,
                vote_count = it.vote_count,
                overview = it.overview,
                original_language = it.original_language,
                popularity = it.popularity,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movies) =
        MoviesEntity(
            id = input.id,
            backdrop_path = input.backdrop_path,
            poster_path = input.poster_path,
            original_title = input.original_title,
            title = input.title,
            release_date = input.release_date,
            vote_average = input.vote_average,
            vote_count = input.vote_count,
            overview = input.overview,
            original_language = input.original_language,
            popularity = input.popularity,
            isFavorite = input.isFavorite
        )
}