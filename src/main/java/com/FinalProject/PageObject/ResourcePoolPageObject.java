package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.ResourcePoolsPageFactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

/**
 * Created by Automation on 30/08/2015.
 */
public class ResourcePoolPageObject extends ResourcePoolsPageFactory {

    String xpathResourcePoolLine = ".//*[@id='ng-app']//td [contains(text(),'%s')]";
    //String getXpathResourcePoolDeleteButton = xpathResourcePoolLine + "/../td/button";
    String getXpathResourcePoolDeleteButton = String.format("%s/../td/button",xpathResourcePoolLine);

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


    public boolean checkPoolName(String resourcePoolName){
        WebElement poolNameLine;
        poolNameLine = getDriver().findElement(By.xpath(String.format(xpathResourcePoolLine,resourcePoolName)));
        return poolNameLine.isDisplayed();
    }

    public void clickDeletePool(String resourcePoolName){
       WebElement poolDeleteButton = getDriver().findElement(By.xpath(String.format(getXpathResourcePoolDeleteButton,resourcePoolName)));
        getActionBot().click(poolDeleteButton);

    }


}
