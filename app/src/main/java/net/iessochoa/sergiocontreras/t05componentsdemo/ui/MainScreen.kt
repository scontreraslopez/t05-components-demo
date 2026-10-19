package net.iessochoa.sergiocontreras.t05componentsdemo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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
        Text(text = "¡Bienvenido a la pantalla principal!")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}