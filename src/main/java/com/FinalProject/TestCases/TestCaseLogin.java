package com.FinalProject.TestCases;

import com.FinalProject.Data.PublicData;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.ApplicationPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Automation on 30/08/2015.
 */
public class TestCaseLogin extends TestCaseBase{
        @Test
        public void loginZenoss(){

        /*Parametros*/
            String user = PublicData.USER;
            String password = PublicData.PASS;


            LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

            controlCenter.enterUser(user);
            controlCenter.enterPassword(password);
            ApplicationPageObject applicationPage = controlCenter.clickOnLogIn();
            Assert.assertTrue(applicationPage.checkPage(), "The Application page was not displayed");
        }
    }
