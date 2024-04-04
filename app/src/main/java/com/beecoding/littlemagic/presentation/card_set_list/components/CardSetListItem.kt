package com.beecoding.littlemagic.presentation.card_set_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beecoding.littlemagic.domain.model.CardSet
import com.beecoding.littlemagic.utils.Utils.Companion.toDateFormat
import com.beecoding.littlemagic.utils.Utils.Companion.capitalize

@Composable
fun CardSetListItem(
    cardSet: CardSet,
    onItemClick: (CardSet) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(cardSet) }

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onItemClick(cardSet) }
                .padding(start = 20.dp, top = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = "${cardSet.name} (${cardSet.code.uppercase()})",
                style = MaterialTheme.typography.bodyMedium,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = if (cardSet.digital) "Digital" else "Non-digital",
                color = if (cardSet.digital) Color.Green else Color.Magenta,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.align(CenterVertically)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onItemClick(cardSet) }
                .padding(start = 25.dp, top = 5.dp, end = 20.dp, bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = "${cardSet.setType.capitalize()} ${cardSet.block} ${cardSet.releasedAt?.toDateFormat()}",
                style = MaterialTheme.typography.bodySmall,
                fontStyle = FontStyle.Italic,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.align(CenterVertically)
            )
        }
    }
}

@Preview
@Composable
fun CardSetListItemPreview() {
    CardSetListItem(
        cardSet = CardSet(
            arenaCode = "arenaCode",
            cardCount = 1,
            code = "aer",
            digital = true,
            foilOnly = true,
            iconSvgUri = "test",
            id = "1",
            mtgoCode = "mtgocode",
            name = "Aether Revolt",
            nonFoilOnly = true,
            `object` = "object",
            releasedAt = "2020-05-10",
            scryfallUri = "testuri",
            searchUri = "searchuri",
            setType = "expansion",
            tcgPlayerId = 45,
            uri = "url",
            block = "",
            blockCode = "",
            parentSetCode = "",
            printedSize = 1
        ), onItemClick = {}
    )
}