package come.yahya.tests.day08_upload_actions_window_wait_js;

import come.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadTest extends TestBase {

    @Test
    public void testUpload(){

        driver.get("https://practice.cydeo.com/upload");

        // Locate input field
        // By xpath("//button[@id='file-upload'])

        WebElement fileInputField = driver.findElement(By.id("file-upload"));
        // find the full path of your file in your computer and send key into above input field
        // you can copy full path by right click + option key
        String filepath = "/Users/solodolo/Downloads/Selenium.png";
        fileInputField.sendKeys(filepath);

        // submit file
        driver.findElement(By.id("file-submit")).click();

    }
}
