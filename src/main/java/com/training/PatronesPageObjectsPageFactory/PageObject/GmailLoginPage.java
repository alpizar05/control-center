package com.training.PatronesPageObjectsPageFactory.PageObject;

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
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void clickOnNext(){
        next.click();
    }

    public void enterPass(String password){
        pwdElement.clear();
        pwdElement.sendKeys(password);
    }

    public GmailMainPage clickSignInButton(){
        signIn.click();
        options.click();
        getActionBot().click(signIn);
        getActionBot().click(options);
        return (GmailMainPage) navigateToNextPage(gmailOption, GmailMainPage.class);
    }
}
