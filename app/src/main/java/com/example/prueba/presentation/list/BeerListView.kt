package com.example.prueba.presentation.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel

// hay que traerla de la API

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



// ¿en el invoke por qué hay que poner del id?
// si yo nada más quiero hacer la función plana para navegar


