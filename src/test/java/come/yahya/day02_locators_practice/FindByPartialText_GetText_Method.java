package come.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetText_Method {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        // Identify the link with text "Disappearing Elements"
        // Using partial link text then get the full text out using new method getText
        WebElement myLnk = driver.findElement(By.partialLinkText("Disappearing"));
        System.out.println("myLnk.getText() = " + myLnk.getText());

        // What if I just provide partial link as letter A
        WebElement aLink = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
