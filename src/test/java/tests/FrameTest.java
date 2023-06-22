package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class FrameTest extends BaseTest {
    @Test
    public void  iframeContentTest() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        WebDriver frame = driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        frame.findElement(By.xpath("//body[@id = 'tinymce']/p")).getText();
        WebElement p = driver.findElement(By.tagName("p"));
        String text = p.getText();
        Assert.assertEquals(text, "Your content goes here.", "Text is not equal to expected");
        driver.switchTo().defaultContent();
    }
}
