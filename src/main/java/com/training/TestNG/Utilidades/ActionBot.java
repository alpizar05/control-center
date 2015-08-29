package com.training.TestNG.Utilidades;

import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by Automation on 06/07/2015.
 */
public class ActionBot {
    WebDriver driver;
    private final String script = "arguments[0].setAttribute('style','border-style: solid; border-color: red;" +
            "border-radius: 25px')";

    public ActionBot(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor)driver).executeScript(script, element);
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor)driver).executeScript(script, element);
        element.clear();
        element.sendKeys(text);
    }

    public String getTextOnTextBox(WebElement element) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor)driver).executeScript(script, element);
        return element.getAttribute("value");
    }
}
