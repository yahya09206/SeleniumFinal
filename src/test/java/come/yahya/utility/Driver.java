package come.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * We want to have a class that only returns single object
 * no matter how many times we ask for object
 * so we are creating this class with the technique we learned from Singleton pattern
 */
public class Driver {

    private static WebDriver obj;
    private Driver(){}

    /**
     * Return obj with only one WebDriver instance
     * @return same WebDriver if it exists, new one if null
     */

    public static WebDriver getDriver(){

        if(obj == null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            // System.out.println("One and only created for the first time");
            return obj;
        }else {
            //System.out.println("You have it, just use existing one");
            return obj;
        }
    }

    public static void closeBrowser(){

        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
        // if not null
            // quit the browser
            // make it null, because once you quit it can not be used again
        if (obj != null){
            obj.quit();
            // so when you ask for it again it won't be a brand new driver
            obj = null;
        }
    }
}
