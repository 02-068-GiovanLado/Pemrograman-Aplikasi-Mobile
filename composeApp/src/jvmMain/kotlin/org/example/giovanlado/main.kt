package org.example.giovanlado

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "tugas1_giovanlado",
    ) {
        App()
    }
}