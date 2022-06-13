package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        //open link
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        /*//1)-------click on alert ok
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        //2_---------------alert have 2 button ok and cancel
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().accept();//this is for ok button
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();//for cancel button*/
        //take inpute from alert box
        //clcik on option
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        //switch to alert box
         Alert webalert =driver.switchTo().alert();
        System.out.println("get text in inputbox: "+webalert.getText());//gettext
        Thread.sleep(3000);
        webalert.sendKeys("welcome click ok");//inputbox
        Thread.sleep(3000);
        webalert.accept();//click on ok
        Thread.sleep(3000);





    }
}
