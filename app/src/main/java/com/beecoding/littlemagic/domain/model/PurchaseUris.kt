package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class PurchaseUris(
    @SerializedName("cardhoarder")
    val cardHoarder: String,
    @SerializedName("cardmarket")
    val cardMarket: String,
    @SerializedName("tcgplayer")
    val tcgPlayer: String
)
