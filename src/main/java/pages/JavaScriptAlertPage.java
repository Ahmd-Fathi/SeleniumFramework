package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JavaScriptAlertPage {
    WebDriver driver;

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;

    }

    public By resultForThirdAlert = By.id("result");
    private By clickOnFirstAlert = By.cssSelector("button[onclick=\"jsAlert()\"]");

    public By msg = By.id("result");

    private By secondAlertdisBtn = By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");

    private By thirdAlertBtn = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");


    public void interactwithalert() throws InterruptedException {
        driver.findElement(clickOnFirstAlert).click();

        driver.switchTo().alert().accept();

    }


    public void secondalertdismiss1() throws InterruptedException {

        driver.findElement(secondAlertdisBtn).click();
        ;

    }


    public void cancelalert3() throws InterruptedException {
        driver.switchTo().alert().dismiss();

    }


    public void thirdALERTinteract(String texthere) {

        driver.findElement(thirdAlertBtn).click();
        driver.switchTo().alert().sendKeys(texthere);
        driver.switchTo().alert().accept();


    }


}
