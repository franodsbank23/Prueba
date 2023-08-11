package com.example.prueba.presentation.start

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prueba.R

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
        Text(
            text = "BEER APP",
            color = Color.White,
            fontSize = 30.sp

            )

        Image(
            painter = painterResource(id = R.drawable.cervezastarttwo),
            contentDescription= "imagen",
            modifier = Modifier.
                    size(250.dp)
        )

        Text(
            text = "Start",
            color = Color.White,
            fontSize = 25.sp
            )

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
                modifier = Modifier.size(50.dp)


            )
        }
    }
}