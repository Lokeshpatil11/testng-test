package com.example.tests;

import org.testng.annotations.Test;

public class YourTests {

    @Test(groups = {"default"})
    public void defaultTest() {
        System.out.println("Running default test");
        // Add your test code here
    }

    @Test(groups = {"smoke"})
    public void smokeTest() {
        System.out.println("Running smoke test");
        // Add your smoke test code here
    }

    @Test(groups = {"regression"})
    public void regressionTest() {
        System.out.println("Running regression test");
        // Add your regression test code here
    }
}
