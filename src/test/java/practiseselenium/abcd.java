package practiseselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#testing")).click();
		driver.findElement(By.xpath("//a[text()='Tabs']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String parentid = itr.next();
		String childid = itr.next();
		String subchildid = itr.next();
		driver.switchTo().window(parentid);
		//driver.switchTo().window(childid);
		while(itr.hasNext()) {
			String abc = itr.next();
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
			
		}
		
		
	}

}
