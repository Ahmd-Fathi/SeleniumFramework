package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
    HomePage HomeObject;
    LoginPage LoginObject;

    String userName = "tomsmith";
    String password = "SuperSecretPassword!";

    @Test
    public void testSuccessfulLogin() {
        HomeObject = new HomePage(driver);
        HomeObject.ClickOnformAuthonticationLink();
        LoginObject = new LoginPage(driver);
        LoginObject.setUserName(userName);
        LoginObject.setPassword(password);
        LoginObject.ClickOnLoginBtn();
        Assert.assertTrue(driver.findElement(LoginObject.SuccessMessageAfterLogin).getText().contains("You logged into a secure area!\n"), "sorry there is a mistake");


    }


}
