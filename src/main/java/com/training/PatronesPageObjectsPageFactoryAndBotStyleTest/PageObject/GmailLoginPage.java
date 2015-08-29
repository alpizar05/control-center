package com.training.PatronesPageObjectsPageFactoryAndBotStyleTest.PageObject;

import com.training.PatronesPageObjectsPageFactory.PageFactory.GmailLoginPageFactory;
import com.training.PatronesPageObjectsPageFactory.Utilidades.Utilidades;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailLoginPage extends GmailLoginPageFactory {

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){
        getActionBot().sendKeys(emailElement, email);
    }

    public void clickOnNext(){
        getActionBot().click(next);
    }

    public void enterPass(String password){
        getActionBot().sendKeys(pwdElement, password);
    }

    public GmailMainPage clickSignInButton(){
        getActionBot().click(signIn);
        getActionBot().click(options);
        return (GmailMainPage) navigateToNextPage(gmailOption, GmailMainPage.class);
    }
}
