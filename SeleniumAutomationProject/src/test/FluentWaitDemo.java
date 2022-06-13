package test;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //declaration
        Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                        .ignoring(NoSuchElementException.class);
        driver.get("https://www.facebook.com/");
        //usage of fluent
       WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
           public WebElement apply(WebDriver Driver) {
               return driver.findElement(By.xpath("//button[@name='login']"));
           }
       });
       element.click();





        driver.get("https://www.facebook.com/");

    }
}
