package com.beecoding.littlemagic.presentation.card_set_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.unit.dp
import com.beecoding.littlemagic.domain.model.CardSet

@Composable
fun CardSetListItem(
    cardSet: CardSet,
    onItemClick: (CardSet) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(cardSet) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Text(
            text = "${cardSet.id}. ${cardSet.name} (${cardSet.code})",
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Ellipsis
        )

        Text(
            text = if (cardSet.digital) "Digital" else "Non-digital",
            color = if (cardSet.digital) Color.Green else Color.Magenta,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(CenterVertically)
        )
    }
}