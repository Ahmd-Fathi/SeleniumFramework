package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;

    }

    private By drobdown = By.id("dropdown");
    public By option1 = By.cssSelector("option[value=\"1\"]");
    public By option2 = By.cssSelector("option[value=\"2\"]");


    public void dropdownInteract() {
        Select dropdown = new Select(driver.findElement(drobdown));
        dropdown.selectByValue("2");

    }


}
