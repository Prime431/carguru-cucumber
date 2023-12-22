package com.au.carsguide.pages;

import com.au.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindDealerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//p[normalize-space()='101 Auto Centre'])[1]")
    List<WebElement> dealerElements;

    public String checkDealerNamesAvailable(String dealerNames) {
        List<WebElement> dealer = dealerElements;

        for (WebElement e : dealer) {
            if (e.getText().contains(dealerNames))
                System.out.println("Dealers :" + e.getText());
            break;
        }
        return dealerNames;
    }


}
