package com.example.prueba.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel

// hay que traerla de la API

// hay que pasarle la info también
@Composable
fun BeerListView (
    onDetailClick: (String) -> Unit,
    beerListViewModel: BeerListViewModel = koinViewModel()
)
{
   // beerListViewModel.getData()
    // println("hola")
    LaunchedEffect(true ){
        beerListViewModel.getData()
    }
    val state = beerListViewModel.beerList.observeAsState()

    /*Column() {
        IconButton(onClick = onInfoClick) {
            Icon(Icons.Filled.Info)

        }

    }*/



    TopAppBar(
        modifier = Modifier,
        backgroundColor = Color.Cyan
    ) {
        Text(
            text = "Beer Aplication",
            textAlign = TextAlign.Center)

    }

    Icon(imageVector = Icons.Filled.Info, contentDescription = "informacion")

    Spacer(modifier = Modifier
        .size(100.dp)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        val beerList = state.value
        items(beerList?.size ?: 0) { i ->
            // Unwrap
            val item = beerList?.get(i)
            item?.let { beer ->
                BeerItem(beer) {
                    onDetailClick.invoke(beer.id)
                }
            }
        }
    }}




