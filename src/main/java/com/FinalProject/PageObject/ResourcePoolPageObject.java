package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.ResourcePoolsPageFactory;
import com.FinalProject.Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Automation on 30/08/2015.
 */
public class ResourcePoolPageObject extends ResourcePoolsPageFactory {

    String xpathResourcePoolLine = ".//*[@id='ng-app']//td [contains(text(),'%s')]";
    String getXpathResourcePoolDeleteButton = String.format("%s/../td/button", xpathResourcePoolLine);
    String deleteMessage = "This action will permanently delete the resource pool %s";
    String getXpathDeleteResourceFlareMessage = ".//*[@id='notifications']//span[contains(text(),'%s')]";

    public ResourcePoolPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage() {
        return mainResourcePoolTitleElement.isDisplayed();
    }

    public void clickAddPool() {
        getActionBot().click(addResourceButtonElement);
    }


    public void enterPoolName(String user) {
        getActionBot().sendKeys(poolNameFieldElement, user);

    }

    public void enterPoolDescription(String user) {
        getActionBot().sendKeys(poolDescriptionFieldElement, user);
    }


    public void clickSubmitPool() {
        getActionBot().click(submitPoolButtonElement);
    }


    public boolean checkPoolName(String resourcePoolName) {
        return (getActionBot().findElement(String.format(xpathResourcePoolLine, resourcePoolName)));
    }

    public void clickDeletePool(String resourcePoolName) {
        WebElement poolDeleteButton = getDriver().findElement(By.xpath(String.format(getXpathResourcePoolDeleteButton, resourcePoolName)));
        getActionBot().click(poolDeleteButton);

    }

    public boolean checkAddWindowTittle() {

        return (addResourceWindowTitleElement.isDisplayed());

    }

    public boolean checkAddResourceFlareTitle() {
        return (addResourceFlareTitleElement.isDisplayed());
    }

    public boolean checkAddResourceFlareMessage() {
        return (addResourceFlareMessageElement.isDisplayed());
    }

    public boolean checkDeleteWindowTittle() {

        return (deleteResourceWindowTitleElement.isDisplayed());

    }


    public boolean checkDeleteConfirmationMessage(String resourcePoolName) {

        return (deleteResourcePoolConfirmationMessageElement.getText().matches(String.format(deleteMessage, resourcePoolName)));
    }

    public void clickDeleteReourceConfirmationButton() {
        getActionBot().click(deleteResourceConfirmationButtonElement);
    }

    public boolean checkDeleteFlareTitle() {
        Utilities.waitForElementDisplayed(getDriver(),deleteResourceFlareTittle);
        return (deleteResourceFlareTittle.isDisplayed());

    }

    public boolean checkDeleteFlareMessage(String resourcePoolName) {

        WebElement deleteFlareMessage = getDriver().findElement(By.xpath(String.format(getXpathDeleteResourceFlareMessage, resourcePoolName)));
        return (deleteFlareMessage.isDisplayed());
    }
}
