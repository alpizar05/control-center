package com.framework.TareaTestNG;

import com.testsuites.TestCaseBase;
import org.testng.annotations.Test;

/**
 * Created by Automation on 31/07/2015.
 */
@Test(groups = "applications")
public class SuiteTareaTestNG01 extends TestCaseBase {

    @Test(groups = {"partial_regression", "full_smoke", "basic_smoke"})
    public void test01() {
        System.out.print("test01()");
    }

    @Test
    public void test02() {
        System.out.print("test02()");
    }

    @Test(groups = {"partial_regression"})
    public void test03() {
        System.out.print("test03()");
    }

    @Test(groups = {"full_smoke"})
    public void test04() {
        System.out.print("test04()");
    }

    @Test(groups = {"partial_regression"})
    public void test05() {
        System.out.print("test05()");
    }

    @Test
    public void test06() {
        System.out.print("test07()");
    }

    @Test(groups = {"partial_regression", "full_smoke", "basic_smoke"})
    public void test07() {
        System.out.print("test07()");
    }

    @Test
    public void test08() {
        System.out.print("test08()");
    }

    @Test(groups = {"partial_regression"})
    public void test09() {
        System.out.print("test09()");
    }

    @Test(groups = {"full_smoke"})
    public void test10() {
        System.out.print("test10()");
    }
}
