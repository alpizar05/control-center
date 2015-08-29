package com.training.PatronesPageObjectsPageFactory.PageFactory;

import com.training.PatronesPageObjectsPageFactory.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailMainPageFactory extends PageBase {

    public GmailMainPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindAll({@FindBy(id = "gbqfq"), @FindBy(id = "gbqfq")})
    protected WebElement searchTextField;
}
