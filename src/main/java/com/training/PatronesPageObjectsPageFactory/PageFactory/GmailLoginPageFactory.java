package com.training.PatronesPageObjectsPageFactory.PageFactory;

import com.training.PatronesPageObjectsPageFactory.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailLoginPageFactory extends PageBase {

    public GmailLoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    protected WebElement emailElement;

    @FindBy(id = "Passwd")
    protected WebElement pwdElement;

    @FindBy(id = "next")
    protected WebElement next;

    @FindBy(id = "signIn")
    protected WebElement signIn;

    @FindBy(css = ".gb_pa.gb_2")
    protected WebElement options;

    @FindBy(xpath = "//span[text()='Gmail']")
    protected WebElement gmailOption;

    @FindBy(css = ".msg")
    protected WebElement cargando;
}
