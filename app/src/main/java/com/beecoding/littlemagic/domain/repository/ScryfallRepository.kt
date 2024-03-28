package com.beecoding.littlemagic.domain.repository

import com.beecoding.littlemagic.domain.model.Card
import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow

interface ScryfallRepository {

    suspend fun getCardById(cardId: String): Flow<Result<Card>>

    suspend fun getSetByCode(setCode: String): Flow<Result<CardSet>>

    suspend fun getSets(): Flow<Result<List<CardSet>>>
}