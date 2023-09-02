package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private By userNameTxtBox = By.id("username");

    private By passwordTxtBox = By.id("password");
    private By loginBtn = By.cssSelector("button[class=\"radius\"]");

    public By SuccessMessageAfterLogin = By.id("flash");


    public void setUserName(String userName) {
        driver.findElement(userNameTxtBox).sendKeys(userName);
    }


    public void setPassword(String password) {
        driver.findElement(passwordTxtBox).sendKeys(password);
    }

    public void ClickOnLoginBtn() {
        driver.findElement(loginBtn).click();
    }


}
