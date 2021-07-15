package Day2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class D2_C3 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Using LinkText and PartialLinkText
        These locators type are very useful whenever you need click on another url
        It uses the inner Text of the link
         */
        // click pn forget password
        // navigate back
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
          /*
        LinkText and PartialLinkText
        LinkText will use whole inner text whereas PartialLinkText will use portion of it
         */
        //click forgot password button
        WebElement forgetpasword = driver.findElement(By.linkText("Forgot Password?"));
        //<a href="https://www.facebook.com/recover/initiate/?ars=facebook_login&amp;privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI1NzA0NzY2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D">Forgot Password?</a>
        // ONE CLICK AND DOUBLE CLICK for copy text not whole line
        Thread.sleep(4000);
        forgetpasword.click();
        driver.navigate().back();
        //Click create account button
        WebElement CreateAnAccount = driver.findElement(By.partialLinkText("New Account"));
        CreateAnAccount.click();
        WebElement SignupPage = driver.findElement(By.className("mbs _52lq fsl fwb fcb"));
        String text = SignupPage.getText();
        System.out.println(text);
        /*
        By.className
        by.name
        By.tagName
        By.partialLinkText
        By.id
        By.LinkText
        By.xpath
        By.cssSelector
         */
    }
}