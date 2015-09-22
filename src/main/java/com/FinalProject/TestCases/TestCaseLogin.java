package com.FinalProject.TestCases;

import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test(groups = {"authentication"})
public class TestCaseLogin extends TestCaseBase {

    /**
     * Author: Wendy Sandoval
     *
     * @param user
     * @param password
     * @throws Exception
     */
    @Test(groups = {"tc01"}, priority = 0)
    @Parameters({"tc01_user", "tc01_password"})
    public void loginRoot(String user, String password) throws Exception {

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
