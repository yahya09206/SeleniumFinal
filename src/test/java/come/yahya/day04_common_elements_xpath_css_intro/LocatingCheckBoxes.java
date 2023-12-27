package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        // Checkboxes can be checked and unchecked
        // That's the only attribute special about the element
        // We can use additional method called isSelected() to determine if it's checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        // Identify first checkbox and check if it is selected
        WebElement checkBox = driver.findElement(By.id("box1"));
        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());
        System.out.println("checkBox.getAttribute(\"checked\") = " + checkBox.getAttribute("checked"));

        // Identify second checkbox and check if it is selected
        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        System.out.println("checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));

        // Click first checkbox
        checkBox.click();
        // Click second checkbox
        checkBox2.click();

        // Check if each one is clicked already or not
        if (!checkBox.isSelected()){
            checkBox.click();
        } else {
            System.out.println("Take it easy, box is already selected");
        }

        if (!checkBox2.isSelected()){
            checkBox2.click();
        } else {
            System.out.println("Take it easy, box is already selected");
        }

        // Close browser after 3 seconds
        Thread.sleep(3000);
        driver.quit();
    }
}
