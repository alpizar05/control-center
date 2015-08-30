package com.FinalProject.PageObject;

import com.FinalProject.Utilities.Utilities;
import com.FinalProject.Utilities.ActionBot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Automation on 05/07/2015.
 */
public class PageBase {
    private WebDriver driver;
    private ActionBot actionBot;

    public PageBase(WebDriver driver){
        this.driver = driver;
        actionBot = new ActionBot(driver);
    }

    public PageBase navigateToNextPage(WebElement elementToClickOn, Class<?> pageToNavigateTo){
        Utilities.waitForElementDisplayed(this.driver, elementToClickOn);
        elementToClickOn.click();
        return (PageBase) PageFactory.initElements(this.driver, pageToNavigateTo);
    }

    /* Setter and getters */
    public ActionBot getActionBot() {
        return actionBot;
    }

    public void setActionBot(ActionBot actionBot) {
        this.actionBot = actionBot;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
