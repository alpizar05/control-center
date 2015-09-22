package com.FinalProject.PageObject;


import com.FinalProject.PageFactory.LoginPageFactory;
import org.openqa.selenium.WebDriver;


/**
 * Created by Automation on 30/08/2015.
 */
public class LoginPageObject extends LoginPageFactory {

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean checkPage() {
        return mainLogoElement.isDisplayed();
    }

    public void enterUser(String user) {
        getActionBot().sendKeys(userFieldElement, user);
    }

    public void enterPassword(String pwd) {
        getActionBot().sendKeys(pwdFieldElement, pwd);
    }

    public TopMainMenuPageObject clickOnLogIn() {
        return (TopMainMenuPageObject) navigateToNextPage(logInButtonElement, TopMainMenuPageObject.class);
    }


}
