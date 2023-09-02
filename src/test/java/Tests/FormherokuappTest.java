package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormherokuappPage;

public class FormherokuappTest extends TestBase {
    String FirstName = "Ahmed";
    String LastName = "Fathi";

    String jobTitle = "QA automation engineer";
    String Date = "06011985";

    FormherokuappPage FormherokuappObject;

    @Test
    public void FillForm() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/form");
        FormherokuappObject = new FormherokuappPage(driver);
        FormherokuappObject.FillAllApplicationForm(FirstName, LastName, jobTitle, Date);
        Assert.assertTrue(driver.findElement(FormherokuappObject.SuccessMessageAfterFillForm).getText().contains(" The form was successfully submitted!"));

    }


}
