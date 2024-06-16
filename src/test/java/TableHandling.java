import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class TableHandling {

	public static void main(String[] args) throws Exception,IndexOutOfBoundsException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	
		//to print the table headings
		List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//th"));
		Thread.sleep(4000);
		for(int i=0;i<headings.size();i++)
		{
			
			
			System.out.println(headings.get(i).getText());
			
		}
		driver.quit();
		
		//to print the table data
		
		List<WebElement> Data = driver.findElements(By.xpath("//table[@id='table1']//td"));
		Thread.sleep(4000);
		for(int i=0;i<Data.size();i++)
		{
			
			
			System.out.println(Data.get(i).getText());
			
		}
		driver.quit();
		
*/
		String givenname="Manish";
		
		//for scrolling
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
		js.executeScript("arguments[0].scrollIntoView(); ", table);
	
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		Thread.sleep(4000);
		int row=0;
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).getText().equals(givenname))
			{
				row=i;
			}
		}	
			
			 String path = "//table[@id='table1']//tr["+(row+1)+"]/td[3]";
			
			driver.findElement(By.xpath(path)).getText();
			System.out.println(driver.findElement(By.xpath(path)).getText());
			
			
			
		Thread.sleep(5000);	
		driver.quit();
		
		
	}

}
