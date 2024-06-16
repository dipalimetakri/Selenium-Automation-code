package LiveProjects;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	
	Logger log;
	
	@Test(dataProvider="getLogindata")
	public void login(String email,String password,String expectedresult) throws IOException, InterruptedException {
		
		
		
		//Landingpage called
		LandingPage landingpage= new LandingPage(driver);
		landingpage.AccountDropdown.click();
		log.debug("Click on my accountpage dropdown");
		landingpage.Loginoption().click();
		log.debug("Click on loginbutton");

		
		Thread.sleep(2000);
		//Loginpage called
		
		LoginPage loginpage =new LoginPage(driver);
		
		
		loginpage.emailField.sendKeys(email);
		log.debug("Entered email into email field");
		loginpage.passwordField().sendKeys(password);
		log.debug("Entered password into password field");
		
		loginpage.loginButton().click();
		
		//After login AcountPage class called
		AccountPage accountpage=new AccountPage(driver);
	//	Assert.assertTrue(accountpage.EditaccInfo().isDisplayed());
		String actualResult=null;
		
		try {
			if(accountpage.EditaccInfo().isDisplayed())
			{
			accountpage.EditaccInfo();
			actualResult="Successful";
			log.info("Test got Successful");
			Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			
			actualResult="Failure";
			log.info("test got falure");
		}
		
		Assert.assertEquals(actualResult, expectedresult);
	}
	@AfterMethod
		public void closure() {
			driver.close();
			log.debug("Browser got closed");
		}
	@BeforeMethod
	public void openBrowser() throws IOException 
	{
		
		 log = LogManager.getLogger(LoginTest.class.getName());
		driver= initializedriver();
		log.debug("Browser got Launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL	");
	}
//if use data .properties file then don't use for multiple set of data so you use single set of data then you can use properties class
	
	@DataProvider
	public Object[][] getLogindata() throws InterruptedException
	{
		Object[][] data = {{"dipalimetkari84@gmail.com","Dipali@123","Successful"},{"dummy@vmail.in","dummy","Failure"}};
		Thread.sleep(2000);
		return data;
	}
}
