package dev.immathan.quickdrop.android

import WelcomeScreen
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import dev.immathan.quickdrop.common.theme.QuickDropTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuickDropTheme {
                WelcomeScreen()
            }
        }
    }
}