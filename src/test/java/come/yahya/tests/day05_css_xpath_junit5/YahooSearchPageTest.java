package come.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    // Write 2 tests
    // testYahooSearchPageTitle
    // Test when you navigate to yahoo search page, the title should be "Yahoo Search - Web Search

    @Test
    public void testYahooSearchResultPagetitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");


    }
}
