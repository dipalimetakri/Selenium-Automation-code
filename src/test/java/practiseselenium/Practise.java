package practiseselenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		 
		 driver.manage().window().maximize();
		 //Implicit wait-Global wait applicable for overall webelement
		 
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Explicit Wait
		
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	         
	       //Fluent wait 
	        FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(7)).pollingEvery(Duration.ofSeconds(4))
	       
	        		
	        		.ignoring(NoSuchElementException.class);
	        		 
	         

	}

}
