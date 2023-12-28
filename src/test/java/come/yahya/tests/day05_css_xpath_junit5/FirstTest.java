package come.yahya.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    // Test method is annotated with @Test annotation
    // It's a void method with no param
    @Test
    public void testAddition(){

        int num1 = 10;
        int num2 = 7;
        int expectedResult = 17;
        Assertions.assertEquals(expectedResult, num1 + num2);
    }

    @Test
    public void testString(){

        String msg = "I love Selenium";

        // Assert that above message starts with "I love Selenium"
        Assertions.assertEquals("I love Selenium", msg);

        // Assert this message starts with "I love"
        Assertions.assertTrue(msg.startsWith("I love"));
    }
}
