package com.example.prueba.domain.model

import com.example.prueba.testutil.BeerTestDataBuilder
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BeerDetailModelTest {

    class HeroModelTest {

        //
        var beerDetailModel = BeerDetailModel(
            "1",
            "Roja",
            "Chapulin",
            "anio",
            "espumosa",
            "https://link"
        )

        @Test
        fun `WHEN create model EXPECT not null value`() {
            assertThat(beerDetailModel, instanceOf(BeerDetailModel::class.java))
            assertThat(beerDetailModel, notNullValue())
        }

        @Test
        fun `WHEN beerDetailModel id is 1 EXPECT id = 1`() {
            val beer = BeerTestDataBuilder()
                .buildSingle()
            assertThat(beer.id, `is`("test-id"))
        }

        @Test
        fun `WHEN beerDetailModel name is Roja EXPECT name = Roja`() {
            val beer = BeerTestDataBuilder()
                .withName("Roja")
                .buildSingle()
            assertThat(beer.name, `is`("Roja))
        }


        @Test
        fun `WHEN creates beerDetailModel EXPECT imageUrl contains schema`() {
            assertThat(beerDetailModel.imageUrl, beerDetailModel.imageUrl.startsWith("https"))
        }

    }
}