package come.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAttribute {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://practice.cydeo.com/");

        // Get the first link on the page and get href attribute
//        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
//        // Get any attribute of identified element, in this case the href
//        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));
//
//        // Get text practice
//        System.out.println("firstLink.getText() = " + firstLink.getText());

        // Navigate to google.com and identify the searchbox and get couple of attributes value
        driver.navigate().to("https://google.com");
        WebElement searchBox = driver.findElement(By.id("input"));
        searchBox.sendKeys("Selenium");

        // Get the class Atrribute
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));
        // maxLength
        System.out.println("searchBox.getAttribute(\"maxLength\") = " + searchBox.getAttribute("maxLength"));
        // title
        // autocapitalize
        // spellcheck
        // role

        Thread.sleep(3000);
        driver.quit();
    }
}
