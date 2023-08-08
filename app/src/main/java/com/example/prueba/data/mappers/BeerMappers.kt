package com.example.prueba.data.mappers

import com.example.prueba.domain.model.BeerItemModel
import com.example.prueba.data.dto.principal.BeerDto
import com.example.prueba.domain.model.BeerDetailModel


// Los MAPPERS:






// tipo I

fun BeerDto.toBeerItemModel(): BeerItemModel {
    return BeerItemModel(
        id = id?: "",
        name = name?: "",
        imageUrl = imageUrl?: ""
    )
}

fun BeerDto.toBeerDetailModel(): BeerDetailModel {

    return BeerDetailModel(
        id= id?: "",
        name = name?: "",
        tagline = tagline?: "",
        firstBrewed = firstBrewed?: "",
        description = description?: "",
        imageUrl = imageUrl?: ""
    )
}