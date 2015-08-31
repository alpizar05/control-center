package com.FinalProject.PageFactory;

import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 30/08/2015.
 */
public class ResourcePoolsPageFactory extends PageBase{

    public ResourcePoolsPageFactory (WebDriver driver){super (driver);}

    @FindBy(xpath = ".//*[@id='ng-app']//span [contains(text(),'Resource Pools')]")
    protected WebElement resourcePoolTitleElement;

    @FindBy(xpath = ".//*[@id='ng-app']//button [@ng-click = 'modalAddPool()']")
    protected WebElement addResourceButtonElement;

    @FindBy(id = "new_pool_name")
    protected WebElement poolNameFieldElement;

    @FindBy(id = "new_pool_description")
    protected WebElement poolDescriptionFieldElement;

    @FindBy(xpath = ".//*[@id='ng-app']//button [@class = 'btn btn-primary submit']")
    protected WebElement submitPoolButton;


}
