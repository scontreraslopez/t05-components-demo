package net.iessochoa.sergiocontreras.t05componentsdemo.ui.components

import android.widget.RatingBar
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t05componentsdemo.R

/**
 * Barra de valoración con estrellas.
 * @param rating valoración actual, de 0 a [maxRating]
 * @param onRatingChange se llama con la nueva valoración al pulsar una estrella
 * @param maxRating número de estrellas
 * @param starSize tamaño de cada estrella
 * @param color color de las estrellas
 */

@Composable
fun RatingBar(
    rating: Int,
    onRatingChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    maxRating: Int = 5,
    starSize: Dp = 40.dp,
    color: Color = MaterialTheme.colorScheme.primary
) {
    Row(modifier = modifier.selectableGroup()) {
        for (i in 1..maxRating) {
            Icon(
                painter = painterResource(
                    if (i <= rating) R.drawable.ic_star else R.drawable.ic_star_border
                    // Necesita tener importados estos iconos
                ),
                contentDescription = "$i / $maxRating",
                tint = color,
                modifier = Modifier
                    .size(starSize)
                    .selectable(
                        selected = i == rating,
                        // Pulsar la primera estrella cuando ya está sola deja la valoración a 0
                        onClick = { onRatingChange(if (i == 1 && rating == 1) 0 else i) },
                        role = Role.RadioButton
                    )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RatingBarPreview() = RatingBar(
    rating = 3,
    onRatingChange = {}
)