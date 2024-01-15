package come.yahya.pages;

import come.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WCommonArea {

    @FindBy(id = "ctl00_logout")
    public WebElement logoutLink;
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersTab;
    @FindBy(linkText = "View all products")
    public WebElement viewAllProductsTab;
    @FindBy(linkText = "Order")
    public WebElement orderTab;

    public WCommonArea(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
