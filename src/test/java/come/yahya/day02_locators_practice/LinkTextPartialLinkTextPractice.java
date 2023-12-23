package come.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/");

        // Click on first link "A/B Testing"
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        firstLink.click();
        // Navigate back to home page
        driver.navigate().back();
        // Maximize page
        driver.manage().window().maximize();
        // Click on second link
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        // Click on "Home" link to go back to home
        driver.findElement(By.linkText("Home")).click();
        // Click on "Redirect Link"
        driver.findElement(By.linkText("Redirect Link"));

        // Temporary sleep
        Thread.sleep(5000);
        driver.quit();
    }
}
