import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://omayo.blogspot.com/p/lightbox.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        
        
        Actions action=new Actions(driver);
        
       WebElement blogmenuu = driver.findElement(By.id("blogsmenu"));
       
       action.moveToElement(blogmenuu).perform();
       WebElement sel143 = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
       action.moveToElement(sel143).click().perform();
       
       driver.quit();
        
	}

}
