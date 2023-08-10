package com.example.prueba.presentation.list

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import java.io.FileDescriptor


class BeerListViewKtTest{

    @get:Rule
    val composeTestRule = createComposeRule()

    fun generateFakeBeerList(): List<Beer>{
        return listOf(
            Beer("1", "Beer Name 1", "Description 1"),
            Beer("2", "Beer Name 2", "Description 2")
            )
    }

    @Test
    // fun `WHEN view its created it has its UI elements wo ITEM`(){
    fun checkingElementsWoItem(){
        composeTestRule.setContent {
            BeerListView(
                onDetailClick ={},
                beerListViewModel = FakeBeerListViewModel())
        }

        composeTestRule.onNodeWithText("Beer Application").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("informacion").assertIsDisplayed()
    }

    @Test
    //fun `WHEN view its created it has its UI elements and ITEM`(){
    fun checkingElementsWItem(){
        val fakeViewModel = FakeBeerListViewModel()
        fakeViewModel.beerList.value = generateFakeBeerList()

        composeTestRule.setContent {
            BeerListView(
                onDetailClick = {},
                beerListViewModel = FakeBeerListViewModel()
            )
        }

        composeTestRule.onAllNodesWithTag("BeerItem").assertCountEquals(2)
    }

    // we using a object with id of one
    // we may do more checks if need
    @Test
    //fun `WHEN its clicked it goes there`(){
    fun whenCLickedItNavigates(){}
        var clickedItemId: String? = null
        val fakeViewModel = FakeBeerListViewModel()
        fakeViewModel.beerList.value = generateFakeBeerList()

        composeTestRule.setContent {
            BeerListView(
                onDetailClick = {itemId -> clickedItemId = itemId},
                beerListViewModel = fakeViewModel
            )
        }

        composeTestRule.onAllNodesWithTag("BeerItem")[0].performClick()

        assert( clickedItemId == "1")
    }


}

// auxiliar

data class Beer(
    val id: String,
    val name: String,
    val description: String
)
class FakeBeerListViewModel : BeerListViewModel(){
    val beerList = mutableStateOf<List<Beer?>(null)
}

