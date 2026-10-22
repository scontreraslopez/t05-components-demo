package net.iessochoa.sergiocontreras.t05componentsdemo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


/**
 * @param listaOpciones lista de opciones
 * @param opcionSeleccionada opción seleccionada
 * @param onOptionSelected función que se ejecuta cuando se selecciona una opción
 */
@Composable
fun RadioButtonRow(
    listaOpciones: List<String>,
    opcionSeleccionada: String,
    onOptionSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .selectableGroup(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        listaOpciones.forEach { operation ->
            RadioButtonText(
                texto = operation,
                seleccionado = opcionSeleccionada == operation, // comportamiento radio button
                onClick = { onOptionSelected(operation) },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RadioButtonRowPreview() {
    val listaOpciones = listOf("Atún", "Peperoni", "Queso", "Bacon")
    val opcionSeleccionada = listaOpciones[1]
    RadioButtonRow(
        listaOpciones,
        opcionSeleccionada,
        {}
    )
}

