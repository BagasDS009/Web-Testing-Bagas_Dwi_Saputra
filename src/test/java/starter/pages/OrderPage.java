package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By buttonAddItemsOne() {
        return By.xpath("//*[@id=\"order-394\"]/div[2]/button[2]");
    }
    private By buttonReduceItemsOne() {
        return By.xpath("//*[@id=\"order-394\"]/div[2]/button[1]");
    }
    private By buttonAddItemsTwo() {
        return By.xpath("//*[@id=\"order-400\"]/div[2]/button[2]");
    }
    private By buttonReduceItemsTwo() {
        return By.xpath("//*[@id=\"order-400\"]/div[2]/button[1]");
    }
    private By buttonAddItemsThree() {
        return By.xpath("//*[@id=\"order-419\"]/div[2]/button[2]");
    }
    private By buttonReduceItemsThree() {
        return By.xpath("//*[@id=\"order-419\"]/div[2]/button[1]");
    }
    private By buttonBayar() {
        return By.xpath("//*[@id=\"button-bayar\"]");
    }
    private By pageTransaction() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div");
    }
    private By pageOrderEmpty() {
        return  By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div");
    }
    @Step
    public void clickButtonAddItemsOne() {
        $(buttonAddItemsOne()).click();
    }
    @Step
    public void clickButtonReduceItemsOne() {
        $(buttonReduceItemsOne()).click();
    }
    @Step
    public void clickButtonAddItemsTwo() {
        $(buttonAddItemsTwo()).click();
    }
    @Step
    public void clickButtonReduceItemsTwo() {
        $(buttonReduceItemsTwo()).click();
    }
    @Step
    public void clickButtonAddItemsThree() {
        $(buttonAddItemsThree()).click();
    }
    @Step
    public void clickButtonReduceItemsThree() {
        $(buttonReduceItemsThree()).click();
    }
    @Step
    public void clickButtonBayar() {
        $(buttonBayar()).click();
    }
    @Step
    public void validatePageTransaction() {
        $(pageTransaction()).isDisabled();
    }
    @Step
    public void validatePageOrderIsEmpty() {
        $(pageOrderEmpty()).isDisabled();
    }
}
