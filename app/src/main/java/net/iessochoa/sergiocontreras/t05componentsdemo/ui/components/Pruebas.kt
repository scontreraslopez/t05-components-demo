package net.iessochoa.sergiocontreras.t05componentsdemo.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BotonesPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(onClick = { }) { Text("Button") }
        FilledTonalButton(onClick = { }) { Text("FilledTonalButton") }
        ElevatedButton(onClick = { }) { Text("ElevatedButton") }
        OutlinedButton(onClick = { }) { Text("OutlinedButton") }
        TextButton(onClick = { }) { Text("TextButton") }
        Button(onClick = { }, enabled = false) { Text("Deshabilitado") }
    }
}


@Composable
fun IngredienteCard(
    @DrawableRes imagen: Int,
    @StringRes nombre: Int,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.width(120.dp)) {
        Image(
            painter = painterResource(imagen),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )
        Text(
            text = stringResource(nombre),
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
