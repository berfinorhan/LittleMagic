package com.beecoding.littlemagic.data.remote

import com.beecoding.littlemagic.data.remote.dto.CardDto
import com.beecoding.littlemagic.data.remote.dto.CardSetDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ScryfallApi {

    @GET("/cards/{cardId}")
    suspend fun getCardById(@Path("cardId") cardId: String): CardDto

    @GET("/sets/{setCode}")
    suspend fun getSetByCode(@Path("setName") setName: String): CardSetDto

    @GET("/sets")
    suspend fun getSets(): List<CardSetDto>

}