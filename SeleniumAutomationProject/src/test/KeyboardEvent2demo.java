package test;

import org.openqa.selenium.By;

//1)...right 1 box text.2)......seect that text.3)....cnt+c.4)...tab.5).....goto next textbox.6)....cntrol+v
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent2demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("password");
        Actions acn=new Actions(driver);
        //1-----ctrl+a
        acn.keyDown(Keys.CONTROL);
        acn.sendKeys("a");
        acn.keyUp(Keys.CONTROL);
        acn.perform();
        //2.......cnrl+c
        acn.keyDown(Keys.CONTROL);
        acn.sendKeys("c");
        acn.keyUp(Keys.CONTROL);
        acn.perform();
        //3------tab
        acn.sendKeys(Keys.TAB);
        acn.perform();
        //4---cnrl +v
        acn.keyDown(Keys.CONTROL);
        acn.sendKeys("v");
        acn.keyUp(Keys.CONTROL);
        acn.perform();
        driver.findElement(By.name("login")).click();
    }
}
