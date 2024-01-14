package come.yahya.tests.day10_driver_method_practice_properties;

import come.yahya.utility.Driver;
import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){

        // use ConfigReader everywhere
        // navigate by passing value you got from properties test
        Driver.getDriver().get("");
    }
}
