package LiveProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Registration started on tutorialninja Congratulations");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
       WebElement myaccountField = driver.findElement(By.xpath("//span[text()='My Account']"));
       myaccountField.click();
       
       WebElement Register = driver.findElement(By.linkText("Register"));
       Register.click();
       
       WebElement firstnamefield = driver.findElement(By.id("input-firstname"));
       firstnamefield.sendKeys("mmdsd");
       
       WebElement LastnameField = driver.findElement(By.id("input-lastname"));
       LastnameField.sendKeys("Dhasdrme");
       
       WebElement Emailfield = driver.findElement(By.id("input-email"));
       Emailfield.sendKeys("dipalimetkaritrt67563@gmail.com");
       
       WebElement Telephonefield = driver.findElement(By.id("input-telephone"));
       Telephonefield.sendKeys("34343456464");
       
       WebElement Passwordfield = driver.findElement(By.id("input-password"));
       Passwordfield.sendKeys("Dipali@123");
       
       WebElement ConfirmPasswordfield = driver.findElement(By.id("input-confirm"));
       ConfirmPasswordfield.sendKeys("Dipali@123");
       
       WebElement Checkboxfield = driver.findElement(By.xpath("//input[@type='checkbox']"));
       Checkboxfield.click();
       
       WebElement Continuefield = driver.findElement(By.xpath("//input[@value='Continue']"));
       Continuefield.click();
       
       WebElement myaccountfField = driver.findElement(By.xpath("//span[text()='My Account']"));
       myaccountfField.click();
       
       
       WebElement LogoutField = driver.findElement(By.linkText("Logout"));
       
      if( LogoutField.isDisplayed())
      {
    	  System.out.println("You are logged in");
    	  
    	  String ActualURL = driver.getCurrentUrl();
    	  String ExpectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
    	  
    	  if(ActualURL.equals(ExpectedURL))
    	  {
    		  System.out.println("Account successfully created");
    	  }
    	  else
    	  {
    		  System.out.println("Account successfully not created");
    	  }
    	  
    	  String ActualHeadline = driver.getTitle();
    	  String ExpectedHeadline = "Your Account Has Been Created!";
    	  
    	  if(ActualHeadline.equals(ExpectedHeadline))
    	  {
    		 System.out.println("Your Headline of page is correct");
    	  }
    	  else
    	  {
    		  System.out.println("Your Headline of page is incorrect");
    	  }
    	  WebElement ContentOnPage = driver.findElement(By.xpath("//div[@id='content']/h1"));
    	  String ActualContent = ContentOnPage.getText();
    	  String ExpectedContent = "Your Account Has Been Created!";
    	  if(ActualContent.equals(ExpectedContent))
    	  {
    		  System.out.println("Yoyr content is exactly right");
    	  }
    	  else
    	  {
    		  System.out.println("Yoyr content is not exactly right");
    	  }
    	  WebElement Congratulationmsg = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
    	  String ActualCongratulationText = Congratulationmsg.getText();
    	  String ExpectedCongratulationText = "Congratulations! Your new account has been successfully created!";
    	  
    	  if(ActualCongratulationText.equals(ExpectedCongratulationText))
    	  {
    		  System.out.println("Your Congratulation message is diplayed properly");
    	  }
    	  else
    	  {
    		  System.out.println("Your Congratulation message is not diplayed properly");
    	  }
    	  
    	  WebElement cntbuttnEle = driver.findElement(By.linkText("Continue"));
    	  cntbuttnEle.click();
    	  String ActualTitle = driver.getTitle();
    	  String ExpectedTitle = "My Account";
    	  if(ActualTitle.equals(ExpectedTitle))
    	  {
    		  System.out.println("You are successfully navigated to Account page");
    	  }
    	  else
    	  {
    		  System.out.println("You are not navigated on Account Page");
    	  }
      }
      else
      {
    	  System.out.println("You are not logged in");
      }
      
      
     // driver.quit();
      
      
       
       
	}

}

