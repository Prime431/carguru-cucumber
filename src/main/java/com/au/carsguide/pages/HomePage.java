package com.au.carsguide.pages;

import com.au.carsguide.utility.Utility;
import net.bytebuddy.asm.Advice;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(css = ".uhf-top[href='/buy-a-car/all-new-and-used']")
    WebElement mouseHoverOnBuySell;
    @CacheLookup
    @FindBy(css = "a[href='/buy-a-car/new-and-used-car-search']")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Used Cars For Sale'])[1]")
    WebElement usedCarForSaleText;

    @CacheLookup
    @FindBy(id = "makes")
    WebElement makes;

    @CacheLookup
    @FindBy(id = "models")
    WebElement models;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement locations;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement priceElement;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(css = "div[class='makeFilter'] div[class='mmvs']")
    WebElement makeOnSearchPage;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='All new & used cars']")
    WebElement allNewAndUsedCar;

    @CacheLookup
    @FindBy(css = "a[href='/buy-a-car/used-car-search']")
    WebElement used;

    @CacheLookup
    @FindBy(css = ".search-type-all-used.active")
    WebElement allUsedCar;
    @CacheLookup
    @FindBy(css = "a[href='//www.carsguide.com.au/car-dealers']")
    WebElement findADealer;


    public void clickOnFindADealer(){
        log.info("click on find a dealer : " + findADealer.toString());
        clickOnElement(findADealer);
    }
    public void navigateToAllUsedCars(){
        clickOnElement(allUsedCar);
    }

    public void clickOnUsed() {
        clickOnElement(used);
    }

    public void navigateToAllNewAndUsedCarsMenu() {
        clickOnElement(allNewAndUsedCar);
    }

    public String verifyTheMakeOnSearchPage() throws InterruptedException {
        String actualText = getTextFromElement(makeOnSearchPage);
        Thread.sleep(1000);
        return actualText;

    }

    public void clickOnFindMyNextCar() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(findMyNextCar);
    }

    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(priceElement, price);
    }

    public void selectMakesOfTheCar(String make) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(makes, make);

    }

    public void selectModelsOfTheCar(String model) throws InterruptedException {
        Thread.sleep(1000);
        selectByValueFromDropDown(models, model);

    }

    public void selectLocationsOfTheCar(String location) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(locations, location);

    }

    public void mouseHoverOnBuySell() throws InterruptedException {
        mouseHoverToElement(mouseHoverOnBuySell);
        Thread.sleep(2000);
    }


    public String verifyMake(String make) {
        return getTextFromElement(makeOnSearchPage);

    }

    public void clickOnSearchCars() {
        clickOnElement(searchCars);
    }

}