package com.framework.PageFactory;

import com.framework.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 19/07/2015.
 */
public class TestPageFactory extends PageBase {
    public TestPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "name")
    protected
    WebElement nombre;

    @FindBy(id = "apellido")
    protected
    WebElement apellido;

    @FindBy(id = "cedula")
    protected
    WebElement cedula;

    @FindBy(tagName = "iframe")
    protected
    WebElement iframeResult;

    @FindBy(id = "btnClickMe")
    protected
    WebElement btnClickMe;
}
