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
        //Check Add Resource Pool Window is open
        Assert.assertTrue(resourcePool.checkAddWindowTittle(), "Add resource pool Window is not displayed");
        //Enter Resource Pool Name
        resourcePool.enterPoolName(testResourceName);
        //Enter Resource Pool Description
        resourcePool.enterPoolDescription(testResourceDesc);
        //Click on Submit button
        resourcePool.clickSubmitPool();
        //Flare title displays
        Assert.assertTrue(resourcePool.checkAddResourceFlareTitle(), "Error in Flare Message");
        //Flare Message displays
        Assert.assertTrue(resourcePool.checkAddResourceFlareMessage(), "Error in Flare Message");
        //Resource Pool is added
        Assert.assertTrue(resourcePool.checkPoolName(testResourceName), "Resource pool was not added");
        //Click on log out
        LoginPageObject loginPage = topMainMenu.clickLogOutButton();
        //Log In page is displayed
        Assert.assertTrue(loginPage.checkPage(), "Log Out Action is failing");
    }



    @Test
    public void DeleteResourcePool() {

         /*Parametros*/
        String user = PublicData.USER;
        String password = PublicData.PASS;
        String testResourceName = "TestResourceName";

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
        //Click on Delete button
        resourcePool.clickDeletePool(testResourceName);
        //Confirmation Page is displayed
        resourcePool.checkDeleteWindowTittle();
        //ConfirmationMessage is displayed
        resourcePool.checkDeleteConfirmationMessage(testResourceName);
        //Click on confirmation button
        resourcePool.clickDeleteReourceConfirmationButton();
        //Flare tittle is displayed
        resourcePool.checkDeleteFlareTitle();
        //Flare message is correct
        resourcePool.checkDeleteFlareMessage(testResourceName);
        //Click on log out
        LoginPageObject loginPage = topMainMenu.clickLogOutButton();
        //Log In page is displayed
        Assert.assertTrue(loginPage.checkPage(), "Log Out Action is failing");




    }

}
