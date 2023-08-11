package com.example.prueba.presentation.detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.prueba.domain.model.BeerDetailModel
import org.junit.Rule
import org.junit.Test

// testear:
// que vaya para atrás
// los elementos UI en general

// paparazzi?

class BeerDetailViewKtTest{

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `WHEN detail is created CHECK elements in UI`(){
        val fakeBeer= BeerDetailModel(
            id = "1",
            name = "test-name",
            imageUrl = "test-imageUrl",
            description = "test-description",
            tagline = "test-tagline",
            firstBrewed = "test-firstBrewed"
        )


        composeTestRule.setContent {
            BeerDetailView(
                id = "1",
                onBackClick = { /*TODO*/ },
                beerDetailViewModel = FakeBeerDetailViewModel(fakeBeer)
            )
        }

        // Test UI elements
        composeTestRule.onNodeWithText("Test Beer").assertIsDisplayed()
        composeTestRule.onNodeWithText("Test name").assertIsDisplayed()
        composeTestRule.onNodeWithText("Test imageUrl").assertIsDisplayed()
        composeTestRule.onNodeWithText("Test description").assertIsDisplayed()
        composeTestRule.onNodeWithText("Test tagline").assertIsDisplayed()
        composeTestRule.onNodeWithText("Test firstBrewed").assertIsDisplayed()


        // Test image
        composeTestRule.onNodeWithTag("beer_image").assertIsDisplayed()

        @Test
        fun `WHEN the back its clicked go back`(){
            var backButtonClicked = false

            composeTestRule.setContent {
                BeerDetailView(
                    id = "1",
                    onBackClick = { backButtonClicked = true },
                    beerDetailViewModel = FakeBeerDetailViewModel(fakeBeer)
                    )
            }

            composeTestRule.onNodeWithContentDescription("botón atrás para listado de cervezas")
                .performClick()

            assert(backButtonClicked)
        }


    }
}

// Auxiliary things
data class Beer(
    val id: String,
    val name: String,
    val imageUrl: String,
    val description: String,
    val tagline: String,
    val firstBrewed: String
)

// fake viewModel to test
class FakeBeerDetailViewModel(private val beer: Beer): BeerDetailViewModel{
    override val beer: State<Beer?> = mutableStateOf(beer)
    override fun getBeer(id: String){}
}