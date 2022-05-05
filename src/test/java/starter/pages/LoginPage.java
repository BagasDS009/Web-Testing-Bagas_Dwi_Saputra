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
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }
    private By loginValidation() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]/div/div[1]");
    }
    private By invalidEmail() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }
    private By invalidPassword() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }
//    private By iconUser() {
//        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[2]/span/i");
//    }
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
    public void loginSuccessfulValidation() {
        $(loginValidation()).isDisabled();
    }
    @Step
    public void loginInvalidEmail() {
        $(invalidEmail()).isDisabled();
    }
    @Step
    public void loginInvalidPassword() {
        $(invalidPassword()).isDisabled();
    }
}
