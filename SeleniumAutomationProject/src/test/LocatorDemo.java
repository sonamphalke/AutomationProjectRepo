package test;

import org.checkerframework.common.value.qual.EnsuresMinLenIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        //open link
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       /* //1)..................using  #id locator
        driver.findElement(By.id("login1"));
        driver.findElement(By.id("login1")).sendKeys("sonam");
        //2)...................using #class locator
        driver.findElement(By.className("signinbtn")).click();
*/
        /*//3)................linktext and partiallinkktext we can use any one outof this
        driver.findElement(By.linkText("Forgot Password?")).click();

       driver.findElement(By.partialLinkText("Forgot")).click();
*/
        /*//4)....................class name
        //driver.findElements(By.className("ntile boxcol")).size();
        //5)----------------------tagname
      WebDriver e =  driver.findElements(By.tagName("a")).size();
        System.out.println(e);*/

    }

}
