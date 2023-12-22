package com.au.carsguide.steps;

import com.au.carsguide.pages.FindDealerPage;
import com.au.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealers {
    @And("I click Find a Dealer")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealer();
    }



    @Then("I should see the dealer names <dealersName> are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(String dealerNames) {
        System.out.println("dealers name: "+ dealerNames);
        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames),dealerNames,"Error");
    }

    @Then("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerNames) {
        System.out.println("dealers name: "+ dealerNames);
        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames),dealerNames,"Error");


    }
}
