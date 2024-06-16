import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverpart2anddiffbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set path to the chromedriver executabl
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	//	driver.get("https://www.facebook.com/login/");
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		//to view in full screen mode
		driver.manage().window().fullscreen();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	  //  String m=driver.getTitle();
	//	String url=driver.getCurrentUrl();
	//	System.out.println(url);
	//	driver.findElement(By.linkText("compendiumdev")).click();
		
		//To print the current URL 
	//	String L= driver.getCurrentUrl();
	//	System.out.println(L);
		
	//    driver.findElement(By.linkText("Open a popup window")).click();
	//	driver.findElement(By.linkText("Blogger")).click();
//	String text	= driver.findElement(By.id("textbox1")).getAttribute("value");
//	System.out.println(text);
		//to close the current browser window
		//driver.close();
	
	//getAttribute is use
		
		//to close all main and child windows get closed
		
		
		//isDisplayed
		
	//	boolean displayed= driver.findElement(By.id("hbutton")).isDisplayed();
	//	System.out.println(displayed);
		
		//isEnabled
		
	//	boolean Enabled=driver.findElement(By.id("but2")).isEnabled();	
	//	System.out.println(Enabled);
		
		//isselected
	//	boolean selected=driver.findElement(By.id("checkbox2")).isSelected();
	//	System.out.println(selected);
		
		//navigate
		
	//	driver.navigate().to("https://www.youtube.com/c/QAFox/playlists");	
		
		//Browser back option
		//driver.navigate().back();
		
		//Browser forward option
		//driver.navigate().forward();
		
		//Browser refresh option
	//	driver.navigate().refresh();
		
		
		//String sm=driver.getPageSource();
		//System.out.println(sm);
		
		//driver.get("https://www.facebook.com/login/");
		/*
	    driver.findElement(By.id("email")).sendKeys("dipalimetkari84@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("Dipali@123");
	   String g= driver.findElement(By.id("loginbutton")).getTagName();
	   System.out.println(g);
	   */
	String c=   driver.findElement(By.id("home")).getCssValue("text-align");
	System.out.println(c);
	   
	   Dimension d = driver.findElement(By.id("alert2")).getSize();
	   System.out.println(d.height);
	   System.out.println(d.width);
	   
	   //To find the location of webelement
	    Point m = driver.findElement(By.id("alert2")).getLocation();
	   System.out.println("x co ordinator of page is " +m.x);
	   System.out.println("y co ordinator of page is " +m.y);
	    
		Thread.sleep(5000);
		//findElements is kind of list so return type is List
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		/*
		for(int i=0;i<elements.size();i++)
			if(elements.get(i).getText().length()>0)//getText is string type so length() method used 
				
			{
				System.out.println(elements.get(i).getText());
			}*/
		
		
		//For -each loop
		
		for(WebElement j: elements)
		{
			if (j.getText().length()>0)
			{
				System.out.println(j.getText());
			}
			
		}
		driver.quit();
	}
	
	

}
