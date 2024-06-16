import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeybordkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Actions action=new Actions(driver);
        
        /*
        WebElement compendium = driver.findElement(By.linkText("compendiumdev"));
        
        //Keys- is the class enclosed all keyboard method
        
        action.keyDown(Keys.CONTROL).click(compendium).keyUp(Keys.CONTROL).perform();
        
       
        
        WebElement useridfield = driver.findElement(By.name("userid"));
        useridfield.sendKeys("dipalimetkari84@gmail.com");
        action.sendKeys(Keys.TAB).perform();
        
        WebElement pswdfield = driver.findElement(By.name("pswrd"));
        pswdfield.sendKeys("Dipali@123");
        
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        */ 
        //without Action class
        driver.findElement(By.name("userid")).sendKeys("Dipali");
        driver.findElement(By.name("pswrd")).sendKeys("Dipali@123");
        driver.findElement(By.name("pswrd")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("9921845429");
        driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("Dipali@123");
        Thread.sleep(3000);
     //   driver.quit();
        
   
      
        

	}

}
