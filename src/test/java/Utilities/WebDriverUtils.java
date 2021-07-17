package Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
public class WebDriverUtils {
    public static WebDriver getDriver(String browser){
        // This method will accept string value
        //This will return WebDriver
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("internetexplorerdriver")){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            return new SafariDriver();
        }else{
            System.out.println("Browser does not exist");
            System.out.println("Please check browser name");
            System.out.println("Current browser name : "+browser);
            return null;
        }
    }
}
