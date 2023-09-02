package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userAvatarone = By.xpath("/html/body/div[2]/div/div/div[1]/img");
    public By SuccessMessageAvatarOneIsAppear = By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5");
    public By SuccessMessageAvatarOneViewProfilesAppear = By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
    private By userAvatarTwo = By.xpath("//*[@id=\"content\"]/div/div[2]/img");
    private By userAvatarThree = By.xpath("//*[@id=\"content\"]/div/div[3]/img");

    public By SuccessMessageAvatartwoIsAppear = By.xpath("/html/body/div[2]/div/div/div[2]/div/h5");

    public By SuccessMessageAvatarTwoViewProfilesAppear = By.xpath("/html/body/div[2]/div/div/div[2]/div/a");
    public By SuccessMessageAvatarthreeIsAppear = By.xpath("/html/body/div[2]/div/div/div[3]/div/h5");

    public By SuccessMessageAvatarThreeViewProfilesAppear = By.xpath("/html/body/div[2]/div/div/div[3]/div/a");


    public void HoverAvatarOne() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(userAvatarone)).build().perform();
        Thread.sleep(2000);

    }


    public void HoverOnAvatartTwo() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(userAvatarTwo)).build().perform();

    }

    public void HoverOnAvatartThree() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(userAvatarThree)).build().perform();

    }


}
