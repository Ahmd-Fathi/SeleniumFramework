package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertPage;

public class JavaScriptAlertTest extends TestBase {


    HomePage HomeObject;
    JavaScriptAlertPage JavaScriptAlertObject;

    @Test(priority = 1)
    public void Acceptalertstest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnalertsLink();
        JavaScriptAlertObject = new JavaScriptAlertPage(driver);
        JavaScriptAlertObject.interactwithalert();
        Assert.assertTrue(driver.findElement(JavaScriptAlertObject.msg).getText().contains("You successfully clicked an alert"));

    }

    @Test(priority = 2)
    public void disalertstest() throws InterruptedException {

        JavaScriptAlertObject = new JavaScriptAlertPage(driver);
        JavaScriptAlertObject.secondalertdismiss1();
        String msg = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        Assert.assertTrue(msg.contains("I am a JS Confirm"));
        System.out.println(msg);

        Thread.sleep(2000);
        JavaScriptAlertObject.cancelalert3();


    }

    @Test(priority = 3)
    public void alert3test() throws InterruptedException {
        JavaScriptAlertObject = new JavaScriptAlertPage(driver);
        Thread.sleep(3000);

        JavaScriptAlertObject.thirdALERTinteract("Ahmed");
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(JavaScriptAlertObject.resultForThirdAlert).getText().contains("Ahmed"));


    }


}
