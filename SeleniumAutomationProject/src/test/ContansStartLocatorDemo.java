package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContansStartLocatorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        //open link
        driver.get("https://facebook.com");
        /*//using of contains method
        driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sonam14phalke@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]")).click();*/
        //using stars-with
          //driver.findElement(By.xpath("//button[starts-with(@data-testid,'open-')]")).click();//not working need to check

        driver.findElement(By.xpath("//input[starts-with(@name,'ema')]")).sendKeys("sonam14phalke@gmail.com");
        //using test() click on Forgotten password? link
        //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();









    }
}
