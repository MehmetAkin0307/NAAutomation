import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassSendsKeys {
    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement myElement=driver.findElement(By.id("twotabsearchtextbox"));
        wait.until(ExpectedConditions.visibilityOf(myElement));
        Actions myMouse=new Actions(driver);
        myMouse.moveToElement(myElement).click().perform();
        myMouse.sendKeys("shoes").perform();
        myMouse.moveToElement(driver.findElement(By.cssSelector("input[type=submit]"))).click().perform();
    }
}
