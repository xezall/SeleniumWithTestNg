package Day6;

import Utilities.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D6_C4 {
    /*
Navigate to http://the-internet.herokuapp.com/nested_frames
Switch to other frames
 */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtils.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/nested_frames");


    }
    @AfterMethod
    public void close(){
        driver.quit();

    }
    @Test
    public void switchToOtherFrames(){


    }
}
