package Tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.dynamicLoadingPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class dynamicLoadingTest extends TestBase {


    HomePage HomeObject;

    dynamicLoadingPage dynamicLoadingObject;


    @Test(priority = 1)
    public void dynamicLoadingTest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clikkOndynamicLoading();
        dynamicLoadingObject = new dynamicLoadingPage(driver);
        dynamicLoadingObject.ClikOnfirstElmntLinkExOne();

    }


    @Test(priority = 2)
    public void dynamicLoadingTest2() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clikkOndynamicLoading();
        dynamicLoadingObject = new dynamicLoadingPage(driver);
        dynamicLoadingObject.clickOnsecondElmentLinkExTwo();
        Assert.assertTrue(driver.findElement(dynamicLoadingObject.successmessageafterloadingfinish).isDisplayed());


    }


}
