package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEventDemo  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        Actions acn= new Actions(driver);
        acn.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        acn.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        acn.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        acn.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        acn.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);



    }
}
