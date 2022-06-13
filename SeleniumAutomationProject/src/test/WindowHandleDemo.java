package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleDemo {
    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");

        //-----------------parent->child->parent->click any button
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
        String parentWindow=driver.getWindowHandle();
        Set <String> childWindow=driver.getWindowHandles();
        for (String s:childWindow)
        {
            if (!parentWindow.contentEquals(s)) {
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
                Thread.sleep(3000);
            }
        }
        //going to parent page address
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
