package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class contextMenuePage {
    WebDriver driver;

    public contextMenuePage(WebDriver driver) {
        this.driver = driver;
    }


    private By box = By.id("hot-spot");


    public void IntraActWithBoxAndAlert1() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(box)).contextClick().build().perform();


    }


    public void IntraActWithBoxAcceptAlert3() throws InterruptedException {

        driver.switchTo().alert().accept();


    }


}
