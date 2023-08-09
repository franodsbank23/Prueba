package com.example.prueba.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidViewBinding

@Composable
fun InfoComponentView (
    onBackClick: () -> Unit,
    ){
    AndroidViewBinding(factory = info)
}