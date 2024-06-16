package TestNGFramewok;

import org.testng.annotations.Test;

public class Classannotation {
	
	@Test(timeOut=5000)
	public void flipkart() throws InterruptedException {
		System.out.println("Flipkart");
		Thread.sleep(3000);	}
	
	
//	@Test(dependsOnMethods={"messho","clinic"})
//	public void amazon() {
//		System.out.println("amazon");
//	}
//	
	@Test
	public void yar() {
		System.out.println("yar");
	}
	
	@Test(dependsOnMethods={"mars"})
	public void messho() {
		System.out.println("messho");
	}
	@Test(enabled=false)
	public void clinic() {
		System.out.println("clinic");
	}
	@Test
	public void mars() {
		System.out.println("mars");
	}

}
