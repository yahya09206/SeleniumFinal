package come.yahya.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate 2 elements using xpath
        WebElement forgetPasswordHeader = driver.findElement(By.xpath("//div/h2[text()='Forgot Password']"));
        System.out.println("forgetPasswordHeader.getText() = " + forgetPasswordHeader.getText());

        WebElement emailBox = driver.findElement(By.xpath("//div/input[@name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        WebElement retrieveBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));
        retrieveBtn.click();

        // Save confirm message to variable //*[@id="content"]/h4
        WebElement confirmationMessage = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        System.out.println("confirmationMessage.getText() = " + confirmationMessage.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
