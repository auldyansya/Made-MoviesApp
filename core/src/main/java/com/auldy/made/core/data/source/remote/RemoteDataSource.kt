package com.auldy.made.core.data.source.remote

import android.annotation.SuppressLint
import android.util.Log
import com.auldy.made.core.data.source.remote.network.ApiResponse
import com.auldy.made.core.data.source.remote.network.ApiService
import com.auldy.made.core.data.source.remote.response.MoviesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {

    @SuppressLint("CheckResult")
    suspend fun getAllMovies(): Flow<ApiResponse<List<MoviesResponse>>> {
        //get data from remote api
        return flow {
            try {
                val response = apiService.getMovies()
                val dataArray = response.results
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }
}

