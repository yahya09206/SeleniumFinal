package come.yahya.tests.day06_junit_practice_utility_methods;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {

    @Test
    public void testJavaScriptAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        // Alert interface from Selenium is used to deal with alerts
        // Your driver object can switchTo the alert and take action on it
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        // Driver first needs to switch to the alert box since it's not part of html
        // using switchTo() method followed by alert() method
        // .alert() method returns a type Alert from Selenium
        // and it has 4 methods
            // accept() --> click on ok button
            // dismiss() --> click on cancel button
            // sendKeys(yourText) --> enter text into prompt
        driver.switchTo().alert().accept();

    }
}
