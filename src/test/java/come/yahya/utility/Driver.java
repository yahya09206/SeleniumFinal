package come.yahya.utility;

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

    public static WebDriver getDriver(){

        if(obj == null){
            obj = new ChromeDriver();
            System.out.println("One and only created for the first time");
            return obj;
        }else {
            System.out.println("You have it, just use existing one");
            return obj;
        }
    }
}
