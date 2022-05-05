package starter.stepdefinitios;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        registerPage.openPage();
    }
    @And("I click icon login button")
    public void iButtonIconLoginButton() {
        registerPage.clickIconLogin();
    }
    @And("I validate on login page")
    public void validateOnLoginPage(){
        registerPage.validateOnLoginPage();
    }
    @When("I click icon register to make account")
    public void iButtonRegisterToMakeAccount() {
        registerPage.clickButtonRegisterToPageRegister();
        registerPage.validateOnRegisterPage();
    }
    @And("I input nama in register")
    public void iInputNamaRegister() {
        registerPage.inputNameRegister("Bagas Dwi Saputra");
    }
    @And("I input email in register")
    public void iInputEmailInRegister() {
        registerPage.inputEmailRegister("bagasdwisaputra19@gmail.com");
    }
    @And("I input password in register")
    public void iInputPasswordRegister() {
        registerPage.inputPasswordRegister("NMklop90");
    }
    @Then("I click button register")
    public void iClickButtonRegister() {
        registerPage.clickButtonRegisterToLoginPage();
        registerPage.validateOnLoginPage();
    }
    @And("I input invalid nama in register")
    public void iInputInvalidNamaInRegister() {
        registerPage.inputNameRegister("Bagas Dwi Saputra");
    }
    @And("I input invalid email in register")
    public void iInputEmailRegister() {
        registerPage.inputEmailRegister("08219974");
    }
    @And("I input email is already in use")
    public void iInputEmailIsAlreadyInUse() {
        registerPage.inputEmailRegister("NMklop90");
    }
    @And("I input nama is already in use")
    public void iInputNamaIsAlreadyInUse() {
        registerPage.inputNameRegister("Bagas Dwi Saputra");
    }
    @And("I entered a successful name in the registration using faker")
    public void iEnteredASuccessfulNameInTheRegistrationUsingFaker() {
        Faker random = new Faker();
        registerPage.inputNameRegister(random.name().firstName() +" "+ random.name().lastName());
    }
    @And("I entered a successful email in the registration using faker")
    public void iEnteredASuccessfulEmailInTheRegistrationUsingFaker() {
        Faker random = new Faker();
        registerPage.inputEmailRegister(random.internet().emailAddress(random.name().username()));
    }
    @And("I entered a successful password in the registration using faker")
    public void iEnteredASuccessfulPasswordInTheRegistrationUsingFaker() {
        Faker random = new Faker();
        registerPage.inputPasswordRegister(random.internet().password(8,14));
    }
}
