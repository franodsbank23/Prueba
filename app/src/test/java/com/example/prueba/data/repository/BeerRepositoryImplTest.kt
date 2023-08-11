package com.example.prueba.data.repository

import com.example.prueba.data.dto.BeerDto
import com.example.prueba.data.remote.RemoteDataSourceInterface
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runTest
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock

class BeerRepositoryImplTest {

    @MockK(relaxed = true)
    private lateinit var remoteDataSource: RemoteDataSourceInterface

    @Before
    fun setup(){
        MockKAnnotations.init(this)
    }

    @Test
    fun `WHEN getBeerList EXPECT remote data`()= runTest{
        coEvery {remoteDataSource.getBeerList()} returns listOf<BeerDto>()

        val repo = BeerRepositoryImpl(
            remoteDataSource = remoteDataSource
        )

        val res = repo.getBeerList()

        assertThat(res, instanceOf(List::class.java))
        //assertThat(res.size, `is`(2))
    }




    fun getListRemote() = listOf<BeerDto>(
        BeerDto("id", "name", "tagline", "firstBrewed", "description", "imageUrl"),
        BeerDto("id", "name", "tagline", "firstBrewed", "description", "imageUrl")
    )

    /*@Test
    fun  `WHEN getBeerById EXPECT an element`()*/
}