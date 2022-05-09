package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By iconButtonLogin() {
        return By.xpath("//*[@class=\"v-toolbar__content\"]/button[2]");
    }
    private By loginPage() {
        return By.xpath("//*[@class=\"v-main\"]/div/div/div/div");
    }
    private By registerLink() {
        return By.xpath("//*[@class=\"v-card__text\"]/div/a");
    }
    private By registerPage() {
        return By.xpath("//*[@class=\"v-main__wrap\"]/div/div/div");
    }
    private By nameFieldRegister() {
        return By.xpath("//label[contains(text(),'Nama Lengkap')]/following-sibling::input");
    }
    private By emailFieldRegister() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By passwordFieldRegister() {
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By buttonRegister() {
         return By.xpath("//*[@class=\"text-center\"]/button");
    }
    @Step
    public void openPage() {
        open();
    }
    @Step
    public void clickIconLogin() {
         $(iconButtonLogin()).click();
    }
    @Step
    public void validateOnLoginPage() {
         $(loginPage()).isDisabled();
    }
    @Step
    public void clickButtonRegisterToPageRegister() {
         $(registerLink()).click();
    }
    @Step
    public void validateOnRegisterPage() {
         $(registerPage()).isDisabled();
    }
    @Step
    public void inputNameRegister(String namaRegister) {
         $(nameFieldRegister()).type(namaRegister);
    }
    @Step
    public void inputEmailRegister(String emailRegister) {
        $(emailFieldRegister()).type(emailRegister);
    }
    @Step
    public void inputPasswordRegister(String passwordRegister) {
        $(passwordFieldRegister()).type(passwordRegister);
    }
    @Step
    public void clickButtonRegisterToLoginPage() {
        $(buttonRegister()).click();
    }

}
