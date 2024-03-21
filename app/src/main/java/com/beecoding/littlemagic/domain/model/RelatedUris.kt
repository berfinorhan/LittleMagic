package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class RelatedUris(
    val edhrec: String,
    val gatherer: String,
    @SerializedName("tcgplayer_infinite_articles")
    val tcgPlayerInfiniteArticles: String,
    @SerializedName("tcgplayer_infinite_decks")
    val tcgPlayerInfiniteDecks: String
)
