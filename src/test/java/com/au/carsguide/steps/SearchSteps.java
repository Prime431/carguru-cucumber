package com.au.carsguide.steps;

import com.au.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on buy+sell tab")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverOnBuySell();
    }

    @And("I click Search Cars link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("I navigate to new and used car search page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new HomePage().navigateToAllNewAndUsedCarsMenu();
    }

    @And("I select make {string}")
    public void iSelectMake(String make) throws InterruptedException {
        new HomePage().selectMakesOfTheCar(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) throws InterruptedException {
        new HomePage().selectModelsOfTheCar(model);

    }

    @And("I select location {string}")
    public void iSelectLocation(String location) throws InterruptedException {
        new HomePage().selectLocationsOfTheCar(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new HomePage().selectPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() throws InterruptedException {
        new HomePage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) throws InterruptedException {
        Assert.assertEquals(new HomePage().verifyMake(make),make,"Error");


    }

    @And("I click Used link")
    public void iClickUsedLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnUsed();
    }

    @Then("I navigate to Used Cars For Sale page")
    public void iNavigateToUsedCarsForSalePage() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().navigateToAllUsedCars();

    }
}