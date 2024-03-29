package com.beecoding.littlemagic.presentation.card_set_list

import com.beecoding.littlemagic.domain.model.CardSet

data class CardSetListState (
    val cardSetList: List<CardSet> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)