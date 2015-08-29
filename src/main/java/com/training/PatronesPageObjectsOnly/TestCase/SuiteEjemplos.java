package com.training.PatronesPageObjectsOnly.TestCase;

import com.training.PatronesPageObjectsOnly.PageObject.GmailLoginPage;
import com.training.PatronesPageObjectsOnly.PageObject.GmailMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Automation on 05/07/2015.
 */
public class SuiteEjemplos extends TestCaseBase{

    @Test
    public void loginGmail(){
        String email = "automationtrainingap@gmail.com";
        String password = "automationtrainingap$1";

        GmailLoginPage gmail = new GmailLoginPage(driver);
        gmail.enterEmail(email);
        gmail.clickOnNext();
        gmail.enterPass(password);
        GmailMainPage mainPage = gmail.clickSignInButton();
        Assert.assertTrue(mainPage.checkPage(), "The main page was not displayed as expected");

        mainPage.searchMessage("Test Search term");
    }
}
