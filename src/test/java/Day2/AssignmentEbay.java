package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEbay {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.ca/");

        Thread.sleep(2000);

//        driver.findElement(By.id("gh-ac")).sendKeys("Computer");
//        Thread.sleep(2000);
//        driver.findElement(By.id("gh-cat")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("gh-btn")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("gh-Alerts-i")).click();
//        driver.findElement(By.id("gh-as-a")).click();
//        driver.findElement(By.className("hl-cat-nav__active")).click();
        //driver.findElement(By.className("gh-sch-prom")).click();
        //driver.findElement(By.className("font-marketsans")).click();
        //driver.findElement(By.className("desktop gh-1199 gh-flex")).click();
        //driver.findElement(By.className("hl-loyalty__text-subtitle")).click();
        //driver.findElement(By.id("gh-shop-a")).click();
        //driver.findElement(By.tagName())



       // WebDriver driver2=new ChromeDriver();
//        driver2.get("https://developer.ebay.com/");
//        driver2.findElement(By.id("")).click();
//        driver2.findElement(By.id("")).click();



    }
}
