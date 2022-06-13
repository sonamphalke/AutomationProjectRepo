package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class CloseQuitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
/*
        //...............use driver.close()  methos is going to close one single webpage
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        String parentWindow=driver.getWindowHandle();
        Set <String> childWindow=driver.getWindowHandles();
        driver.close();*/

        //--------------------se driver.quit()  methos is going to close all webpage
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        String parentWindow=driver.getWindowHandle();
        Set <String> childWindow=driver.getWindowHandles();
        driver.quit();


    }

}
