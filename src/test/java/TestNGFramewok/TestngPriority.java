package TestNGFramewok;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngPriority {
	
	@BeforeTest
	public void beforepmodule() {
		System.out.println("You are the before test module priority");
	}

	@AfterClass
	public void afterclss() 
	  {
		  System.out.println("Closing the browser after class");
	  }
	  @BeforeClass
	  public void beforeclss()
	  {
		  System.out.println("Launching the web browsern before class execution");
	  }
	
//	  @AfterMethod public void after() 
//	  {
//		  System.out.println("Closing the browser");
//	  }
//	  @BeforeMethod
//	  public void before()
//	  {
//		  System.out.println("Launching the web browser");
//	  }
//	 

	@Test(priority = 1)

	public void Registration() {
		System.out.println("You have registered successfully");
	}

	@Test(priority = 2)
	public void Login() {
		System.out.println("You have logged in successfully");
	}

	@Test(priority = 3)
	public void Homepage() {
		System.out.println("You have Successfully moved into Homepage");
	}

}
