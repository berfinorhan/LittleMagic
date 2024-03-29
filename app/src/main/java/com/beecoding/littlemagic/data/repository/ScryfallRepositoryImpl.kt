package com.beecoding.littlemagic.data.repository

import com.beecoding.littlemagic.data.remote.ScryfallApi
import com.beecoding.littlemagic.data.repository.mapper.toCard
import com.beecoding.littlemagic.data.repository.mapper.toCardSet
import com.beecoding.littlemagic.domain.model.Card
import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ScryfallRepositoryImpl @Inject constructor(
    private val api: ScryfallApi
) : ScryfallRepository {
    override suspend fun getCardById(cardId: String): Flow<Result<Card>> = flow {
        emit(Result.Loading())

        try {
            val card = api.getCardById(cardId)
            emit(Result.Success(data = card.toCard()))
        } catch (e: HttpException) {
            emit(Result.Error(message = e.localizedMessage ?: "An unexpected error happened."))
        } catch (e: IOException) {
            emit(Result.Error(e.localizedMessage ?: "Unable to reach the server."))
        }
    }

    override suspend fun getSetByCode(setCode: String): Flow<Result<CardSet>> = flow {
        try {
            val cardSet = api.getSetByCode(setCode)
            emit(Result.Success(data = cardSet.toCardSet()))
        } catch (e: HttpException) {
            emit(Result.Error(message = e.localizedMessage ?: "An unexpected error happened."))
        } catch (e: IOException) {
            emit(Result.Error(e.localizedMessage ?: "Unable to reach the server."))
        }
    }

    override suspend fun getCardSetList(): Flow<Result<List<CardSet>>> = flow {
        try {
            val sets = api.getCardSetList()
            emit(Result.Success(data = sets.map { it.toCardSet() }))
        } catch (e: HttpException) {
            emit(Result.Error(message = e.localizedMessage ?: "An unexpected error happened."))
        } catch (e: IOException) {
            emit(Result.Error(e.localizedMessage ?: "Unable to reach the server."))
        }
    }

}