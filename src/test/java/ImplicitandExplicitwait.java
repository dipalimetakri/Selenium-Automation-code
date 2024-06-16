import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://omayo.blogspot.com/");
	 driver.findElement(By.className("dropbtn")).click();
	 
	 driver.manage().window().maximize();
	 //Implicit wait-Global wait applicable for overall webelement
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	 /*
	 //Explicitwait
	 
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	 
	 WebElement facebookele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
	
	 WebElement facebookclc = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
	 facebookclc.click();
	
	 */
	 
	 //FluentWait
	 Wait<WebDriver> Explicitwait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1))
			 .ignoring(NoSuchElementException.class);
	driver.findElement(By.linkText("Facebook"));
	 

	}

	

}
