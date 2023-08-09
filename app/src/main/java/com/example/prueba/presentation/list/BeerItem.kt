package com.example.prueba.presentation.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    Column(
        modifier = Modifier.clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
        )
    {
        AsyncImage(
            model = beer.imageUrl,
            contentDescription = beer.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)

        )
        Text(text = beer.name)
        Text(text = beer.id)
        Button(onClick = onDetailClicked ) {
            Text(text = "details")
            
        }
        Spacer(modifier = Modifier
            .size(10.dp)
        )

        //Icon(bitmap = Icons.Filled.Star, contentDescription = "estrella")

        Divider(color = Color.Blue, thickness = 1.dp)
        Spacer(modifier = Modifier
            .size(10.dp)
        )


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
    Column(
        modifier = Modifier.clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
        )
    {
        AsyncImage(
            model = beer.imageUrl,
            contentDescription = beer.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)

        )
        Text(text = beer.name)
        Text(text = beer.id)
        Text(
            text = "go to details",
            modifier = Modifier
                .clickable { onDetailClicked() },
        )
        Button(onClick = onDetailClicked ) {
            Text(text = "go to details")

        }
        Spacer(modifier = Modifier
            .size(20.dp)
        )

    }
}*/





