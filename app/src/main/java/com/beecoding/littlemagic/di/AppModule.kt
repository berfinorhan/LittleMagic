package com.beecoding.littlemagic.di

import com.beecoding.littlemagic.data.remote.ScryfallApi
import com.beecoding.littlemagic.data.repository.ScryfallRepositoryImpl
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesScryfallApi(): ScryfallApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ScryfallApi::class.java)
    }

    @Provides
    @Singleton
    fun provideScryfallRepository(api: ScryfallApi): ScryfallRepository {
        return ScryfallRepositoryImpl(api)
    }
}