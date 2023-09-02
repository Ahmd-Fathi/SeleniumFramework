package Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeyPressesPage;

public class KeyPressesPageTest extends TestBase {
    String Text = "A";
    HomePage HomeObject;

    KeyPressesPage KeyPressesobject;

    @Test(priority = 1)

    public void kyepressTest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnkyePressLink();
        KeyPressesobject = new KeyPressesPage(driver);
        KeyPressesobject.interactWithkyepree(Text + Keys.BACK_SPACE);
        Assert.assertTrue(driver.findElement(KeyPressesobject.ResultAfterTyping).getText().contains("You entered: BACK_SPACE"));

        driver.close();
    }


    @Test(priority = 2)
    public void keypressmultiplepressbuttoninkeyboard() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnkyePressLink();
        KeyPressesobject = new KeyPressesPage(driver);
        KeyPressesobject.holdmultubailebtninsametimetospecialcharacter();


    }


}
