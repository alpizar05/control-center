package com.FinalProject.TestCases;

import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import com.FinalProject.PageObject.UserDetailsPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = {"details"})
public class TestCaseUserDetails extends TestCaseBase {

    /**
     * Author: Wendy Sandoval
     *
     * @param user
     * @param password
     */
    @Test(groups = {"tc05"})
    @Parameters({"tc05_user", "tc05_password"})
    public void ChangeLanguageSpanish(String user, String password) {

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

    /**
     * Author: Wendy Sandoval
     *
     * @param user
     * @param password
     */
    @Test(groups = {"tc06"})
    @Parameters({"tc06_user", "tc06_password"})
    public void ChangeLanguageEnglish(String user, String password) {

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
        userDetails.clickEnglishhButton();
        //Username label is displayed in english
        userDetails.checkUsernameEnglish();
        //User is displayed
        userDetails.checkUserNameValue(user);
        //Message label is displayed in english
        userDetails.checkMessageEnglish();
        //Clear button is displayed in Spanish
        userDetails.checkEnglishClearButton();
        //CloseWindow
        userDetails.clickCloseButton();
    }

    /**
     * Author: Alvaro Alpizar
     *
     * @param user
     * @param password
     */
    @Test(groups = {"tc07"}, dependsOnGroups = "tc09")
    @Parameters({"tc07_user", "tc07_password"})
    public void readNotification(String user, String password) {

        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Enter user name
        controlCenter.enterUser(user);
        //Enter password
        controlCenter.enterPassword(password);

        //Click on Log In button
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");

        //Click on User Details  menu option
        UserDetailsPageObject userDetails = topMainMenu.clickUserDetails();
        Assert.assertTrue(userDetails.checkPage(), "User details page was not displayed");

        //Read notification
        userDetails.readNotification();
        Assert.assertTrue(userDetails.isRead(), "Notification is not mark as read");
    }

    /**
     * Author: Alvaro Alpizar
     *
     * @param user
     * @param password
     */
    @Test(groups = {"tc08"}, dependsOnGroups = "tc09")
    @Parameters({"tc08_user", "tc08_password"})
    public void deleteNotification(String user, String password) {

        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Enter user name
        controlCenter.enterUser(user);
        //Enter password
        controlCenter.enterPassword(password);

        //Click on Log In button
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");

        //Click on User Details  menu option
        UserDetailsPageObject userDetails = topMainMenu.clickUserDetails();
        Assert.assertTrue(userDetails.checkPage(), "User details page was not displayed");

        //Delete notifications
        userDetails.deleteNotifications();
        Assert.assertTrue(userDetails.isNotificationDisplayed(), "Notification were not removed");
    }

}
