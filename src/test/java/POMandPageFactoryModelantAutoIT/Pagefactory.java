package POMandPageFactoryModelantAutoIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {
	WebDriver driver;
	
	public Pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-email")
	private WebElement EmailField;
	
	@FindBy(id="input-password")
	private WebElement PassField;
	
	@FindBy(css="button[type='submit")
	private WebElement ButtonField;
	
	public WebElement EmailField()
	{
		return EmailField;
	}
	public WebElement PassField()
	{
		return PassField;
	}
	
	public WebElement ButtonField()
	{
		return ButtonField;
	}
	
	
	

}
