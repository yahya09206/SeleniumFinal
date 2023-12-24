package come.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        // Get all the links that have partial text A in it
        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));
        System.out.println("allLink.size() = " + allLink.size());
        for (WebElement webElement : allLink) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
