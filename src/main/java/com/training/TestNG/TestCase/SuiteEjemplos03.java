package com.training.TestNG.TestCase;

import com.training.TestNG.PageObject.TestPage;
import com.training.TestNG.Utilidades.DataProviderUtility;
import jxl.read.biff.BiffException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Automation on 05/07/2015.
 */
public class SuiteEjemplos03 extends TestCaseBase {

    @DataProvider(name = "dataProviderEjemplo")
    public static Object[][] dataProviderEjemplo() {
        return new Object[][] {
                {"Oscar01", "valerio01", "123456789"},
                {"Oscar04", "valerio04", "123456789"}
        };
    }

    @Test(dataProvider = "dataProviderEjemplo")
    public void test01(String nombre, String apellido, String cedula){

        System.out.print("\n---- SE ESTA EJECUTANDO EL TEST 01");
        TestPage testPage = PageFactory.initElements(driver, TestPage.class);
        testPage.moveToFrame();
        testPage.fillFields(nombre, apellido, cedula);
        testPage.clickOnButton();
        testPage.closeAlert();

    }

    @DataProvider(name = "dataProviderEjemploXLS")
    //@Parameters({"xlsfile"})
    public static Object[][] dataProviderEjemploXLS() throws IOException, BiffException {
        return new DataProviderUtility("src/main/resources/ExcelFiles/testXLS.xls").getData();
    }

    @Test(groups = {"data_provider_xls"}, dataProvider = "dataProviderEjemploXLS")
    public void test02(String nombre, String apellido, String cedula){

        System.out.print("\n---- SE ESTA EJECUTANDO EL TEST 01");
        TestPage testPage = PageFactory.initElements(driver, TestPage.class);
        testPage.moveToFrame();
        testPage.fillFields(nombre, apellido, cedula);
        testPage.clickOnButton();
        testPage.closeAlert();

    }
}