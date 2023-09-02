package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;

public class HoverTest extends TestBase {
    HomePage HomeObject;

    HoverPage HoverPageObject;

    @Test(priority = 1)
    public void HoverTestavatarone() throws InterruptedException {

        HomeObject = new HomePage(driver);
        HomeObject.clickOnHoverLink();
        HoverPageObject = new HoverPage(driver);
        HoverPageObject.HoverAvatarOne();
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatarOneIsAppear).isDisplayed());
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatarOneViewProfilesAppear).isDisplayed());
    }


    @Test(priority = 2)
    public void HoverTestavatartwo() throws InterruptedException {


        HoverPageObject = new HoverPage(driver);
        HoverPageObject.HoverOnAvatartTwo();
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatartwoIsAppear).isDisplayed());
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatarTwoViewProfilesAppear).isDisplayed());
    }

    @Test(priority = 3)
    public void HoverTestavatarthree() throws InterruptedException {


        HoverPageObject = new HoverPage(driver);
        HoverPageObject.HoverOnAvatartThree();
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatarthreeIsAppear).isDisplayed());
        Assert.assertTrue(driver.findElement(HoverPageObject.SuccessMessageAvatarThreeViewProfilesAppear).isDisplayed());
    }


}
