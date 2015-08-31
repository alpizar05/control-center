package com.FinalProject.TestCases;

import com.FinalProject.Data.PublicData;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Automation on 30/08/2015.
 */
public class TestCaseLogin extends TestCaseBase{
        @Test
        public void loginRoot(){

        /*Parametros*/
            String user = PublicData.USER;
            String password = PublicData.PASS;


            LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

            //Enter user name
            controlCenter.enterUser(user);
            //Enter password
            controlCenter.enterPassword(password);
            //Click on Log In button
            TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
            //Main menu is displayed
            Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");
        }
    }
