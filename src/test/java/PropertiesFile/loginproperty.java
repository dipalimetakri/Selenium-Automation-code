package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginproperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\PropertiesFile\\data.properties");
		pr.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pr.getProperty("URL"));
		System.out.println(pr.getProperty("URL"));
		driver.findElement(By.id("input-email")).sendKeys(pr.getProperty("email"));;
        driver.findElement(By.id("input-password")).sendKeys(pr.getProperty("password"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		

	}

}
