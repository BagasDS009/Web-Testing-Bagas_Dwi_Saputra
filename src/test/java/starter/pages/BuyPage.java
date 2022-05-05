package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyPage extends PageObject {
    private By buttonItemsOne() {
        return By.xpath("//*[@id=\"259\"]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsTwo() {
        return By.xpath("//*[@id=\"262\"]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsThree() {
        return By.xpath("//*[@id=\"264\"]/div/div[3]/div[2]/button[2]");
    }

    private By buttonSearch() {
        return By.xpath("//label[contains(text(),'Select category')]");
    }
    private By cariCategory() {
        return By.className("//*[@class=\"v-list-item v-list-item--link theme--light\"][96]");
    }
    private By pageCategory() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div/div[1]");
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