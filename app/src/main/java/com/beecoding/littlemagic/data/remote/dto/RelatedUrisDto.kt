package com.beecoding.littlemagic.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RelatedUrisDto(
    val edhrec: String,
    val gatherer: String,
    @SerializedName("tcgplayer_infinite_articles")
    val tcgPlayerInfiniteArticles: String,
    @SerializedName("tcgplayer_infinite_decks")
    val tcgPlayerInfiniteDecks: String
)