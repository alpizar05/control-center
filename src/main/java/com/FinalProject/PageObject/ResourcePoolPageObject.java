package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.ResourcePoolsPageFactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

/**
 * Created by Automation on 30/08/2015.
 */
public class ResourcePoolPageObject extends ResourcePoolsPageFactory {

    public ResourcePoolPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage() {return resourcePoolTitleElement.isDisplayed();}

    public void clickAddPool(){
        getActionBot().click(addResourceButtonElement);
    }


    public void enterPoolName(String user){
        getActionBot().sendKeys(poolNameFieldElement, user);

    }

    public void enterPoolDescription(String user){
        getActionBot().sendKeys(poolDescriptionFieldElement, user);
    }


    public void clickSubmitPool(){
        getActionBot().click(submitPoolButton);
    }

    public boolean checkPoolName(){
        WebElement poolNameLine;
        String xpathTmp;
        xpathTmp = ".//*[@id='ng-app']//td [contains(text(),'"+ poolNameFieldElement.getAttribute("value") + "')]";
        poolNameLine = getDriver().findElement(By.xpath(xpathTmp));
        return poolNameLine.isDisplayed();
    }

}
