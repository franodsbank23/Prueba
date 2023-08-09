package com.example.prueba

import com.example.prueba.domain.model.BeerDetailModel

class BeerTestDataBuilder {
    val id = "test-id"
    var name = ""
    var photoUrl = ""
    var description = ""
    var numElements: Int = 1

    fun withName(name: String): BeerTestDataBuilder {
        this.name = name
        return this
    }

    fun withImageUrl(photoUrl: String): BeerTestDataBuilder {
        this.photoUrl = photoUrl
        return this
    }

    fun withDescription(description: String): BeerTestDataBuilder {
        this.description = description
        return this
    }

    fun withNumElements(numElements: Int): BeerTestDataBuilder {
        this.numElements = numElements

        return this
    }

    fun buildList(): List<BeerDetailModel> {
        val list = mutableListOf<BeerDetailModel>()

        for(i in 0 until numElements) {
            list.add(
                BeerDetailModel(
                    id= id,
                    name = name,
                    imageUrl = photoUrl,
                    description = description,
                    tagline = tagline,
                    firstBrewed = firstBrewed
                )
            )
        }

        return list.toList()
    }

    fun buildSingle() = BeerDetailModel(
        id = id,
        name = name,
        imageUrl = photoUrl,
        description = description
    )
}