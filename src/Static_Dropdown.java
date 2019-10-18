import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.skyscanner.com/hotels");
         Select s = new Select(driver.findElement(By.id("adults")));
        s.selectByValue("3");
        try{
            Thread.sleep(2000L);        }
        catch(InterruptedException e){

        }
        // Step 6: Lets load the dropdown with 6th index
        // Lets put some duration to see the loadings correctly
        // s.selectByIndex(6);
        try{
            Thread.sleep(2000L);        }
           catch (InterruptedException e) {
            e.printStackTrace();
        }

        s.selectByVisibleText("10");
        try{
        Thread.sleep(2000L);        }
         catch(InterruptedException e) {

         }
    }
    }
