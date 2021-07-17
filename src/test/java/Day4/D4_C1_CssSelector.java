package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class D4_C1_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        /*the fastest locator
        what is the implementation css in code
        css locator driver.findElement(By.cssSelector("kdfhsl");
         */
        WebDriverManager.chromedriver().setup();
        //polymorhism
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //implicit wait=>it will wait for the whole page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("books");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
       // driver.quit();
    }
}
