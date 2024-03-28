package com.beecoding.littlemagic.domain.use_case.get_card

import com.beecoding.littlemagic.domain.model.Card
import com.beecoding.littlemagic.domain.repository.ScryfallRepository
import com.beecoding.littlemagic.utils.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCardUseCase @Inject constructor(
    private val repository: ScryfallRepository
) {
    suspend operator fun invoke(cardId: String): Flow<Result<Card>> {
        return repository.getCardById(cardId)
    }
}