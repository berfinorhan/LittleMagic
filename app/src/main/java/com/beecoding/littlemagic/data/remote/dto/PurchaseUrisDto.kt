package com.beecoding.littlemagic.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PurchaseUrisDto(
    @SerializedName("cardhoarder")
    val cardHoarder: String,
    @SerializedName("cardmarket")
    val cardMarket: String,
    @SerializedName("tcgplayer")
    val tcgPlayer: String
)