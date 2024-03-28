package com.beecoding.littlemagic.domain.use_case.get_set

import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSetUseCase @Inject constructor(
    private val repository: ScryfallRepository
) {
    suspend operator fun invoke(setCode: String): Flow<Result<CardSet>> {
        return repository.getSetByCode(setCode)
    }
}