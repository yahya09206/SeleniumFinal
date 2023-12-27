package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");

        // TODO: Identify first dropdown
        WebElement dropDown1 = driver.findElement(By.id("year"));
        // TODO: Wrap it up using Select class so we can use easy methods
        Select yearSelectObj = new Select(dropDown1);
        // TODO: Select items in 3 different ways
        // Select 3rd item
        yearSelectObj.selectByIndex(2);
        // Select item with value attribute 2019
        yearSelectObj.selectByValue("2000");
        // Select item with visible text 1990
        yearSelectObj.selectByVisibleText("1990");

//        yearSelectObj.selectByVisibleText("Bla Bla");

        Thread.sleep(3000);
        driver.quit();




    }
}
