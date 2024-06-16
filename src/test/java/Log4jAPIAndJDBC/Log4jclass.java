package Log4jAPIAndJDBC;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;

public class Log4jclass {
	
public static void main (String[] args) {
	Logger logs = LogManager.getLogger(Log4jclass.class.getName());
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 logs.debug("Crome browser is launched");
	driver.manage().window().maximize();
	 logs.debug("Window is maximized");

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	 logs.debug("Website is opened");

	String actualResult = driver.findElement(By.cssSelector("#pah")).getText();
//	Assert.assertEquals(actualResult, "driver.findElement(By.cssSelector(\"#pah\")).getText()");
	 logs.debug("clicked on the omayo blogspot link");

	if(driver.getTitle().equals("PracticeAutomationHerey"))
	{
		logs.info("Success: The correct tile is retrieved");
	}
	else
	{
		logs.error("Wrong : The erong title  is retrieved");
	}
	driver.close();
	logs.debug("Browser got closed");
	
}

}
