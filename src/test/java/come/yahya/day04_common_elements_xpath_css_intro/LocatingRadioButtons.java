package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButtons {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");

        // Locate the blue radio button
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        // Locate the red radio button
        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("Before redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click(); // This will click to check radio button
        System.out.println("After redRadio.isSelected() = " + redRadio.isSelected());

        // Green radio button
        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        // Any element can use isDisabled() method to check whether element is disabled or not
        // One can not take any action on disabled element
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        // A radio group is grouped by its name attribute
        // All radio buttons related to color has name color in this case
        // So we can findElements to get all of them
        List<WebElement> allColorRadios = driver.findElements(By.name("name"));
        // Check the size to see how many radio buttons were identified
        System.out.println("allColorRadios.size() = " + allColorRadios.size());
        // Click on third radio button
        allColorRadios.get(2).click();
        // Loop over all the elements to print these : id attributes, isSelected, isEnabled
        // allColorRadios.iter and hit enter and give each element a name
        for (WebElement eachColorRadio : allColorRadios) {
            System.out.println("eachColorRadio.getAttribute(\"id\") = " + eachColorRadio.getAttribute("id"));
            System.out.println("eachColorRadio.isSelected() = " + eachColorRadio.isSelected());
            System.out.println("eachColorRadio.isEnabled() = " + eachColorRadio.isEnabled());
            System.out.println("----------------------");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
