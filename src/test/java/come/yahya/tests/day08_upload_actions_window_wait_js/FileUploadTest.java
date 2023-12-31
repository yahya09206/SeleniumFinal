package come.yahya.tests.day08_upload_actions_window_wait_js;

import come.yahya.utility.BrowserUtil;
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

        // submit file then wait two seconds
        driver.findElement(By.id("file-submit")).click();
        BrowserUtil.waitFor(2);

        // Thread.sleep(2000) is needed sometimes, but we are forced to deal with checked exceptions
        // objective: have a human-readable utility method so we can call like this
        // BrowserUtil.waitFor(2) --> no exception handling, jsut wait for 2 seconds
        // Create a class called BrowserUtil under utility package
        // Create a static method called waitFor and accept int as the amount of seconds to wait for

    }
}
