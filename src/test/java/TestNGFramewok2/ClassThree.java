package TestNGFramewok2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassThree {
	@AfterTest
	public void testmoduleafter() {
		
		System.out.println("You have executed after test module one ");
	}
	@Test(groups={"smoke"},priority=7)
	public void classthree() {
		System.out.println("Executing class three method under ClassThree");
	}
	@Test(groups={"sanity"},priority=8)
		public void classten() {
		System.out.println("Executing class ten method under ClassThree");
			//Disha has commited changes
	}
}
