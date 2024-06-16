import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      
      //  driver.get("https://omayo.blogspot.com/p/page3.html");
        
        //for doubleclick
        driver.get("https://omayo.blogspot.com/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Actions action=new Actions(driver);
        /*
     
        WebElement minprice = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
        
        action.dragAndDropBy(minprice, 100, 0).perform();
        
        Thread.sleep(3000);
        action.dragAndDropBy(minprice, -200, 0).perform();
        
       */
        
        //moveToElement-used to 
       // driver.get("https://omayo.blogspot.com/");
         WebElement searchfield = driver.findElement(By.name("q"));
         searchfield .sendKeys("Dipali");
         
         //used to double click
        // action.moveToElement(searchfield).doubleClick().perform();
         
         
         //contextClick -used to right click
        action.contextClick().perform();
        
         
        
        Thread.sleep(2000);
        
       // driver.quit();
        
	}

}
