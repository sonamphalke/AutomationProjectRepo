package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseOverDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Actions actions= new Actions(driver);
        //hover btn

       actions.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']"))).build().perform();
        /*WebElement element=driver.findElement(By.xpath("//button[@class='dropbtn']"));
        element.click();*/

       // driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
        WebElement ele1=driver.findElement(By.xpath("//a[text()='Top']"));
        WebElement ele2=driver.findElement(By.xpath("//a[text()='Reload']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",ele1);
       // driver.manage().window().maximize();
       // Actions actions= new Actions(driver);
        actions.clickAndHold(ele1).moveToElement(ele2).release().build().perform();

    }
}
