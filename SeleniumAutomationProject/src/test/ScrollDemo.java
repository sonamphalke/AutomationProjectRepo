package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class ScrollDemo {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        /*js.executeScript("window.scrollBy(0,600)"," ");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1500)", "");
        Thread.sleep(3000);
        //by using document.body.scrollHeight scroll down end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");*/
        //scrolldown to perticular web element
       // driver.findElement(By.xpath("//div[@id='gcc_erB8YpjqDs7ioAP46ZqgBA']");


    }
}
