package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends TestBase {

    HomePage HomeObject;

    HorizontalSliderPage HorizontalSliderObject;

    @Test
    public void slideTest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnslideLink();
        HorizontalSliderObject = new HorizontalSliderPage(driver);
        HorizontalSliderObject.moverslide();
        Assert.assertTrue(driver.findElement(HorizontalSliderObject.moveslide).getText().contains("3.5"));


    }


}
