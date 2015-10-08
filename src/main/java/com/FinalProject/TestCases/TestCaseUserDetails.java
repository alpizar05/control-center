package com.FinalProject.TestCases;

import com.FinalProject.PageObject.HostsPageObject;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import com.FinalProject.PageObject.UserDetailsPageObject;
import com.FinalProject.Utilities.Utilities;
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
    @Test(groups = {"tc05"}, priority = 0)
    @Parameters({"tc05_user", "tc05_password"})
    public void ChangeLanguageSpanish(String user, String password) throws Exception {

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
    @Test(groups = {"tc06"}, priority = 1)
    @Parameters({"tc06_user", "tc06_password"})
    public void ChangeLanguageEnglish(String user, String password) throws Exception {

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
    @Test(groups = {"tc07"}, priority = 2)
    @Parameters({"tc07_user", "tc07_password", "tc07_resource_pool_name", "tc07_address", "tc07_hostname", "tc07_port", "tc07_ram_commitment"})
    public void readNotification(String user, String password, String resourceName, String ipAddress, String hostname, String port, String ramCommitment) throws Exception {

        /*Pre steps*/
        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Enter user name
        controlCenter.enterUser(user);
        //Enter password
        controlCenter.enterPassword(password);

        //Click on Log In button
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");

        //Click on Hosts option
        HostsPageObject hosts = topMainMenu.clickHostsPool();
        Assert.assertTrue(hosts.checkPage(), "Hosts page is not displayed");

        //Click on Add host
        hosts.clickAddPool();
        Assert.assertTrue(hosts.checkAddWindowTittle(), "Add host Window is not displayed");

        //Enter Host info
        hosts.enterHostNameAndPort(ipAddress, port);
        hosts.enterPoolDescription(resourceName);
        hosts.enterRamCommitment(ramCommitment);

        //Click on submit
        hosts.clickSubmitHost();
        Assert.assertTrue(hosts.isHostDisplayed(hostname), "Host was not added");

        //Click on Hosts option
        hosts = topMainMenu.clickHostsPool();
        Assert.assertTrue(hosts.checkPage(), "Hosts page is not displayed");

        //click delete button
        hosts.clickDeleteHost(hostname);
        Assert.assertTrue(hosts.checkDeleteConfirmationMessage(hostname), "Remove Host modal is not displayed");

        //Click remove button
        hosts.clickRemoveConfirmationButton();
        Utilities.wait(3);
        Assert.assertFalse(hosts.isHostDisplayed(hostname));

        /*TC steps*/
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
    @Test(groups = {"tc08"}, priority = 2)
    @Parameters({"tc08_user", "tc08_password", "tc08_resource_pool_name", "tc08_address", "tc08_hostname", "tc08_port", "tc08_ram_commitment"})
    public void deleteNotification(String user, String password, String resourceName, String ipAddress, String hostname, String port, String ramCommitment) throws Exception {

        /*Pre steps*/
        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Enter user name
        controlCenter.enterUser(user);
        //Enter password
        controlCenter.enterPassword(password);

        //Click on Log In button
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page was not displayed");

        //Click on Hosts option
        HostsPageObject hosts = topMainMenu.clickHostsPool();
        Assert.assertTrue(hosts.checkPage(), "Hosts page is not displayed");

        //Click on Add host
        hosts.clickAddPool();
        Assert.assertTrue(hosts.checkAddWindowTittle(), "Add host Window is not displayed");

        //Enter Host info
        hosts.enterHostNameAndPort(ipAddress, port);
        hosts.enterPoolDescription(resourceName);
        hosts.enterRamCommitment(ramCommitment);

        //Click on submit
        hosts.clickSubmitHost();
        Assert.assertTrue(hosts.isHostDisplayed(hostname), "Host was not added");

        //Click on Hosts option
        hosts = topMainMenu.clickHostsPool();
        Assert.assertTrue(hosts.checkPage(), "Hosts page is not displayed");

        //click delete button
        hosts.clickDeleteHost(hostname);
        Assert.assertTrue(hosts.checkDeleteConfirmationMessage(hostname), "Remove Host modal is not displayed");

        //Click remove button
        hosts.clickRemoveConfirmationButton();
        Utilities.wait(3);
        Assert.assertFalse(hosts.isHostDisplayed(hostname));

        /*TC steps*/
        //Click on User Details  menu option
        UserDetailsPageObject userDetails = topMainMenu.clickUserDetails();
        Assert.assertTrue(userDetails.checkPage(), "User details page was not displayed");

        //Delete notifications
        userDetails.deleteNotifications();
        Assert.assertFalse(userDetails.isNotificationDisplayed(), "Notification were not removed");
    }

}
