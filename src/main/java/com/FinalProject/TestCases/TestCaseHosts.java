package com.FinalProject.TestCases;

import com.FinalProject.PageObject.HostsPageObject;
import com.FinalProject.PageObject.LoginPageObject;
import com.FinalProject.PageObject.TopMainMenuPageObject;
import com.FinalProject.Utilities.Utilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = {"hosts"})
public class TestCaseHosts extends TestCaseBase {

    /**
     * Author: Alvaro Alpizar
     *
     * @param user
     * @param password
     * @param resourceName
     * @param hostname
     * @param port
     * @param ramCommitment
     * @throws Exception
     */
    @Test(groups = {"tc09"}, priority = 0)
    @Parameters({"tc09_user", "tc09_password", "tc09_resource_pool_name", "tc09_address", "tc09_hostname", "tc09_port", "tc09_ram_commitment"})
    public void addHosts(String user, String password, String resourceName, String ipAddress, String hostname, String port, String ramCommitment) throws Exception {

        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Do login
        controlCenter.enterUser(user);
        controlCenter.enterPassword(password);
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page is not displayed");

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
    }

    @Test(groups = {"tc10"}, priority = 2)
    @Parameters({"tc10_user", "tc10_password", "tc10_hostname"})
    public void deleteHosts(String user, String password, String hostname) throws Exception {

        LoginPageObject controlCenter = PageFactory.initElements(driver, LoginPageObject.class);

        //Do login
        controlCenter.enterUser(user);
        controlCenter.enterPassword(password);
        TopMainMenuPageObject topMainMenu = controlCenter.clickOnLogIn();
        Assert.assertTrue(topMainMenu.checkPage(), "Top main menu page is not displayed");

        //Click on Hosts option
        HostsPageObject hosts = topMainMenu.clickHostsPool();
        Assert.assertTrue(hosts.checkPage(), "Hosts page is not displayed");

        //click delete button
        hosts.clickDeleteHost(hostname);
        Assert.assertTrue(hosts.checkDeleteConfirmationMessage(hostname), "Remove Host modal is not displayed");

        //Click remove button
        hosts.clickRemoveConfirmationButton();
        Utilities.wait(3);
        Assert.assertFalse(hosts.isHostDisplayed(hostname));
    }
}
