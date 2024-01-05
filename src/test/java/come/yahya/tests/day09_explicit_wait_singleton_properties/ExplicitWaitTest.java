package come.yahya.tests.day09_explicit_wait_singleton_properties;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest extends TestBase {


    @Test
    public void testWaitForTitle(){
        // 1. Navigate to https://practice.cydeo.com/dynamic_loading
        driver.get("https://practice.cydeo.com/dynamic_loading");
        // 2. Click on example 7
        driver.findElement(By.partialLinkText("Example 7")).click();
        // 3. The title will show loading... until certain time,
        // we want to wait until the title value becomes "Dynamic Title"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        // Then we use until method that accepts expected conditions
    }
}
