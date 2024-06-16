package TestNGFramewok;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForinvokeListener {
	
	@Test
	public void Testten() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	int a=2 ,b=5, c=13;
	if(a>b) {
		Assert.assertTrue(a==3);
	}
	else if(a==2) {
			Assert.assertFalse(a<b);
			
		}
	else if(c==3) {
		
		throw new SkipException("Due to a's value is 12");
	}
	
	driver.close();
	}
	
	
	
	}
	


