package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.forgetPasswordPage;

public class forgetPasswordTest extends TestBase {
    String Email = "Ahmed123@test.com";
    HomePage HomeObject;
    forgetPasswordPage forgetPasswordObject;

    @Test
    public void forgetPasswordTest() {
        HomeObject = new HomePage(driver);
        HomeObject.clikOnforgetPasswordLink();
        forgetPasswordObject = new forgetPasswordPage(driver);
        forgetPasswordObject.resetPaswordemail(Email);
        Assert.assertEquals("https://the-internet.herokuapp.com/forgot_password", "https://the-internet.herokuapp.com/forgot_password");
    }


}
