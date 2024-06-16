import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", "Selenium_Automation//src//test//java//Browser//chromedriver.exe");
		
		//Chromedriver is a predefined class and created object for the same so wecan access varible inside interface 
		//by using child class object
		//webdriver is an interface
		//chromedriver is a child class of webdriver interface
		//ChromeDriver()--this is a default constructor ---it launches the browser
		
		//blank browser will open
	     WebDriver driver =new ChromeDriver();
	//driver.get("https://www.facebook.com/");
		
		//To open the above given chrome browser
		driver.get("https://omayo.blogspot.com/");
		
	//	System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
		
	//	WebDriver driver=new FirefoxDriver();
		
		//Maximizing the browser window
		
		driver.manage().window().maximize();
		
		//Finding the UI element 
		// id is static method inside by class so static method access using class names.method
		//findelement method return type is WebElement and WebElement is an interface
	//	WebElement element =driver.findElement(By.id("textbox1"));
		//WebElement element = driver.findElement(By.name("q"));
	//	WebElement element =driver.findElement(By.className("classone"));
	//WebElement element =driver.findElement(By.linkText("onlytestingblog"));
		
		
		//using partial text we can give half text
		
	//	WebElement element =driver.findElement(By.partialLinkText("onlytesting"));
		
	//Using css selector
		
	//	WebElement element =driver.findElement(By.cssSelector("#confirm"));
		
	//Using XPath
		
		//WebElement element =driver.findElement(By.xpath("//input[@id='confirm']"));
		
		//using advance method

	  String text = driver.findElement(By.id("pah")).getText();
		System.out.println(text);
	     driver.navigate().back();


		
		//to provide input to the searchbox
    //     element.sendKeys("Dipali Metkari");
		// to click on confirm button
	//	element.click();
         
		
		// to hold the program we use thread class.sleep method
		Thread.sleep(5000);
		//element.clear();

		
		}

}
