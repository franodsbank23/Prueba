package com.example.prueba.presentation.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.prueba.domain.model.BeerItemModel


// le paso BeerItemDto

// después tengo que pasarles la función para navegar a su detail


@Composable
fun BeerItem
            (
    beer: BeerItemModel,
    onDetailClicked: () -> Unit
            )
{
    Column(modifier = Modifier.clickable { }) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(beer.imageUrl)
                .build(),
            contentDescription = beer.name,
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        )
        Text(text = beer.id)
        Text(text = "go to details", modifier = Modifier.clickable { onDetailClicked() })
    }
}

// guardo


/*@Composable
fun BeerItem
            (
    beer: BeerItemModel,
    onDetailClicked: () -> Unit
)
{
    Column(modifier = Modifier.clickable { }) {
        AsyncImage(
            model = beer.imageUrl,
            contentDescription = beer.name,
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        )
        Text(text = beer.id)
        Text(text = "go to details", modifier = Modifier.clickable { onDetailClicked() })
    }
}*/


