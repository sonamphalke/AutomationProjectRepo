package test;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleCookisDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        //cookies all have cookies variable type
        //create objject for cookie
        //.................set <cookie >use for access multiple cookies

         Set<Cookie> Cookies =driver.manage().getCookies();
         //..............size() use for show  how many cookies present in webpage
        System.out.println("cookies" +Cookies.size());

        //for see each cookie created by broweser we use for loop
        //1)cookie =return type 2)cookie=create single variable 3)cookies=access cookies variable e(x=int a=b);
       /* for(Cookie cookie:Cookies)//read and print all cookies
        {
            System.out.println(cookie.getName() +" " + cookie.getValue());//print name and value of cookies
        }*/

        //.......... get cookie with specific cookies name
        System.out.println(driver.manage().getCookieNamed("pxcts"));


        //.............add new cookie
        Cookie Cobj= new Cookie("mycookie","12345sonam"); //create cookie  with createe obj
        driver.manage().addCookie(Cobj);
        Cookies=driver.manage().getCookies();
        System.out.println("cookies size----" +Cookies.size());
        //for show the cookie
        for(Cookie cookie:Cookies)
        {
            System.out.println("set one------------------");
            System.out.println(cookie.getName()+ " " + cookie.getValue());
        }
        //.....delete cookie
        driver.manage().deleteCookie(Cobj);
        Cookies =driver.manage().getCookies();
        System.out.println("cookies set 2--------------");
        System.out.println("cookies size---" +Cookies.size());
        //for show the cookie
        for(Cookie cookie:Cookies)
        {

            System.out.println(cookie.getName()+ " " + cookie.getValue());
        }
        //delete cookies by name
        driver.manage().deleteCookieNamed("_pxff_ddtc");
        Cookies =driver.manage().getCookies();
        System.out.println(" delete cookies by name _pxff_ddtc cookies set 3--------------");
        System.out.println("cookies size---" +Cookies.size());
        //for show the cookie
        for(Cookie cookie:Cookies)
        {

            System.out.println(cookie.getName()+ " " + cookie.getValue());
        }
        //
        driver.manage().deleteAllCookies();
        Cookies =driver.manage().getCookies();
        System.out.println("cookies size---" +Cookies.size());
        //for show the cookie
        for(Cookie cookie:Cookies)
        {
            System.out.println(" delete all cookies cookies set 4--------------");
            System.out.println(cookie.getName()+ " " + cookie.getValue());
        }


    }
}
