package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatepickerDemo {
    public static void main(String[] args) throws  InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.redbus.in/");
        String fdate="19";
        String fmonth="may";
        String fyear="2022";
        driver.findElement(By.id("onward_cal")).click();
        String data =  driver.findElement(By.xpath("//td[text()='May 2022']")).getText();
        if (data.equals(fmonth)&& data.equals(fyear))
        {
            List<WebElement> allDate=driver.findElements(By.xpath("//table"));
            for (WebElement date:allDate)
            {
                if(date.getText().equals(fdate));
                {
                    date.click();
                    Thread.sleep(3000);
                    break;
                }

            }
        }
driver.close();



    }
}
