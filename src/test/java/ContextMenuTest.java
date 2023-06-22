
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

        @Test
            public void checkRightButtonClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
                Actions actions = new Actions(driver);
                actions.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();

    }
}
