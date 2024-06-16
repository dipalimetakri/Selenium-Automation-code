package TestNGFramewok2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classtwo {

	@BeforeTest
	public void testmodule1() {

		System.out.println("You are the awesome before test method got executed");
	}
	

	@Test(groups={"smoke"},priority=1)
	public void classtwo() {
		System.out.println("Executing class two method under ClassTwo");
	}
	@AfterSuite
	
	public void beforesuit() {
		System.out.println("You are After the test suite execution");
	}
}
