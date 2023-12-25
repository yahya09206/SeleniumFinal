package come.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetElementByTagName {
    public static void main(String[] args) throws InterruptedException {

        // Setup Chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        // Identify first element with tag name <a>
        WebElement firstLink = driver.findElement(By.tagName("a"));
        // Now lets get the text to find out
        System.out.println("firstLink.getText() = " + firstLink.getText());

        // Get all elements with the "a" tag
        List<WebElement> allATags = driver.findElements(By.tagName("a"));
        System.out.println("allATags.size() = " + allATags.size());

        // Iterate thru list and print them out
        for (WebElement eachATagElement : allATags) {
            System.out.println("eachATagElement.getText() = " + eachATagElement.getText());
        }

        // Quit after 3 seconds
        Thread.sleep(3000);
        driver.quit();
    }
}
