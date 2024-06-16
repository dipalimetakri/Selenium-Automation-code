package Cucumberpckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OmayoLogin {
	WebDriver driver;
	@Given("^I navigate into application URL$")
	public void I_navigate_into_application_URL() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void I_enter_username_as_Someusername_and_password_as_Somepassword(String Someusername, String Somepassword ) {
		driver.findElement(By.name("userid")).sendKeys(Someusername);
		driver.findElement(By.name("pswrd")).sendKeys(Somepassword);
	 
		
	}
	@And("^I click on the login button$")
	public void I_click_on_the_login_button() {
		driver.findElement(By.cssSelector("[value='Login']")).click();
		
	}
	
	@Then("^I should be able to login based on \"([^\"]*)\" login status$")
	public void I_should_be_able_to_login_based_on_Somexpectedresult_login_status(String Somexpectedresult){
		
		String actualResult=null;
		try {
		Alert alert = driver.switchTo().alert();
		if(alert.getText().contains("Error Password or Username")){

		actualResult="Failure";
		}
		}catch(Exception e)
		{
			actualResult="Success";
		}
		Assert.assertEquals(Somexpectedresult, actualResult);
		driver.quit();
		
		
	}
}
