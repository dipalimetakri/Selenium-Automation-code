import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Actions action=new Actions(driver);
        
        WebElement rome = driver.findElement(By.id("box6"));
       WebElement Denmark = driver.findElement(By.id("box104"));
       
       
       action.dragAndDrop(rome, Denmark).perform();
       
       
       
       
       Thread.sleep(3000);
       driver.quit();

	}

}
