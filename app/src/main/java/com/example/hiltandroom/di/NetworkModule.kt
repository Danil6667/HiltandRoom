package com.example.hiltandroom.di

import com.example.hiltandroom.data.remote.RetrofitClient
import com.example.hiltandroom.data.remote.api.PostsApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Provides
    @Singleton
    fun providePostApiService(): PostsApiService {
        return retrofitClient.postsApiService
    }
}