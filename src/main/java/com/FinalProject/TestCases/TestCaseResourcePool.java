package com.FinalProject.TestCases;

import com.FinalProject.Data.PublicData;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.ResourcePoolPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Automation on 31/08/2015.
 */
public class TestCaseResourcePool extends TestCaseBase {

    @Test
    public void AddResourcePool(){

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
        //Click on Resource Pool otp menu option
        ResourcePoolPageObject resourcePool = topMainMenu.clickResourcePool();
        //Resource Pool page  is displayed
        Assert.assertTrue(resourcePool.checkPage(), "Resource pool page was not displayed");
        //Click on Add resource pool
        resourcePool.clickAddPool();
        //Enter Resource Pool Name
        resourcePool.enterPoolName(testResourceName);
        //Enter Resource Pool Description
        resourcePool.enterPoolDescription(testResourceDesc);
        //Click on Submit button
        resourcePool.clickSubmitPool();
        //Resource Pool is added
        Assert.assertTrue(resourcePool.checkPoolName(), "Resource pool was not added");
        //Click on log out
        LoginPageObject loginPage = topMainMenu.clickLogOutButton();
        //Log In page is displayed
        Assert.assertTrue(loginPage.checkPage(), "Resource pool was not added");

    }



    @Test
    public void DeleteResourcePool() {
    }

}
