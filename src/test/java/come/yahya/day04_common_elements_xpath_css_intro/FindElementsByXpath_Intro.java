package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByXpath_Intro {
    public static void main(String[] args) throws InterruptedException {

        // Inspect element --> right click --> copy --> copy full xpath
        //

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        Thread.sleep(3000);
        driver.quit();

    }
}
