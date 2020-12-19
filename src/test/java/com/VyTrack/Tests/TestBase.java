package com.VyTrack.Tests;

import com.VyTrack.Utilities.ConfigurationReader;
import com.VyTrack.Utilities.Driver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));

    }
    //ITestResult class describes the result of a test in TestNG
    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {

        Thread.sleep(2000);
        Driver.closeDriver();

    }

}
