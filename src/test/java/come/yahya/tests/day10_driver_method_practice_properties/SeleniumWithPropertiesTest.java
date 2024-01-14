package come.yahya.tests.day10_driver_method_practice_properties;

import come.yahya.utility.*;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){

        // use ConfigReader everywhere
        String url = ConfigReader.read("weborder_url");
        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");

        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);

        // navigate by passing value you got from properties test
        Driver.getDriver().get(url);
        WebOrderUtil.login(username, password);

        System.out.println("END");
    }
}
