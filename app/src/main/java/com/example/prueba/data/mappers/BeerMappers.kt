package com.example.prueba.data.mappers

import com.example.prueba.data.dto.BeerDetailDto
import com.example.prueba.data.dto.BeerItemDto
import com.example.prueba.data.dto.principal.BeerDto


// Los MAPPERS:

fun BeerDto.toBeerItemDto(): BeerItemDto{
    return BeerItemDto(
        id = id,
        name = name,
        imageUrl = imageUrl
    )
}

fun BeerDto.toBeerDetailDto(): BeerDetailDto{

    return BeerDetailDto(
        id= id,
        name = name,
        tagline = tagline,
        firstBrewed = firstBrewed,
        description = description,
        imageUrl = imageUrl
    )
}