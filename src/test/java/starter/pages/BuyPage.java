package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyPage extends PageObject {
    private By buttonItemsOne() {
        return By.xpath("//*[@id=\"394\"]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsTwo() {
        return By.xpath("//*[@id=\"400\"]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsThree() {
        return By.xpath("//*[@id=\"419\"]/div/div[3]/div[2]/button[2]");
    }

    private By buttonSearch() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[3]/div/i");
    }
    private By cariCategory() {
        return By.xpath("//*[@class=\"v-list-item v-list-item--link theme--light\"][1]/div/div");
    }
    private By pageCategory() {
        return By.xpath("//*[@class=\"v-alert__wrapper\"]/div");
    }

    private By buttonShoppingChart() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }
    private By pageOrder() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]/div");
    }
    @Step
    public void clickButtonBuyItemsOne(){
        $(buttonItemsOne()).click();
    }
    @Step
    public void clickButtonBuyItemsTwo(){
        $(buttonItemsTwo()).click();
    }

    @Step
    public void clickButtonSearch() {
        $(buttonSearch()).click();
    }
    @Step
    public void searchCategory() {
        $(cariCategory()).click();
    }
    @Step
    public void validatePageCategory() {
        $(pageCategory()).isDisabled();
    }

    @Step
    public void clickButtonBuyItemsThree(){
        $(buttonItemsThree()).click();
    }

    @Step
    public void clickIconShoppingChart() {
        $(buttonShoppingChart()).click();
    }
    @Step
    public void validateOnPageOrder() {
        $(pageOrder()).isDisabled();
    }
}