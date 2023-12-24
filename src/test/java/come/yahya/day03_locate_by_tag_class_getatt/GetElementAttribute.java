package come.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        // Get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        // Get any attribute of identified element, in this case the href
        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        // Get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
