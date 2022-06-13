package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
       WebElement IsButton = driver.findElement(By.xpath("//input[@name='email']"));
         /*       if(IsButton.isEnabled())
        {
            System.out.println("enable");
        }
                else
        {
            System.out.println("disable");
        }*/

    }


}

