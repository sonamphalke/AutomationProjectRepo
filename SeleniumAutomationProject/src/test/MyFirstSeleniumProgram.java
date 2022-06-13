package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperties;

public class MyFirstSeleniumProgram {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        //open link
        driver.get("https://amazon.com");
        /*//using  #id locator
        driver.findElement(By.id("login1"));
        //using #class locator
        driver.findElement(By.className("form-label"));*/
    }


}
