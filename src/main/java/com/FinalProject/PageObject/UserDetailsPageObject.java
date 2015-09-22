package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.UserDetailsPageFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 20/09/2015.
 */
public class UserDetailsPageObject extends UserDetailsPageFactory
{

    String xpathNotificationLine = ".//*[@id='ng-app']//span[contains(text(),'%s')]";
    String xpathUserNameValue = ".//*[@id='ng-app']//p[contains(text(),'%s')]";


    public UserDetailsPageObject (WebDriver driver) { super(driver); }

    public boolean checkPage() {return userDetailsTitleElement.isDisplayed();}

    public boolean checkUsernameEnglish() {return englishUserNameLabelElement.isDisplayed();}

    public boolean checkUsernameSpanish() {return spanishUserNameLabelElement.isDisplayed();}

    public boolean checkMessageEnglish() {return englishMessagesLabel.isDisplayed();}

    public boolean checkMessageLabelSpanish() {return spanishMessagesLabel.isDisplayed();}

    public boolean checkSpanishClearButton() {return spanishRadioElement.isDisplayed();}

    public boolean checkEnglishClearButton() {return englishRadioElement.isDisplayed();}

    public void clickSpanishButton(){
        getActionBot().click(spanishRadioElement);
    }

    public void clickEnglishhButton(){
        getActionBot().click(englishRadioElement);
    }

    public void clickCloseButton(){
        getActionBot().click(userDetailsCloseWindowButton);
    }

    public boolean checkUserNameValue(String currentUser) {
        return (getActionBot().findElement(String.format(xpathUserNameValue,currentUser)));
    }

    public boolean checkNotification(String message){
        return (getActionBot().findElement(String.format(xpathNotificationLine,message)));

    }

}
