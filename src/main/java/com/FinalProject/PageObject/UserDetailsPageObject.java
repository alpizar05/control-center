package com.FinalProject.PageObject;

import com.FinalProject.PageFactory.UserDetailsPageFactory;
import com.FinalProject.Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.reflect.annotation.ExceptionProxy;

/**
 * Created by Automation on 20/09/2015.
 */
public class UserDetailsPageObject extends UserDetailsPageFactory {

    String xpathNotificationLine = ".//*[@id='ng-app']//span[contains(text(),'%s')]";
    String xpathUserNameValue = ".//*[@id='ng-app']//span[contains(text(),'%s')]";
    String xpathReadState = "//div[@class='message unreadMessage ng-scope']";


    public UserDetailsPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage() throws Exception {
        Utilities.wait(10);
        return userDetailsTitleElement.isDisplayed();
    }

    public boolean checkUsernameEnglish() {
        return englishUserNameLabelElement.isDisplayed();
    }

    public boolean checkUsernameSpanish() {
        return spanishUserNameLabelElement.isDisplayed();
    }

    public boolean checkMessageEnglish() {
        return englishMessagesLabel.isDisplayed();
    }

    public boolean checkMessageLabelSpanish() {
        return spanishMessagesLabel.isDisplayed();
    }

    public boolean checkSpanishClearButton() {
        return spanishRadioElement.isDisplayed();
    }

    public boolean checkEnglishClearButton() {
        return englishRadioElement.isDisplayed();
    }

    public void clickSpanishButton() {
        getActionBot().click(spanishRadioElement);
    }

    public void clickEnglishhButton() {
        getActionBot().click(englishRadioElement);
    }

    public void clickCloseButton() {
        getActionBot().click(userDetailsCloseWindowButton);
    }

    public boolean checkUserNameValue(String currentUser) {
        return (getActionBot().findElement(String.format(xpathUserNameValue, currentUser)));
    }

    public void readNotification(){
        notification.click();
    }

    public void deleteNotifications(){
        deleteButton.click();
    }

    public boolean isRead(){
        try {
            notification.findElement(By.xpath(xpathReadState));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean isNotificationDisplayed(){
        try {
            return notification.isDisplayed();
        } catch (Exception e){
            return  false;
        }
    }

}
