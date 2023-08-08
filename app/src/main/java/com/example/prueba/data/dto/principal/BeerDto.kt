package com.example.prueba.data.dto.principal

import com.squareup.moshi.Json

class BeerDto (

    @Json(name="id") var id: String?,
    @Json(name="name") var name: String?,
    @Json(name="tagline") var tagline: String?,
    @Json(name="first_brewed") var firstBrewed: String?,
    @Json(name="description") var description: String?,
    @Json(name="image_url") var imageUrl: String?,

)
