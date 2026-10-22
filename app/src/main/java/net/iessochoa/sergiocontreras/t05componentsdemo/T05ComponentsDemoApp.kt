package net.iessochoa.sergiocontreras.t05componentsdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.MainScreen
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.Purple80
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.T05ComponentsDemoTheme

/**
 * Project: T05 Components Demo
 * From: net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme
 * Created by: Contr
 * On: 19/10/2026 at 23:21
 * Creado en Settings -> Editor -> File and Code Templates
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun T05ComponentsDemoApp() {
    T05ComponentsDemoTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(
                        text = stringResource(R.string.top_app_bar_title),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Purple80)
                    ) },
                )
            }
        ) { innerPadding ->
            MainScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun T05ComponentsDemoAppPreview() = T05ComponentsDemoApp()