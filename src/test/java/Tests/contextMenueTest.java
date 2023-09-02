package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.contextMenuePage;

public class contextMenueTest extends TestBase {

    HomePage HomeObject;
    contextMenuePage contextMenueObject;

    @Test

    public void usercanInterActContextMenu() throws InterruptedException {

        HomeObject = new HomePage(driver);
        HomeObject.clickOncontextMenueLink();
        contextMenueObject = new contextMenuePage(driver);
        contextMenueObject.IntraActWithBoxAndAlert1();
        String MSG = driver.switchTo().alert().getText();
        Assert.assertTrue(MSG.contains("You selected a context menu"));
        contextMenueObject.IntraActWithBoxAcceptAlert3();


    }


}
