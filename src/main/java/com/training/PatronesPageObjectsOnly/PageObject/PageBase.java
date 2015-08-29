package com.training.PatronesPageObjectsOnly.PageObject;

import com.training.PatronesPageObjectsOnly.Utilidades.Utilidades;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Automation on 05/07/2015.
 */
public class PageBase {
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }
}
