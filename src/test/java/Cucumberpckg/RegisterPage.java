package Cucumberpckg;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage {
	
	WebDriver driver;
	@Before("@Register")
	public void openbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Given("^I navigate to the register page$")
	public void I_navigate_to_the_register_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}
	@When("^I enter below details$")
	
	public void I_enter_below_details(DataTable Data) {
		
		Map<String, String> datamap = Data.asMap(String.class,String.class);
		
		driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("FirstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("LastName"));
		driver.findElement(By.id("input-email")).sendKeys(datamap.get("Emalid"));
		driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
		driver.findElement(By.id("input-password")).sendKeys(datamap.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("Password"));
		
		
		
	}
	@And("^I click on Privacy policy$")
	
	public void And_I_click_on_Privacy_policy() {
		
		driver.findElement(By.name("agree")).click();
		
	}
	@After("@Register")
	public void browserclose() {
		
		driver.close();
	}
	
	
	

}
