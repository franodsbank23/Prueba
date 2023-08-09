package com.example.prueba.domain.usecases

import com.example.prueba.data.repository.BeerRepositoryInterface
import com.example.prueba.domain.model.BeerDetailModel
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

//then return?
// what dependency me falta?

class GetBeerUsecaseTest {

    @Mock
    private lateinit var beerRepositoryInterface: BeerRepositoryInterface

    private lateinit var getBeerUsecase: GetBeerUsecase

    @Before
    fun settingUp(){
        MockitoAnnotations.initMocks(this)
        getBeerUsecase = GetBeerUsecase(beerRepositoryInterface)
    }

    @Test
    fun `WHEN use invoke should return BeerDetailModel`() = runBlocking {
        val beerId = "fake_id"
        val expectedBeerDetail = BeerDetailModel(
            "1", "name", "tagline", "firstBrewed", "description", "imageUrl")

        `when(beerRepositoryInterface.getBeerById(beerId).thenReturn(expectedBeerDetail))

        val result = getBeerUsecase.invoke(beerId)

        assert(result== expectedBeerDetail)
    }
}