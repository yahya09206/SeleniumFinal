package come.yahya.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate 2 elements using css selector
        // input[name='email']
        // form#forgot_password input[name='email']
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

    }
}
