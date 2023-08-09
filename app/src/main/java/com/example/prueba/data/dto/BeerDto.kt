package com.example.prueba.data.dto

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class BeerDto (
    @Json(name="id") val id: String?,
    @Json(name="name") val name: String?,
    @Json(name="tagline") val tagline: String?,
    @Json(name="first_brewed") val firstBrewed: String?,
    @Json(name="description") val description: String?,
    @SerializedName("image_url") val imageUrl: String?,
    )


/*
data class BeerDto (
    @Json(name="id") val id: String?,
    @Json(name="name") val name: String?,
    @Json(name="tagline") val tagline: String?,
    @Json(name="first_brewed") val firstBrewed: String?,
    @Json(name="description") val description: String?,
    @Json(name="image_url") val imageUrl: String?,
)*/
