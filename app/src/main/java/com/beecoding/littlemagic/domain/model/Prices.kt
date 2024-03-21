package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class Prices(
    val eur: String,
    @SerializedName("eur_foil")
    val eurFoil: String,
    val tix: String,
    val usd: String,
    @SerializedName("usd_etched")
    val usdEtched: Any,
    @SerializedName("usd_foil")
    val usdFoil: String
)
