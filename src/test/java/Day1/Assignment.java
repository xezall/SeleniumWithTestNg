
package Day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment {
    /*
    -Go to https://www.etsy.com/
-Maximize window
-Verify title
-Verify Current Url
-Go to https://www.amazon.com/
-Verify title
-Verify Current Url
-Navigate Back
-Refresh
-Quit browser
     */
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String actualTitle=driver.getTitle();
        System.out.println("Etsytitle is "+ actualTitle );
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Test is passed Successfully");
        }else {
            System.out.println("Test is failed");
        }
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        Thread.sleep(4000);
        driver.quit();
      /*
      -Go to https://www.amazon.com/
-Verify title
-Verify Current Url
-Navigate Back
-Refresh
-Quit browser
       */
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        String actualTitle1=driver1.getTitle();
        System.out.println("Amazon title is : "+actualTitle1);
        String expectedTitle1="Amazon.com. Spend less. Smile more.";
        if(actualTitle1.equalsIgnoreCase(expectedTitle1)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }
        String cur=driver1.getCurrentUrl();
        System.out.println(cur);
        driver1.navigate().back();
        Thread.sleep(4000);
        driver1.navigate().refresh();
        Thread.sleep(4000);
        driver1.quit();
    }
}
