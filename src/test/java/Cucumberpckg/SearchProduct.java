package Cucumberpckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
	WebDriver driver;
	@Before("@wip")
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\Browser\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	//add tidy gherkin extension to chrome or run feature file then it will auto generatre
	@Given("^I visit the website as a guest user$")
	public void I_visit_the_website_as_a_guest_user() {
		System.out.println(">>--Given:I visit the website as a guest user");

	}
	

@When("^I select the books option from the search dropdown$")
public void i_select_the_books_option_from_the_search_dropdown() {
    // Write code here that turns the phrase above into concrete actions
System.out.println(">>--When:^I select the books option from the search dropdown");
}

@When("^I click on the search icon option$")
public void i_click_on_the_search_icon_option() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(">>--When:I click on the search icon option");

}

@Then("^I should see the page having heading as amazon best reads is getting displayed$")
public void i_should_see_the_page_having_heading_as_amazon_best_reads_is_getting_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(">>--Then:I should see the page having heading as amazon best reads is getting displayed");

}

@Then("^I should not see the other category products$")
public void i_should_not_see_the_other_category_products() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(">>--@Then:I should not see the other category products");

}

@When("^I select the baby option from the search dropdown$")
public void i_select_the_baby_option_from_the_search_dropdown() {
	System.out.println(">>--When:I select the baby option from the search dropdown");

    // Write code here that turns the phrase above into concrete actions
}

@Then("^I should see the page having heading as offers on baby product is getting displayed$")
public void i_should_see_the_page_having_heading_as_offers_on_baby_product_is_getting_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(">>--@Then:I should see the page having heading as offers on baby product is getting displayed");

}

@After("@wip")
public void teardown() 
{
	driver.quit();
}

}
