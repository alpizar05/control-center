package com.FinalProject.Utilities;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Automation on 05/07/2015.
 */
public class Utilities {

    public static boolean waitForElementDisplayed(WebDriver driver, final WebElement element) {
        boolean isElementEnabled = true;
        if (element != null) {
            try {
                (new WebDriverWait(driver, 30))
                        .until(new ExpectedCondition<Object>() {
                            public Boolean apply(WebDriver d) {
                                return element.isDisplayed();
                            }
                        });
            } catch (TimeoutException te) {
                isElementEnabled = false;
            }
        } else {
            isElementEnabled = false;
        }
        return isElementEnabled;
    }

    public static boolean waitForElementNotDisplayed(WebDriver driver, final WebElement element) {
        boolean isElementEnabled = true;
        if (element != null) {
            try {
                (new WebDriverWait(driver, 30))
                        .until(new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver d) {
                                return !element.isDisplayed();
                            }
                        });
            } catch (TimeoutException te) {
                isElementEnabled = false;
            }
        } else {
            isElementEnabled = false;
        }
        return isElementEnabled;
    }

    public static void wait(int secsToWait) throws Exception {


        for (int second = 0; ; second++) {
            if ((second > secsToWait)) {
                break;
            }
            Thread.sleep(1000);
        }

    }
}
