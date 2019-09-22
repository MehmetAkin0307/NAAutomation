import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocator {

    public static WebDriver mehmet;

    public static void main(String[] args) throws InterruptedException {

        String expectedValue = "Sizin İçin Buradayız!";
        invokeChromeBrowser();
        mehmet.manage().window().maximize();
        mehmet.get("http://www.flypgs.com");
        mehmet.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);// secip alt enter
        mehmet.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(5000);// secip alt enter
        System.out.println("Validation" + isTexTrue(expectedValue));
    }

    public static void invokeChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        mehmet = new ChromeDriver();
    }

    public static boolean isTexTrue(String expectedValue) {
        String resultValue = mehmet.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}