import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicketTC {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mehmetakin0307@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pwd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("contains ema");
        Thread.sleep(1000);

    }
}
