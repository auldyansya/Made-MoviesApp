package com.auldy.made.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.auldy.made.R
import com.auldy.made.core.domain.model.Movies
import com.auldy.made.databinding.ActivityDetailMoviesBinding
import org.koin.android.viewmodel.ext.android.viewModel

class DetailMoviesActivity : AppCompatActivity() {


    private val detailMoviesViewModel: DetailMoviesViewModel by viewModel()
    private lateinit var binding: ActivityDetailMoviesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailMovies = intent.getParcelableExtra<Movies>(EXTRA_DATA)
        showDetailMovies(detailMovies)
    }

    private fun showDetailMovies(detailMovies: Movies?) {
        detailMovies?.let {
            supportActionBar?.title = detailMovies.title
            binding.title.text = detailMovies.title
            binding.release.text = detailMovies.release_date
            binding.average.text = detailMovies.vote_average
            binding.originalTitle.text = detailMovies.original_title
            binding.count.text = detailMovies.vote_count
            binding.language.text = detailMovies.original_language
            binding.popularity2.text = detailMovies.popularity
            binding.overview.text = detailMovies.overview

            val imageBackdrop = detailMovies.backdrop_path
            Glide.with(this@DetailMoviesActivity)
                .load("https://image.tmdb.org/t/p/w780$imageBackdrop")
                .into(binding.background)
            val imagePoster = detailMovies.poster_path
            Glide.with(this@DetailMoviesActivity)
                .load("https://image.tmdb.org/t/p/w780$imagePoster")
                .into(binding.poster)

            var statusFavorite = detailMovies.isFavorite
            setStatusFavorite(statusFavorite)
            binding.fab.setOnClickListener {
                statusFavorite = !statusFavorite
                detailMoviesViewModel.setFavoriteMovies(detailMovies, statusFavorite)
                setStatusFavorite(statusFavorite)
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.fab.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_favorite_white
                )
            )
        } else {
            binding.fab.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_not_favorite_white
                )
            )
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

}
