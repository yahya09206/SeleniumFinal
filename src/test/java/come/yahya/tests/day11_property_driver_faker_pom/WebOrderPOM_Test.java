package come.yahya.tests.day11_property_driver_faker_pom;

import come.yahya.pages.WLoginPage;
import come.yahya.utility.BrowserUtil;
import come.yahya.utility.Driver;
import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){

        // Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();

        loginPage.userNameField.sendKeys("Tester");
        loginPage.passwordField.sendKeys("test");
        loginPage.loginButton.click();

        BrowserUtil.waitFor(4);
    }
}
