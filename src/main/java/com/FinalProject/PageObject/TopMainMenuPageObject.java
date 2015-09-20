package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.TopMainMenuPageFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 30/08/2015.
 */
public class TopMainMenuPageObject extends TopMainMenuPageFactory{

    public TopMainMenuPageObject (WebDriver driver) { super(driver); }

    public boolean checkPage(){
        return logoElment.isDisplayed();
    }


    public LoginPageObject clickLogOutButton(){
        return (LoginPageObject) navigateToNextPage(logOutButtonElement, LoginPageObject.class);
    }

    public ApplicationPageObject clickApplicationsLink(){
        return (ApplicationPageObject) navigateToNextPage(applicationsLinkElement, ApplicationPageObject.class);
    }

    public  ResourcePoolPageObject clickResourcePool(){
        return (ResourcePoolPageObject) navigateToNextPage(resourcePoolsLinkElement, ResourcePoolPageObject.class);
    }
    public  UserDetailsPageObject clickUserDetails(){
        return (UserDetailsPageObject) navigateToNextPage(UserDetailsLinkElement, UserDetailsPageObject.class);
    }



}
