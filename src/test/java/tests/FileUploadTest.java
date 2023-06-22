package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import java.io.File;
import static org.testng.AssertJUnit.assertEquals;


public class FileUploadTest extends BaseTest {

    @Test
    public void verificationOfTheMachingNamesInTheFilesUploadedTest() {
        driver.get("http://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/owl.jpg");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class = 'example']/h3")).getText(),"File Uploaded!", "true");
    }}

