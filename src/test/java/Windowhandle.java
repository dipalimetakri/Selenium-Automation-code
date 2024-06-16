import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
       
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		//to get access of opened window windpow
		Set<String> windowids = driver.getWindowHandles();
          Iterator<String> itr = windowids.iterator();
        
    	//hasNext()-used to check availablity of child window
		String maiwindow = itr.next();//it will print first wdow id
		String childwindow = itr.next();
		
		//to switch from main to child wdo
		driver.switchTo().window(childwindow);
		
		
		
		String parachildwindow = driver.findElement(By.tagName("h3")).getText();
			System.out.println(parachildwindow);
		
			
			//Control will come to main window so main will close and child will remain
			driver.switchTo().window(maiwindow);

			driver.close();
			
			
		
	}

}
