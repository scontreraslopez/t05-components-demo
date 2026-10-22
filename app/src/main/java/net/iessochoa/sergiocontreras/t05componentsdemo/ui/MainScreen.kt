package net.iessochoa.sergiocontreras.t05componentsdemo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t05componentsdemo.R
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

    ) {
        val (tipoCarta, onTipoCartaSelect) = remember { mutableStateOf("") }
        val (nombreCarta, onNombreCartaChange) = remember { mutableStateOf("")}

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
        TextField(
            value = nombreCarta,
            label = { Text ("Nombre") },
            onValueChange = onNombreCartaChange
        )
        val listOfTipos = listOf("Criatura", "Instantáneo", "Artefacto")

        DynamicSelectTextField(
            selectedValue = tipoCarta,
            options = listOfTipos,
            label = "Tipo",
            onValueChangedEvent = onTipoCartaSelect
        )

        Text("Colores")
        Row() {
            FilterChip(
                label = { Text("Blanco") },
                onClick = {},
                selected = false
            )
            FilterChip(
                label = { Text("Verde") },
                onClick = {},
                selected = true
            )
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