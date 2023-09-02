package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;

    }


    private By kyepressTxtBox = By.id("target");

    public By ResultAfterTyping = By.id("result");


    public void interactWithkyepree(String text) throws InterruptedException {

        driver.findElement(kyepressTxtBox).sendKeys(text + Keys.chord(Keys.SHIFT), "2");


    }


    public void holdmultubailebtninsametimetospecialcharacter() throws InterruptedException {

        driver.findElement(kyepressTxtBox).sendKeys(Keys.chord(Keys.SHIFT, "2"));

    }


}
