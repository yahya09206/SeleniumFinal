package come.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://yahoo.com/");

        // TODO: Identify searchbox using css selector
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
//        WebElement searchBox = driver.findElement(By.cssSelector("input[id='yschsp']"));
//        WebElement searchbox = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBox.sendKeys("CSS Selector");

        // #sbq-clear
        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        searchBox.sendKeys("XPATH");

        // #ybar-search
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']"));
        searchIcon.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.quit();
    }
}
