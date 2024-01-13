package come.yahya.tests.day09_explicit_wait_singleton_properties;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        // Enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // Enter password
        // Click login
    }
}
