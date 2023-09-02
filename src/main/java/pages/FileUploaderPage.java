package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    WebDriver driver;

    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By submitFileUploadBtn = By.id("file-submit");
    private By ChooseuploadFile = By.id("file-upload");

    public By msgAfterUploadFile = By.cssSelector("div[class=\"example\"] h3");


    public void ClickOnsubmitFileUploadBtn() throws InterruptedException {
        driver.findElement(submitFileUploadBtn).click();
    }


    public void chossefileBtn(String imagePath) throws InterruptedException {
        driver.findElement(ChooseuploadFile).sendKeys(imagePath);
    }


}
