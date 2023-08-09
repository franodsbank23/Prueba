package com.example.prueba.testutil

import com.example.prueba.domain.model.BeerDetailModel

class BeerTestDataBuilder {
    val id = "test-id"
    var name = ""
    var imageUrl = ""
    var description = ""
    var tagline = ""
    var firstBrewed = ""
    var numElements: Int = 1

    fun withName(name: String): BeerTestDataBuilder {
        this.name = name
        return this
    }

    fun withImageUrl(imageUrl: String): BeerTestDataBuilder {
        this.imageUrl = imageUrl
        return this
    }

    fun withDescription(description: String): BeerTestDataBuilder {
        this.description = description
        return this
    }

    fun withTagline(tagline: String): BeerTestDataBuilder{
        this.tagline = tagline
        return this
    }

    fun firstBrewed(firstBrewed: String): BeerTestDataBuilder{
        this.firstBrewed = firstBrewed
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
                    imageUrl = imageUrl,
                    description = description,
                    tagline = tagline,
                    firstBrewed = firstBrewed
                )
            )
        }

        return list.toList()
    }

    fun buildSingle() = BeerDetailModel(
        id= id,
        name = name,
        imageUrl = imageUrl,
        description = description,
        tagline = tagline,
        firstBrewed = firstBrewed
    )
}