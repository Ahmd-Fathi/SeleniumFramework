package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {

    WebDriver driver;

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }


    private By AlltextAreaInFram = By.id("mce_0_ifr");

    private By txtInTextArea = By.id("tinymce");


    public void switchToFramArea1() {
        driver.switchTo().frame(driver.findElement(AlltextAreaInFram));


    }


    public void clearTxtInTxtArea2() throws InterruptedException {
        driver.findElement(txtInTextArea).clear();

    }

    public void writeTxt3() throws InterruptedException {

        driver.findElement(txtInTextArea).sendKeys("Hello World");

    }


}
