package net.iessochoa.sergiocontreras.t05componentsdemo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.t05componentsdemo.R
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.DynamicSelectTextField
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.components.MtgCard
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
        // Aquí puedes agregar los componentes de la pantalla principal
        MtgCard(
            imagen = R.drawable.mtg_placeholder,
            nombre = "Zombie Sobrecosido",
            tipo = "Zombie",
            subtipo = "Guerrero"
        )
        Text("Power Level")
        RatingBar(
            rating = 3,
            onRatingChange = {}
        )
        TextField(
            value = "",
            label = { Text ("Nombre") },
            onValueChange = {}
        )
        val listOfTipos = listOf("Criatura", "Instantáneo", "Artefacto")

        DynamicSelectTextField(
            selectedValue = listOfTipos.first(),
            options = listOfTipos,
            label = "Tipo",
            onValueChangedEvent = {}
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

        R



    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}