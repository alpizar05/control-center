package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 30/08/2015.
 */
public class ApplicationsPageFactory extends PageBase {

    @FindBy(xpath = ".//*[@id='ng-app']//span [contains(text(),'Applications')]")
    protected WebElement applicationTitleElement;

    public ApplicationsPageFactory(WebDriver driver) {
        super(driver);
    }
}
