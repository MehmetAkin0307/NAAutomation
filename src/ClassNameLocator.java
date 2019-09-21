import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver mehmet;

    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        mehmet.get("http://www.turkishairlines.com/");
        Thread.sleep(3000);
        mehmet.findElement(By.className("thyHeaderLink")).click();

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        mehmet=new ChromeDriver();
    }
}
