package LiveProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICICTermLifeInsuranceFlow {
	
	@Test
	public void registration() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iciciprulife.com/term-insurance-plans/iprotect-smart-term-insurance-calculator.html?UID=1251&utm_source=google&utm_medium=cpc&utm_content=IPS_Salaried_Tax_460&utm_campaign=IPRU-Search-Brand_Product_Term_Plan-BMM-RX-Desktop-1251&utm_source=google&utm_campaign={campaign}&utm_medium=cpc&utm_adgroup={adgroup}&utm_term=icici%20pru%20term%20insurance&utm_device=c&gad_source=1&gclid=EAIaIQobChMIo9jMku3BhQMVVqhmAh3j_AMYEAAYAiAAEgI8p_D_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.className("nri_yes active")).click();
		 driver.findElement(By.xpath("//*[@id='myDropDown'][1]")).click();
		driver.findElement(By.xpath("//*[@for='tb2']")).click();
		driver.findElement(By.name("user_dob")).sendKeys("02022000");
		driver.findElement(By.cssSelector("#leadMobileNo")).sendKeys("1234567873");
		driver.findElement(By.xpath("//div[@class='mobile-remove']//input[@placeholder='Enter Your Email ID']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//select[@id='myDropDown1'])[1]"));
		
		
	}

}
