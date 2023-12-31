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
        driver.navigate().to("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Get the class Atrribute
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));
        // maxLength
        System.out.println("searchBox.getAttribute(\"maxLength\") = " + searchBox.getAttribute("maxLength"));
        // title
        System.out.println("searchBox.getAttribute(\"role\") = " + searchBox.getAttribute("role"));
        // autocapitalize
        System.out.println("searchBox.getAttribute(\"autocapitalize\") = " + searchBox.getAttribute("autocapitalize"));
        // spellcheck
        System.out.println("searchBox.getAttribute(\"spellcheck\") = " + searchBox.getAttribute("spellcheck"));
        // role
        System.out.println("searchBox.getAttribute(\"role\") = " + searchBox.getAttribute("role"));
        // Using value attribute of input text box to extract the text inside
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));


        Thread.sleep(3000);
        driver.quit();
    }
}
