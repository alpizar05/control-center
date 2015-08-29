package com.testsuites;

import com.training.PatronesPageObjectsPageFactory.Data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Automation on 05/07/2015.
 */
public class TestCaseBase {

    WebDriver driver = null;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        System.out.print("\nSE ESTA EJECUTANDO EL BEFORE SUITE");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        System.out.print("\n- SE ESTA EJECUTANDO EL BEFORE TEST");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.print("\n-- SE ESTA EJECUTANDO EL BEFORE CLASS");
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters({"url"})
    public void setUp(String url){
        System.out.print("\n--- SE ESTA EJECUTANDO EL BEFORE METHOD");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        System.out.print("\n--- SE ESTA EJECUTANDO EL AFTER METHOD");
        driver.close();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.print("\n-- SE ESTA EJECUTANDO EL AFTER CLASS");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.print("\n- SE ESTA EJECUTANDO EL AFTER TEST");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        System.out.print("\nSE ESTA EJECUTANDO EL AFTER SUITE");
    }
}
