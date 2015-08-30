package com.FinalProject.TestCases;

import com.FinalProject.Data.PublicData;
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
        driver.get(PublicData.URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
