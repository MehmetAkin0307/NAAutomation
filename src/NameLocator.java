import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
   public static WebDriver mehmet;

    public static void main(String[] args) {
    invokeChromeBrowser();
    mehmet.get("http://www.facebook.com");
    mehmet.findElement(By.name("firstname")).sendKeys("Mehmet");
    mehmet.findElement(By.name("lastname")).sendKeys("Akin");
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        mehmet=new ChromeDriver();
    }
}
