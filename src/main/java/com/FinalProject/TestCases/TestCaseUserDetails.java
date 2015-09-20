package com.FinalProject.TestCases;

import com.FinalProject.Data.PublicData;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.ResourcePoolPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import com.FinalProject.PageObject.UserDetailsPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Automation on 20/09/2015.
 */
public class TestCaseUserDetails extends TestCaseBase {

    @Test
    public void ChangeLanguageSpanish(){

        /*Parametros*/
        String user = PublicData.USER;
        String password = PublicData.PASS;
        String testResourceName = "TestResourceName";
        String testResourceDesc = "TestResourceDesc";

        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Enter user name
        controlCenter.enterUser(user);
        //Enter password
        controlCenter.enterPassword(password);
        //Click on Log In button
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        //Main menu is displayed
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");
        //Click on User Details  menu option
        UserDetailsPageObject userDetails = topMainMenu.clickUserDetails();
        //User Details page  is displayed
        Assert.assertTrue(userDetails.checkPage(), "User details page was not displayed");
        //click on spanishButton
        userDetails.clickSpanishButton();
        //Username label is displayed in spanish
        userDetails.checkUsernameSpanish();
        //User is displayed
        userDetails.checkUserNameValue(user);
        //Message label is displayed in spanish
        userDetails.checkMessageLabelSpanish();
        //Clear button is displayed in Spanish
        userDetails.checkSpanishClearButton();
        //CloseWindow
        userDetails.clickCloseButton();
        }



}
