import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpiceJetApp {

    @Test
    public void flight() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/vishwajeetrana/Documents/chromedriver");

       WebDriver driver=new ChromeDriver();
       driver.get("https://book.spicejet.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
      // driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();


        Thread.sleep(5000);
        driver.findElement(By.id("divpaxinfo")).click();
        Select s=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
        s.selectByValue("5");

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();

        driver.findElement(By.className("ui-state-default ui-state-highlight")).click();



        Thread.sleep(5000);

       driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
       driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
       driver.quit();

    }
}
