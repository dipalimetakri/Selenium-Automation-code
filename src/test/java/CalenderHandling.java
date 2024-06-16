import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement source_element = driver.findElement(By.cssSelector("#form-field-travel_comp_date"));
		js.executeScript("arguments[0].scrollIntoView();", source_element);
		Thread.sleep(2000);
		source_element.click();

		/*
		 * while
		 * (!driver.findElement(By.xpath("//*[contains (@aria-label,'October ')]")).
		 * getText().contains("October")) {
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.cssSelector(".flatpickr-next-month")).click(); }
		 * 
		 * List<WebElement> days = driver.findElements(By.className("flatpickr-day"));
		 * 
		 * for (int i = 0; i <= days.size(); i++) { if
		 * (days.get(i).getText().equals("15")) { days.get(i).click(); break; } }
		 */

		WebElement arrow = driver.findElement(By.cssSelector(".flatpickr-next-month"));
		WebElement oct = driver.findElement(By.xpath("//span[text()='October ']"));
		if (driver.findElement(By.cssSelector(".flatpickr-next-month")).getText().contains("March")) {
			// Thread.sleep(3000);
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();

			List<WebElement> days = driver.findElements(By.className("flatpickr-day"));

			for (int i = 0; i <= days.size(); i++) {
				if (days.get(i).getText().equals("30")) {
					days.get(i).click();
					break;
				}
			}

		}

	}
}
