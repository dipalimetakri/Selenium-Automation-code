package TestNGFramewok;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNG {

	// Test case
	@Test
	public void sample() {
		// TODO Auto-generated method stub

		// Passing the TC
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("prompt")).click();

		driver.quit();
	}

	// Failing test case
	@Test
	public void fail() {
		int s = 10 / 0;
	}

	// Manually providing exception
	@Test
	public void manuallyexception() throws Exception {
		int age = 4;
		if (age < 18)
			throw new Exception("Age cannot be less than 18");
	}

	// Skip the TC
	@Test
	public void skipTC()

	{
		int age = 52;
		if (age > 18)
			throw new SkipException("Age cannot be greater than 18-Hence Skipping the TC");
	}
	
	@Test
	public void assertMethods()
	{
		//Assert.assertEquals("Dipuu", "Dipuu");
		int a=4, b=2;
	    Assert.assertTrue(a>b);
	    Assert.assertNotEquals("Hi", "Bye");

	  Assert.assertFalse(a<b);
	
	  
	  int age=3;
	  if(age<18)
	  {
		  //if you wants to fail test case manually
		  Assert.fail("Age can not be less than 18");
	  }
	  
	    
	}
	@AfterTest
	public void afterpmodule() {
		System.out.println("You are the after test priority module ");
	}

	
	}
	


