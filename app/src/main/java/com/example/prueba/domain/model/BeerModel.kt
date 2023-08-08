package com.example.prueba.domain

import com.squareup.moshi.Json

data class BeerModel (
    var id: String,
    var name: String,
    var tagline: String,
    var firstBrewed: String,
    var description: String,
    var imageUrl: String,
)