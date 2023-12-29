package come.yahya.tests.day06_junit_practice_utility_methods;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){
        driver.get("https://search.yahoo.com/");

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testYahooSearchResultPage(){
        // Navigate to yahoo search and enter selenium and hit enter
        driver.get("https://search.yahoo.com/");
        driver.findElement(By.name("p")).sendKeys("selenium" + Keys.ENTER);
        // Assert title starts with selenium
        Assertions.assertTrue(driver.getTitle().startsWith("selenium"));
    }
}
