package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;

        //1)---------open link
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//its a global declaration we just need to declare once.

        driver.get("https://www.facebook.com/");
      driver.findElement(By.name("email")).sendKeys("sonam14phalke");
      driver.findElement(By.name("pass")).sendKeys("12345");
      //.2).......for explicit wait wait for duration of  perticular time
        //need too repeted code for ech element
        WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement element=Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='login']")));
        element.click();

    }
}
