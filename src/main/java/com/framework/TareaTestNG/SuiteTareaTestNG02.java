package com.framework.TareaTestNG;

import com.testsuites.TestCaseBase;
import org.testng.annotations.Test;

/**
 * Created by Automation on 31/07/2015.
 */
@Test(groups = "users")
public class SuiteTareaTestNG02 extends TestCaseBase {

    @Test(groups = {"full_smoke", "users"})
    public void test011() {
        System.out.print("test011()");
    }

    @Test(groups = {"partial_regression"})
    public void test012() {
        System.out.print("test012()");
    }

    @Test
    public void test013() {
        System.out.print("test013()");
    }

    @Test(groups = {"partial_regression", "full_smoke", "basic_smoke"})
    public void test014() {
        System.out.print("test014()");
    }

    @Test
    public void test015() {
        System.out.print("test015()");
    }

    @Test(groups = {"partial_regression"})
    public void test016() {
        System.out.print("test017()");
    }

    @Test(groups = {"full_smoke"})
    public void test017() {
        System.out.print("test017()");
    }

    @Test(groups = {"partial_regression"})
    public void test018() {
        System.out.print("test018()");
    }

    @Test
    public void test019() {
        System.out.print("test019()");
    }

    @Test(groups = {"partial_regression", "full_smoke", "basic_smoke"})
    public void test20() {
        System.out.print("test20()");
    }
}
