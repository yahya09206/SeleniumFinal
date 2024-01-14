package come.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtil {

    /**
     * Simply navigate to WebOrderApp
     */
    public static void openWebOrderapp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    public static void login(){

        // WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // Enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // Click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(String username, String password){

        // WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // Enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // Click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static boolean loginErrorMsgVisible(){

        boolean elementFound = BrowserUtil.checkvisbilityOfElement(By.xpath
                ("//span[.='Invalid Login or Password.']"), 2);
        return elementFound;
    }


}
