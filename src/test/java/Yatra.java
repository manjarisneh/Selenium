import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Yatra {

    @Test
    public void flights() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/vishwajeetrana/Documents/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.in/");
        driver.manage().window().maximize();


        // WebElement prod=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // prod.sendKeys("Lakme lipsticks")
        WebElement prods= driver.findElement(By.xpath("//a[contains(text()='Today's Deals')]"));
        prods.click();
        Thread.sleep(5000);
        driver.quit();


    }

}
