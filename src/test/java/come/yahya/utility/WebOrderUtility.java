package come.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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
        driverParam.findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtOrderPage(WebDriver driverParam){

        boolean result = false;

        // locator for the header element of all order page
        // //h2[normalize-space(.)='List of All Orders']
        try{
            WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            System.out.println("ELEMENT WAS IDENTIFIED");
            result = true;
        }catch (NoSuchElementException e){
            System.out.println("NO Such element! you are not on the right page");
        }

        return result;
    }
}
