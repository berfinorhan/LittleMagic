package com.beecoding.littlemagic.domain.use_case.get_sets

import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCardSetListUseCase @Inject constructor(
    private val repository: ScryfallRepository
) {
    operator fun invoke(): Flow<Result<List<CardSet>>> = flow {
        repository.getCardSetList()
    }
}