package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.WYSIWYGEditorPage;

public class WYSIWYGEditorTest extends TestBase {

    HomePage HomeObject;

    WYSIWYGEditorPage WYSIWYGEditorObject;


    @Test
    public void editorFramTest() throws InterruptedException {
        HomeObject = new HomePage(driver);
        HomeObject.clickOnWYSIWYGEditorlink();
        WYSIWYGEditorObject = new WYSIWYGEditorPage(driver);
        WYSIWYGEditorObject.switchToFramArea1();
        WYSIWYGEditorObject.clearTxtInTxtArea2();
        WYSIWYGEditorObject.writeTxt3();

    }


}
