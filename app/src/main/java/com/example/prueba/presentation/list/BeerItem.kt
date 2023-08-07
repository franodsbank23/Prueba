package com.example.prueba.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.prueba.data.dto.BeerItemDto


// le paso BeerItemDto

@Composable
fun BeerItem
            (
    beerItemAttributes: BeerItemDto
            )
{
    Column() {
        AsyncImage(
            model = beerItemAttributes.imageUrl,
            contentDescription = beerItemAttributes.name,
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        )
        Text(text = beerItemAttributes.id)

    }
}