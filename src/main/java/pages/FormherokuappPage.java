package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormherokuappPage {
    WebDriver driver;

    public FormherokuappPage(WebDriver driver) {
        this.driver = driver;
    }

    public By SuccessMessageAfterFillForm = By.cssSelector("div[class=\"alert alert-success\"]");
    private By firstNameTxtBox = By.id("first-name");

    private By lastNameTxtBox = By.id("last-name");
    private By jobTitleTxtBox = By.id("job-title");
    private By RadioBtnCollege = By.id("radio-button-2");
    private By Gender = By.id("checkbox-1");

    private By dropdownYearOfEx = By.id("select-menu");
    private By Date = By.id("datepicker");

    private By submitBtn = By.cssSelector("a[class=\"btn btn-lg btn-primary\"]");


    public void FillAllApplicationForm(String FirstName, String lastName, String jobTitle, String date) throws InterruptedException {

        driver.findElement(firstNameTxtBox).sendKeys(FirstName);
        driver.findElement(lastNameTxtBox).sendKeys(lastName);

        driver.findElement(jobTitleTxtBox).sendKeys(jobTitle);

        driver.findElement(RadioBtnCollege).click();

        driver.findElement(Gender).click();

        Select select = new Select(driver.findElement(dropdownYearOfEx));

        select.selectByIndex(3);
        driver.findElement(Date).clear();
        driver.findElement(Date).sendKeys();
        Thread.sleep(1000);


        driver.findElement(submitBtn).click();


    }


}
