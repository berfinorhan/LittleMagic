package com.beecoding.littlemagic.domain.use_case.get_sets

import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSetsUseCase @Inject constructor(
    private val repository: ScryfallRepository
) {
    suspend operator fun invoke(): Flow<Result<List<CardSet>>> {
        return repository.getSets()
    }
}