package com.example.arena

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Ciemny motyw dla nowoczesnego wyglądu
            MaterialTheme(colorScheme = darkColorScheme(primary = Color(0xFFBB86FC))) {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ArenaGoldApp()
                }
            }
        }
    }
}

@Composable
fun ArenaGoldApp() {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Willkommen in der Arena Gold", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { /* Funkcja startu */ },
            modifier = Modifier.fillMaxWidth().height(56.dp)
        ) {
            Text("SPIEL STARTEN", style = MaterialTheme.typography.labelLarge)
        }
    }
}
