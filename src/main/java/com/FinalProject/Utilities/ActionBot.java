package com.FinalProject.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Automation on 30/08/2015.
 */
public class ActionBot {
    WebDriver driver;

    public ActionBot(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(WebElement element, String text) {
        Utilities.waitForElementDisplayed(driver, element);
        element.clear();
        element.sendKeys(text);
    }

    public boolean findElement(String elementXpath) {

        try {
            WebElement poolNameLine;
            poolNameLine = driver.findElement(By.xpath(elementXpath));
            return poolNameLine.isDisplayed();

        } catch (TimeoutException te) {
            return false;
        }
    }

    public void click(WebElement element) {
        Utilities.waitForElementDisplayed(driver, element);
        element.click();
    }

    public void selectElement(String dropdown, String option) {
        new Select(driver.findElement(By.id(dropdown))).selectByVisibleText(option);
    }
}
