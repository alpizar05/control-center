package com.training.TestNG.TestCase;

import com.training.TestNG.PageObject.TestPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Automation on 05/07/2015.
 */
public class SuiteEjemplos02 extends TestCaseBase {

    @Test(groups = {"smoke"})
    @Parameters({"nombre", "apellido", "cedula"})
    public void test01(String nombre, String apellido, String cedula){

        System.out.print("\n---- SE ESTA EJECUTANDO EL TEST 04");
        TestPage testPage = PageFactory.initElements(driver, TestPage.class);
        testPage.moveToFrame();
        testPage.fillFields(nombre, apellido, cedula);
        testPage.clickOnButton();
        testPage.closeAlert();

    }

    @Test
    @Parameters({"nombre", "apellido", "cedula"})
    public void test02(String nombre, String apellido, String cedula){

        System.out.print("\n---- SE ESTA EJECUTANDO EL TEST 05");
        TestPage testPage = PageFactory.initElements(driver, TestPage.class);
        testPage.moveToFrame();
        testPage.fillFields(nombre, apellido, cedula);
        testPage.clickOnButton();
        testPage.closeAlert();

    }

    @Test
    @Parameters({"nombre", "apellido", "cedula"})
    public void test03(String nombre, String apellido, String cedula){

        System.out.print("\n---- SE ESTA EJECUTANDO EL TEST 06");
        TestPage testPage = PageFactory.initElements(driver, TestPage.class);
        testPage.moveToFrame();
        testPage.fillFields(nombre, apellido, cedula);
        testPage.clickOnButton();
        testPage.closeAlert();

    }
}
