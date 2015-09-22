package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 20/09/2015.
 */
public class UserDetailsPageFactory extends PageBase {

    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'User Details')]")
    protected WebElement userDetailsTitleElement;
    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'User Details')]/../button")
    protected WebElement userDetailsCloseWindowButton;
    @FindBy(xpath = ".//*[@id='ng-app']//p[contains(text(),'Username')]")
    protected WebElement englishUserNameLabelElement;
    @FindBy(xpath = ".//*[@id='ng-app']//p[contains(text(),'Usuario')]")
    protected WebElement spanishUserNameLabelElement;
    @FindBy(xpath = ".//*[@id='ng-app']//input[@value='en_US']")
    protected WebElement englishRadioElement;
    @FindBy(xpath = ".//*[@id='ng-app']//input[@value='es_US']")
    protected WebElement spanishRadioElement;
    @FindBy(xpath = ".//*[@id='ng-app']//div[contains(text(),'Messages')]")
    protected WebElement englishMessagesLabel;
    @FindBy(xpath = ".//*[@id='ng-app']//div[contains(text(),'Mensajes')]")
    protected WebElement spanishMessagesLabel;
    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'Clear')]")
    protected WebElement englishClearButtonElement;
    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'Borrar')]")
    protected WebElement spanishClearButtonElement;
    @FindBy(xpath = "//div[@ng-click='clearMessages()']")
    protected WebElement deleteButton;
    @FindBy(xpath = "//ul[@class='well list-group']/li[1]")
    protected WebElement notification;

    public UserDetailsPageFactory(WebDriver driver) {
        super(driver);
    }


}
