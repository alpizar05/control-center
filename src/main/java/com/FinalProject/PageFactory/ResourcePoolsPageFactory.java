package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 30/08/2015.
 */
public class ResourcePoolsPageFactory extends PageBase {

    @FindBy(xpath = ".//*[@id='ng-app']//span [contains(text(),'Resource Pools')]")
    protected WebElement mainResourcePoolTitleElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button [@ng-click = 'modalAddPool()']")
    protected WebElement addResourceButtonElement;
    @FindBy(id = "new_pool_name")
    protected WebElement poolNameFieldElement;
    @FindBy(id = "new_pool_description")
    protected WebElement poolDescriptionFieldElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button [@class = 'btn btn-primary submit']")
    protected WebElement submitPoolButtonElement;
    @FindBy(xpath = ".//*[@id='ng-app']//span[contains(text(),'Add Resource Pool')]")
    protected WebElement addResourceWindowTitleElement;
    @FindBy(xpath = ".//*[@id='notifications']//span[@class='title' and contains(text(),'Added new Pool')]")
    protected WebElement addResourceFlareTitleElement;
    @FindBy(xpath = ".//*[@id='notifications']//span[@class='message' and contains(text(),'Added resource pool')]")
    protected WebElement addResourceFlareMessageElement;
    @FindBy(xpath = ".//*[@class=\"modal-title\" and contains(text(),'Remove Pool')]")
    protected WebElement deleteResourceWindowTitleElement;
    @FindBy(xpath = ".//*[@id='ng-app']//div[contains(text(),\"This action will permanently delete the resource pool\")]")
    protected WebElement deleteResourcePoolConfirmationMessageElement;
    @FindBy(xpath = ".//*[@id='ng-app']//button[contains(text(),'Remove Pool')]")
    protected WebElement deleteResourceConfirmationButtonElement;
    @FindBy(xpath = ".//*[@id='notifications']//span[contains(text(),'Removed pool')]")
    protected WebElement deleteResourceFlareTittle;

    public ResourcePoolsPageFactory(WebDriver driver) {
        super(driver);
    }


}
