package com.framework.Utilidades;

/**
 * Created by Automation on 06/07/2015.
 */
public class ActionBot {
    private final String script = "arguments[0].setAttribute('style','border-style: solid; border-color: red;" +
            "border-radius: 25px')";
    WebDriver driver;

    public ActionBot(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor) driver).executeScript(script, element);
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor) driver).executeScript(script, element);
        element.clear();
        element.sendKeys(text);
    }

    public String getTextOnTextBox(WebElement element) {
        Utilidades.waitForElementDisplayed(driver, element);
        ((JavascriptExecutor) driver).executeScript(script, element);
        return element.getAttribute("value");
    }
}
