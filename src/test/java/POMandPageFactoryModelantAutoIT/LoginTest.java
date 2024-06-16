package POMandPageFactoryModelantAutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.EmailField().sendKeys("dipalimetkari84");
		loginpage.PassField().sendKeys("Dipali@123");
		loginpage.PassField().click();

}
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
