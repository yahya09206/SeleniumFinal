package come.yahya.utility;

import org.openqa.selenium.By;

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
     * @param seconds time to wait
     * @return true if the element is found within the time and visible, false if not
     */
    public static boolean checkvisbilityOfElement(By locator, int seconds){

    }
}
