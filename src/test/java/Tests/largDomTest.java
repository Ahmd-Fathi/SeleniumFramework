package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.largDomPage;

public class largDomTest extends TestBase {

    HomePage HomeObject;

    largDomPage largDomObject;


    @Test
    public void largdomTest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickonlargDomLik();
        largDomObject = new largDomPage(driver);
        largDomObject.intractWithPageAndTable();


    }


}
