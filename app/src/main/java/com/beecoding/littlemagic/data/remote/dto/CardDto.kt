package com.beecoding.littlemagic.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CardDto(
    val artist: String,
    @SerializedName("artist_ids")
    val artistIds: List<String>,
    val booster: Boolean,
    @SerializedName("border_color")
    val borderColor: String,
    @SerializedName("card_back_id")
    val cardBackId: String,
    @SerializedName("cardmarket_id")
    val cardMarketId: Int,
    val cmc: Int,
    @SerializedName("collector_number")
    val collectorNumber: String,
    @SerializedName("color_identity")
    val colorIdentity: List<String>,
    val colors: List<String>,
    val digital: Boolean,
    @SerializedName("edhrec_rank")
    val edhrecRank: Int,
    val finishes: List<String>,
    val foil: Boolean,
    val frame: String,
    @SerializedName("full_art")
    val fullArt: Boolean,
    val games: List<String>,
    @SerializedName("highres_image")
    val highresImage: Boolean,
    val id: String,
    @SerializedName("illustration_id")
    val illustrationId: String,
    @SerializedName("image_status")
    val imageStatus: String,
    @SerializedName("image_uris")
    val imageUris: ImageUrisDto,
    val keywords: List<String>,
    val lang: String,
    val layout: String,
    val legalities: LegalitiesDto,
    @SerializedName("mana_cost")
    val manaCost: String,
    @SerializedName("mtgo_foil_id")
    val mtgoFoilId: Int,
    @SerializedName("mtgo_id")
    val mtgoId: Int,
    @SerializedName("multiverse_ids")
    val multiverseIds: List<Int>,
    val name: String,
    @SerializedName("nonfoil")
    val nonFoil: Boolean,
    val `object`: String,
    @SerializedName("oracle_id")
    val oracleId: String,
    @SerializedName("oracle_text")
    val oracleText: String,
    @SerializedName("oversized")
    val overSized: Boolean,
    @SerializedName("penny_rank")
    val pennyRank: Int,
    val power: String,
    val prices: PricesDto,
    @SerializedName("prints_search_uri")
    val printsSearchUri: String,
    val promo: Boolean,
    @SerializedName("purchase_uris")
    val purchaseUris: PurchaseUrisDto,
    val rarity: String,
    @SerializedName("related_uris")
    val relatedUris: RelatedUrisDto,
    @SerializedName("released_at")
    val releasedAt: String,
    val reprint: Boolean,
    val reserved: Boolean,
    @SerializedName("rulings_uri")
    val rulingsUri: String,
    @SerializedName("scryfall_set_uri")
    val scryfallSetUri: String,
    @SerializedName("scryfall_uri")
    val scryfallUri: String,
    val `set`: String,
    @SerializedName("set_id")
    val setId: String,
    @SerializedName("set_name")
    val setName: String,
    @SerializedName("set_search_uri")
    val setSearchUri: String,
    @SerializedName("set_type")
    val setType: String,
    @SerializedName("set_uri")
    val setUri: String,
    @SerializedName("story_spotlight")
    val storySpotlight: Boolean,
    @SerializedName("tcgplayer_id")
    val tcgPlayerId: Int,
    val textless: Boolean,
    val toughness: String,
    @SerializedName("type_line")
    val typeLine: String,
    val uri: String,
    val variation: Boolean
)