package com.example.prueba.presentation.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.prueba.domain.usecases.GetBeerUsecase
import com.example.prueba.testutil.BeerTestDataBuilder
import com.example.prueba.testutil.DefaultDispatcherRule
import com.example.prueba.testutil.getOrAwaitValue
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class BeerDetailViewModelTest{

    @get:Rule
    val instantExecutorRule: InstantTaskExecutorRule = InstantTaskExecutorRule()
    @get:Rule
    val defaultDispatcherRule: DefaultDispatcherRule = DefaultDispatcherRule()

    @MockK(relaxed = true)
    private lateinit var getBeerUseCase: GetBeerUsecase

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `WHEN detail viewModel getData EXPECT returns data`() = runTest {
        coEvery { GetBeerUsecase.invoke("test-id") } returns
                BeerTestDataBuilder().buildSingle()

        val viewModel = BeerDetailViewModel(getBeerUseCase)

        viewModel.getBeer("test-id")

        val res = viewModel.beer.getOrAwaitValue()

        assertThat(res.id, `is`("test-id"))
    }
}