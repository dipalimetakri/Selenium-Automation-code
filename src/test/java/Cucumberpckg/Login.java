package Cucumberpckg;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Before("@Ninja")
	public void getbrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Given("^I navigate to the login page of the application$")
	public void I_navigate_to_the_login_page_of_the_application() {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		
	}
	@When ("^I enter the email address as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void I_enter_the_email_address_asSomeemail_and_password_as_Somepassword(String emailaddress, String password) {
		
		driver.findElement(By.id("input-email")).sendKeys(emailaddress);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	@And("^I click on  for login button$")
	public void I_click_on_the_login_button() {
		
		driver.findElement(By.cssSelector("[value='Login']")).click();;
		
	}
	@Then("^I should successfully logged in into tutorialsNinja page$")
	public void I_should_successfully_logged_in_into_tutorialsNinja_page() {
		WebElement Accountpage=null;
		
		try{
		 Accountpage = driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']"));
		}catch(Exception e) {
			System.out.println("Login has failled");
		}
	Assert.assertNotNull("Login failled", Accountpage);
	//	Assert.fail();
	}
	
	@After("@Ninja")
	public void closebrowser() {
		driver.quit();
		
		
	}


}
