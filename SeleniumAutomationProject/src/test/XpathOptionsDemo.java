package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class XpathOptionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        //provide the xpath
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        //or and options
        driver.findElement(By.xpath("//input[@id='search_query_top' or @id='search_query_top1']")).sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.xpath("//button[@name='submit_search' and @type='submit']")).click();

        //used of chaied xpath
        driver.findElements(By.xpath("//ul[@name='submenu-container clearfix first-in-line-xs']//li[2]"));




    }
}
