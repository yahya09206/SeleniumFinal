package come.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    WebDriver driver;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }

    // Write 2 tests
    // testYahooSearchPageTitle
    // Test when you navigate to yahoo search page, the title should be "Yahoo Search - Web Search

    @Test
    public void testYahooSearchResultPagetitle() throws InterruptedException {

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        Assertions.assertEquals(expectedTitle, actualTitle);

        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void testYahooSearchResultPageTitle() throws InterruptedException {

        driver.get("https://search.yahoo.com/");

        // Identify searchbox and enter selenium, and hit Enter key on keyboard
        WebElement searchBar = driver.findElement(By.xpath("//input[@name='p']"));
        searchBar.sendKeys("Selenium" + Keys.ENTER);

//        String expectedTitleStartsWith = "selenium";
        String actualTitle = driver.getTitle();

        Assertions.assertTrue(actualTitle.startsWith("Selenium"));
    }
}
