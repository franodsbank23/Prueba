package com.example.prueba.data.mappers

import com.example.prueba.data.dto.BeerDto
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BeerMappersTest {

    @Test
    fun `WHEN toHeroModel with values EXPECT model has value`() {
        val beerDto = BeerDto(
            id = "test-id",
            name = "test-name",
            tagline = "test-tagline",
            firstBrewed = "test-firstBrewed",
            description = "test-description",
            imageUrl = "test-imageUrl"

        )
        val res = beerDto.toBeerDetailModel()

        assertThat(res.id, `is`("test-id"))
    }

    @Test
    fun `WHEN toHeroModel with null EXPECT empty string`() {
        val beerDto = BeerDto(
            id = null,
            name = null,
            tagline = null,
            firstBrewed = null,
            description = null,
            imageUrl = null
        )
        val res = beerDto.toBeerDetailModel()

        assertThat(res.id, `is`(""))
    }
}