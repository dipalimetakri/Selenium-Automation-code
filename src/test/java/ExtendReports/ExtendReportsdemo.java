package ExtendReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsdemo {
	WebDriver driver;
	ExtentReports ereport;
	
	@BeforeMethod
	public void before() {
		String eepath = System.getProperty("user.dir");
		System.out.println(eepath);
		String epath = System.getProperty("user.dir")+"\\Extend Reports\\reports.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(epath);
		
		reporter.config().setReportName("Omayo Report");
		reporter.config().setDocumentTitle("Extent Report Omayoy Title");
		
		ereport=new ExtentReports();
		ereport.attachReporter(reporter);
		ereport.setSystemInfo("Operationg System", "Windows 10");
		ereport.setSystemInfo("Environment", "Eclipse");
		
	}
	@Test
	public void testone() {
		ExtentTest etest = ereport.createTest("Test method one created");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		etest.info("Screen has been maximized");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		String actualResult = driver.findElement(By.cssSelector("#pah")).getText();
	//	Assert.assertEquals(actualResult, "driver.findElement(By.cssSelector(\"#pah\")).getText()");
		
		Assert.assertEquals(actualResult, "PracticeAutomationHere");	
		etest.info("Expected and actual assertion has been completed");
	}
	@Test
	public void testtwo() {
		ExtentTest etest = ereport.createTest("Test method two created");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			etest.info("ChromeBrowserLaunched");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		etest.info("Navigated properlly");
		String actualResult = driver.findElement(By.cssSelector("#pah")).getText();
	//	Assert.assertEquals(actualResult, "driver.findElement(By.cssSelector(\"#pah\")).getText()");
		
		etest.fail("Test has been failled");//this if for failling the test
		Assert.assertEquals(actualResult, "PracticeAutomationHere");	

	}
	
	@AfterMethod
	public void after() {
		driver.close();
		ereport.flush();
		
	}

}
