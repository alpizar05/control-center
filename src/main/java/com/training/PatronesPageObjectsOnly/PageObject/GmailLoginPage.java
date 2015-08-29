package com.training.PatronesPageObjectsOnly.PageObject;

import com.training.PatronesPageObjectsOnly.Utilidades.Utilidades;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Automation on 05/07/2015.
 */
public class GmailLoginPage extends PageBase {

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){
        WebElement emailElement = getDriver().findElement(By.id("Email"));
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void clickOnNext(){
        getDriver().findElement(By.id("next")).click();
    }

    public void enterPass(String password){
        WebElement pwdElement = getDriver().findElement(By.id("Passwd"));
        pwdElement.clear();
        pwdElement.sendKeys(password);
    }

    public GmailMainPage clickSignInButton(){
        getDriver().findElement(By.id("signIn")).click();
        getDriver().findElement(By.cssSelector(".gb_pa.gb_2")).click();
        getDriver().findElement(By.xpath("//span[text()='Gmail']")).click();
        WebElement cargando = getDriver().findElement(By.cssSelector(".msg"));
        Utilidades.waitForElementNotDisplayed(getDriver(), cargando);
        return new GmailMainPage(getDriver());
    }
}
