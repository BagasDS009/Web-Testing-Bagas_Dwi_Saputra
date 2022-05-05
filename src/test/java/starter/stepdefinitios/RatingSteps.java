package starter.stepdefinitios;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RatingPage;

public class RatingSteps {
    @Steps
    RatingPage ratingPage;
    @And("I click detail button on items")
    public void clickDetailButtonOnItems(){
        ratingPage.clickButtonDetailItemsOne();
    }
    @And("Validate on the rating page")
    public void validateOnTheRatingPage() {
        ratingPage.validateRatingPage();
    }
    @Then("I rate the item from one to five")
    public void rateTheItem() {
        ratingPage.rateOne();
        ratingPage.rateFour();
        ratingPage.rateTwo();
        ratingPage.rateFive();
        ratingPage.rateThree();
    }
    @And("Validate rating success")
    public void validateRatingSuccess() {
        ratingPage.validateRatingPage();
    }
}

