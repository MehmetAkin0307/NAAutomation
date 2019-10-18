import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver mehmet=myBrowser.invokeChromeBrowser();
        mehmet.get("http://www.expedia.com");
        Thread.sleep(2000);
       /* mehmet.findElement(By.id("package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(1000);
        mehmet.findElement(By.cssSelector("option[value='p']")).click();
        Thread.sleep(1000);
        mehmet.findElement(By.cssSelector("option[value='p']")).sendKeys(Keys.ENTER);*/
        Select s=new Select(mehmet.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
        Thread.sleep(1000);
        s.selectByValue("p");
        Thread.sleep(1000);
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.selectByVisibleText("Business");
       // Thread.sleep(1000);
       // s.deselectAll();
    }
}
