package POMandPageFactoryModelantAutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITclass {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		Actions action=new Actions(driver);//to automate mouse actions
		action.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();
		Runtime.getRuntime().exec("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\AutoItUpload\\Autoscituploadfile.exe");
		System.out.println("Executed Successfully dear");
		
		
	}

}
