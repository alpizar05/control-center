package com.training.PatronesPageObjectsPageFactory.TestCase;

import com.training.PatronesPageObjectsPageFactory.PageObject.GmailLoginPage;
import com.training.PatronesPageObjectsPageFactory.PageObject.GmailMainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Automation on 05/07/2015.
 */
public class SuiteEjemplos extends TestCaseBase {

    @Test
     public void loginGmail(){

        /*Parametros*/
        String email = "automationtrainingap@gmail.com";
        String password = "automationtrainingap$1";

        /*crear la instancia del page object gmail*/
        GmailLoginPage gmail = PageFactory.initElements(driver, GmailLoginPage.class);

        /*interactuar con el PO por medio de sus metodos*/
        gmail.enterEmail(email);
        gmail.clickOnNext();
        gmail.enterPass(password);
        GmailMainPage mainPage = gmail.clickSignInButton();
        Assert.assertTrue(mainPage.checkPage(), "The main page was not displayed as expected");

        mainPage.searchMessage("Test Search term");
    }
}
