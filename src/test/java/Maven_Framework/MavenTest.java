package Maven_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	
	WebDriver driver;
	@Test
	
	public void mvn() 
	{
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		String actualResult = driver.findElement(By.cssSelector("#pah")).getText();
	//	Assert.assertEquals(actualResult, "driver.findElement(By.cssSelector(\"#pah\")).getText()");
		
		Assert.assertEquals(actualResult, "PracticeAutomationHere");	
	}
	@AfterMethod
	public void closer() {
		driver.close();
		
	}
	
	//to see the maven surefire reports go to target-surefire reports-index.html
	
}
