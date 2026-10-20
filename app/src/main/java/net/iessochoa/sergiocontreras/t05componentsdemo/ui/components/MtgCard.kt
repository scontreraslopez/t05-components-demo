package net.iessochoa.sergiocontreras.t05componentsdemo.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t05componentsdemo.R

@Composable
fun MtgCard(
    @DrawableRes imagen: Int,
    nombre: String,
    tipo: String,
    subtipo: String,
    modifier: Modifier = Modifier
) {
    OutlinedCard (
        modifier = modifier.width(120.dp),
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Column (
            modifier = Modifier.padding(4.dp)
        ) {
            Text(
                text = nombre,
                style = MaterialTheme.typography.labelSmall
            )
            Image(
                painter = painterResource(imagen),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )
            Text(
                text = "$tipo - $subtipo",
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MtgCardPreview() {
    MtgCard(
        imagen = R.drawable.mtg_placeholder,
        nombre = "Zombie Sobrecosido",
        tipo = "Zombie",
        subtipo = "Guerrero"
    )
}
