package com.training.ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Automation on 21/06/2015.
 */
public class Selectores {

    @Test
    public void testWithJavaScript() throws InterruptedException {

        //Open driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jsfiddle.net/2zv7195o/17/show");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //get some elements using selectors
        WebElement iframeResult = driver.findElement(By.tagName("iframe"));

        //move to the iframe that the page contents, we have to move there because there
        // are the elements we are going to interact with.
        driver.switchTo().frame(iframeResult);

        //apply the script for every h2 tag
        String script = "arguments[0].setAttribute('style','border-style: solid; border-color: red;" +
                "border-radius: 25px')";
        List<WebElement> headers = driver.findElements(By.tagName("h2"));

        for (WebElement header : headers){
            ((JavascriptExecutor)driver).executeScript(script, header);
        }

        Assert.assertTrue(headers.get(0).getAttribute("style").contains("border-color: red"),
                "Headers do not contain the expected style");
        driver.switchTo().defaultContent();

        //close the browser, the sleep is only to have the chance to see the changes,
        // it is only for training purposes.
        Thread.sleep(5000);
        driver.quit();
    }
}
