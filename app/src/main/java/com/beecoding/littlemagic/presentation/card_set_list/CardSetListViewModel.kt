package com.beecoding.littlemagic.presentation.card_set_list

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.beecoding.littlemagic.domain.use_case.get_sets.GetCardSetListUseCase
import com.beecoding.littlemagic.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CardSetListViewModel @Inject constructor(
    private val getCardSetListUseCase: GetCardSetListUseCase
) : ViewModel() {

    private val _cardSetListState = mutableStateOf<CardSetListState>(CardSetListState())
    val cardSetListState: State<CardSetListState> = _cardSetListState

    init {
        getCardSets()
    }

    private fun getCardSets() {
        getCardSetListUseCase().onEach { result ->
            when(result) {
                is Result.Success -> {
                    _cardSetListState.value = CardSetListState(cardSetList = result.data ?: emptyList())
                }

                is Result.Error  -> {
                    _cardSetListState.value = CardSetListState(error = result.message ?: "An unexpected error occured.")
                }

                is Result.Loading -> {
                    _cardSetListState.value = CardSetListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}