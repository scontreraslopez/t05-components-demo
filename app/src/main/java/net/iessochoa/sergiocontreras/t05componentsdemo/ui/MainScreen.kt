package net.iessochoa.sergiocontreras.t05componentsdemo.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t05componentsdemo.R
import net.iessochoa.sergiocontreras.t05componentsdemo.model.ColorMana
import net.iessochoa.sergiocontreras.t05componentsdemo.model.TipoCarta
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.DynamicSelectTextField
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.MtgCard
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.RadioButtonRow
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.RatingBar

/**
 * Project: T05 Components Demo
 * From: net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme
 * Created by: Contr
 * On: 19/10/2026 at 23:26
 * Creado en Settings -> Editor -> File and Code Templates
 */


@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val (tipoCarta, onTipoCartaSelect) = remember { mutableStateOf("") }
        val (nombreCarta, onNombreCartaChange) = remember { mutableStateOf("")}
        val listOfTipos = TipoCarta.entries.toTypedArray().map {it.toString()}
        val coloresMana = ColorMana.entries.toTypedArray()

        val coloresSeleccionados: MutableList<ColorMana> = remember { mutableStateListOf() }
        val onColorSelected: (ColorMana) -> Unit = {
            if (coloresSeleccionados.contains(it))
                coloresSeleccionados -= it
            else
                coloresSeleccionados += it
                //Log.d("CLICK", "Has clickado ${it.name} y la lista tiene ahora ${coloresSeleccionados.size}")
        }




        // Aquí puedes agregar los componentes de la pantalla principal
        MtgCard(
            imagen = R.drawable.mtg_placeholder,
            nombre = nombreCarta,
            tipo = tipoCarta,
            subtipo = "Guerrero"
        )
        Text("Power Level")
        RatingBar(
            rating = 3,
            onRatingChange = {}
        )
        OutlinedTextField(
            value = nombreCarta,
            label = { Text (stringResource(R.string.textfield_nombre)) },
            onValueChange = onNombreCartaChange,
            modifier = Modifier.fillMaxWidth()
        )

        DynamicSelectTextField(
            selectedValue = tipoCarta,
            options = listOfTipos,
            label = stringResource(R.string.dropdown_tipo),
            onValueChangedEvent = onTipoCartaSelect
        )

        Text("Colores")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            coloresMana.forEach {
                FilterChip(
                    label = { Text (it.nombre) },
                    onClick = { onColorSelected(it) },
                    selected = coloresSeleccionados.contains(it),
                )
            }
        }

        Slider(
            value = 50f,
            onValueChange = {}
        )
        Slider(
            value = 50f,
            onValueChange = {}
        )
        Slider(
            value = 50f,
            onValueChange = {}
        )


    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(

    )
}