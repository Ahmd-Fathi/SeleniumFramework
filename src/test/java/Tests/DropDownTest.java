package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

public class DropDownTest extends TestBase {

    HomePage HomeObject;

    DropDownPage DropDownObject;


    @Test
    public void DropDownTest()
    {
        HomeObject=new HomePage(driver);
        HomeObject.clickOndropdownLink();
        DropDownObject=new DropDownPage(driver);
        DropDownObject.dropdownInteract();
        Assert.assertTrue(driver.findElement(DropDownObject.option2).isSelected());
        Assert.assertTrue(driver.findElement(DropDownObject.option1).isEnabled());
    }















}
