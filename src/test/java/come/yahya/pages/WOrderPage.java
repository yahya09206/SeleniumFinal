package come.yahya.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.)='Order']")
    public WebElement header;
    @FindBy(id = "ctl00_Main_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id = "ctl00_Main_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy(id = "ctl00_Main_fmwOrder_txtUnitPrice")
    public WebElement priceBox;

    @FindBy(id = "ctl00_Main_fmwOrder_txtDiscount")
    public WebElement discountBox;

    @FindBy(id = "ctl00_Main_fmwOrder_txtTotal")
    public WebElement totalBox;

    @FindBy(css = "ctl00_Main_fmwOrder_ddlProduct")
    public WebElement calculateButton;

}
