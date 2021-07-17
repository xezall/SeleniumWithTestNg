package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_C2_Assign {
    public static void main(String[] args) throws InterruptedException {
        /*
Navigate to https://courses.letskodeit.com/practice
click on BMW RADIO button
verify that its selected
Check Bmw, Benz, honda
validate that benz is selected
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement clickbmw=driver.findElement(By.cssSelector("#bmwradio"));
        clickbmw.click();
        Thread.sleep(2000);


        WebElement clickbenz=driver.findElement(By.cssSelector("#benzradio"));
        clickbenz.click();
        Thread.sleep(2000);
        WebElement clickhonda=driver.findElement(By.cssSelector("#hondaradio"));
        clickhonda.click();
        Thread.sleep(2000);
        if(clickhonda.isSelected()){
            System.out.println("successfull");
        }else{
            System.out.println("sorry problem");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
