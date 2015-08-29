package com.training.PatronesPageObjectsPageFactory.PageObject;

import com.training.PatronesPageObjectsPageFactory.PageFactory.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailMainPage extends GmailMainPageFactory {

    public GmailMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage(){
        return searchTextField.isDisplayed();
    }

    public void searchMessage(String searchTerm){
        searchTextField.sendKeys(searchTerm);
    }
}
