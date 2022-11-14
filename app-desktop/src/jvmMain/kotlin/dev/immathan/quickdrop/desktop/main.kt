package dev.immathan.quickdrop.desktop

import WelcomeScreen
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import dev.immathan.quickdrop.common.theme.QuickDropTheme

fun main() {
    application {
        val windowState = rememberWindowState()

        Window(
            onCloseRequest = ::exitApplication, state = windowState, title = "QuickDrop"
        ) {
            QuickDropTheme {
                WelcomeScreen()
            }
        }
    }
}
