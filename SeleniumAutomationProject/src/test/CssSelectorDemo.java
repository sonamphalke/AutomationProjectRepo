package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("sonam14phalke@gmail.com");
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='login']._42ft")).click();


    }
}
