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
    public static boolean checkvisbilityOfElement(By locator, int seconds){

    }
}
