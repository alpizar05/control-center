package com.training.PatronesPageObjectsOnly.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailMainPage extends PageBase {

    public GmailMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage(){
        return getDriver().findElement(By.id("gbqfq")).isDisplayed();
    }

    public void searchMessage(String searchTerm){
        getDriver().findElement(By.id("gbqfq")).sendKeys(searchTerm);
    }
}
