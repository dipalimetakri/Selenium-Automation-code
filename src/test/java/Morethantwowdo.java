import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Morethantwowdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://omayo.blogspot.com");
       
       driver.findElement(By.linkText("Open a popup window")).click();
       driver.findElement(By.linkText("Blogger")).click();
       
       
      Set<String> windowids = driver.getWindowHandles();
      
      Iterator<String> itr = windowids.iterator();
      String t=null;
      while(itr.hasNext())
      {
    	  String windowid=itr.next();
    	  
    	  driver.switchTo().window(windowid);
    	  if(driver.getTitle().equals("New Window"))
    	  {
    		  t = driver.findElement(By.className("example")).getText();
    	  }
    	  
    	  
      }
      System.out.println(t);
      
      driver.quit();
     
       
       
       
       
       
       

	}

}
