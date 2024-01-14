package come.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtil {

    // try catch for timing
    public static void waitFor(int seconds){

        // Multiply by 1000 to get seconds
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            // print out error
            e.printStackTrace();
        }
    }

    /**
     * WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
     *         try {
     *             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//span[.='Invalid Login or Password.']\"")));
     *         }catch(TimeoutException e){
     *             e.printStackTrace();
     *         }
     */
    /**
     * This method will check for visiblity of element within the time given
     * @param locator By.id or By.xpath or By.whatever
     * @param timeToWait time to wait
     * @return true if the element is found within the time and visible, false if not
     */
    public static boolean checkvisbilityOfElement(By locator, int timeToWait){

        boolean result = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWait));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch(TimeoutException e){
            System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT");
        }

        return result;
    }
}
