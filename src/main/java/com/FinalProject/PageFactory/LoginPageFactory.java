package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Automation on 30/08/2015.
 */
public class LoginPageFactory extends PageBase{

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='login']/input [@placeholder='Username']")
    protected WebElement userFieldElement;

    @FindBy(xpath = ".//*[@id='login']/input [@placeholder='Password']")
    protected WebElement pwdFieldElement;
    //Assert.assertTrue(pwdFieldElement.isDisplayed(), "Passowrd Field is not being displayed");

    @FindBy(xpath = ".//*[@id='login']/button [@type='submit' and contains(text(),'Log In')]")
    protected WebElement logInButtonElement;
    //Assert.assertTrue(logInButtonElement.isDisplayed(), "Log In button is not being displayed");


}
