package come.yahya.tests.day09_explicit_wait_singleton_properties;

import come.yahya.utility.BrowserUtil;
import come.yahya.utility.TestBase;
import come.yahya.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

//        // Enter username
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        // Enter password
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        // Click login
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();


        WebOrderUtility.login(driver);

        BrowserUtil.waitFor(3);

        // Create a class called WebOrderUtility
        // Create a static void method called
        // login(username, password) accept 2 strings for usernamd and password
    }
}
