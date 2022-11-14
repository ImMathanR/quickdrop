package dev.immathan.quickdrop.common.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun QuickDropTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
) {
    MaterialTheme(
        colors = if (useDarkTheme) {
            darkColors
        } else {
            lightColors
        }, content = content
    )
}
