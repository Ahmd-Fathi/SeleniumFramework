package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class largDomPage {
    WebDriver driver;

    public largDomPage(WebDriver driver) {
        this.driver = driver;
    }


    private By AllLargTable = By.id("large-table");


    public void intractWithPageAndTable() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("scroll(0,3000)");


    }


}
