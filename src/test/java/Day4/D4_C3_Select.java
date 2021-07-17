package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D4_C3_Select {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement dropdown=driver.findElement(By.cssSelector("#carselect"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Benz");
        Thread.sleep(2000);
        select.selectByIndex(1);
        select.selectByValue("honda");
    }
}
