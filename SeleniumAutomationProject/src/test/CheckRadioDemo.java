package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRadioDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        //checkbox
        driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
        driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
        //radio
        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
        //dropdown
       Select st= new Select(driver.findElement(By.id("carselect")));
       st.selectByIndex(2);
       //
    }
}
