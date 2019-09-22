import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public WebDriver invokeChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver mehmet=new ChromeDriver();
        return mehmet;
    }
}