import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocator {

    public static WebDriver mehmet;

    public static void main(String[] args) {
        String expectedValue="Sizin İçin Buradayız!";
    invokeChromeBrowser();
    mehmet.manage().window().maximize();
    mehmet.get("http://www.flypgs.com");
    mehmet.findElement(By.xpath("/html/body")).click();
    mehmet.findElement(By.linkText("BİZE YAZIN")).click();
        System.out.println("Validation"+isTexTrue(expectedValue));
    }

    public static void invokeChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        mehmet = new ChromeDriver();
    }
    public static boolean isTexTrue(String expectedValue){
        String resultValue=mehmet.findElement(By.linkText("Sizin İçin Buradayız!")).getText();
        return resultValue.equals(expectedValue);
    }
}