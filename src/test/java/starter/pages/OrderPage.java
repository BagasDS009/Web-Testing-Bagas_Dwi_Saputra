package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By buttonAddItemsOne() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[1]/div[2]/button[2]");
    }
    private By buttonReduceItemsOne() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[1]/div[2]/button[1]");
    }
    private By buttonAddItemsTwo() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[2]/div[2]/button[2]");
    }
    private By buttonReduceItemsTwo() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[2]/div[2]/button[1]");
    }
    private By buttonAddItemsThree() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[3]/div[2]/button[2]");
    }
    private By buttonReduceItemsThree() {
        return By.xpath("//*[@class=\"v-card__text\"]/div[3]/div[2]/button[1]");
    }
    private By buttonBayar() {
        return By.xpath("//*[@class=\"text-right mt-3\"]/button");
    }
    private By pageTransaction() {
        return By.xpath("//*[@class=\"container\"]/div/div");
    }
    private By pageOrderEmpty() {
        return  By.xpath("//*[@class=\"v-main__wrap\"]/div/div/div/div");
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
    public boolean validatePageTransaction() {
        return $(pageTransaction()).isDisabled();
    }
    @Step
    public boolean validatePageOrderIsEmpty() {
        return $(pageOrderEmpty()).isDisabled();
    }
}
