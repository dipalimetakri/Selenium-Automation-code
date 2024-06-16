package TestNGFramewok;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     
     //Login to user
     driver.findElement(By.linkText("My Account")).click();
     driver.findElement(By.linkText("Login")).click();
     driver.findElement(By.cssSelector("#input-email")).sendKeys("dipalimetkari84@gmail.com");
     driver.findElement(By.cssSelector("#input-password")).sendKeys("Dipali@123");
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input[value='Login']")).click();
     System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
     
  
     

     
     //Searching iphone
     driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
     driver.findElement(By.xpath("//span[@class='input-group-btn']//i[@class='fa fa-search']")).click()	;
     System.out.println(driver.findElement(By.xpath("//div[@class='product-thumb']//a[text()='iPhone']")).isDisplayed());
     driver.findElement(By.xpath("//div[@class='product-thumb']//a[text()='iPhone']")).click();
   
     System.out.println( driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());
     
     //Adding product to cart
     
    WebElement quantity = driver.findElement(By.id("input-quantity"));
    quantity.clear();
    quantity.sendKeys("2");
    driver.findElement(By.xpath("//button[@id='button-cart']")).click();
    System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText().contains("Success: You have added iPhone to your shopping cart!"));
     
   Thread.sleep(3000);
   
   //Taking screenshot
        
       File sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(sc1, new File("Screenshots//scretaddtocart2.png"));
        System.out.println("You took the screenshot");
        
        
        //Scrolling down
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(); ", quantity);
        
        System.out.println("You have scrolled successfully");
        Thread.sleep(3000);
        
        
        //navigating to shopping cart
        
        driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
        
        
      
   driver.quit();
	
	}

}
