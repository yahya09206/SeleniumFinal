package come.yahya.tests.day09_explicit_wait_singleton_properties;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.time.Duration;

public class ExplicitWaitTest2 extends TestBase {

    // test to wait for interactive element
    @Test
    public void waitUntilElementInteractive(){

        // navigate to cydeo practice site
        driver.get("https://practice.cydeo.com/dynamic_controls");
        // elementToBeClickable(By locator)
        // elementToBeClickable(WebElement element)
        // An expectation for checking an element is visible and enabled such that you can click it

        // click on enable button and wait until the input = Box is enabled clickable
        driver.findElement(By.xpath("//button[.='Enable']")).click();
        // apply wait to webdriver
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        // waiting until element is visible
        wait.until(elementToBeClickable(By.cssSelector("form#input-example>input")));
    }
}
