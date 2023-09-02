package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.lang.ref.PhantomReference;

public class HorizontalSliderPage {

    WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }


    private By slide = By.cssSelector("input[type=\"range\"]");

    public By moveslide = By.id("range");


    public void moverslide() throws InterruptedException {
        driver.findElement(slide).sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT);


    }


}
