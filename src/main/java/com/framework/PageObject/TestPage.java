package com.framework.PageObject;

import com.framework.PageFactory.TestPageFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Automation on 19/07/2015.
 */
public class TestPage extends TestPageFactory {
    public TestPage(WebDriver driver) {
        super(driver);
    }

    public void moveToFrame(){
        getDriver().switchTo().frame(iframeResult);
    }

    public void fillFields(String nombreValor, String apellidoValor, String cedulaValor){
        nombre.clear();
        nombre.sendKeys(nombreValor);
        apellido.clear();
        apellido.sendKeys(apellidoValor);
        cedula.clear();
        cedula.sendKeys(cedulaValor);
    }

    public void clickOnButton(){
        btnClickMe.click();
    }

    public void closeAlert(){
        getDriver().switchTo().alert().accept();
        getDriver().switchTo().defaultContent();

    }
}
