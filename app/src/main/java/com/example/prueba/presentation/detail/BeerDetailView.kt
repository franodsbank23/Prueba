package com.example.prueba.presentation.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.koin.androidx.compose.koinViewModel


@Composable
fun BeerDetailView (
    id: String,
    onBackClick: () -> Unit,
    beerDetailViewModel: BeerDetailViewModel = koinViewModel()
)
    {

        //llamamos al VM

        beerDetailViewModel.getBeer(id)


        val beerState = beerDetailViewModel.beer.observeAsState()

        //manipul
        val result = beerState.value

        // result.let y eso obliga a que no sea nulo

        Column(
            modifier = Modifier
                .clickable { },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(
                modifier = Modifier.semantics {
                    contentDescription = "botón atras para listado de cervezas"
                },
                onClick = onBackClick
            ) {
                Icon(Icons.Filled.ArrowBack, null)
            }
        AsyncImage(
            model = result?.imageUrl,
            contentDescription = result?.name,
            modifier = Modifier
                .weight(0.5f)
                .height(100.dp)
        )
            result?.let{
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = result!!.description, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = result.tagline,
                    color = Color.LightGray)
                Spacer(modifier = Modifier.size(10.dp))
                // también tendría que agregar: "first brewed" y dps lo que sea
                Text(text = result.firstBrewed?: "no information")}



        }
}

// la petición de la api la hago en el VM





