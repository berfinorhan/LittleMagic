package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class CardSet(
    @SerializedName("arena_code")
    val arenaCode: String,
    @SerializedName("card_count")
    val cardCount: Int,
    val code: String,
    val digital: Boolean,
    @SerializedName("foil_only")
    val foilOnly: Boolean,
    @SerializedName("icon_svg_uri")
    val iconSvgUri: String,
    val id: String,
    @SerializedName("mtgo_code")
    val mtgoCode: String,
    val name: String,
    @SerializedName("non_foil_only")
    val nonFoilOnly: Boolean,
    val `object`: String,
    @SerializedName("released_at")
    val releasedAt: String,
    @SerializedName("scryfall_uri")
    val scryfallUri: String,
    @SerializedName("search_uri")
    val searchUri: String,
    @SerializedName("set_type")
    val setType: String,
    @SerializedName("tcgplayer_id")
    val tcgPlayerId: Int,
    val uri: String
)