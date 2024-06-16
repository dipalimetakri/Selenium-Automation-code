import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
  
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.id("alert1")).click();
	     
          Alert alert = driver.switchTo().alert();
         
          System.out.println(alert);
        
          String alerttext = alert.getText();
          System.out.println(alerttext);
          alert.accept();
         WebDriver switchtomainwindow = driver.switchTo().defaultContent();
          
          Thread.sleep(5000);
          
          
          //Single select Dropdowns
          
          WebElement Singleselect = driver.findElement(By.id("drop1"));
          
          Select select=new Select(Singleselect);
          
          select.selectByVisibleText("doc 3");
          
          Thread.sleep(3000);
          
          select.selectByIndex(1);
          Thread.sleep(3000);
          
          
          //Multiselect dropdowns
          
          WebElement multiselect = driver.findElement(By.id("multiselect1"));
          Select select1=new Select(multiselect);
          
          select1.selectByIndex(2);
          select1.selectByIndex(3);
          select1.selectByIndex(1);
          Thread.sleep(3000);
          select1.deselectByIndex(2);
          driver.quit();
        
		
		
	}

}
