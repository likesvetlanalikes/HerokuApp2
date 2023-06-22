package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.BaseTest;

import java.io.File;

public class FileDownloaderTest extends BaseTest {

    @Test
    public void  verifyDownloadingFileTest() {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement downloadLink = driver.findElement(By.linkText("Screenshot (3).png"));
        downloadLink.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = new File("E:\\MY\\QA\\JAVA\\HerokuApp2\\src\\test\\resources\\Screenshot (3).png");
        Assert.assertTrue(file.exists(), "File not downloaded");

    }
}
