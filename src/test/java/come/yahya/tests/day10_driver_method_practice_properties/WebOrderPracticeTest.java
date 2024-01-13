package come.yahya.tests.day10_driver_method_practice_properties;

import come.yahya.utility.BrowserUtil;
import come.yahya.utility.Driver;
import come.yahya.utility.TestBase;
import come.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderapp();
        // Assert the page title as Web Orders Login to ensure you are at the login page
        // Driver.getDriver().getTitle();
        Assertions.assertEquals("Web Orders Login", driver.getTitle());

        WebOrderUtil.login("Tester", "test");

        BrowserUtil.waitFor(3);
    }

    @Test
    public void testInvalidCredentials(){
        WebOrderUtil.openWebOrderapp();
        WebOrderUtil.login("ebc", "efg");

        // locate the error message element
        // with text "Invalid Login or Password." id ct100_MainContent_status
        // span[@id='ct100_MainContent_status']
        WebElement errormsg = driver.findElement(By.xpath("//span[.='Invalid Login or Password.']"));
        assertTrue(errormsg.isDisplayed());
    }
}
