package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailFieldLogin() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By passwordFieldLogin() {
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By buttonLogin() {
        return By.xpath("//*[@class=\"text-center\"]/button");
    }
    private By loginValidation() {
        return By.xpath("//*[@class=\"v-input__control\"]");
    }
    private By errorMessager() {
        return By.xpath("//*[@class=\"v-card__text\"]/div/div/div");
    }
    private By iconUser() {
        return By.xpath("//*[@class=\"v-toolbar__content\"]/button[2]");
    }
    private By iconTransaksi() {
        return By.xpath("//*[@role=\"menu\"]/div/div[1]");
    }
    private By iconLogout() {
        return By.xpath("//*[@role=\"menu\"]/div/div[2]");
    }
    @Step
    public void inputEmailLogin(String emailLogin) {
        $(emailFieldLogin()).type(emailLogin);
    }
    @Step
    public void inputPasswordLogin(String passwordLogin) {
        $(passwordFieldLogin()).type(passwordLogin);
    }
    @Step
    public void clickButtonLogin() {
        $(buttonLogin()).click();
    }
    @Step
    public boolean loginSuccessfulValidation() {
        return $(loginValidation()).isDisabled();
    }
    @Step
    public boolean loginInvalidEmail() {
        return $(errorMessager()).isDisabled();
    }
    @Step
    public boolean validateEqualErrorEmail(String erroremail){
        return $(errorMessager()).getText().equalsIgnoreCase(erroremail);
    }
    @Step
    public boolean loginInvalidPassword() {
        return $(errorMessager()).isDisabled();
    }
    @Step
    public boolean validateEqualErrorPassword(String errorpassword){
        return $(errorMessager()).getText().equalsIgnoreCase(errorpassword);
    }
    @Step
    public void userButton() {
        $(iconUser()).click();
    }
    @Step
    public void transaksiButton() {
        $(iconTransaksi()).click();
    }
    @Step
    public void logoutButton() {
        $(iconLogout()).click();
    }
}
