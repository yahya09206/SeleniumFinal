package come.yahya.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import come.yahya.pages.WAllOrderPage;
import come.yahya.pages.WCommonArea;
import come.yahya.pages.WLoginPage;
import come.yahya.pages.WOrderPage;
import come.yahya.utility.BrowserUtil;
import come.yahya.utility.ConfigReader;
import come.yahya.utility.Driver;
import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

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

    @Test
    public void testCommonArea(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();
        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllOrdersTab.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllProductsTab.click();
        BrowserUtil.waitFor(2);

        commonArea.logoutLink.click();
        BrowserUtil.waitFor(2);

    }

    @Test
    public void testOrderFlow(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();
        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);

        // Place order with information
        WOrderPage orderPage = new WOrderPage();
        orderPage.quantityBox.sendKeys(Keys.BACK_SPACE + "10");
        orderPage.calculateButton.click();

        // Customer info
        Faker faker = new Faker();
        orderPage.customerNameBox.sendKeys(faker.name().fullName());
        orderPage.streetBox.sendKeys(faker.address().streetAddress());
        orderPage.cityBox.sendKeys(faker.address().cityName());
        orderPage.stateBox.sendKeys(faker.address().state());
        orderPage.zipBox.sendKeys(faker.address().zipCode());

        // Payment info
        orderPage.visaRadioButton.click();
        orderPage.cardNumber.sendKeys(faker.numerify("################"));
        orderPage.cardDate.sendKeys(faker.numerify("0#/0#"));

        orderPage.processButton.click();

        Assertions.assertTrue(orderPage.successMessage.isDisplayed());

        BrowserUtil.waitFor(5);

    }
}
