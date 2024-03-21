package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class Legalities(
    val alchemy: String,
    val brawl: String,
    val commander: String,
    val duel: String,
    val explorer: String,
    val future: String,
    val gladiator: String,
    val historic: String,
    val legacy: String,
    val modern: String,
    @SerializedName("oathbreaker")
    val oathBreaker: String,
    @SerializedName("oldschool")
    val oldSchool: String,
    val pauper: String,
    @SerializedName("paupercommander")
    val pauperCommander: String,
    val penny: String,
    val pioneer: String,
    @SerializedName("predh")
    val preDh: String,
    @SerializedName("premodern")
    val preModern: String,
    val standard: String,
    @SerializedName("standardbrawl")
    val standardBrawl: String,
    val timeless: String,
    val vintage: String
)
