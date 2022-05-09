package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RatingPage extends PageObject {
    private By buttonDetailItemsOne() {
        return By.xpath("//*[@id=\"394\"]/div/div[3]/div[2]/button[1]");
    }
    private By buttonDetailItemsTwo() {
        return By.xpath("//*[@id=\"400\"]/div/div[3]/div[2]/button[1]");
    }
    private By buttonDetailItemsThree() {
        return By.xpath("//*[@id=\"419\"]/div/div[3]/div[2]/button[1]");
    }
    private By rate1() {
        return By.xpath("//*[@class=\"v-rating v-rating--dense\"]/button[1]");
    }
    private By rate2() {
        return By.xpath("//*[@class=\"v-rating v-rating--dense\"]/button[2]");
    }
    private By rate3() {
        return By.xpath("//*[@class=\"v-rating v-rating--dense\"]/button[3]");
    }
    private By rate4() {
        return By.xpath("//*[@class=\"v-rating v-rating--dense\"]/button[4]");
    }
    private By rate5() {
        return By.xpath("//*[@class=\"v-rating v-rating--dense\"]/button[5]");
    }
    private By ratingpage() {
        return By.xpath("//*[@class=\"row\"]");
    }

    @Step
    public void clickButtonDetailItemsOne() {
        $(buttonDetailItemsOne()).click();
    }
    @Step
    public void clickButtonDetailItemsTwo() {
        $(buttonDetailItemsTwo()).click();
    }
    @Step
    public void clickButtonDetailItemsThree() {
        $(buttonDetailItemsThree()).click();
    }
    @Step
    public void rateOne() {
        $(rate1()).click();
    }
    @Step
    public void rateTwo() {
        $(rate2()).click();
    }
    @Step
    public void rateThree() {
        $(rate3()).click();
    }
    @Step
    public void rateFour() {
        $(rate4()).click();
    }
    @Step
    public void rateFive() {
        $(rate5()).click();
    }
    @Step
    public void validateRatingPage() {
        $(ratingpage()).isDisabled();
    }

}
