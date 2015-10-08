package com.FinalProject.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestCaseBase {

    public static WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"cc_url", "implicit_time_out"})
    public void setUp(String ccUrl, String implicitTimeout) {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicitTimeout), TimeUnit.SECONDS);
        driver.get(ccUrl);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
