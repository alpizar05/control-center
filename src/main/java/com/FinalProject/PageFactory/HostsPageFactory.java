package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 30/08/2015.
 */
public class HostsPageFactory extends PageBase {

    @FindBy(xpath = ".//*[@id='ng-app']//span [contains(text(),'Hosts')]")
    protected WebElement mainTitleElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button [@ng-click = 'modalAddHost()']")
    protected WebElement addHostButtonElement;
    @FindBy(id = "new_host_name")
    protected WebElement hostFieldElement;
    @FindBy(id = "new_host_ram_commitment")
    protected WebElement hostRamCommitmentFieldElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button [@class = 'btn btn-primary submit']")
    protected WebElement submitHostButtonElement;
    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'Add Host')]")
    protected WebElement addHostWindowTitleElement;
    @FindBy(className = "notification bg-success")
    protected WebElement addHostFlareElement;
    @FindBy(xpath = ".//*[@class='modal-title' and contains(text(),'Remove Host')]")
    protected WebElement deleteHostWindowTitleElement;
    @FindBy(xpath = ".//*[@id='ng-app']//div[contains(text(),'This action will permanently delete the host')]")
    protected WebElement deleteHostConfirmationMessageElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button[contains(text(),'Remove Host')]")
    protected WebElement deleteHostButtonElement;
    @FindBy(xpath = ".//button[@class = 'btn btn-danger']")
    protected WebElement removeHostConfirmationButtonElement;
    @FindBy(xpath = ".//div[@class='notification bg-success']/span[text()='Removed host']")
    protected WebElement deleteHostFlareTittle;

    public HostsPageFactory(WebDriver driver) {
        super(driver);
    }


}
