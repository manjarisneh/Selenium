import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricTables {

    @Test
    public void runs() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/vishwajeetrana/Documents/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Live Scores')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'NZ vs IND - Stumps')]")).click();
        driver.findElement(By.linkText("Scorecard")).click();

        WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
        int row=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        System.out.println("row is------------------" + row);
        int col=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        System.out.println("col is------------------" + col);

        for(int i=0; i<col-2;i++)
        {
            System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
        }
        Thread.sleep(6000);
        driver.quit();
    }
}
