package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class CardSet(
    val `object`: String,
    val id: String,
    val code: String,
    @SerializedName("mtgo_code")
    val mtgoCode: String?,
    @SerializedName("arena_code")
    val arenaCode: String?,
    @SerializedName("tcgplayer_id")
    val tcgPlayerId: Int?,
    val name: String,
    @SerializedName("set_type")
    val setType: String,
    @SerializedName("released_at")
    val releasedAt: String?,
    @SerializedName("block_code")
    val blockCode: String?,
    val block: String?,
    @SerializedName("parent_set_code")
    val parentSetCode: String?,
    @SerializedName("card_count")
    val cardCount: Int,
    @SerializedName("printed_size")
    val printedSize: Int?,
    val digital: Boolean,
    @SerializedName("foil_only")
    val foilOnly: Boolean,
    @SerializedName("non_foil_only")
    val nonFoilOnly: Boolean,
    @SerializedName("scryfall_uri")
    val scryfallUri: String,
    val uri: String,
    @SerializedName("icon_svg_uri")
    val iconSvgUri: String,
    @SerializedName("search_uri")
    val searchUri: String,
)
