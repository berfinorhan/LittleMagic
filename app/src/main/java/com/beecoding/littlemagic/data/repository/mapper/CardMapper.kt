package com.beecoding.littlemagic.data.repository.mapper

import com.beecoding.littlemagic.data.remote.dto.CardDto
import com.beecoding.littlemagic.data.remote.dto.ImageUrisDto
import com.beecoding.littlemagic.data.remote.dto.LegalitiesDto
import com.beecoding.littlemagic.data.remote.dto.PricesDto
import com.beecoding.littlemagic.data.remote.dto.PurchaseUrisDto
import com.beecoding.littlemagic.data.remote.dto.RelatedUrisDto
import com.beecoding.littlemagic.domain.model.Card
import com.beecoding.littlemagic.domain.model.ImageUris
import com.beecoding.littlemagic.domain.model.Legalities
import com.beecoding.littlemagic.domain.model.Prices
import com.beecoding.littlemagic.domain.model.PurchaseUris
import com.beecoding.littlemagic.domain.model.RelatedUris

fun CardDto.toCard(): Card {
    return Card(
        artist = artist,
        artistIds = artistIds,
        booster = booster,
        borderColor = borderColor,
        cardBackId = cardBackId,
        cardMarketId = cardMarketId,
        cmc = cmc,
        collectorNumber = collectorNumber,
        colorIdentity = colorIdentity,
        colors = colors,
        digital = digital,
        edhrecRank = edhrecRank,
        finishes = finishes,
        foil = foil,
        frame = frame,
        fullArt = fullArt,
        games = games,
        highresImage = highresImage,
        id = id,
        illustrationId = illustrationId,
        imageStatus = imageStatus,
        imageUris = imageUris.toImagesUris(),
        keywords = keywords,
        lang = lang,
        layout = layout,
        legalities = legalities.toLegalities(),
        manaCost = manaCost,
        mtgoFoilId = mtgoFoilId,
        mtgoId = mtgoId,
        multiverseIds = multiverseIds,
        name = name,
        nonFoil = nonFoil,
        `object` = `object`,
        oracleId = oracleId,
        oracleText = oracleText,
        overSized = overSized,
        pennyRank = pennyRank,
        power = power,
        prices = prices.toPrices(),
        printsSearchUri = printsSearchUri,
        promo = promo,
        purchaseUris = purchaseUris.toPurchaseUris(),
        rarity = rarity,
        relatedUris = relatedUris.toRelatedUris(),
        releasedAt = releasedAt,
        reprint = reprint,
        reserved = reserved,
        rulingsUri = rulingsUri,
        scryfallSetUri = scryfallSetUri,
        scryfallUri = scryfallUri,
        `set` = `set`,
        setId = setId,
        setName = setName,
        setSearchUri = setSearchUri,
        setType = setType,
        setUri = setUri,
        storySpotlight = storySpotlight,
        tcgPlayerId = tcgPlayerId,
        textless = textless,
        toughness = toughness,
        typeLine = typeLine,
        uri = uri,
        variation = variation
    )
}

fun ImageUrisDto.toImagesUris(): ImageUris {
    return ImageUris(
        artCrop = artCrop,
        borderCrop = borderCrop,
        large = large,
        normal = normal,
        png = png,
        small = small
    )
}

fun LegalitiesDto.toLegalities(): Legalities {
    return Legalities(
        alchemy = alchemy,
        brawl = brawl,
        commander = commander,
        duel = duel,
        explorer = explorer,
        future = future,
        gladiator = gladiator,
        historic = historic,
        legacy = legacy,
        modern = modern,
        oathBreaker = oathBreaker,
        oldSchool = oldSchool,
        pauper = pauper,
        pauperCommander = pauperCommander,
        penny = penny,
        pioneer = pioneer,
        preDh = preDh,
        preModern = preModern,
        standard = standard,
        standardBrawl = standardBrawl,
        timeless = timeless,
        vintage = vintage
    )
}

fun PricesDto.toPrices(): Prices {
    return Prices(
        eur = eur,
        eurFoil = eurFoil,
        tix = tix,
        usd = usd,
        usdEtched = usdEtched,
        usdFoil = usdFoil
    )
}

fun PurchaseUrisDto.toPurchaseUris(): PurchaseUris {
    return PurchaseUris(
        cardHoarder = cardHoarder,
        cardMarket = cardMarket,
        tcgPlayer = tcgPlayer
    )
}

fun RelatedUrisDto.toRelatedUris(): RelatedUris {
    return RelatedUris(
        edhrec = edhrec,
        gatherer = gatherer,
        tcgPlayerInfiniteArticles = tcgPlayerInfiniteArticles,
        tcgPlayerInfiniteDecks = tcgPlayerInfiniteDecks
    )
}
