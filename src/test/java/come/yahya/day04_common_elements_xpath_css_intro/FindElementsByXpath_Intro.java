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

        // Using relative path
        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        // Providing attributes in xpath
        // elementTag[@attributeName='attribute value']
        // if you have more than one
        // elementTag[@attributeName='attribute value' and @attribute2Name='attribute2 value']
        // you have option to provide index
        // //someElement[indexGoesHere]
        // /html/body/div/div[2]/div/form/span[1]
        // //*[@id="checkboxes"]/span[1]
        // //*[@id="box1"]
        // Click on checkboxes link to go to checkbox page using xpath
        driver.findElement(By.xpath("//li/a[text()='Checkboxes']")).click();
        // Identify header, 1st checkbox using xpath
        WebElement header = driver.findElement(By.xpath("//h2[text()='Checkboxes']"));
        System.out.println("header.getText() = " + header.getText());

        WebElement firstCheckbox = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("firstCheckbox.isSelected() = " + firstCheckbox.isSelected());

        Thread.sleep(3000);
        driver.quit();

    }
}
