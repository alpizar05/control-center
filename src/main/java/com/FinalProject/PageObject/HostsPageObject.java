package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.HostsPageFactory;
import com.FinalProject.Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Automation on 30/08/2015.
 */
public class HostsPageObject extends HostsPageFactory {

    String getGetXpathHost = "//td[contains(text(),'%s')]";
    String getXpathHostDeleteButton = "//td[contains(text(),'%s')]/../td/button[contains(@ng-click,'remove_host')]";
    String deleteMessage = "This action will permanently delete the host %s";
    String getXpathDeleteResourceFlareMessage = ".//*[@id='notifications']//span[contains(text(),'%s')]";
    String getResourcePoolOption = "new_host_parent";

    public HostsPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage() {
        return mainTitleElement.isDisplayed();
    }

    public void clickAddPool() throws Exception {
        getActionBot().click(addHostButtonElement);
        Utilities.wait(2);
    }

    public void enterHostNameAndPort(String host, String port) {
        getActionBot().sendKeys(hostFieldElement, String.format("%s%s%s", host, ":", port));
    }

    public void enterPoolDescription(String resourcePool) {
        getActionBot().selectElement(getResourcePoolOption, resourcePool);
    }

    public void enterRamCommitment(String ramCommitment) {
        getActionBot().sendKeys(hostRamCommitmentFieldElement, ramCommitment);
    }

    public void clickSubmitHost() {
        getActionBot().click(submitHostButtonElement);
    }

    public void clickDeleteHost(String hostname) {
        WebElement poolDeleteButton = getDriver().findElement(By.xpath(String.format(getXpathHostDeleteButton, hostname)));
        getActionBot().click(poolDeleteButton);
    }

    public boolean isHostDisplayed(String hostname) {
        try {
            getDriver().findElement(By.xpath(String.format(getGetXpathHost, hostname)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickRemoveConfirmationButton() {
        getActionBot().click(removeHostConfirmationButtonElement);
    }

    public boolean checkAddWindowTittle() {
        return (addHostWindowTitleElement.isDisplayed());
    }

    public boolean checkDeleteConfirmationMessage(String hostname) throws Exception {
        Utilities.wait(5);
        return deleteHostConfirmationMessageElement.getText().matches(String.format(deleteMessage, hostname));
    }
}
