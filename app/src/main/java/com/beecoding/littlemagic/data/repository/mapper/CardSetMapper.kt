package com.beecoding.littlemagic.data.repository.mapper

import com.beecoding.littlemagic.data.remote.dto.CardSetDto
import com.beecoding.littlemagic.domain.model.CardSet

fun CardSetDto.toCardSet(): CardSet {
    return CardSet(
        arenaCode = arenaCode,
        cardCount = cardCount,
        code = code,
        digital = digital,
        foilOnly = foilOnly,
        iconSvgUri = iconSvgUri,
        id = id,
        mtgoCode = mtgoCode,
        name = name,
        nonFoilOnly = nonFoilOnly,
        `object` = `object`,
        releasedAt = releasedAt,
        scryfallUri = scryfallUri,
        searchUri = searchUri,
        setType = setType,
        tcgPlayerId = tcgPlayerId,
        uri = uri
    )
}