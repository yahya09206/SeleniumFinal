package come.yahya.tests.day11_property_driver_faker_pom;

import come.yahya.pages.WAllOrderPage;
import come.yahya.pages.WLoginPage;
import come.yahya.utility.BrowserUtil;
import come.yahya.utility.ConfigReader;
import come.yahya.utility.Driver;
import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){

        // Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();
        loginPage.login(ConfigReader.read("weborder_username"), ConfigReader.read("weborder_password"));
        // assertTrue(loginPage.loginErrorMsgPresent)
        BrowserUtil.waitFor(4);
    }

    @Test
    public void testAllOrderPage(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        // After logging in go to all order page
        WAllOrderPage allOrderPage = new WAllOrderPage();

        // Assert that header element is displayed
        assertTrue(allOrderPage.header.isDisplayed());

        allOrderPage.checkAllButton.click();

        BrowserUtil.waitFor(2);

        allOrderPage.uncheckAllButton.click();

        // print out size of all headerCells
        System.out.println("allOrderPage.headerCells.size() = " + allOrderPage.headerCells.size());
        assertEquals(13, allOrderPage.headerCells.size());
    }
}
