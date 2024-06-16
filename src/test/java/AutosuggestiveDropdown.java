import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
     
    
       
       Thread.sleep(10000);
       
      
       Actions a = new Actions(driver);

       Thread.sleep(5000);
//        WebElement closekey = driver.findElement(By.className("close"));
//        a.moveToElement(closekey).click().build().perform();
       
       
//       
//       WebElement closekey = driver.findElement(By.xpath("//i[@id='webklipper-publisher-widget-container-notification-close-divwewidgeticon we_close']"));
//       closekey.click();
       Thread.sleep(3000);
       
         driver.findElement(By.id("fromCity")).click();
         
        
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kar");
         
        
         
         
         int i=0;
         while(i<4)
         {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
        	 i++;
         }
         
         driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
         
         
         //toCity
         
         driver.findElement(By.id("toCity")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mum");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
         driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
         

	}

}
