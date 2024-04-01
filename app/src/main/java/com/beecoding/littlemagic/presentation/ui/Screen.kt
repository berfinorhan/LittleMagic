package com.beecoding.littlemagic.presentation.ui

sealed class Screen (val route: String) {
    data object CardSetListScreen: Screen(route = "card_set_list_screen")
    data object CardSetDetailScreen: Screen(route = "card_set_detail_screen")
    data object CardDetailScreen: Screen(route = "card_detail_screen")
}