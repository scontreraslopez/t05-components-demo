package net.iessochoa.sergiocontreras.t05componentsdemo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.MainScreen
import net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme.T05ComponentsDemoTheme

/**
 * Project: T05 Components Demo
 * From: net.iessochoa.sergiocontreras.t05componentsdemo.ui.theme
 * Created by: Contr
 * On: 19/10/2026 at 23:21
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun T05ComponentsDemoApp() {
    T05ComponentsDemoTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MainScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}