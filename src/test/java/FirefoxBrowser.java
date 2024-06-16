import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String browser="edge";
		WebDriver driver =null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			  
			  driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
				{
		           System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\msedgedriver.exe");
		           driver =new EdgeDriver();  
				}

		else
		{
			System.out.println("Invallid browser");
		}

    	driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String r = driver.findElement(By.id("link1")).getText();		
		System.out.println(r);
		//driver.quit();
	}

}
