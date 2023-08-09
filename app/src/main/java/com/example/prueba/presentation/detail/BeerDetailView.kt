package com.example.prueba.presentation.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
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
                .clickable { }
        ) {
        AsyncImage(
            model = result?.imageUrl,
            contentDescription = result?.name,
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        )
            result?.let{Text(text = result!!.description)
                Text(text = result.tagline)
                Text(text = result.firstBrewed)}


            IconButton(
                modifier = Modifier.semantics {
                    contentDescription = "Atrás Botón Ir al listado de personajes"
                },
                onClick = onBackClick
            ) {
                Icon(Icons.Filled.ArrowBack, null)
            }
        }
}

// la petición de la api la hago en el VM





