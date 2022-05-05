package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;
import starter.pages.TransactionsPage;

public class TransactionsSteps {
    @Steps
    OrderPage orderPage;
    @Steps
    TransactionsPage transactionsPage;
    @Then("I on the transactions page")
    public void iOnTheTransactionsPage() {
        orderPage.validatePageTransaction();
    }
    @And("I clicked the product icon twice")
    public void iClickIconProduk() {
        transactionsPage.clickButtonProduk();
    }
    @And("I clicked the harga icon twice")
    public void iClickIconHarga() {
        transactionsPage.clickButtonHarga();
    }
    @And("I clicked the banyaknya icon twice")
    public void iClickIconBanyaknya() {
        transactionsPage.clickButtonBanyaknya();
    }
    @And("I clicked the sub-harga icon twice")
    public void iClickIconSubHarga() {
        transactionsPage.clickButtonSubHarga();
    }
    @And("I click icon next")
    public void iClickIconNext() {
        transactionsPage.clickButtonNext();
    }
    @And("I click icon back")
    public void iClickIconBack() {
        transactionsPage.clickButtonBack();
    }
}
