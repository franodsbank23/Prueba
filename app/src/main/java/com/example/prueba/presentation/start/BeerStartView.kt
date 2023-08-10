package com.example.prueba.presentation.start

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun BeerStartView
    (
    onStartClick: () -> Unit
        )
{
    
    Column(
        modifier = Modifier
            .clickable { }
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        )
    {
        Text(text = "BEER APP", color = Color.White)
        /*Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = stringResource(id = R.string.dog_content_description)
        )*/
        Text(text = "Start", color = Color.White)
        IconButton(
            modifier = Modifier.semantics {
                contentDescription = "botón inicio para entrar en la app"
            },
            onClick = onStartClick
        ) {
            Icon(
                Icons.Filled.PlayArrow,
                null,
                tint = Color.White,

            )
        }
    }
}