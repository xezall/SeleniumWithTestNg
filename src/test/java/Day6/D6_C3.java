
package Day6;

import Utilities.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D6_C3 {
    /*
Navigate to "http://the-internet.herokuapp.com/iframe"
Clean the text field
Type "Hello it's me" to the text field
Validate the title
 */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverUtils.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void iframes(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement messagebox=driver.findElement(By.id("tinymce"));
        messagebox.clear();
        messagebox.sendKeys("Hello it's me");
        driver.switchTo().parentFrame();//returns to previous iframe to html block
        driver.switchTo().defaultContent();//returns to the main html
        driver.getTitle();
        System.out.println(driver.getTitle());

    }

}
