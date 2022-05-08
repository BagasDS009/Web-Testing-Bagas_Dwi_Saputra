package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.RegisterPage;

public class LoginSteps {
    @Steps
    OrderPage orderPage;
    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;
    @When("I am on the login page")
    public void iAmOnTheLoginPage() {
        registerPage.validateOnLoginPage();
    }
    @And("I input valid email login")
    public void iInputEmailLogin() {
        loginPage.inputEmailLogin("bagasdwisaputra19@gmail.com");
    }
    @And("I input invalid password login")
    public void iInputPasswordLogin() {
        loginPage.inputPasswordLogin("PaasswordSalah");
    }
    @Then("I click button login")
    public void iClickButtonLogin() {
        loginPage.clickButtonLogin();
    }
    @And("Login successful validation")
    public void loginSuccessfulValidation() {
        loginPage.loginSuccessfulValidation();
    }
    @And("I input invalid email login")
    public void iInputInvalidEmailLogin() {
        loginPage.inputEmailLogin("EmailSalah@gmail.com");
    }
    @And("I input valid password login")
    public void iInputValidPasswordLogin() {
        loginPage.inputPasswordLogin("NMklop90");
    }
    @And("Login failed validation invalid password")
    public void loginFailedValidationInvalidPassword() {
        loginPage.loginInvalidPassword();
    }
    @And("Login failed validation invalid email")
    public void loginFailedValidationInvalidEmail() {
        loginPage.loginInvalidEmail();
    }
    @And("Login failed validation invalid password and email")
    public void loginFailedValidationInvalidPasswordAndEmail() {
        loginPage.loginInvalidPassword();
    }

    @And("I click button user")
    public void iClickButtonUser() {
        loginPage.userButton();
    }
    @And("I logout account")
    public void iLogoutAccount() {
        loginPage.logoutButton();
    }
    @And("Validate that the account is logged out")
    public void validateThatTheAccountIsLoggedOut() {
        registerPage.validateOnLoginPage();
    }

    @And("I transaction account")
    public void iTransactionAccount() {
        loginPage.transaksiButton();
    }
    @And("Validate that the account has entered the transaction page")
    public void validateThatTheAccountHasEnteredTheTransactionPage() {
        orderPage.validatePageTransaction();
    }
}
