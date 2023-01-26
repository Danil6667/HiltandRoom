package com.example.hiltandroom.data.remote.api


import com.example.hiltandroom.data.models.Photo
import retrofit2.Call
import retrofit2.http.GET


interface PostsApiService {

    @GET("albums/1/photos")
    fun getPhoto(): Call<List<Photo>>
}