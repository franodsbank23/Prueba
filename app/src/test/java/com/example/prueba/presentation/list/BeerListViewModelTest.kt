package com.example.prueba.presentation.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.prueba.domain.usecases.GetBeerListUsecase
import com.example.prueba.testutil.BeerTestDataBuilder
import com.example.prueba.testutil.DefaultDispatcherRule
import com.example.prueba.testutil.getOrAwaitValue
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class BeerListViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    @get:Rule
    val defaultDispatcherRule = DefaultDispatcherRule()

    @MockK(relaxed = true)
    private lateinit var getBeerListUseCase: GetBeerListUsecase

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @After
    fun tearDown() {
        // Liberar recursos del test
    }

    @Test
    fun `WHEN viewModel init EXPECT data at LiveData`() = runTest {
        coEvery { getBeerListUseCase.invoke() } returns BeerTestDataBuilder()
            .withNumElements(15)
            .buildList()

        val viewModel = BeerListViewModel(getBeerListUseCase)

        val res = viewModel.beerList.getOrAwaitValue()

        assertThat(res.size, `is`(15))

    }

}

}