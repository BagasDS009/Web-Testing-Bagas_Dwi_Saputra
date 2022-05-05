package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class LoginSteps {
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
}
