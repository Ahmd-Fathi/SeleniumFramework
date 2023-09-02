package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgetPasswordPage {

    WebDriver driver;
    public forgetPasswordPage (WebDriver driver)
    {
        this.driver=driver;

    }



private By emailTxtBox=By.id("email");


private By resetPassword= By.cssSelector("i[class=\"icon-2x icon-signin\"]");





public  void  resetPaswordemail(String email )
{

    driver.findElement(emailTxtBox).sendKeys(email);
    driver.findElement(resetPassword).click();

}






}
