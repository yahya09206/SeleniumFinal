package come.yahya.tests.day10_driver_method_practice_properties;

import come.yahya.utility.BrowserUtil;
import come.yahya.utility.TestBase;
import come.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderapp();
        WebOrderUtil.login("Tester", "test");

        BrowserUtil.waitFor(3);
    }
}
