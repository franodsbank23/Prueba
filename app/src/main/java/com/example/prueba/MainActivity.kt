package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.prueba.navigation.NavigationGraph
import com.example.prueba.ui.theme.PruebaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PruebaTheme(
                dynamicColor = false
            ) {
                NavigationGraph()
            }
        }
    }
}

