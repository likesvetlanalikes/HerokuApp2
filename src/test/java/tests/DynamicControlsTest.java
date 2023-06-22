package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.BaseTest;

import static org.testng.AssertJUnit.assertEquals;


public class DynamicControlsTest extends BaseTest {
    @Test
    public void clickRemoveButtonTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox input[type='checkbox']"));
        checkbox.click();
        driver.findElement(By.cssSelector("#checkbox-example button[type='button']")).click();
    }

    @Test
    public void waitForTheMessageTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox input[type='checkbox']"));
        checkbox.click();
        driver.findElement(By.cssSelector("#checkbox-example button[type='button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("checkbox"), "It's gone"));
    }

    @Test
    public void checkboxNotPresentTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox input[type='checkbox']"));
        checkbox.click();
        driver.findElement(By.cssSelector("#checkbox-example button[type='button']")).click();
        boolean isCheckboxPresent = driver.findElements(By.id("checkbox")).size() > 0;
        Assert.assertFalse(isCheckboxPresent, "Checkbox is present on the page");

    }

    @Test
    public void inputEnableTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example button[type='button']"));
        enableButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("message"), "It's enabled!"));
        WebElement input = driver.findElement(By.cssSelector("#input-example input[type='text']"));
        boolean isInputEnabled = input.isEnabled();
        Assert.assertTrue(isInputEnabled, "Input is disabled on the page");
    }
}

