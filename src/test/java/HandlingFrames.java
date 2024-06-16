import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement frame3 = driver.findElement(By.id("frm3"));
        WebElement f2 = driver.findElement(By.id("frm2"));
        driver.switchTo().frame(f2);
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("firstName")).sendKeys("Dipali");
        driver.findElement(By.id("lastName")).sendKeys("Metkari");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("Done you nailed it ");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
      
            driver.quit();
	}

}
