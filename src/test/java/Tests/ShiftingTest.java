package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShiftingPage;

public class ShiftingTest extends TestBase {

    HomePage HomeObject;
    ShiftingPage ShiftingObject;


    @Test
    public void shiftingTest() {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnpreesBtn();
        ShiftingObject = new ShiftingPage(driver);
        ShiftingObject.clickOnfirstChosseExample();
        ShiftingObject.numberOfTagName();
    }


}
