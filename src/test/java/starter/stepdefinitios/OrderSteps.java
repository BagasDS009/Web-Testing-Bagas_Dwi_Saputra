package starter.stepdefinitios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.BuyPage;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.RegisterPage;

public class OrderSteps {
    @Steps
    OrderPage orderPage;
    @Steps
    LoginPage loginPage;
    @Steps
    BuyPage buyPage;
    @Steps
    RegisterPage registerPage;
    @And("I click the add button once on each item")
    public void iClickTheAddButtonOnceOnEachItem() {
        orderPage.clickButtonAddItemsOne();
        orderPage.clickButtonAddItemsTwo();
        orderPage.clickButtonAddItemsThree();
    }
    @And("I click the button bayar")
    public void iClickTheButtonBayar() {
        orderPage.clickButtonBayar();
    }
    @And("validate on page transaction")
    public void validateOnPageTransaction() {
        orderPage.validatePageTransaction();
    }
    @And("I click the remove button once on each item")
    public void iClickTheRemoveButtonOnceOnEachItem() {
        orderPage.clickButtonReduceItemsThree();
        orderPage.clickButtonReduceItemsTwo();
        orderPage.clickButtonReduceItemsOne();
    }
    @And("validate on page order is empty")
    public void validateOnPageOrderIsEmpty() {
        orderPage.validatePageOrderIsEmpty();
    }
    @And("I click button login to order page")
    public void iClickButtonLoginToOrderPage() {
        loginPage.clickButtonLogin();
    }
    @Then("I clicked the buy button for all three items once to order page")
    public void iClickedTheBuyButtonForAllThreeItemsOnceToOrderPage() {
        buyPage.clickButtonBuyItemsOne();
        buyPage.clickButtonBuyItemsTwo();
        buyPage.clickButtonBuyItemsThree();
    }
    @And("I am on the login page at transaction")
    public void iAmOnTheLoginPageAtTransaction() {
        registerPage.validateOnLoginPage();
    }
    @And("I click button login at transaction")
    public void iClickButtonLoginAtTransaction() {
        loginPage.clickButtonLogin();
    }
}
