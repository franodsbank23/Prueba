package com.example.prueba.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.example.prueba.databinding.InfoViewBinding

@Composable
fun InfoComponentView (
    onBackClick: () -> Unit,
    ){
    AndroidViewBinding(InfoViewBinding::inflate){
        btnBack.setOnClickListener{
            onBackClick.invoke()
        }
    }
}