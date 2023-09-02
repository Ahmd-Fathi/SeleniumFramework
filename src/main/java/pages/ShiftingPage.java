package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingPage {
    WebDriver driver;

    public ShiftingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstChosseExample = By.linkText("Example 1: Menu Element");

    private By tagNameElment = By.tagName("li");


    public void numberOfTagName() {
        List<WebElement> links = driver.findElements(tagNameElment);
        System.out.println(links.size());

    }


    public void clickOnfirstChosseExample() {

        driver.findElement(firstChosseExample).click();
    }


}
