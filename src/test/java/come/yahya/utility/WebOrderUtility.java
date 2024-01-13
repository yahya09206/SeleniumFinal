package come.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// This isn't a test class so we can't extend testbase
// It simply doesn't make sense
public class WebOrderUtility {

    public static void login(WebDriver driverParam){

        // WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // Enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // Click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driverParam, String username, String password){

        // Enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // Enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // Click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void logout(WebDriver driverParam){

        driverParam.findElement(By.id("ctl100_logout")).click();
    }
}
