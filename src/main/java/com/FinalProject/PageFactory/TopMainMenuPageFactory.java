package com.FinalProject.PageFactory;


import com.FinalProject.PageObject.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Automation on 30/08/2015.
 */
public class TopMainMenuPageFactory extends PageBase{

    public TopMainMenuPageFactory(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "logoType")
    protected WebElement logoElment;

    @FindBy (xpath = ".//*[@id='ng-app']//button [@ng-click='logout()']")
    protected WebElement logOutButtonElement;


    @FindBy (xpath = ".//*[@id='ng-app']//a [contains(text(),'Applications')]")
    protected WebElement applicationsLinkElement;

    @FindBy (xpath = ".//*[@id='ng-app']//a [contains(text(),'Resource Pools')]")
    protected WebElement resourcePoolsLinkElement;

    @FindBy (xpath = ".//*[@id='ng-app']//a [contains(text(),'Hosts')]")
    protected WebElement hostLinkElement;


}
