package come.yahya.tests.day06_junit_practice_utility_methods;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();

        Thread.sleep(3000);
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm = " + itsGoneElm);
    }
}
