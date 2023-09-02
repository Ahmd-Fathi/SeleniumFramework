package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploaderPage;
import pages.HomePage;

public class FileUploaderTest extends TestBase {
    String imagPath = "F:\\IdeaProjects\\seleniumFramework\\uploads\\tree-736885_1280.jpg";
    HomePage HomeObject;

    FileUploaderPage FileUploadeObject;


    @Test
    public void userShouldCanUploadFile() throws InterruptedException {

        HomeObject = new HomePage(driver);
        HomeObject.clickOnuploadFileLinkTxt();
        FileUploadeObject = new FileUploaderPage(driver);
        FileUploadeObject.chossefileBtn(imagPath);
        FileUploadeObject.ClickOnsubmitFileUploadBtn();
        Assert.assertTrue(driver.findElement(FileUploadeObject.msgAfterUploadFile).isDisplayed());

    }


}
