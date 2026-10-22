package net.iessochoa.sergiocontreras.t05componentsdemo.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
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
import net.iessochoa.sergiocontreras.t05componentsdemo.model.ColorMana
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaB
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaG
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaGenerico
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaR
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaU
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.CartaColors.ManaW

@Composable
fun MtgCard(
    @DrawableRes imagen: Int,
    nombre: String,
    tipo: String,
    subtipo: String,
    coloresMana: List<String>,
    modifier: Modifier = Modifier
) {
    OutlinedCard (
        modifier = modifier.width(250.dp),
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Column (
            modifier = Modifier.padding(4.dp)
        ) {

            MtgCardBlock() {
                Text(
                    text = nombre,
                    style = MaterialTheme.typography.labelSmall,
                    maxLines = 2
                )

                Spacer(modifier = Modifier.weight(1f))

                coloresMana.forEach {
                    Surface(
                        modifier = Modifier.size(24.dp),
                        color = colorFinder(it),
                        content = {       }
                    )
                }

            }

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

fun colorFinder(nombreColor: String): Color {
    val color =  when (nombreColor) {
        ColorMana.BLANCO.nombre ->  ManaW
        ColorMana.AZUL.nombre ->  ManaU
        ColorMana.NEGRO.nombre ->  ManaB
        ColorMana.ROJO.nombre ->  ManaR
        ColorMana.VERDE.nombre ->  ManaG
        else -> ManaGenerico
    }
    return color
}



@Preview(showBackground = true)
@Composable
fun MtgCardPreview() {
    MtgCard(
        imagen = R.drawable.mtg_placeholder,
        nombre = "Zombie Sobrecosido",
        coloresMana = listOf("Azul", "Negro"),
        tipo = "Zombie",
        subtipo = "Guerrero"
    )
}
