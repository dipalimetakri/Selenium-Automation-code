package POMandPageFactoryModelantAutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
 private  By EmailField= By.id("input-email");
 private By PassField= By.id("input-password");
 private By ButtonField= By.cssSelector("button[type='submit']");
 
 
 public LoginPage(WebDriver driver) {
	 this.driver=driver;
	 
 }
 
 
 public WebElement EmailField() {
	 return driver.findElement(EmailField);
	 
 }
public WebElement PassField() {
	 return driver.findElement(PassField);

	 
 }
public WebElement ButtonField() {
	 return driver.findElement(ButtonField);
	 
}
}
