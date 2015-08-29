package com.training.PatronesPageObjectsPageFactory.TestCase;

import com.training.PatronesPageObjectsPageFactory.Data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Automation on 05/07/2015.
 */
public class TestCaseBase {

    WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Data.URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
