import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryCssSelectorOnFacebook {
    public static void main(String[] args) throws InterruptedException {

        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
      //  driver.findElement(By.cssSelector("input#email")).sendKeys("we grap this");
        //driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
       // driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
    }

}
