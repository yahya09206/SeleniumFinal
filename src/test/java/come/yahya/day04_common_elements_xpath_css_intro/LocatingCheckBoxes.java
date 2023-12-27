package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        // Checkboxes can be checked and unchecked
        // That's the only attribute special about the element
        // We can use additional method called isSelected() to determine if it's checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        // Identify first checkbox and check if it is selected
        WebElement checkBox = driver.findElement(By.id("box1"));
        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());

        // Identify second checkbox and check if it is selected
        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
    }
}
