package step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BookItLoginPage;

import java.util.concurrent.TimeUnit;

public class BookItStepDefs {

    WebDriver driver;

    @Before
    public  void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public  void task1() throws InterruptedException {

        driver.get("https://cybertek-reservation-qa3.herokuapp.com/sign-in");

       BookItLoginPage loginPage= new BookItLoginPage(driver);

        loginPage.loginToBookIt();

        driver.findElement(By.linkText("hunt")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='mat-icon-button']")).click();

        driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']//div[contains(text(),'29')]")).click();

        driver.findElement(By.xpath("//span[.='from']/..//div/div[2]")).click();
        driver.findElement(By.xpath("//span[.=' 7:00am ']")).click();

        driver.findElement(By.xpath("//span[.='to']/..//div/div[2]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.=' 7:30am ']")).click();

        driver.findElement(By.className("mat-button")).click();

        driver.findElement(By.xpath("//p[.=' denali ']/../..//button")).click();


        driver.findElement(By.xpath("//button[.='confirm']")).click();

    }



}
