package come.yahya.tests.day06_junit_practice_utility_methods;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class AlertPracticeTest extends TestBase {

    @Test
    public void testJavaScriptAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");
    }
}
