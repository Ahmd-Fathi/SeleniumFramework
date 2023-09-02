package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By WYSIWYGEditorlink = By.cssSelector("a[href=\"/tinymce\"]");
    private By contextMenueLink = By.cssSelector("a[href=\"/context_menu\"]");
    private By uploadFileLink = By.cssSelector("a[href=\"/upload\"]");
    private By kyePressLink = By.cssSelector("a[href=\"/key_presses\"]");
    private By HoverLinkTxt = By.cssSelector("a[href=\"/hovers\"]");
    private By forgetPasswordLink = By.cssSelector("a[href=\"/forgot_password\"]");
    private By dropDownLink = By.cssSelector("a[href=\"/dropdown\"]");
    private By formAuthonticationLink = By.linkText("Form Authentication");
    private By preesBtn = By.linkText("Shifting Content");
    private By largDomLik = By.cssSelector("a[href=\"/large\"]");

    private By HorizonSlide = By.cssSelector("a[href=\"/horizontal_slider\"]");

    public void clickOnpreesBtn() {
        driver.findElement(preesBtn).click();
    }

    private By alerts = By.cssSelector("a[href=\"/javascript_alerts\"]");

    public void clickOnkyePressLink() {
        driver.findElement(kyePressLink).click();
    }

    public void ClickOnformAuthonticationLink() {


        driver.findElement(formAuthonticationLink).click();
    }

    public void clickOnuploadFileLinkTxt() {

        driver.findElement(uploadFileLink).click();
    }

    public void clickonlargDomLik() {
        driver.findElement(largDomLik).click();
    }

    private By dynamicLoading = By.cssSelector("a[href=\"/dynamic_loading\"]");

    public void clickOnWYSIWYGEditorlink() {

        driver.findElement(WYSIWYGEditorlink).click();
    }

    public void clickOndropdownLink() {
        driver.findElement(dropDownLink).click();
    }

    public void clickOnslideLink() {
        driver.findElement(HorizonSlide).click();

    }

    public void clickOnHoverLink() {
        driver.findElement(HoverLinkTxt).click();
    }

    public void clikOnforgetPasswordLink() {

        driver.findElement(forgetPasswordLink).click();
    }


    public void clikkOndynamicLoading() {
        driver.findElement(dynamicLoading).click();
    }

    public void clickOnalertsLink() {

        driver.findElement(alerts).click();
    }


    public void clickOncontextMenueLink() {

        driver.findElement(contextMenueLink).click();
    }


}
