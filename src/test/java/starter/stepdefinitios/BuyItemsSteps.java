package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BuyPage;

public class BuyItemsSteps {
    @Steps
    BuyPage buyPage;
    @When("I clicked the buy button for all three items once")
    public void iClickedTheBuyButtonForAllThreeItemsOnce() {
        buyPage.clickButtonBuyItemsOne();
        buyPage.clickButtonBuyItemsTwo();
//        buyPage.clickButtonSearchTokoBuah();
//        buyPage.searchTokoBuah();
        buyPage.clickButtonBuyItemsThree();
    }
    @And("I click the button shopping cart")
    public void iClickButtonShoppingCart() {
        buyPage.clickIconShoppingChart();
    }
    @Then("Check the ordered items on the shopping cart")
    public void checkTheOrderedItemsOnTheShoppingCart() {
        buyPage.validateOnPageOrder();
    }
    @When("I clicked the buy button for all three items twice")
    public void iClickedTheBuyButtonForAllThreeItemsTwice() {
        buyPage.clickButtonBuyItemsOne();
        buyPage.clickButtonBuyItemsOne();
        buyPage.clickButtonBuyItemsTwo();
        buyPage.clickButtonBuyItemsTwo();
        buyPage.clickButtonBuyItemsThree();
        buyPage.clickButtonBuyItemsThree();
    }

    @When("I click categories")
    public void iClickCategories() {
        buyPage.clickButtonSearch();
    }
    @And("I choose one")
    public void iChooseOne() {
        buyPage.searchCategory();
    }
    @Then("I on the categories page")
    public void iOnTheCategoriesPage() {
        buyPage.validatePageCategory();
    }
}
