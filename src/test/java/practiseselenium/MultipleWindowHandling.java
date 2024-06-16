package practiseselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");

		driver.manage().window().maximize();
		driver.findElement(By.linkText("Work-Space")).click();
		driver.findElement(By.linkText("Tabs")).click();
		driver.findElement(By.id("multi")).click();
		Thread.sleep(3000);
		
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String child = null;
		while (itr.hasNext()) {
			String wid = itr.next();
			WebDriver w = driver.switchTo().window("wid");
			if (w.getTitle().equals("LetCode with Koushik")) {
				driver.findElement(By.id("modern")).click();
				child = driver.findElement(By.className("title")).getText();
			}
		}
		System.out.println(child);
		//driver.quit();
	}

}
