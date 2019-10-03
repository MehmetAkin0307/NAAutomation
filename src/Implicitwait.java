import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicitwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.skyscanner.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Step 6: Locate the date picker.
        // First we need to open the picker then we will select the date
         driver.findElement(By.id("depart-fsc-datepicker-button")).click();
         driver.findElement(By.xpath("//div[@class='FlightDatepicker_fsc-datepicker__container__hgj24'] //span[contains(text(),'24')]")).click();
        // Step 7: Locate the second date picker.
        // First we need to open the picker then we will select the date
        driver.findElement(By.id("return-fsc-datepicker-button")).click();
        // open the date picker by clicking the button
         driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
        // Step 8: close the browser.
        driver.close();
    }
}
