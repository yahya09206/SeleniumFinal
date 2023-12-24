package come.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementByTagName {
    public static void main(String[] args) {

        // Setup Chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Identify first element with tag name <a>
        WebElement firstLink = driver.findElement(By.tagName("a"));
        // Now lets get the text to find out
        System.out.println("firstLink.getText() = " + firstLink.getText());
    }
}
