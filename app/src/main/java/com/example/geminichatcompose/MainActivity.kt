package com.example.geminichatcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.example.geminichatcompose.gemini.chat.components.GeminiChatScreen
import com.example.geminichatcompose.ui.theme.GeminiChatComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GeminiChatComposeTheme {
                GeminiChatScreen(
                    modifier = Modifier
                )
            }
        }
    }
}
