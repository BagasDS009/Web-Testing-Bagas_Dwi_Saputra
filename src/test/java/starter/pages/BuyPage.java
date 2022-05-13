package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyPage extends PageObject {
    private By buttonItemsOne() {
        return By.xpath("//*[@class=\"row align-stretch\"]/div[7]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsTwo() {
        return By.xpath("//*[@class=\"row align-stretch\"]/div[13]/div/div[3]/div[2]/button[2]");
    }
    private By buttonItemsThree() {
        return By.xpath("//*[@class=\"row align-stretch\"]/div[17]/div/div[3]/div[2]/button[2]");
    }
    private By buttonSearch() {
        return By.xpath("//*[@class=\"v-select__slot\"]/div[3]/div/i");
    }
    private By cariCategory() {
        return By.xpath("//*[@class=\"v-list-item v-list-item--link theme--light\"][4]/div/div");
    }
    private By pageCategory() {
        return By.xpath("//*[@class=\"v-alert__wrapper\"]/div");
    }

    private By buttonShoppingChart() {
        return By.xpath("//*[@class=\"v-toolbar__content\"]/button");
    }
    private By pageOrder() {
        return By.xpath("//*[@class=\"v-main__wrap\"]/div/div/div/div");
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
    public boolean validatePageCategory() {
      return $(pageCategory()).isDisabled();
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
    public boolean validateOnPageOrder() {
       return $(pageOrder()).isDisabled();
    }
}