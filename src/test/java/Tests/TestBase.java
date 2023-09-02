package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utility.helper;


import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeSuite
    public void startDriver() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterSuite
    public void quitDriver() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();

    }

    @AfterMethod
    public void screenShootOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Fail");
            System.out.println("Taking screenshot");
            // in this step im navigate to classe name here im name it helper 2
            // and for sure this will be changed in any project after
            // i navigate to class name i navigate to method inside class name
            helper.captureScreenshots(driver, result.getName());
        }

    }


}










