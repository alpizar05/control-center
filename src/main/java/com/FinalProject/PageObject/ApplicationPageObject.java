package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.ApplicationsPageFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 30/08/2015.
 */
public class ApplicationPageObject extends ApplicationsPageFactory {

    public ApplicationPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage(){
        return applicationTitleElement.isDisplayed();
    }


}
