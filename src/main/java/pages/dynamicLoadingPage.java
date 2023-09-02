package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dynamicLoadingPage {
    WebDriver driver;

    public dynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }


    private By firstElmntLink = By.cssSelector("a[href=\"/dynamic_loading/1\"]");


    private By secondElmentLink = By.cssSelector("a[href=\"/dynamic_loading/2\"]");

    public By successmessageafterloadingfinish = By.cssSelector("div[id=\"finish\"] h4");

    public By loadingscreen = By.id("loading");

    private By StartBtn = By.xpath("/html/body/div[2]/div/div/div[1]/button");

    public void ClikOnfirstElmntLinkExOne() throws InterruptedException {
        driver.findElement(firstElmntLink).click();

        driver.findElement(StartBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingscreen)));

    }

    public void clickOnsecondElmentLinkExTwo() {
        driver.findElement(secondElmentLink).click();
        driver.findElement(StartBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(successmessageafterloadingfinish)));

    }


}
