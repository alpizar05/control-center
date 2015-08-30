package com.FinalProject.Utilities;

import org.openqa.selenium.*;


/**
 * Created by Automation on 30/08/2015.
 */
public class ActionBot {
    WebDriver driver;

    public ActionBot(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeys(WebElement element, String text) {
        Utilities.waitForElementDisplayed(driver, element);
        element.clear();
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        Utilities.waitForElementDisplayed(driver, element);
        element.click();
    }
}
