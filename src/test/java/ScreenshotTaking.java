import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTaking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        
        //For taking the screenshot
        File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //For copying the screenshots
        FileUtils.copyFile(Screenshotfile, new File("Screenshots//screenshot1.png"));
        System.out.println("Whoooa ! Screenshot has been Taken");
        
        driver.findElement(By.linkText("theautomatedtester")).click();
        
        //Agiang taking screenshot
        
        File Src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Src2, new File("Screenshots//Src2.png"));
        System.out.println("Whoooa ! Again Screenshot has been Taken");

        
        
        driver.quit();
		
		
		

	}

}
