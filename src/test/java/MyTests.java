
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyTests {

//    @Test
//    public void addNewCustomer() throws InterruptedException {
//        System.out.println();
//       System.setProperty("webdriver.chrome.driver","/Users/vishwajeetrana/Documents/chromedriver");
//
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://www.demo.guru99.com/V4/");
//        //driver.manage().window().maximize();
//       // String expectedTitle = "Welcome: Mercury Tours";
//      //  String ActualTitle=driver.getTitle();
//        //System.out.println(ActualTitle);
//        //Assert.assertEquals(ActualTitle,expectedTitle);
//
//       WebElement email= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
//       email.sendKeys("mngr245862");
//
//       WebElement password=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
//       password.sendKeys("sEhEvaz");
//
//       driver.findElement(By.name("btnLogin")).click();
//       System.out.println("Title of the 1st page:----------- "+driver.getTitle());
//
//       WebElement NewCustomer= driver.findElement(By.linkText("New Customer"));
//        NewCustomer.click();
//
//        System.out.println("Title of the 2nd page:----------- "+driver.getTitle());
//
//        WebElement CustName=driver.findElement(By.xpath("//input[@name='name']"));
//        CustName.sendKeys("Bananas");
//
//       List<WebElement> Gender= driver.findElements(By.name("rad1"));
//       int GenderSize=Gender.size();
//
//       for(int i=0; i<GenderSize; i++)
//       {
//           String val=Gender.get(i).getAttribute("value");
//
//           if(val.equalsIgnoreCase("f"))
//           {
//               Gender.get(i).click();
//               break;
//           }
//       }
//
//       WebElement dob= driver.findElement(By.xpath("//input[@id='dob']"));
//       dob.sendKeys("01051995");
//
//       WebElement address=driver.findElement(By.xpath("//td//textarea[@name='addr']"));
//       address.sendKeys("FLAT NO C183 ABBEY FALLS apartments BKC  Kurla ");
//
//        WebElement city=driver.findElement(By.xpath("//td//input[@name='city']"));
//        city.sendKeys("Mumbai");
//
//        WebElement state=driver.findElement(By.xpath("//td//input[@name='state']"));
//        state.sendKeys("Maharastra");
//
//        WebElement pin=driver.findElement(By.xpath("//td//input[@name='pinno']"));
//        pin.sendKeys("411057");
//
//        WebElement mno=driver.findElement(By.xpath("//td//input[@name='telephoneno']"));
//        mno.sendKeys("9123456781");
//
//        WebElement emailId=driver.findElement(By.xpath("//td//input[@name='emailid']"));
//        emailId.sendKeys("AAAbcdefmix@gmail.com");
//
//        WebElement password2=driver.findElement(By.xpath("//td//input[@name='password']"));
//        password2.sendKeys("password");
//
//        WebElement Submit= driver.findElement(By.xpath("//td//input[@value='Submit']"));
//        Submit.click();
//
//      //Thread.sleep(10000);
//
//        System.out.println("Title of the 1st page:----------- "+driver.getTitle());
//     // driver.quit();
//        //71753
//
//
//        WebElement CustomerId=driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]"));
//        System.out.println("Customer Id is ------------->>>>>>>>>>"+ CustomerId);
//
//    }

    @Test
    public void greenKart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/vishwajeetrana/Documents/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] itemsneeded= {"Cucumber", "Brocolli", "Tomato", "Carrot"};

        int sizeofitems=itemsneeded.length;
        int j=0;

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));


        for(int i=0;i<products.size();i++)
        {
            String[] name=products.get(i).getText().split("-");
            String actualProd=name[0].trim();
            List itemNeededList= Arrays.asList(itemsneeded);

            if(itemNeededList.contains(actualProd))
            {
                j++;
                System.out.println(actualProd);
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                Thread.sleep(2000);
                if(j==sizeofitems)
                {
                    break;
                }
                else
                {
                    continue;
                }
            }




        }

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//        driver.findElement(By.cssSelector("button.promoBtn")).click();
//        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      String Str=  driver.findElement(By.cssSelector(("span.promoInfo"))).getText();
//        System.out.println("Promo info: ------------------" + Str);



    }
}
