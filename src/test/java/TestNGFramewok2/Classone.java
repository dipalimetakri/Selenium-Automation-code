package TestNGFramewok2;

import org.testng.annotations.Test;

public class Classone {

	@Test
	public void classoneone() {
		System.out.println("Executing class one method under ClassOne");			
	}
	@Test(groups={"smoke"},priority=8)
	public void classonetwo() {
		System.out.println("Executing class two method under ClassOne");			
	}
	@Test
	public void classoneThree() {
		System.out.println("Executing class Three method under ClassOne");			
	}
	public void classonefour() {
		System.out.println("Executing class four method under ClassOne");			
	}
}
